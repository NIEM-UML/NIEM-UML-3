/**
 */
package gov.niem.release.niem.niem.core._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Person Union Status Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type describing the legal status of a person's union with another person.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionStatusCodeSimpleType()
 * @model extendedMetaData="name='PersonUnionStatusCodeSimpleType'"
 * @generated
 */
public enum PersonUnionStatusCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Anulled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANULLED_VALUE
	 * @generated
	 * @ordered
	 */
	ANULLED(0, "anulled", "anulled"),

	/**
	 * The '<em><b>Dissolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISSOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	DISSOLVED(1, "dissolved", "dissolved"),

	/**
	 * The '<em><b>Married</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARRIED_VALUE
	 * @generated
	 * @ordered
	 */
	MARRIED(2, "married", "married"),

	/**
	 * The '<em><b>Separated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATED_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATED(3, "separated", "separated"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(4, "unknown", "unknown"),

	/**
	 * The '<em><b>Widowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDOWED_VALUE
	 * @generated
	 * @ordered
	 */
	WIDOWED(5, "widowed", "widowed");

	/**
	 * The '<em><b>Anulled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * anulled
	 * <!-- end-model-doc -->
	 * @see #ANULLED
	 * @model name="anulled"
	 * @generated
	 * @ordered
	 */
	public static final int ANULLED_VALUE = 0;

	/**
	 * The '<em><b>Dissolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dissolved
	 * <!-- end-model-doc -->
	 * @see #DISSOLVED
	 * @model name="dissolved"
	 * @generated
	 * @ordered
	 */
	public static final int DISSOLVED_VALUE = 1;

	/**
	 * The '<em><b>Married</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * married
	 * <!-- end-model-doc -->
	 * @see #MARRIED
	 * @model name="married"
	 * @generated
	 * @ordered
	 */
	public static final int MARRIED_VALUE = 2;

	/**
	 * The '<em><b>Separated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * separated
	 * <!-- end-model-doc -->
	 * @see #SEPARATED
	 * @model name="separated"
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATED_VALUE = 3;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 4;

	/**
	 * The '<em><b>Widowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * widowed
	 * <!-- end-model-doc -->
	 * @see #WIDOWED
	 * @model name="widowed"
	 * @generated
	 * @ordered
	 */
	public static final int WIDOWED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Person Union Status Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonUnionStatusCodeSimpleType[] VALUES_ARRAY =
		new PersonUnionStatusCodeSimpleType[] {
			ANULLED,
			DISSOLVED,
			MARRIED,
			SEPARATED,
			UNKNOWN,
			WIDOWED,
		};

	/**
	 * A public read-only list of all the '<em><b>Person Union Status Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonUnionStatusCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Person Union Status Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonUnionStatusCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonUnionStatusCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Union Status Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonUnionStatusCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonUnionStatusCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Union Status Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonUnionStatusCodeSimpleType get(int value) {
		switch (value) {
			case ANULLED_VALUE: return ANULLED;
			case DISSOLVED_VALUE: return DISSOLVED;
			case MARRIED_VALUE: return MARRIED;
			case SEPARATED_VALUE: return SEPARATED;
			case UNKNOWN_VALUE: return UNKNOWN;
			case WIDOWED_VALUE: return WIDOWED;
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
	private PersonUnionStatusCodeSimpleType(int value, String name, String literal) {
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
	
} //PersonUnionStatusCodeSimpleType
