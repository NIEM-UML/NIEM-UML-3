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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.proxy.xsd._3._0._0Package
 * @generated
 */
public class _0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.ANY_URI: {
				AnyURI anyURI = (AnyURI)theEObject;
				T result = caseAnyURI(anyURI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BASE64_BINARY: {
				Base64Binary base64Binary = (Base64Binary)theEObject;
				T result = caseBase64Binary(base64Binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BOOLEAN: {
				gov.niem.release.niem.proxy.xsd._3._0.Boolean boolean_ = (gov.niem.release.niem.proxy.xsd._3._0.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BYTE: {
				gov.niem.release.niem.proxy.xsd._3._0.Byte byte_ = (gov.niem.release.niem.proxy.xsd._3._0.Byte)theEObject;
				T result = caseByte(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOUBLE: {
				gov.niem.release.niem.proxy.xsd._3._0.Double double_ = (gov.niem.release.niem.proxy.xsd._3._0.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FLOAT: {
				gov.niem.release.niem.proxy.xsd._3._0.Float float_ = (gov.niem.release.niem.proxy.xsd._3._0.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GDAY: {
				GDay gDay = (GDay)theEObject;
				T result = caseGDay(gDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GMONTH: {
				GMonth gMonth = (GMonth)theEObject;
				T result = caseGMonth(gMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GMONTH_DAY: {
				GMonthDay gMonthDay = (GMonthDay)theEObject;
				T result = caseGMonthDay(gMonthDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GYEAR: {
				GYear gYear = (GYear)theEObject;
				T result = caseGYear(gYear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GYEAR_MONTH: {
				GYearMonth gYearMonth = (GYearMonth)theEObject;
				T result = caseGYearMonth(gYearMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.HEX_BINARY: {
				HexBinary hexBinary = (HexBinary)theEObject;
				T result = caseHexBinary(hexBinary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INTEGER: {
				gov.niem.release.niem.proxy.xsd._3._0.Integer integer = (gov.niem.release.niem.proxy.xsd._3._0.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LONG: {
				gov.niem.release.niem.proxy.xsd._3._0.Long long_ = (gov.niem.release.niem.proxy.xsd._3._0.Long)theEObject;
				T result = caseLong(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NEGATIVE_INTEGER: {
				NegativeInteger negativeInteger = (NegativeInteger)theEObject;
				T result = caseNegativeInteger(negativeInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NON_NEGATIVE_INTEGER: {
				NonNegativeInteger nonNegativeInteger = (NonNegativeInteger)theEObject;
				T result = caseNonNegativeInteger(nonNegativeInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NON_POSITIVE_INTEGER: {
				NonPositiveInteger nonPositiveInteger = (NonPositiveInteger)theEObject;
				T result = caseNonPositiveInteger(nonPositiveInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NORMALIZED_STRING: {
				NormalizedString normalizedString = (NormalizedString)theEObject;
				T result = caseNormalizedString(normalizedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSITIVE_INTEGER: {
				PositiveInteger positiveInteger = (PositiveInteger)theEObject;
				T result = casePositiveInteger(positiveInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SHORT: {
				gov.niem.release.niem.proxy.xsd._3._0.Short short_ = (gov.niem.release.niem.proxy.xsd._3._0.Short)theEObject;
				T result = caseShort(short_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.STRING: {
				gov.niem.release.niem.proxy.xsd._3._0.String string = (gov.niem.release.niem.proxy.xsd._3._0.String)theEObject;
				T result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UNSIGNED_BYTE: {
				UnsignedByte unsignedByte = (UnsignedByte)theEObject;
				T result = caseUnsignedByte(unsignedByte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UNSIGNED_INT: {
				UnsignedInt unsignedInt = (UnsignedInt)theEObject;
				T result = caseUnsignedInt(unsignedInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UNSIGNED_LONG: {
				UnsignedLong unsignedLong = (UnsignedLong)theEObject;
				T result = caseUnsignedLong(unsignedLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UNSIGNED_SHORT: {
				UnsignedShort unsignedShort = (UnsignedShort)theEObject;
				T result = caseUnsignedShort(unsignedShort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any URI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any URI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyURI(AnyURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Binary(Base64Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(gov.niem.release.niem.proxy.xsd._3._0.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(gov.niem.release.niem.proxy.xsd._3._0.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(gov.niem.release.niem.proxy.xsd._3._0.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(gov.niem.release.niem.proxy.xsd._3._0.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GDay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GDay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGDay(GDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GMonth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GMonth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMonth(GMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GMonth Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GMonth Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMonthDay(GMonthDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GYear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GYear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGYear(GYear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GYear Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GYear Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGYearMonth(GYearMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexBinary(HexBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(gov.niem.release.niem.proxy.xsd._3._0.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong(gov.niem.release.niem.proxy.xsd._3._0.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeInteger(NegativeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeInteger(NonNegativeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Positive Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonPositiveInteger(NonPositiveInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalized String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalized String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalizedString(NormalizedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInteger(PositiveInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShort(gov.niem.release.niem.proxy.xsd._3._0.Short object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(gov.niem.release.niem.proxy.xsd._3._0.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedByte(UnsignedByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInt(UnsignedInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedLong(UnsignedLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedShort(UnsignedShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch
