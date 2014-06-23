/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Facet Category Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getFacetCategoryCodeSimpleType()
 * @model extendedMetaData="name='FacetCategoryCodeSimpleType'"
 * @generated
 */
public enum FacetCategoryCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Enumeration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATION(0, "enumeration", "enumeration"),

	/**
	 * The '<em><b>Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	PATTERN(1, "pattern", "pattern"),

	/**
	 * The '<em><b>Min Inclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_INCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_INCLUSIVE(2, "minInclusive", "minInclusive"),

	/**
	 * The '<em><b>Max Inclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_INCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_INCLUSIVE(3, "maxInclusive", "maxInclusive"),

	/**
	 * The '<em><b>Max Exclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_EXCLUSIVE(4, "maxExclusive", "maxExclusive");

	/**
	 * The '<em><b>Enumeration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enumeration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION
	 * @model name="enumeration"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATION_VALUE = 0;

	/**
	 * The '<em><b>Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pattern</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATTERN
	 * @model name="pattern"
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_VALUE = 1;

	/**
	 * The '<em><b>Min Inclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Inclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_INCLUSIVE
	 * @model name="minInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_INCLUSIVE_VALUE = 2;

	/**
	 * The '<em><b>Max Inclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max Inclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_INCLUSIVE
	 * @model name="maxInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_INCLUSIVE_VALUE = 3;

	/**
	 * The '<em><b>Max Exclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max Exclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_EXCLUSIVE
	 * @model name="maxExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_EXCLUSIVE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Facet Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FacetCategoryCodeSimpleType[] VALUES_ARRAY =
		new FacetCategoryCodeSimpleType[] {
			ENUMERATION,
			PATTERN,
			MIN_INCLUSIVE,
			MAX_INCLUSIVE,
			MAX_EXCLUSIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Facet Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FacetCategoryCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Facet Category Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacetCategoryCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FacetCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Facet Category Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacetCategoryCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FacetCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Facet Category Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacetCategoryCodeSimpleType get(int value) {
		switch (value) {
			case ENUMERATION_VALUE: return ENUMERATION;
			case PATTERN_VALUE: return PATTERN;
			case MIN_INCLUSIVE_VALUE: return MIN_INCLUSIVE;
			case MAX_INCLUSIVE_VALUE: return MAX_INCLUSIVE;
			case MAX_EXCLUSIVE_VALUE: return MAX_EXCLUSIVE;
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
	private FacetCategoryCodeSimpleType(int value, String name, String literal) {
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
	
} //FacetCategoryCodeSimpleType
