/**
 */
package gov.niem.release.niem.niem.core._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Person Union Category Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type describing the legally recognized union between two persons.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionCategoryCodeSimpleType()
 * @model extendedMetaData="name='PersonUnionCategoryCodeSimpleType'"
 * @generated
 */
public enum PersonUnionCategoryCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Civil Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVIL_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	CIVIL_UNION(0, "civilUnion", "civil union"),

	/**
	 * The '<em><b>Common Law</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMON_LAW_VALUE
	 * @generated
	 * @ordered
	 */
	COMMON_LAW(1, "commonLaw", "common law"),

	/**
	 * The '<em><b>Domestic Partnership</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_PARTNERSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	DOMESTIC_PARTNERSHIP(2, "domesticPartnership", "domestic partnership"),

	/**
	 * The '<em><b>Married</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARRIED_VALUE
	 * @generated
	 * @ordered
	 */
	MARRIED(3, "married", "married"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(4, "unknown", "unknown");

	/**
	 * The '<em><b>Civil Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * civil union
	 * <!-- end-model-doc -->
	 * @see #CIVIL_UNION
	 * @model name="civilUnion" literal="civil union"
	 * @generated
	 * @ordered
	 */
	public static final int CIVIL_UNION_VALUE = 0;

	/**
	 * The '<em><b>Common Law</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * common law
	 * <!-- end-model-doc -->
	 * @see #COMMON_LAW
	 * @model name="commonLaw" literal="common law"
	 * @generated
	 * @ordered
	 */
	public static final int COMMON_LAW_VALUE = 1;

	/**
	 * The '<em><b>Domestic Partnership</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * domestic partnership
	 * <!-- end-model-doc -->
	 * @see #DOMESTIC_PARTNERSHIP
	 * @model name="domesticPartnership" literal="domestic partnership"
	 * @generated
	 * @ordered
	 */
	public static final int DOMESTIC_PARTNERSHIP_VALUE = 2;

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
	public static final int MARRIED_VALUE = 3;

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
	 * An array of all the '<em><b>Person Union Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonUnionCategoryCodeSimpleType[] VALUES_ARRAY =
		new PersonUnionCategoryCodeSimpleType[] {
			CIVIL_UNION,
			COMMON_LAW,
			DOMESTIC_PARTNERSHIP,
			MARRIED,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Person Union Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonUnionCategoryCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Person Union Category Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonUnionCategoryCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonUnionCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Union Category Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonUnionCategoryCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonUnionCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Union Category Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonUnionCategoryCodeSimpleType get(int value) {
		switch (value) {
			case CIVIL_UNION_VALUE: return CIVIL_UNION;
			case COMMON_LAW_VALUE: return COMMON_LAW;
			case DOMESTIC_PARTNERSHIP_VALUE: return DOMESTIC_PARTNERSHIP;
			case MARRIED_VALUE: return MARRIED;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private PersonUnionCategoryCodeSimpleType(int value, String name, String literal) {
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
	
} //PersonUnionCategoryCodeSimpleType
