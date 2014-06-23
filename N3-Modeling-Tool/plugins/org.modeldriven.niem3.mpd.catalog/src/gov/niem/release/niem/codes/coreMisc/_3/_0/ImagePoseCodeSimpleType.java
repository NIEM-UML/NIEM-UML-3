/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Pose Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for angles of an entitys pose in a photograph.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package#getImagePoseCodeSimpleType()
 * @model extendedMetaData="name='ImagePoseCodeSimpleType'"
 * @generated
 */
public enum ImagePoseCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Frontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	FRONTAL(0, "Frontal", "Frontal"),

	/**
	 * The '<em><b>Oblique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIQUE(1, "Oblique", "Oblique"),

	/**
	 * The '<em><b>Side</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDE_VALUE
	 * @generated
	 * @ordered
	 */
	SIDE(2, "Side", "Side");

	/**
	 * The '<em><b>Frontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object in the image is facing the front.
	 * <!-- end-model-doc -->
	 * @see #FRONTAL
	 * @model name="Frontal"
	 * @generated
	 * @ordered
	 */
	public static final int FRONTAL_VALUE = 0;

	/**
	 * The '<em><b>Oblique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object in the image is facing a quarter view.
	 * <!-- end-model-doc -->
	 * @see #OBLIQUE
	 * @model name="Oblique"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIQUE_VALUE = 1;

	/**
	 * The '<em><b>Side</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object in the image is facing the side.
	 * <!-- end-model-doc -->
	 * @see #SIDE
	 * @model name="Side"
	 * @generated
	 * @ordered
	 */
	public static final int SIDE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Image Pose Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImagePoseCodeSimpleType[] VALUES_ARRAY =
		new ImagePoseCodeSimpleType[] {
			FRONTAL,
			OBLIQUE,
			SIDE,
		};

	/**
	 * A public read-only list of all the '<em><b>Image Pose Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImagePoseCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Pose Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImagePoseCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagePoseCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Pose Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImagePoseCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagePoseCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Pose Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImagePoseCodeSimpleType get(int value) {
		switch (value) {
			case FRONTAL_VALUE: return FRONTAL;
			case OBLIQUE_VALUE: return OBLIQUE;
			case SIDE_VALUE: return SIDE;
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
	private ImagePoseCodeSimpleType(int value, String name, String literal) {
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
	
} //ImagePoseCodeSimpleType
