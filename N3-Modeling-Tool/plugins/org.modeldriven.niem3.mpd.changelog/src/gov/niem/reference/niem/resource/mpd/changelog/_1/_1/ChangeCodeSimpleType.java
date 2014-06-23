/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Change Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeCodeSimpleType()
 * @model extendedMetaData="name='ChangeCodeSimpleType'"
 * @generated
 */
public enum ChangeCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>New Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_REQUIREMENT(0, "newRequirement", "new requirement"),

	/**
	 * The '<em><b>Bug Fix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUG_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	BUG_FIX(1, "bugFix", "bug fix"),

	/**
	 * The '<em><b>Refactoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFACTORING_VALUE
	 * @generated
	 * @ordered
	 */
	REFACTORING(2, "refactoring", "refactoring"),

	/**
	 * The '<em><b>Harmonization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	HARMONIZATION(3, "harmonization", "harmonization"),

	/**
	 * The '<em><b>General Improvement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_IMPROVEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_IMPROVEMENT(4, "generalImprovement", "general improvement");

	/**
	 * The '<em><b>New Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New Requirement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_REQUIREMENT
	 * @model name="newRequirement" literal="new requirement"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_REQUIREMENT_VALUE = 0;

	/**
	 * The '<em><b>Bug Fix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bug Fix</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUG_FIX
	 * @model name="bugFix" literal="bug fix"
	 * @generated
	 * @ordered
	 */
	public static final int BUG_FIX_VALUE = 1;

	/**
	 * The '<em><b>Refactoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Refactoring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFACTORING
	 * @model name="refactoring"
	 * @generated
	 * @ordered
	 */
	public static final int REFACTORING_VALUE = 2;

	/**
	 * The '<em><b>Harmonization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Harmonization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARMONIZATION
	 * @model name="harmonization"
	 * @generated
	 * @ordered
	 */
	public static final int HARMONIZATION_VALUE = 3;

	/**
	 * The '<em><b>General Improvement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General Improvement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_IMPROVEMENT
	 * @model name="generalImprovement" literal="general improvement"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_IMPROVEMENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Change Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeCodeSimpleType[] VALUES_ARRAY =
		new ChangeCodeSimpleType[] {
			NEW_REQUIREMENT,
			BUG_FIX,
			REFACTORING,
			HARMONIZATION,
			GENERAL_IMPROVEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeCodeSimpleType get(int value) {
		switch (value) {
			case NEW_REQUIREMENT_VALUE: return NEW_REQUIREMENT;
			case BUG_FIX_VALUE: return BUG_FIX;
			case REFACTORING_VALUE: return REFACTORING;
			case HARMONIZATION_VALUE: return HARMONIZATION;
			case GENERAL_IMPROVEMENT_VALUE: return GENERAL_IMPROVEMENT;
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
	private ChangeCodeSimpleType(int value, String name, String literal) {
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
	
} //ChangeCodeSimpleType
