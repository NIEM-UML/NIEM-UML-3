/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Day Of Week Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for days of the week.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package#getDayOfWeekCodeSimpleType()
 * @model extendedMetaData="name='DayOfWeekCodeSimpleType'"
 * @generated
 */
public enum DayOfWeekCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>FRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRI_VALUE
	 * @generated
	 * @ordered
	 */
	FRI(0, "FRI", "FRI"),

	/**
	 * The '<em><b>MON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MON_VALUE
	 * @generated
	 * @ordered
	 */
	MON(1, "MON", "MON"),

	/**
	 * The '<em><b>SAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_VALUE
	 * @generated
	 * @ordered
	 */
	SAT(2, "SAT", "SAT"),

	/**
	 * The '<em><b>SUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUN_VALUE
	 * @generated
	 * @ordered
	 */
	SUN(3, "SUN", "SUN"),

	/**
	 * The '<em><b>THU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THU_VALUE
	 * @generated
	 * @ordered
	 */
	THU(4, "THU", "THU"),

	/**
	 * The '<em><b>TUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUE_VALUE
	 * @generated
	 * @ordered
	 */
	TUE(5, "TUE", "TUE"),

	/**
	 * The '<em><b>WED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WED_VALUE
	 * @generated
	 * @ordered
	 */
	WED(6, "WED", "WED");

	/**
	 * The '<em><b>FRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Friday
	 * <!-- end-model-doc -->
	 * @see #FRI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRI_VALUE = 0;

	/**
	 * The '<em><b>MON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monday
	 * <!-- end-model-doc -->
	 * @see #MON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MON_VALUE = 1;

	/**
	 * The '<em><b>SAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saturday
	 * <!-- end-model-doc -->
	 * @see #SAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT_VALUE = 2;

	/**
	 * The '<em><b>SUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sunday
	 * <!-- end-model-doc -->
	 * @see #SUN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUN_VALUE = 3;

	/**
	 * The '<em><b>THU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thursday
	 * <!-- end-model-doc -->
	 * @see #THU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THU_VALUE = 4;

	/**
	 * The '<em><b>TUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuesday
	 * <!-- end-model-doc -->
	 * @see #TUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUE_VALUE = 5;

	/**
	 * The '<em><b>WED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wednesday
	 * <!-- end-model-doc -->
	 * @see #WED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Day Of Week Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DayOfWeekCodeSimpleType[] VALUES_ARRAY =
		new DayOfWeekCodeSimpleType[] {
			FRI,
			MON,
			SAT,
			SUN,
			THU,
			TUE,
			WED,
		};

	/**
	 * A public read-only list of all the '<em><b>Day Of Week Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DayOfWeekCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Day Of Week Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DayOfWeekCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DayOfWeekCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Day Of Week Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DayOfWeekCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DayOfWeekCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Day Of Week Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DayOfWeekCodeSimpleType get(int value) {
		switch (value) {
			case FRI_VALUE: return FRI;
			case MON_VALUE: return MON;
			case SAT_VALUE: return SAT;
			case SUN_VALUE: return SUN;
			case THU_VALUE: return THU;
			case TUE_VALUE: return TUE;
			case WED_VALUE: return WED;
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
	private DayOfWeekCodeSimpleType(int value, String name, String literal) {
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
	
} //DayOfWeekCodeSimpleType
