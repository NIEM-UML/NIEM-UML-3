/**
 */
package gov.niem.release.niem.niem.core._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Passport Category Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for a kind of passport.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportCategoryCodeSimpleType()
 * @model extendedMetaData="name='PassportCategoryCodeSimpleType'"
 * @generated
 */
public enum PassportCategoryCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Diplomat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIPLOMAT_VALUE
	 * @generated
	 * @ordered
	 */
	DIPLOMAT(0, "Diplomat", "Diplomat"),

	/**
	 * The '<em><b>Individual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INDIVIDUAL(1, "Individual", "Individual"),

	/**
	 * The '<em><b>Official</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICIAL(2, "Official", "Official");

	/**
	 * The '<em><b>Diplomat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diplomat
	 * <!-- end-model-doc -->
	 * @see #DIPLOMAT
	 * @model name="Diplomat"
	 * @generated
	 * @ordered
	 */
	public static final int DIPLOMAT_VALUE = 0;

	/**
	 * The '<em><b>Individual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual
	 * <!-- end-model-doc -->
	 * @see #INDIVIDUAL
	 * @model name="Individual"
	 * @generated
	 * @ordered
	 */
	public static final int INDIVIDUAL_VALUE = 1;

	/**
	 * The '<em><b>Official</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official
	 * <!-- end-model-doc -->
	 * @see #OFFICIAL
	 * @model name="Official"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Passport Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PassportCategoryCodeSimpleType[] VALUES_ARRAY =
		new PassportCategoryCodeSimpleType[] {
			DIPLOMAT,
			INDIVIDUAL,
			OFFICIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Passport Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PassportCategoryCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Passport Category Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PassportCategoryCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassportCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passport Category Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PassportCategoryCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassportCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passport Category Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PassportCategoryCodeSimpleType get(int value) {
		switch (value) {
			case DIPLOMAT_VALUE: return DIPLOMAT;
			case INDIVIDUAL_VALUE: return INDIVIDUAL;
			case OFFICIAL_VALUE: return OFFICIAL;
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
	private PassportCategoryCodeSimpleType(int value, String name, String literal) {
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
	
} //PassportCategoryCodeSimpleType
