/**
 */
package gov.niem.release.niem.codes.deaCtlsub._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DEA Class Schedule Code Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for a class to which the Drug Enforcement Agency (DEA) has assigned the product under the Controlled Substances Act of 1970.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.deaCtlsub._3._0._0Package#getDEAClassScheduleCodeCodeSimpleType()
 * @model extendedMetaData="name='DEAClassScheduleCodeCodeSimpleType'"
 * @generated
 */
public enum DEAClassScheduleCodeCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I_VALUE
	 * @generated
	 * @ordered
	 */
	I(0, "I", "I"),

	/**
	 * The '<em><b>II</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #II_VALUE
	 * @generated
	 * @ordered
	 */
	II(1, "II", "II"),

	/**
	 * The '<em><b>III</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #III_VALUE
	 * @generated
	 * @ordered
	 */
	III(2, "III", "III"),

	/**
	 * The '<em><b>IV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IV_VALUE
	 * @generated
	 * @ordered
	 */
	IV(3, "IV", "IV"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(4, "V", "V");

	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule I Controlled Substances.  Substances in this schedule have no currently accepted medical use in the United States, a lack of accepted safety for use under medical supervision, and a high potential for abuse.
	 * <!-- end-model-doc -->
	 * @see #I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I_VALUE = 0;

	/**
	 * The '<em><b>II</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule II Controlled Substances.  Substances in this schedule have a high potential for abuse which may lead to severe psychological or physical dependence.
	 * <!-- end-model-doc -->
	 * @see #II
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int II_VALUE = 1;

	/**
	 * The '<em><b>III</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule III Controlled Substances.  Substances in this schedule have a potential for abuse less than substances in Schedules I or II and abuse may lead to moderate or low physical dependence or high psychological dependence.
	 * <!-- end-model-doc -->
	 * @see #III
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int III_VALUE = 2;

	/**
	 * The '<em><b>IV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule IV Controlled Substances.  Substances in this schedule have a low potential for abuse relative to substances in Schedule III.
	 * <!-- end-model-doc -->
	 * @see #IV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IV_VALUE = 3;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule V Controlled Substances.  Substances in this schedule have a low potential for abuse relative to substances listed in Schedule IV and consist primarily of preparations containing limited quantities of certain narcotics.
	 * <!-- end-model-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 4;

	/**
	 * An array of all the '<em><b>DEA Class Schedule Code Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DEAClassScheduleCodeCodeSimpleType[] VALUES_ARRAY =
		new DEAClassScheduleCodeCodeSimpleType[] {
			I,
			II,
			III,
			IV,
			V,
		};

	/**
	 * A public read-only list of all the '<em><b>DEA Class Schedule Code Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DEAClassScheduleCodeCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DEA Class Schedule Code Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DEAClassScheduleCodeCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DEAClassScheduleCodeCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DEA Class Schedule Code Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DEAClassScheduleCodeCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DEAClassScheduleCodeCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DEA Class Schedule Code Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DEAClassScheduleCodeCodeSimpleType get(int value) {
		switch (value) {
			case I_VALUE: return I;
			case II_VALUE: return II;
			case III_VALUE: return III;
			case IV_VALUE: return IV;
			case V_VALUE: return V;
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
	private DEAClassScheduleCodeCodeSimpleType(int value, String name, String literal) {
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
	
} //DEAClassScheduleCodeCodeSimpleType
