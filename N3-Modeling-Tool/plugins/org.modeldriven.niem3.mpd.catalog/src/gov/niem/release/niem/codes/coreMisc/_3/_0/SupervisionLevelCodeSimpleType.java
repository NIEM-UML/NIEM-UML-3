/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Supervision Level Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for levels of supervision required for a person.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package#getSupervisionLevelCodeSimpleType()
 * @model extendedMetaData="name='SupervisionLevelCodeSimpleType'"
 * @generated
 */
public enum SupervisionLevelCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>1LOWRISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1LOWRISK_VALUE
	 * @generated
	 * @ordered
	 */
	_1LOWRISK(0, "_1LOWRISK", "1-LOW RISK"),

	/**
	 * The '<em><b>2MODERATERISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2MODERATERISK_VALUE
	 * @generated
	 * @ordered
	 */
	_2MODERATERISK(1, "_2MODERATERISK", "2-MODERATE RISK"),

	/**
	 * The '<em><b>3HIGHRISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3HIGHRISK_VALUE
	 * @generated
	 * @ordered
	 */
	_3HIGHRISK(2, "_3HIGHRISK", "3-HIGH RISK"),

	/**
	 * The '<em><b>4EXTREMERISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4EXTREMERISK_VALUE
	 * @generated
	 * @ordered
	 */
	_4EXTREMERISK(3, "_4EXTREMERISK", "4-EXTREME RISK"),

	/**
	 * The '<em><b>COMPACTOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACTOUT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACTOUT(4, "COMPACTOUT", "COMPACT OUT"),

	/**
	 * The '<em><b>FUGITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUGITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FUGITIVE(5, "FUGITIVE", "FUGITIVE"),

	/**
	 * The '<em><b>ISPI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPI_VALUE
	 * @generated
	 * @ordered
	 */
	ISPI(6, "ISPI", "ISP I"),

	/**
	 * The '<em><b>ISPII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPII_VALUE
	 * @generated
	 * @ordered
	 */
	ISPII(7, "ISPII", "ISP II"),

	/**
	 * The '<em><b>RESIDINSTATECUSTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDINSTATECUSTD_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDINSTATECUSTD(8, "RESIDINSTATECUSTD", "RESID/IN-STATE CUSTD");

	/**
	 * The '<em><b>1LOWRISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Low risk
	 * <!-- end-model-doc -->
	 * @see #_1LOWRISK
	 * @model literal="1-LOW RISK"
	 * @generated
	 * @ordered
	 */
	public static final int _1LOWRISK_VALUE = 0;

	/**
	 * The '<em><b>2MODERATERISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moderate risk
	 * <!-- end-model-doc -->
	 * @see #_2MODERATERISK
	 * @model literal="2-MODERATE RISK"
	 * @generated
	 * @ordered
	 */
	public static final int _2MODERATERISK_VALUE = 1;

	/**
	 * The '<em><b>3HIGHRISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High risk
	 * <!-- end-model-doc -->
	 * @see #_3HIGHRISK
	 * @model literal="3-HIGH RISK"
	 * @generated
	 * @ordered
	 */
	public static final int _3HIGHRISK_VALUE = 2;

	/**
	 * The '<em><b>4EXTREMERISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extreme risk
	 * <!-- end-model-doc -->
	 * @see #_4EXTREMERISK
	 * @model literal="4-EXTREME RISK"
	 * @generated
	 * @ordered
	 */
	public static final int _4EXTREMERISK_VALUE = 3;

	/**
	 * The '<em><b>COMPACTOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compact out
	 * <!-- end-model-doc -->
	 * @see #COMPACTOUT
	 * @model literal="COMPACT OUT"
	 * @generated
	 * @ordered
	 */
	public static final int COMPACTOUT_VALUE = 4;

	/**
	 * The '<em><b>FUGITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fugitive
	 * <!-- end-model-doc -->
	 * @see #FUGITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUGITIVE_VALUE = 5;

	/**
	 * The '<em><b>ISPI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISP I
	 * <!-- end-model-doc -->
	 * @see #ISPI
	 * @model literal="ISP I"
	 * @generated
	 * @ordered
	 */
	public static final int ISPI_VALUE = 6;

	/**
	 * The '<em><b>ISPII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISP II
	 * <!-- end-model-doc -->
	 * @see #ISPII
	 * @model literal="ISP II"
	 * @generated
	 * @ordered
	 */
	public static final int ISPII_VALUE = 7;

	/**
	 * The '<em><b>RESIDINSTATECUSTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RESID/IN-STATE CUSTODY
	 * <!-- end-model-doc -->
	 * @see #RESIDINSTATECUSTD
	 * @model literal="RESID/IN-STATE CUSTD"
	 * @generated
	 * @ordered
	 */
	public static final int RESIDINSTATECUSTD_VALUE = 8;

	/**
	 * An array of all the '<em><b>Supervision Level Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SupervisionLevelCodeSimpleType[] VALUES_ARRAY =
		new SupervisionLevelCodeSimpleType[] {
			_1LOWRISK,
			_2MODERATERISK,
			_3HIGHRISK,
			_4EXTREMERISK,
			COMPACTOUT,
			FUGITIVE,
			ISPI,
			ISPII,
			RESIDINSTATECUSTD,
		};

	/**
	 * A public read-only list of all the '<em><b>Supervision Level Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SupervisionLevelCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supervision Level Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SupervisionLevelCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SupervisionLevelCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supervision Level Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SupervisionLevelCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SupervisionLevelCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supervision Level Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SupervisionLevelCodeSimpleType get(int value) {
		switch (value) {
			case _1LOWRISK_VALUE: return _1LOWRISK;
			case _2MODERATERISK_VALUE: return _2MODERATERISK;
			case _3HIGHRISK_VALUE: return _3HIGHRISK;
			case _4EXTREMERISK_VALUE: return _4EXTREMERISK;
			case COMPACTOUT_VALUE: return COMPACTOUT;
			case FUGITIVE_VALUE: return FUGITIVE;
			case ISPI_VALUE: return ISPI;
			case ISPII_VALUE: return ISPII;
			case RESIDINSTATECUSTD_VALUE: return RESIDINSTATECUSTD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SupervisionLevelCodeSimpleType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SupervisionLevelCodeSimpleType
