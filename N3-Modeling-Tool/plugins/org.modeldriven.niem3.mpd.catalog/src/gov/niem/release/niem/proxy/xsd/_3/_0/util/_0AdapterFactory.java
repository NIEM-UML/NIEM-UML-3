/**
 */
package gov.niem.release.niem.proxy.xsd._3._0.util;

import gov.niem.release.niem.proxy.xsd._3._0.AnyURI;
import gov.niem.release.niem.proxy.xsd._3._0.Base64Binary;
import gov.niem.release.niem.proxy.xsd._3._0.Date;
import gov.niem.release.niem.proxy.xsd._3._0.DateTime;
import gov.niem.release.niem.proxy.xsd._3._0.Decimal;
import gov.niem.release.niem.proxy.xsd._3._0.Duration;
import gov.niem.release.niem.proxy.xsd._3._0.GDay;
import gov.niem.release.niem.proxy.xsd._3._0.GMonth;
import gov.niem.release.niem.proxy.xsd._3._0.GMonthDay;
import gov.niem.release.niem.proxy.xsd._3._0.GYear;
import gov.niem.release.niem.proxy.xsd._3._0.GYearMonth;
import gov.niem.release.niem.proxy.xsd._3._0.HexBinary;
import gov.niem.release.niem.proxy.xsd._3._0.Int;
import gov.niem.release.niem.proxy.xsd._3._0.Language;
import gov.niem.release.niem.proxy.xsd._3._0.NegativeInteger;
import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;
import gov.niem.release.niem.proxy.xsd._3._0.NonPositiveInteger;
import gov.niem.release.niem.proxy.xsd._3._0.NormalizedString;
import gov.niem.release.niem.proxy.xsd._3._0.PositiveInteger;
import gov.niem.release.niem.proxy.xsd._3._0.Time;
import gov.niem.release.niem.proxy.xsd._3._0.Token;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedByte;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedLong;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedShort;
import gov.niem.release.niem.proxy.xsd._3._0._0Package;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.proxy.xsd._3._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseAnyURI(AnyURI object) {
				return createAnyURIAdapter();
			}
			@Override
			public Adapter caseBase64Binary(Base64Binary object) {
				return createBase64BinaryAdapter();
			}
			@Override
			public Adapter caseBoolean(gov.niem.release.niem.proxy.xsd._3._0.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseByte(gov.niem.release.niem.proxy.xsd._3._0.Byte object) {
				return createByteAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseDouble(gov.niem.release.niem.proxy.xsd._3._0.Double object) {
				return createDoubleAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseFloat(gov.niem.release.niem.proxy.xsd._3._0.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseGDay(GDay object) {
				return createGDayAdapter();
			}
			@Override
			public Adapter caseGMonth(GMonth object) {
				return createGMonthAdapter();
			}
			@Override
			public Adapter caseGMonthDay(GMonthDay object) {
				return createGMonthDayAdapter();
			}
			@Override
			public Adapter caseGYear(GYear object) {
				return createGYearAdapter();
			}
			@Override
			public Adapter caseGYearMonth(GYearMonth object) {
				return createGYearMonthAdapter();
			}
			@Override
			public Adapter caseHexBinary(HexBinary object) {
				return createHexBinaryAdapter();
			}
			@Override
			public Adapter caseInt(Int object) {
				return createIntAdapter();
			}
			@Override
			public Adapter caseInteger(gov.niem.release.niem.proxy.xsd._3._0.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseLong(gov.niem.release.niem.proxy.xsd._3._0.Long object) {
				return createLongAdapter();
			}
			@Override
			public Adapter caseNegativeInteger(NegativeInteger object) {
				return createNegativeIntegerAdapter();
			}
			@Override
			public Adapter caseNonNegativeInteger(NonNegativeInteger object) {
				return createNonNegativeIntegerAdapter();
			}
			@Override
			public Adapter caseNonPositiveInteger(NonPositiveInteger object) {
				return createNonPositiveIntegerAdapter();
			}
			@Override
			public Adapter caseNormalizedString(NormalizedString object) {
				return createNormalizedStringAdapter();
			}
			@Override
			public Adapter casePositiveInteger(PositiveInteger object) {
				return createPositiveIntegerAdapter();
			}
			@Override
			public Adapter caseShort(gov.niem.release.niem.proxy.xsd._3._0.Short object) {
				return createShortAdapter();
			}
			@Override
			public Adapter caseString(gov.niem.release.niem.proxy.xsd._3._0.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseUnsignedByte(UnsignedByte object) {
				return createUnsignedByteAdapter();
			}
			@Override
			public Adapter caseUnsignedInt(UnsignedInt object) {
				return createUnsignedIntAdapter();
			}
			@Override
			public Adapter caseUnsignedLong(UnsignedLong object) {
				return createUnsignedLongAdapter();
			}
			@Override
			public Adapter caseUnsignedShort(UnsignedShort object) {
				return createUnsignedShortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.AnyURI <em>Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.AnyURI
	 * @generated
	 */
	public Adapter createAnyURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Base64Binary
	 * @generated
	 */
	public Adapter createBase64BinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Byte
	 * @generated
	 */
	public Adapter createByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.GDay <em>GDay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.GDay
	 * @generated
	 */
	public Adapter createGDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.GMonth <em>GMonth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.GMonth
	 * @generated
	 */
	public Adapter createGMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.GMonthDay <em>GMonth Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.GMonthDay
	 * @generated
	 */
	public Adapter createGMonthDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.GYear <em>GYear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.GYear
	 * @generated
	 */
	public Adapter createGYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.GYearMonth <em>GYear Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.GYearMonth
	 * @generated
	 */
	public Adapter createGYearMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.HexBinary <em>Hex Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.HexBinary
	 * @generated
	 */
	public Adapter createHexBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Int
	 * @generated
	 */
	public Adapter createIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Long
	 * @generated
	 */
	public Adapter createLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.NegativeInteger <em>Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.NegativeInteger
	 * @generated
	 */
	public Adapter createNegativeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger <em>Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger
	 * @generated
	 */
	public Adapter createNonNegativeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.NonPositiveInteger <em>Non Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.NonPositiveInteger
	 * @generated
	 */
	public Adapter createNonPositiveIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.NormalizedString <em>Normalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.NormalizedString
	 * @generated
	 */
	public Adapter createNormalizedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.PositiveInteger <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.PositiveInteger
	 * @generated
	 */
	public Adapter createPositiveIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Short
	 * @generated
	 */
	public Adapter createShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.UnsignedByte <em>Unsigned Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.UnsignedByte
	 * @generated
	 */
	public Adapter createUnsignedByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt
	 * @generated
	 */
	public Adapter createUnsignedIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.UnsignedLong <em>Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.UnsignedLong
	 * @generated
	 */
	public Adapter createUnsignedLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.UnsignedShort <em>Unsigned Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.UnsignedShort
	 * @generated
	 */
	public Adapter createUnsignedShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_0AdapterFactory
