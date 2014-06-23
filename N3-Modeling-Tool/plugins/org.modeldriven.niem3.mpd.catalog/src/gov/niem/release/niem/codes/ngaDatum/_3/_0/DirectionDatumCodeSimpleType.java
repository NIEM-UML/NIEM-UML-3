/**
 */
package gov.niem.release.niem.codes.ngaDatum._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction Datum Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for a reference direction as determined by the means by which it is established (e.g., by the direction of a geographic or magnetic pole of the Earth).
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.ngaDatum._3._0._0Package#getDirectionDatumCodeSimpleType()
 * @model extendedMetaData="name='DirectionDatumCodeSimpleType'"
 * @generated
 */
public enum DirectionDatumCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Geodetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEODETIC_VALUE
	 * @generated
	 * @ordered
	 */
	GEODETIC(0, "geodetic", "geodetic"),

	/**
	 * The '<em><b>Magnetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGNETIC_VALUE
	 * @generated
	 * @ordered
	 */
	MAGNETIC(1, "Magnetic", "Magnetic"),

	/**
	 * The '<em><b>Military Grid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILITARY_GRID_VALUE
	 * @generated
	 * @ordered
	 */
	MILITARY_GRID(2, "militaryGrid", "militaryGrid"),

	/**
	 * The '<em><b>Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE(3, "Relative", "Relative");

	/**
	 * The '<em><b>Geodetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced to the direction of the geographic North Pole.
	 * <!-- end-model-doc -->
	 * @see #GEODETIC
	 * @model name="geodetic"
	 * @generated
	 * @ordered
	 */
	public static final int GEODETIC_VALUE = 0;

	/**
	 * The '<em><b>Magnetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced to the direction of the magnetic North Pole.
	 * <!-- end-model-doc -->
	 * @see #MAGNETIC
	 * @model name="Magnetic"
	 * @generated
	 * @ordered
	 */
	public static final int MAGNETIC_VALUE = 1;

	/**
	 * The '<em><b>Military Grid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced to the direction of "north" in a military grid established by a suitable map-projection, for example Universal Transverse Mercator (UTM).
	 * <!-- end-model-doc -->
	 * @see #MILITARY_GRID
	 * @model name="militaryGrid"
	 * @generated
	 * @ordered
	 */
	public static final int MILITARY_GRID_VALUE = 2;

	/**
	 * The '<em><b>Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced to a direction established by the context of use (for example: the heading of a vessel).
	 * <!-- end-model-doc -->
	 * @see #RELATIVE
	 * @model name="Relative"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Direction Datum Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DirectionDatumCodeSimpleType[] VALUES_ARRAY =
		new DirectionDatumCodeSimpleType[] {
			GEODETIC,
			MAGNETIC,
			MILITARY_GRID,
			RELATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Direction Datum Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DirectionDatumCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction Datum Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DirectionDatumCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionDatumCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Datum Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DirectionDatumCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionDatumCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Datum Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DirectionDatumCodeSimpleType get(int value) {
		switch (value) {
			case GEODETIC_VALUE: return GEODETIC;
			case MAGNETIC_VALUE: return MAGNETIC;
			case MILITARY_GRID_VALUE: return MILITARY_GRID;
			case RELATIVE_VALUE: return RELATIVE;
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
	private DirectionDatumCodeSimpleType(int value, String name, String literal) {
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
	
} //DirectionDatumCodeSimpleType
