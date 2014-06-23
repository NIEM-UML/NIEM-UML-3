/**
 */
package gov.niem.niem.proxy.xsd._2.impl;

import gov.niem.niem.proxy.xsd._2.AnyURI;
import gov.niem.niem.proxy.xsd._2.Base64Binary;
import gov.niem.niem.proxy.xsd._2.Date;
import gov.niem.niem.proxy.xsd._2.DateTime;
import gov.niem.niem.proxy.xsd._2.Decimal;
import gov.niem.niem.proxy.xsd._2.Duration;
import gov.niem.niem.proxy.xsd._2.GMonth;
import gov.niem.niem.proxy.xsd._2.GYear;
import gov.niem.niem.proxy.xsd._2.GYearMonth;
import gov.niem.niem.proxy.xsd._2.HexBinary;
import gov.niem.niem.proxy.xsd._2.NonNegativeInteger;
import gov.niem.niem.proxy.xsd._2.Time;
import gov.niem.niem.proxy.xsd._2.Token;
import gov.niem.niem.proxy.xsd._2._2Factory;
import gov.niem.niem.proxy.xsd._2._2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2FactoryImpl extends EFactoryImpl implements _2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _2Factory init() {
		try {
			_2Factory the_2Factory = (_2Factory)EPackage.Registry.INSTANCE.getEFactory(_2Package.eNS_URI);
			if (the_2Factory != null) {
				return the_2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _2Package.ANY_URI: return createAnyURI();
			case _2Package.BASE64_BINARY: return createBase64Binary();
			case _2Package.BOOLEAN: return createBoolean();
			case _2Package.DATE: return createDate();
			case _2Package.DATE_TIME: return createDateTime();
			case _2Package.DECIMAL: return createDecimal();
			case _2Package.DURATION: return createDuration();
			case _2Package.GMONTH: return createGMonth();
			case _2Package.GYEAR: return createGYear();
			case _2Package.GYEAR_MONTH: return createGYearMonth();
			case _2Package.HEX_BINARY: return createHexBinary();
			case _2Package.INTEGER: return createInteger();
			case _2Package.NON_NEGATIVE_INTEGER: return createNonNegativeInteger();
			case _2Package.STRING: return createString();
			case _2Package.TIME: return createTime();
			case _2Package.TOKEN: return createToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyURI createAnyURI() {
		AnyURIImpl anyURI = new AnyURIImpl();
		return anyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMonth createGMonth() {
		GMonthImpl gMonth = new GMonthImpl();
		return gMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GYear createGYear() {
		GYearImpl gYear = new GYearImpl();
		return gYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GYearMonth createGYearMonth() {
		GYearMonthImpl gYearMonth = new GYearMonthImpl();
		return gYearMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexBinary createHexBinary() {
		HexBinaryImpl hexBinary = new HexBinaryImpl();
		return hexBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger createNonNegativeInteger() {
		NonNegativeIntegerImpl nonNegativeInteger = new NonNegativeIntegerImpl();
		return nonNegativeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2Package get_2Package() {
		return (_2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _2Package getPackage() {
		return _2Package.eINSTANCE;
	}

} //_2FactoryImpl
