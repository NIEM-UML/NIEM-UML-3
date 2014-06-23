/**
 */
package gov.niem.release.niem.proxy.xsd._3._0.impl;

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
import gov.niem.release.niem.proxy.xsd._3._0._0Factory;
import gov.niem.release.niem.proxy.xsd._3._0._0Package;

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
public class _0FactoryImpl extends EFactoryImpl implements _0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _0Factory init() {
		try {
			_0Factory the_0Factory = (_0Factory)EPackage.Registry.INSTANCE.getEFactory(_0Package.eNS_URI);
			if (the_0Factory != null) {
				return the_0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0FactoryImpl() {
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
			case _0Package.ANY_URI: return createAnyURI();
			case _0Package.BASE64_BINARY: return createBase64Binary();
			case _0Package.BOOLEAN: return createBoolean();
			case _0Package.BYTE: return createByte();
			case _0Package.DATE: return createDate();
			case _0Package.DATE_TIME: return createDateTime();
			case _0Package.DECIMAL: return createDecimal();
			case _0Package.DOUBLE: return createDouble();
			case _0Package.DURATION: return createDuration();
			case _0Package.FLOAT: return createFloat();
			case _0Package.GDAY: return createGDay();
			case _0Package.GMONTH: return createGMonth();
			case _0Package.GMONTH_DAY: return createGMonthDay();
			case _0Package.GYEAR: return createGYear();
			case _0Package.GYEAR_MONTH: return createGYearMonth();
			case _0Package.HEX_BINARY: return createHexBinary();
			case _0Package.INT: return createInt();
			case _0Package.INTEGER: return createInteger();
			case _0Package.LANGUAGE: return createLanguage();
			case _0Package.LONG: return createLong();
			case _0Package.NEGATIVE_INTEGER: return createNegativeInteger();
			case _0Package.NON_NEGATIVE_INTEGER: return createNonNegativeInteger();
			case _0Package.NON_POSITIVE_INTEGER: return createNonPositiveInteger();
			case _0Package.NORMALIZED_STRING: return createNormalizedString();
			case _0Package.POSITIVE_INTEGER: return createPositiveInteger();
			case _0Package.SHORT: return createShort();
			case _0Package.STRING: return createString();
			case _0Package.TIME: return createTime();
			case _0Package.TOKEN: return createToken();
			case _0Package.UNSIGNED_BYTE: return createUnsignedByte();
			case _0Package.UNSIGNED_INT: return createUnsignedInt();
			case _0Package.UNSIGNED_LONG: return createUnsignedLong();
			case _0Package.UNSIGNED_SHORT: return createUnsignedShort();
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
	public gov.niem.release.niem.proxy.xsd._3._0.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.Byte createByte() {
		ByteImpl byte_ = new ByteImpl();
		return byte_;
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
	public gov.niem.release.niem.proxy.xsd._3._0.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
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
	public gov.niem.release.niem.proxy.xsd._3._0.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDay createGDay() {
		GDayImpl gDay = new GDayImpl();
		return gDay;
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
	public GMonthDay createGMonthDay() {
		GMonthDayImpl gMonthDay = new GMonthDayImpl();
		return gMonthDay;
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
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeInteger createNegativeInteger() {
		NegativeIntegerImpl negativeInteger = new NegativeIntegerImpl();
		return negativeInteger;
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
	public NonPositiveInteger createNonPositiveInteger() {
		NonPositiveIntegerImpl nonPositiveInteger = new NonPositiveIntegerImpl();
		return nonPositiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizedString createNormalizedString() {
		NormalizedStringImpl normalizedString = new NormalizedStringImpl();
		return normalizedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger createPositiveInteger() {
		PositiveIntegerImpl positiveInteger = new PositiveIntegerImpl();
		return positiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.Short createShort() {
		ShortImpl short_ = new ShortImpl();
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String createString() {
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
	public UnsignedByte createUnsignedByte() {
		UnsignedByteImpl unsignedByte = new UnsignedByteImpl();
		return unsignedByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedLong createUnsignedLong() {
		UnsignedLongImpl unsignedLong = new UnsignedLongImpl();
		return unsignedLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedShort createUnsignedShort() {
		UnsignedShortImpl unsignedShort = new UnsignedShortImpl();
		return unsignedShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Package get_0Package() {
		return (_0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _0Package getPackage() {
		return _0Package.eINSTANCE;
	}

} //_0FactoryImpl
