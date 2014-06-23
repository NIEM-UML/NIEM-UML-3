/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Person Name Category Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for a kind of person name.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package#getPersonNameCategoryCodeSimpleType()
 * @model extendedMetaData="name='PersonNameCategoryCodeSimpleType'"
 * @generated
 */
public enum PersonNameCategoryCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Alternate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATE(0, "Alternate", "Alternate"),

	/**
	 * The '<em><b>Asserted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTED(1, "Asserted", "Asserted"),

	/**
	 * The '<em><b>Legal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL(2, "Legal", "Legal");

	/**
	 * The '<em><b>Alternate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate
	 * <!-- end-model-doc -->
	 * @see #ALTERNATE
	 * @model name="Alternate"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATE_VALUE = 0;

	/**
	 * The '<em><b>Asserted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asserted
	 * <!-- end-model-doc -->
	 * @see #ASSERTED
	 * @model name="Asserted"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTED_VALUE = 1;

	/**
	 * The '<em><b>Legal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legal
	 * <!-- end-model-doc -->
	 * @see #LEGAL
	 * @model name="Legal"
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Person Name Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonNameCategoryCodeSimpleType[] VALUES_ARRAY =
		new PersonNameCategoryCodeSimpleType[] {
			ALTERNATE,
			ASSERTED,
			LEGAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Person Name Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonNameCategoryCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Person Name Category Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonNameCategoryCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonNameCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Name Category Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonNameCategoryCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonNameCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Name Category Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonNameCategoryCodeSimpleType get(int value) {
		switch (value) {
			case ALTERNATE_VALUE: return ALTERNATE;
			case ASSERTED_VALUE: return ASSERTED;
			case LEGAL_VALUE: return LEGAL;
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
	private PersonNameCategoryCodeSimpleType(int value, String name, String literal) {
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
	
} //PersonNameCategoryCodeSimpleType
