/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contact Information Availability Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for a period of time or a situation in which an entity is available to be contacted with the given contact information.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package#getContactInformationAvailabilityCodeSimpleType()
 * @model extendedMetaData="name='ContactInformationAvailabilityCodeSimpleType'"
 * @generated
 */
public enum ContactInformationAvailabilityCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(0, "day", "day"),

	/**
	 * The '<em><b>Emergency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(1, "emergency", "emergency"),

	/**
	 * The '<em><b>Evening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENING_VALUE
	 * @generated
	 * @ordered
	 */
	EVENING(2, "evening", "evening"),

	/**
	 * The '<em><b>Night</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT(3, "night", "night"),

	/**
	 * The '<em><b>Primary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY(4, "primary", "primary"),

	/**
	 * The '<em><b>Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY(5, "secondary", "secondary");

	/**
	 * The '<em><b>Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daytime
	 * <!-- end-model-doc -->
	 * @see #DAY
	 * @model name="day"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 0;

	/**
	 * The '<em><b>Emergency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emergency
	 * <!-- end-model-doc -->
	 * @see #EMERGENCY
	 * @model name="emergency"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 1;

	/**
	 * The '<em><b>Evening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late day or early night
	 * <!-- end-model-doc -->
	 * @see #EVENING
	 * @model name="evening"
	 * @generated
	 * @ordered
	 */
	public static final int EVENING_VALUE = 2;

	/**
	 * The '<em><b>Night</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late night
	 * <!-- end-model-doc -->
	 * @see #NIGHT
	 * @model name="night"
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_VALUE = 3;

	/**
	 * The '<em><b>Primary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary
	 * <!-- end-model-doc -->
	 * @see #PRIMARY
	 * @model name="primary"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_VALUE = 4;

	/**
	 * The '<em><b>Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary or alternate
	 * <!-- end-model-doc -->
	 * @see #SECONDARY
	 * @model name="secondary"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Contact Information Availability Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContactInformationAvailabilityCodeSimpleType[] VALUES_ARRAY =
		new ContactInformationAvailabilityCodeSimpleType[] {
			DAY,
			EMERGENCY,
			EVENING,
			NIGHT,
			PRIMARY,
			SECONDARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Contact Information Availability Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContactInformationAvailabilityCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contact Information Availability Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactInformationAvailabilityCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactInformationAvailabilityCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Information Availability Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactInformationAvailabilityCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactInformationAvailabilityCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Information Availability Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactInformationAvailabilityCodeSimpleType get(int value) {
		switch (value) {
			case DAY_VALUE: return DAY;
			case EMERGENCY_VALUE: return EMERGENCY;
			case EVENING_VALUE: return EVENING;
			case NIGHT_VALUE: return NIGHT;
			case PRIMARY_VALUE: return PRIMARY;
			case SECONDARY_VALUE: return SECONDARY;
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
	private ContactInformationAvailabilityCodeSimpleType(int value, String name, String literal) {
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
	
} //ContactInformationAvailabilityCodeSimpleType
