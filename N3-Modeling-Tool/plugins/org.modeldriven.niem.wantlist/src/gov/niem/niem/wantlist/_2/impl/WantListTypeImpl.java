/**
 */
package gov.niem.niem.wantlist._2.impl;

import gov.niem.niem.wantlist._2.AttributeType;
import gov.niem.niem.wantlist._2.ElementType;
import gov.niem.niem.wantlist._2.TypeType;
import gov.niem.niem.wantlist._2.WantListType;
import gov.niem.niem.wantlist._2.wantlistPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Want List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl#isNillableDefault <em>Nillable Default</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WantListTypeImpl extends MinimalEObjectImpl.Container implements WantListType {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeType> attribute;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> element;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeType> type;

	/**
	 * The default value of the '{@link #isNillableDefault() <em>Nillable Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillableDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NILLABLE_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNillableDefault() <em>Nillable Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillableDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean nillableDefault = NILLABLE_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Nillable Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nillableDefaultESet;

	/**
	 * The default value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected String product = PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected String release = RELEASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WantListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return wantlistPackage.Literals.WANT_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeType> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<AttributeType>(AttributeType.class, this, wantlistPackage.WANT_LIST_TYPE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ElementType>(ElementType.class, this, wantlistPackage.WANT_LIST_TYPE__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<TypeType>(TypeType.class, this, wantlistPackage.WANT_LIST_TYPE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNillableDefault() {
		return nillableDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNillableDefault(boolean newNillableDefault) {
		boolean oldNillableDefault = nillableDefault;
		nillableDefault = newNillableDefault;
		boolean oldNillableDefaultESet = nillableDefaultESet;
		nillableDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.WANT_LIST_TYPE__NILLABLE_DEFAULT, oldNillableDefault, nillableDefault, !oldNillableDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNillableDefault() {
		boolean oldNillableDefault = nillableDefault;
		boolean oldNillableDefaultESet = nillableDefaultESet;
		nillableDefault = NILLABLE_DEFAULT_EDEFAULT;
		nillableDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, wantlistPackage.WANT_LIST_TYPE__NILLABLE_DEFAULT, oldNillableDefault, NILLABLE_DEFAULT_EDEFAULT, oldNillableDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNillableDefault() {
		return nillableDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(String newProduct) {
		String oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.WANT_LIST_TYPE__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(String newRelease) {
		String oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.WANT_LIST_TYPE__RELEASE, oldRelease, release));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case wantlistPackage.WANT_LIST_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case wantlistPackage.WANT_LIST_TYPE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case wantlistPackage.WANT_LIST_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case wantlistPackage.WANT_LIST_TYPE__ATTRIBUTE:
				return getAttribute();
			case wantlistPackage.WANT_LIST_TYPE__ELEMENT:
				return getElement();
			case wantlistPackage.WANT_LIST_TYPE__TYPE:
				return getType();
			case wantlistPackage.WANT_LIST_TYPE__NILLABLE_DEFAULT:
				return isNillableDefault();
			case wantlistPackage.WANT_LIST_TYPE__PRODUCT:
				return getProduct();
			case wantlistPackage.WANT_LIST_TYPE__RELEASE:
				return getRelease();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case wantlistPackage.WANT_LIST_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends AttributeType>)newValue);
				return;
			case wantlistPackage.WANT_LIST_TYPE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ElementType>)newValue);
				return;
			case wantlistPackage.WANT_LIST_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeType>)newValue);
				return;
			case wantlistPackage.WANT_LIST_TYPE__NILLABLE_DEFAULT:
				setNillableDefault((Boolean)newValue);
				return;
			case wantlistPackage.WANT_LIST_TYPE__PRODUCT:
				setProduct((String)newValue);
				return;
			case wantlistPackage.WANT_LIST_TYPE__RELEASE:
				setRelease((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case wantlistPackage.WANT_LIST_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case wantlistPackage.WANT_LIST_TYPE__ELEMENT:
				getElement().clear();
				return;
			case wantlistPackage.WANT_LIST_TYPE__TYPE:
				getType().clear();
				return;
			case wantlistPackage.WANT_LIST_TYPE__NILLABLE_DEFAULT:
				unsetNillableDefault();
				return;
			case wantlistPackage.WANT_LIST_TYPE__PRODUCT:
				setProduct(PRODUCT_EDEFAULT);
				return;
			case wantlistPackage.WANT_LIST_TYPE__RELEASE:
				setRelease(RELEASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case wantlistPackage.WANT_LIST_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case wantlistPackage.WANT_LIST_TYPE__ELEMENT:
				return element != null && !element.isEmpty();
			case wantlistPackage.WANT_LIST_TYPE__TYPE:
				return type != null && !type.isEmpty();
			case wantlistPackage.WANT_LIST_TYPE__NILLABLE_DEFAULT:
				return isSetNillableDefault();
			case wantlistPackage.WANT_LIST_TYPE__PRODUCT:
				return PRODUCT_EDEFAULT == null ? product != null : !PRODUCT_EDEFAULT.equals(product);
			case wantlistPackage.WANT_LIST_TYPE__RELEASE:
				return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nillableDefault: ");
		if (nillableDefaultESet) result.append(nillableDefault); else result.append("<unset>");
		result.append(", product: ");
		result.append(product);
		result.append(", release: ");
		result.append(release);
		result.append(')');
		return result.toString();
	}

} //WantListTypeImpl
