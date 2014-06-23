/**
 */
package gov.niem.release.niem.niem.core._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Separation Category Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for a code that identifies the type of separation between the parties in a Person Union.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSeparationCategoryCodeSimpleType()
 * @model extendedMetaData="name='SeparationCategoryCodeSimpleType'"
 * @generated
 */
public enum SeparationCategoryCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Legal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL(0, "Legal", "Legal"),

	/**
	 * The '<em><b>Physical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL(1, "Physical", "Physical"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(2, "Unknown", "Unknown");

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
	public static final int LEGAL_VALUE = 0;

	/**
	 * The '<em><b>Physical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical
	 * <!-- end-model-doc -->
	 * @see #PHYSICAL
	 * @model name="Physical"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_VALUE = 1;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Separation Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeparationCategoryCodeSimpleType[] VALUES_ARRAY =
		new SeparationCategoryCodeSimpleType[] {
			LEGAL,
			PHYSICAL,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Separation Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SeparationCategoryCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Separation Category Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeparationCategoryCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeparationCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Separation Category Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeparationCategoryCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeparationCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Separation Category Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeparationCategoryCodeSimpleType get(int value) {
		switch (value) {
			case LEGAL_VALUE: return LEGAL;
			case PHYSICAL_VALUE: return PHYSICAL;
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
	private SeparationCategoryCodeSimpleType(int value, String name, String literal) {
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
	
} //SeparationCategoryCodeSimpleType
