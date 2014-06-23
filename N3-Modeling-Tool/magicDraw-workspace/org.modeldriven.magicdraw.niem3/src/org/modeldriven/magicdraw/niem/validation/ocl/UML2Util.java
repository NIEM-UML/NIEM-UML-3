package org.modeldriven.magicdraw.niem.validation.ocl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.WeakHashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
//import org.eclipse.uml2.common.CommonPlugin;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.osgi.framework.Bundle;

import com.nomagic.magicdraw.foundation.MDExtension;
import com.nomagic.magicdraw.foundation.MDFoundationFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;

//import com.nomagic.uml2.ext.magicdraw.extensions.ExtensionsFactory;
//import com.nomagic.uml2.ext.magicdraw.extensions.MDExtension;

/**
 * Utilities for working with EMF-based objects and resources.
 * 
 * @since 1.2
 */
public class UML2Util {

	protected UML2Util() {
		super();
	}

	/**
	 * An interface for classes that can determine matches based on some
	 * criteria.
	 */
	public static interface EObjectMatcher {

		/**
		 * Determines whether the specified object matches some criteria.
		 * 
		 * @param eObject
		 *            The candidate object.
		 * @return <code>true</code> if the object meets the criteria;
		 *         <code>false</code> otherwise.
		 */
		public boolean matches(EObject eObject);

	}

	/**
	 * A matcher that determines matches based on the class of candidate
	 * objects.
	 */
	public static class EClassMatcher
			implements EObjectMatcher {

		protected final EObject eObject;

		/**
		 * Constructs a new class matcher based on the specified object.
		 * 
		 * @param eObject
		 *            The object whose class is to be used as a match criterion.
		 */
		public EClassMatcher(EObject eObject) {
			super();

			this.eObject = eObject;
		}

		public boolean matches(EObject otherEObject) {
			return eObject == null
				? false
				: (otherEObject == null
					? false
					: eObject.eClass() == otherEObject.eClass());
		}
	}

	/**
	 * A matcher that determines matches based on the class of, and the value
	 * for a specific structural feature held by, candidate objects.
	 */
	public static class EStructuralFeatureMatcher
			extends EClassMatcher {

		protected final EStructuralFeature eStructuralFeature;

		/**
		 * Constructs a new structural feature matcher based on the specified
		 * object.
		 * 
		 * @param eObject
		 *            The object whose class is to be used as a match criterion.
		 * @param eStructuralFeature
		 *            The structural feature whose value is to be used as a
		 *            match criterion.
		 */
		public EStructuralFeatureMatcher(EObject eObject,
				EStructuralFeature eStructuralFeature) {
			super(eObject);

			this.eStructuralFeature = eStructuralFeature;
		}

		@Override
		public boolean matches(EObject otherEObject) {
			return super.matches(otherEObject)
				&& safeEquals(eObject.eGet(eStructuralFeature), otherEObject
					.eGet(eStructuralFeature));
		}
	}

	/**
	 * An interface for classes that can convert objects to another
	 * representation.
	 */
	public static interface Converter {

		/**
		 * Converts the specified objects using the specified options, reporting
		 * problems to the specified diagnostics, within the specified context.
		 * 
		 * @param eObjects
		 *            The objects to be converted.
		 * @param options
		 *            The options to use.
		 * @param diagnostics
		 *            The chain of diagnostics to which problems are to be
		 *            appended.
		 * @param context
		 *            The cache of context-specific information.
		 * @return Another representation of the objects.
		 */
		Collection<? extends EObject> convert(
				Collection<? extends EObject> eObjects,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context);

	}

	/**
	 * The abstract parent of classes that can provide a textual representation
	 * of objects, classes, and features.
	 */
	public static abstract class QualifiedTextProvider {

		/**
		 * Retrieves a textual representation of the specified object.
		 * 
		 * @param eObject
		 *            The object for which to retrieve text.
		 * @return A textual representation of the object.
		 */
		public String getText(EObject eObject) {

			return eObject instanceof ENamedElement
				? ((ENamedElement) eObject).getName()
				: EMPTY_STRING;
		}

		/**
		 * Retrieves the string used to separate segments of qualified text.
		 * 
		 * @return The separator to be used.
		 */
		public abstract String getSeparator();

		/**
		 * Retrieves a textual representation of the specified structural
		 * feature.
		 * 
		 * @param eStructuralFeature
		 *            The feature for which to retrieve text.
		 * @return A textual representation of the feature.
		 */
		public String getFeatureText(EStructuralFeature eStructuralFeature) {
			return eStructuralFeature.getName();
		}

		/**
		 * Retrieves a textual representation of the specified object's class.
		 * 
		 * @param eObject
		 *            The object for which to retrieve text.
		 * @return A textual representation of the object's class.
		 */
		public String getClassText(EObject eObject) {
			return eObject.eClass().getName();
		}

	}

	/**
	 * The default URI converter for resource bundle look-ups.
	 */
	protected static final URIConverter DEFAULT_URI_CONVERTER = new ExtensibleURIConverterImpl();

	/**
	 * A cache of resource bundles.
	 */
	protected static final Map<Resource, Map<Locale, ResourceBundle>> RESOURCE_BUNDLES = Collections
		.synchronizedMap(new WeakHashMap<Resource, Map<Locale, ResourceBundle>>());

	/**
	 * The empty string.
	 */
	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	/**
	 * The platform line separator.
	 */
	protected static final String LINE_SEPARATOR = System.getProperties()
		.getProperty("line.separator"); //$NON-NLS-1$

	/**
	 * The scheme for platform URIs.
	 */
	public static final String URI_SCHEME_PLATFORM = "platform"; //$NON-NLS-1$

	/**
	 * The first segment for platform plugin URIs.
	 */
	public static final String URI_SEGMENT_PLUGIN = "plugin"; //$NON-NLS-1$

	/**
	 * The first segment for platform resource URIs.
	 */
	public static final String URI_SEGMENT_RESOURCE = "resource"; //$NON-NLS-1$

	/**
	 * The standard extension for properties files.
	 */
	public static final String PROPERTIES_FILE_EXTENSION = "properties"; //$NON-NLS-1$

	/**
	 * Retrieves the candidate resource bundle URIs based on the specified base
	 * URI and base segment in the specified locale.
	 * 
	 * @param baseURI
	 *            The base URI (i.e. without the last segment) for the candidate
	 *            resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs.
	 * @param baseSegment
	 *            The base segment (i.e. the last segment without the extension)
	 *            for the candidate resource bundle URIs.
	 * @return The candidate resource bundle URIs with the base URI and base
	 *         segment in the locale.
	 */
	protected static List<URI> getResourceBundleURIs(URI baseURI,
			Locale locale, String baseSegment) {
		List<URI> resourceBundleURIs = new ArrayList<URI>();
		String language = locale.getLanguage();

		if (language.length() > 0) {
			baseSegment += ('_' + language);
			resourceBundleURIs.add(0, baseURI.appendSegment(baseSegment)
				.appendFileExtension(PROPERTIES_FILE_EXTENSION));

			String country = locale.getCountry();

			if (country.length() > 0) {
				baseSegment += ('_' + country);
				resourceBundleURIs.add(0, baseURI.appendSegment(baseSegment)
					.appendFileExtension(PROPERTIES_FILE_EXTENSION));

				String variant = locale.getVariant();

				if (variant.length() > 0) {
					baseSegment += ('_' + variant);
					resourceBundleURIs.add(0, baseURI
						.appendSegment(baseSegment).appendFileExtension(
							PROPERTIES_FILE_EXTENSION));
				}
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the candidate resource bundle URIs for the specified URI in the
	 * specified locale (if specified).
	 * 
	 * @param uri
	 *            The URI upon which to base the candidate resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs, or <code>null</code>.
	 * @return The candidate resource bundle URIs for the URI in the locale (if
	 *         specified).
	 */
	protected static List<URI> getResourceBundleURIs(URI uri, Locale locale) {
		List<URI> resourceBundleURIs = new ArrayList<URI>();
		URI baseURI = uri.trimSegments(1);
		String baseSegment = uri.trimFileExtension().lastSegment();

		if (baseSegment != null) {
			resourceBundleURIs.add(baseURI.appendSegment(baseSegment)
				.appendFileExtension(PROPERTIES_FILE_EXTENSION));

			if (locale != null) {
				Locale defaultLocale = Locale.getDefault();

				resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
					defaultLocale, baseSegment));

				if (!locale.equals(defaultLocale)) {
					resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
						locale, baseSegment));
				}
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object in the
	 * specified locale (if specified).
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param locale
	 *            The locale in which to retrieve the resource bundle, or
	 *            <code>null</code>.
	 * @return The resource bundle for the object in the locale (if specified).
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			Locale locale) {
		Resource resource = eObject.eResource();

		if (resource != null) {
			Map<Locale, ResourceBundle> resourceBundles = RESOURCE_BUNDLES
				.get(resource);

			if (resourceBundles == null) {
				RESOURCE_BUNDLES.put(resource, resourceBundles = Collections
					.synchronizedMap(new HashMap<Locale, ResourceBundle>()));
			}

			if (!resourceBundles.containsKey(locale)) {
				ResourceSet resourceSet = resource.getResourceSet();
				URIConverter uriConverter = resourceSet == null
					? DEFAULT_URI_CONVERTER
					: resourceSet.getURIConverter();

				URI uri = resource.getURI();
				List<URI> resourceBundleURIs = getResourceBundleURIs(uri,
					locale);

				if (EMFPlugin.IS_ECLIPSE_RUNNING) {
					URI normalizedURI = uriConverter.normalize(uri);
					int segmentCount = normalizedURI.segmentCount();

					if (URI_SCHEME_PLATFORM.equals(normalizedURI.scheme())
						&& segmentCount > 2
						&& URI_SEGMENT_PLUGIN.equals(normalizedURI.segment(0))) {

						Bundle bundle = Platform.getBundle(normalizedURI
							.segment(1));

						if (bundle != null) {
							Bundle[] fragments = Platform.getFragments(bundle);

							if (fragments != null) {
								String[] trailingSegments = normalizedURI
									.segmentsList().subList(2, segmentCount)
									.toArray(new String[]{});

								for (int f = 0; f < fragments.length; f++) {
									resourceBundleURIs.addAll(0,
										getResourceBundleURIs(normalizedURI
											.trimSegments(segmentCount - 1)
											.appendSegment(
												fragments[f].getSymbolicName())
											.appendSegments(trailingSegments),
											locale));
								}
							}
						}
					}
				}

				ResourceBundle resourceBundle = null;

				for (Iterator<URI> rbu = resourceBundleURIs.iterator(); rbu
					.hasNext();) {

					try {
						InputStream inputStream = uriConverter
							.createInputStream(rbu.next());
						try {
							resourceBundle = new PropertyResourceBundle(
								inputStream);
						} finally {
							inputStream.close();
						}
						break;
					} catch (IOException ioe) {
						// ignore
					}
				}

				resourceBundles.put(locale, resourceBundle);
			}

			return resourceBundles.get(locale);
		}

		return null;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object,
	 * localized in the default locale if indicated.
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param localize
	 *            Whether to retrieve the resource bundle based on (the default)
	 *            locale.
	 * @return The resource bundle for the object (in the default locale).
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			boolean localize) {
		return getResourceBundle(eObject, localize
			? Locale.getDefault()
			: null);
	}

	/**
	 * Retrieves a string for the specified object, localized if indicated.
	 * 
	 * @param eObject
	 *            The object for which to retrieve a (localized) string.
	 * @param key
	 *            The key in the resource bundle.
	 * @param defaultString
	 *            The string to return if no string for the given key can be
	 *            found.
	 * @param localize
	 *            Whether the string should be localized.
	 * @return The (localized) string.
	 */
	protected static String getString(EObject eObject, String key,
			String defaultString, boolean localize) {
		String string = defaultString;

		if (eObject != null) {

			try {
				ResourceBundle resourceBundle = getResourceBundle(eObject,
					localize);

				if (resourceBundle != null) {
					string = resourceBundle.getString(key);
				}
			} catch (MissingResourceException mre) {
				// ignore
			}
		}

		return string;
	}

	/**
	 * Retrieves a qualified textual representation of the specified object
	 * using the specified qualified text provider.
	 * 
	 * @param eObject
	 *            The object for which to retrieve qualified text.
	 * @param qualifiedTextProvider
	 *            The provider to be used.
	 * @return A qualified textual representation of the object.
	 */
	public static String getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider) {

		return getQualifiedText(eObject, qualifiedTextProvider,
			new StringBuffer()).toString();
	}

	protected static StringBuffer getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider,
			StringBuffer qualifiedText) {

		EObject eContainer = eObject == null
			? null
			: eObject.eContainer();

		if (eContainer != null) {
			getQualifiedText(eContainer, qualifiedTextProvider, qualifiedText);

			if (qualifiedText.length() > 0) {
				qualifiedText.append(qualifiedTextProvider.getSeparator());
			}
		}

		return getQualifiedTextSegment(eObject, qualifiedTextProvider,
			qualifiedText);
	}

	protected static StringBuffer getQualifiedTextSegment(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider,
			StringBuffer qualifiedText) {

		String text = qualifiedTextProvider.getText(eObject);

		if (!isEmpty(text)) {
			return qualifiedText.append(text);
		} else if (eObject == null) {
			return qualifiedText.append(String.valueOf(eObject));
		}

		qualifiedText.append('{');

		EStructuralFeature eContainingFeature = eObject.eContainingFeature();

		if (eContainingFeature != null) {
			qualifiedText.append(qualifiedTextProvider
				.getFeatureText(eContainingFeature));

			if (eContainingFeature.isMany()) {
				qualifiedText.append(' ');

				List<?> list = (List<?>) eObject.eContainer().eGet(
					eContainingFeature, false);

				qualifiedText.append('[');
				qualifiedText.append(list.indexOf(eObject));
				qualifiedText.append(']');
			}

			qualifiedText.append(' ');
		}

		qualifiedText.append(qualifiedTextProvider.getClassText(eObject));
		qualifiedText.append('}');

		return qualifiedText;
	}

	protected static String getMessageSubstitution(Map<Object, Object> context,
			Object object) {

		if (object instanceof EObject) {
			EObject eObject = (EObject) object;

			if (context != null) {
				EValidator.SubstitutionLabelProvider substitutionLabelProvider = (EValidator.SubstitutionLabelProvider) context
					.get(EValidator.SubstitutionLabelProvider.class);

				if (substitutionLabelProvider != null) {
					return substitutionLabelProvider.getObjectLabel(eObject);
				}

				QualifiedTextProvider qualifiedTestProvider = (QualifiedTextProvider) context
					.get(QualifiedTextProvider.class);

				if (qualifiedTestProvider != null) {
					return getQualifiedText(eObject, qualifiedTestProvider);
				}
			}
			// tjd added qualifiedName option
			if(eObject instanceof NamedElement)return ((NamedElement)eObject).getQualifiedName();
			Resource resource = eObject.eResource();

			if (resource != null) {
				return resource.getURI().lastSegment() + '#'
					+ resource.getURIFragment(eObject);
			}

			return EcoreUtil.getIdentification((EObject) object);
		} else if (object instanceof Collection<?>) {
			StringBuffer messageSubstitution = new StringBuffer("["); //$NON-NLS-1$

			for (Object element : ((Collection<?>) object)) {

				if (messageSubstitution.length() > 1) {
					messageSubstitution.append(", "); //$NON-NLS-1$
				}

				messageSubstitution.append(getMessageSubstitution(context,
					element));
			}

			messageSubstitution.append(']');

			return messageSubstitution.toString();
		} else {
			return String.valueOf(object);
		}
	}

	public static Object[] getMessageSubstitutions(
			Map<Object, Object> context, Object object0) {
		return new Object[]{getMessageSubstitution(context, object0)};
	}

	protected static Object[] getMessageSubstitutions(
			Map<Object, Object> context, Object object0, Object object1) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1)};
	}

	protected static Object[] getMessageSubstitutions(
			Map<Object, Object> context, Object object0, Object object1,
			Object object2) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1),
			getMessageSubstitution(context, object2)};
	}

	/**
	 * Safely determines whether <code>object</code> equals
	 * <code>otherObject</code>, i.e. without throwing an exception if
	 * <code>object</code> is <code>null</code>.
	 * 
	 * @param object
	 *            The first object to compare.
	 * @param otherObject
	 *            The second object to compare.
	 * @return <code>true</code> if <code>object</code> equals
	 *         <code>otherObject</code>; <code>false</code> otherwise.
	 */
	public static boolean safeEquals(Object object, Object otherObject) {
		return object == null
			? otherObject == null
			: object.equals(otherObject);
	}

	/**
	 * Determines whether the specified string is empty, i.e. is
	 * <code>null</code> or has a length of zero.
	 * 
	 * @param string
	 *            The string in question.
	 * @return <code>true</code> if the string is empty; <code>false</code>
	 *         otherwise.
	 */
	public static boolean isEmpty(String string) {
		return string == null || string.length() == 0;
	}

	/**
	 * Retrieves the first of the specified objects that matches the criteria
	 * used by the specified matcher.
	 * 
	 * @param eObjects
	 *            The collection of candidate objects.
	 * @param filter
	 *            The matcher to be used.
	 * @return The first object that matches the criteria.
	 */
	public static EObject findEObject(Collection<? extends EObject> eObjects,
			EObjectMatcher filter) {
		return findEObject(eObjects.iterator(), filter);
	}

	/**
	 * Retrieves the first of the specified objects that matches the criteria
	 * used by the specified matcher.
	 * 
	 * @param iterator
	 *            The iterator for the candidate objects.
	 * @param filter
	 *            The matcher to be used.
	 * @return The first object that matches the criteria.
	 */
	public static EObject findEObject(Iterator<? extends EObject> iterator,
			EObjectMatcher filter) {

		while (iterator.hasNext()) {
			EObject eObject = iterator.next();

			if (filter.matches(eObject)) {
				return eObject;
			}
		}

		return null;
	}

	protected static EClassifier getCommonEType(EClassifier eType,
			final EClassifier otherEType) {

		if (eType == null || eType.equals(otherEType)) {
			return eType;
		} else {
			return new EcoreSwitch<EClassifier>() {

				@Override
				public EClassifier caseEClassifier(EClassifier eClassifier) {
					return EcorePackage.eINSTANCE.getEObject();
				}

				@Override
				public EClassifier caseEClass(EClass eClass) {

					if (otherEType instanceof EClass) {
						EClass otherEClass = (EClass) otherEType;

						if (eClass.isSuperTypeOf(otherEClass)) {
							return eClass;
						} else if (otherEClass.isSuperTypeOf(eClass)) {
							return otherEClass;
						}

						for (Iterator<EClass> eAllSuperTypes = eClass
							.getEAllSuperTypes().iterator(); eAllSuperTypes
							.hasNext();) {

							EClass eSuperType = eAllSuperTypes.next();

							if (eSuperType.isSuperTypeOf(otherEClass)) {
								return eSuperType;
							}
						}

						for (Iterator<EClass> otherEAllSuperTypes = otherEClass
							.getEAllSuperTypes().iterator(); otherEAllSuperTypes
							.hasNext();) {

							EClass otherESuperType = otherEAllSuperTypes.next();

							if (otherESuperType.isSuperTypeOf(eClass)) {
								return otherESuperType;
							}
						}
					}

					return super.caseEClass(eClass);
				}

				@Override
				public EClassifier caseEDataType(EDataType eDataType) {
					return otherEType instanceof EDataType
						&& eDataType.getInstanceClass().equals(
							((EDataType) otherEType).getInstanceClass())
						? eDataType
						: EcorePackage.eINSTANCE.getEJavaObject();
				}

				@Override
				public EClassifier caseEEnum(EEnum eEnum) {
					return otherEType instanceof EEnum
						? EcorePackage.eINSTANCE.getEEnumerator()
						: EcorePackage.eINSTANCE.getEJavaObject();
				}
			}.doSwitch(eType);
		}
	}

	protected static int getLesserLowerBound(int lowerBound, int otherLowerBound) {
		return Math.min(lowerBound, otherLowerBound);
	}

	protected static int getGreaterUpperBound(int upperBound,
			int otherUpperBound) {

		return upperBound == ETypedElement.UNBOUNDED_MULTIPLICITY
			|| otherUpperBound == ETypedElement.UNBOUNDED_MULTIPLICITY
			? ETypedElement.UNBOUNDED_MULTIPLICITY
			: Math.max(upperBound, otherUpperBound);
	}

	/**
	 * Obtains a valid Java identifier based on the specified name.
	 * 
	 * @param name
	 *            The name from which to obtain a valid identifier.
	 * @return A valid (Java) identifier.
	 */
	public static String getValidJavaIdentifier(String name) {
		return getValidJavaIdentifier(name, new StringBuffer()).toString();
	}

	/**
	 * Appends a valid Java identifier based on the specified name to the
	 * specified buffer.
	 * 
	 * @param name
	 *            The name from which to obtain the valid identifier.
	 * @param validJavaIdentifier
	 *            The buffer to which to append the valid identifier.
	 * @return The buffer.
	 */
	protected static StringBuffer getValidJavaIdentifier(String name,
			StringBuffer validJavaIdentifier) {

		if (isEmpty(name)) {
			validJavaIdentifier.append('_');
		} else {
			char char_0 = name.charAt(0);

			if (Character.isJavaIdentifierStart(char_0)) {
				validJavaIdentifier.append(char_0);
			} else {
				validJavaIdentifier.append('_');

				if (Character.isJavaIdentifierPart(char_0)) {
					validJavaIdentifier.append(char_0);
				}
			}

			for (int i = 1; i < name.length(); i++) {
				char char_i = name.charAt(i);

				if (Character.isJavaIdentifierPart(char_i)) {
					validJavaIdentifier.append(char_i);
				}
			}
		}

		return validJavaIdentifier;
	}

	protected static boolean isNCNameStart(char c) {
		return XMLTypeUtil.isNCNameStart(c);
	}

	protected static boolean isNCNamePart(char c) {
		return XMLTypeUtil.isNCNamePart(c);
	}

	protected static String getValidNCName(String name) {
		return getValidNCName(name, new StringBuffer()).toString();
	}

	protected static StringBuffer getValidNCName(String name,
			StringBuffer validNCName) {

		if (isEmpty(name)) {
			validNCName.insert(0, '_');
		} else {

			for (int i = name.length(); --i > 0;) {
				char char_i = name.charAt(i);

				if (isNCNamePart(char_i)) {
					validNCName.insert(0, char_i);
				}
			}

			char char_0 = name.charAt(0);

			if (isNCNameStart(char_0)) {
				validNCName.insert(0, char_0);
			} else {

				if (isNCNamePart(char_0)) {
					validNCName.insert(0, char_0);
				}

				validNCName.insert(0, '_');
			}
		}

		return validNCName;
	}

	/**
	 * Obtains a valid XMI identifier for the specified object based on the URI
	 * fragment segments of its containment hierarchy.
	 * 
	 * @param internalEObject
	 *            The object for which to obtain an XMI identifier.
	 * @return An XMI identifier for the object.
	 */
	public static String getXMIIdentifier(InternalEObject internalEObject) {
		return getXMIIdentifier(internalEObject, new StringBuffer()).toString();
	}

	protected static StringBuffer getXMIIdentifier(
			InternalEObject internalEObject, StringBuffer xmiIdentifier) {
		InternalEObject eInternalContainer = internalEObject
			.eInternalContainer();
		Resource.Internal eDirectResource = internalEObject.eDirectResource();

		while (eInternalContainer != null && eDirectResource == null) {
			getValidNCName(eInternalContainer.eURIFragmentSegment(
				internalEObject.eContainingFeature(), internalEObject),
				xmiIdentifier);

			internalEObject = eInternalContainer;
			eInternalContainer = internalEObject.eInternalContainer();
			eDirectResource = internalEObject.eDirectResource();

			if (eInternalContainer != null && eDirectResource == null) {
				xmiIdentifier.insert(0, '-');
			}
		}

		if (eDirectResource != null) {
			int index = eDirectResource.getContents().indexOf(internalEObject);
			int length = xmiIdentifier.length();

			if (index > 0 || length == 0) {

				if (length > 0) {
					xmiIdentifier.insert(0, '-');
				}

				xmiIdentifier.insert(0, index);
				xmiIdentifier.insert(0, '_');
			}
		}

		return xmiIdentifier;
	}

	/**
	 * Counts the number of instances of the specified classifier.
	 * 
	 * @param iterator
	 *            The iterator for the candidate objects.
	 * @param eClassifier
	 *            The classifier in question.
	 * @return The number of the instances of the classifier.
	 */
	public static int getInstanceCount(Iterator<?> iterator,
			EClassifier eClassifier) {
		int count = 0;

		while (iterator.hasNext()) {

			if (eClassifier.isInstance(iterator.next())) {
				count++;
			}
		}

		return count;
	}

	protected static boolean addConstraint(EModelElement eModelElement,
			String constraint) {

		if (isEmpty(constraint)) {
			return false;
		} else {
			List<String> constraints = new ArrayList<String>(EcoreUtil
				.getConstraints(eModelElement));

			boolean result = constraints.add(constraint);

			EcoreUtil.setConstraints(eModelElement, constraints);

			return result;
		}
	}

	protected static void addDocumentation(EModelElement eModelElement,
			String text) {

		if (!isEmpty(text)) {
			String documentation = EcoreUtil.getDocumentation(eModelElement);

			EcoreUtil.setDocumentation(eModelElement, documentation == null
				? text
				: documentation + LINE_SEPARATOR + text);
		}
	}

	protected static Collection<EObject> getRootContainers(
			Collection<? extends EObject> eObjects) {
		Collection<EObject> rootContainers = new UniqueEList.FastCompare<EObject>();

		for (Iterator<? extends EObject> i = eObjects.iterator(); i.hasNext();) {
			rootContainers.add(EcoreUtil.getRootContainer(i.next()));
		}

		return rootContainers;
	}

	/**
	 * Retrieves an iterator over the content tree of the specified object which
	 * optionally includes the root object and/or copies contents while
	 * iterating.
	 * 
	 * @param eObject
	 *            The root of the content hierarchy.
	 * @param includeRoot
	 *            Whether to include the root object.
	 * @param defensiveCopy
	 *            Whether to copy contents while iterating.
	 * @return A content tree iterator.
	 */
	public static <T> TreeIterator<T> getAllContents(EObject eObject,
			boolean includeRoot, final boolean defensiveCopy) {
		return new AbstractTreeIterator<T>(eObject, includeRoot) {

			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unchecked")
			@Override
			protected Iterator<T> getChildren(Object object) {
				return (Iterator<T>) (defensiveCopy
					? new ArrayList<EObject>(((EObject) object).eContents())
						.iterator()
					: ((EObject) object).eContents().iterator());
			}
		};
	}

	/**
	 * Creates an annotation with the specified source on the specified model
	 * element.
	 * 
	 * @param eModelElement
	 *            The model element on which to create the annotation.
	 * @param source
	 *            The source for the new annotation.
	 * @return A new annotation.
	 */
	/*
	public static EAnnotation createEAnnotation(EModelElement eModelElement,
			String source) {
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setEModelElement(eModelElement);
		eAnnotation.setSource(source);
		return eAnnotation;
	}
*/
	public static MDExtension createEAnnotation(Element eModelElement,
			String source) {
		MDExtension eAnnotation = MDFoundationFactory.eINSTANCE.createMDExtension();
		eAnnotation.setElement(eModelElement);
		eAnnotation.setSource(source);

		return eAnnotation;
	}
	/**
	 * Retrieves the annotation with the specified source on the specified model
	 * element, optionally creating one on demand if no such annotation exists.
	 * 
	 * @param eModelElement
	 *            The model element from/on which to retrieve/create the
	 *            annotation.
	 * @param source
	 *            The source for the (new) annotation.
	 * @param createOnDemand
	 *            Whether to create one if no such annotation exists.
	 * @return The (new) annotation.
	 */
	/*
	public static EAnnotation getEAnnotation(EModelElement eModelElement,
			String source, boolean createOnDemand) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		return eAnnotation == null && createOnDemand
			? createEAnnotation(eModelElement, source)
			: eAnnotation;
	}
*/
	protected static void log(String text){
		QvtCommonAction.log(text);
	}
	public static MDExtension getEAnnotation(Element eModelElement,
			String source, boolean createOnDemand) {
		//log("UML2Util.getEAnnotation "+source);
		MDExtension eAnnotation = null;
		try{
			
			eAnnotation = ElementOperations.getMDExtension(eModelElement,source);
			//eAnnotation = eModelElement.getMDExtension(source);
			/*
			for(MDExtension eAnnotationTest:eModelElement.getMdExtensions()){
				if(source.equals(eAnnotationTest.getSource())){
					eAnnotation=eAnnotationTest;
					break;
				}
			}
			*/
		}catch(Throwable t){
			log("UML2Util.getEAnnotation failed "+source+", "+eModelElement.getMdExtensions()+" : "+t);
			return null;
		}
		return eAnnotation == null && createOnDemand
			? createEAnnotation(eModelElement, source)
			: eAnnotation;
	}
	/**
	 * Retrieves a collection of non-navigable inverse references to the
	 * specified object.
	 * 
	 * @param eObject
	 *            The referenced object.
	 * @return The non-navigable inverse references to the object.
	 */
	public static Collection<EStructuralFeature.Setting> getNonNavigableInverseReferences(
			EObject eObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter
			.getCrossReferenceAdapter(eObject);
		return crossReferenceAdapter == null
			? Collections.<EStructuralFeature.Setting> emptyList()
			: crossReferenceAdapter.getNonNavigableInverseReferences(eObject);
	}

	/**
	 * Retrieves a collection of inverse references to the specified object.
	 * 
	 * @param eObject
	 *            The referenced object.
	 * @return The inverse references to the object.
	 */
	public static Collection<EStructuralFeature.Setting> getInverseReferences(
			EObject eObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter
			.getCrossReferenceAdapter(eObject);
		return crossReferenceAdapter == null
			? Collections.<EStructuralFeature.Setting> emptyList()
			: crossReferenceAdapter.getInverseReferences(eObject);
	}

	protected static void removeReferences(EObject eObject,
			EObject ancestorEObject) {

		for (EStructuralFeature.Setting nonNavigableInverseReference : new ArrayList<EStructuralFeature.Setting>(
			getNonNavigableInverseReferences(eObject))) {

			if (nonNavigableInverseReference.getEStructuralFeature()
				.isChangeable()
				&& (ancestorEObject == null || !EcoreUtil.isAncestor(
					ancestorEObject, nonNavigableInverseReference.getEObject()))) {

				EcoreUtil.remove(nonNavigableInverseReference, eObject);
			}
		}

		for (EReference eReference : eObject.eClass().getEAllReferences()) {

			if (eReference.isChangeable() && !eReference.isContainer()
				&& !eReference.isContainment() && eObject.eIsSet(eReference)) {

				if (eReference.isMany()) {

					for (Iterator<?> values = ((List<?>) eObject
						.eGet(eReference)).iterator(); values.hasNext();) {

						Object value = values.next();

						if (ancestorEObject == null
							|| !EcoreUtil.isAncestor(ancestorEObject,
								(EObject) value)) {

							values.remove();
						}
					}
				} else {

					if (ancestorEObject == null
						|| !EcoreUtil.isAncestor(ancestorEObject,
							(EObject) eObject.eGet(eReference))) {

						eObject.eUnset(eReference);
					}
				}
			}
		}
	}

	protected static void destroy(EObject eObject) {

		if (eObject.eContents().isEmpty()) {
			removeReferences(eObject, eObject);
			eObject.eAdapters().clear();
		} else {

			for (Iterator<EObject> allContents = getAllContents(eObject, true,
				false); allContents.hasNext();) {

				removeReferences(allContents.next(), eObject);
			}

			for (Iterator<EObject> allContents = getAllContents(eObject, true,
				false); allContents.hasNext();) {

				(allContents.next()).eAdapters().clear();
			}
		}

		EcoreUtil.remove(eObject);
	}

	protected static void destroyAll(Collection<? extends EObject> eObjects) {

		for (Iterator<? extends EObject> o = eObjects.iterator(); o.hasNext();) {
			destroy(o.next());
		}
	}

	/**
	 * Loads a resource with the specified URI into the specified resource set
	 * and retrieves the first instance of the specified class from its
	 * contents.
	 * 
	 * @param resourceSet
	 *            The resource set into which to load the resource.
	 * @param uri
	 *            The URI of the resource to be loaded.
	 * @param eClass
	 *            The class of the object to be retrieved.
	 * @return The first instance of the class in the resource.
	 */
	public static <T> T load(ResourceSet resourceSet, URI uri, EClass eClass) {

		try {
			@SuppressWarnings("unchecked")
			T objectByType = (T) EcoreUtil.getObjectByType(resourceSet
				.getResource(uri, true).getContents(), eClass);
			return objectByType;
		} catch (Exception e) {
			return null;
		}
	}

	protected static boolean intersect(Collection<?> collection,
			Collection<?> otherCollection) {
		return !Collections.disjoint(collection, otherCollection);
	}
	
	/**
	 * Load a class from the specified system property.
	 * Any exceptions resulting from class loading failures will be logged.
	 * 
	 * If the system property is separated with a ':' then the first part indicates
	 * the pluginId and the trailing part indicates the class name.
	 * 
	 * @param systemProperty 
	 * 			The system property containing the location of the class to be loaded.
	 * @return
	 * 			The loaded class.
	 * @since 1.5
	 */	
	@SuppressWarnings("unchecked")
	public static <T> T loadClassFromSystemProperty(String systemProperty) {
		String property = System.getProperty(systemProperty);

		if (!isEmpty(property)) {

			try {
				int index = property.indexOf(':');

				if (index != -1) {
					return  (T) org.eclipse.emf.common.CommonPlugin.loadClass(
						property.substring(0, index),
						property.substring(index + 1)).newInstance();
				} else {
					return (T) Class.forName(property).newInstance();
				}
			} catch (Exception e) {
				//CommonPlugin.INSTANCE.log(e);
				NIEMResourceLoader.INSTANCE.log(e);
			}
		}

		return null;
	}
}
