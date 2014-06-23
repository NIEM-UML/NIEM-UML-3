/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MPD Class Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for the classification of an MPD.
 * <!-- end-model-doc -->
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDClassCodeSimpleType()
 * @model extendedMetaData="name='MPDClassCodeSimpleType'"
 * @generated
 */
public enum MPDClassCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Rel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REL_VALUE
	 * @generated
	 * @ordered
	 */
	REL(0, "rel", "rel"),

	/**
	 * The '<em><b>Cu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CU_VALUE
	 * @generated
	 * @ordered
	 */
	CU(1, "cu", "cu"),

	/**
	 * The '<em><b>Du</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DU_VALUE
	 * @generated
	 * @ordered
	 */
	DU(2, "du", "du"),

	/**
	 * The '<em><b>Iepd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEPD_VALUE
	 * @generated
	 * @ordered
	 */
	IEPD(3, "iepd", "iepd"),

	/**
	 * The '<em><b>Eiem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIEM_VALUE
	 * @generated
	 * @ordered
	 */
	EIEM(4, "eiem", "eiem");

	/**
	 * The '<em><b>Rel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * release
	 * <!-- end-model-doc -->
	 * @see #REL
	 * @model name="rel"
	 * @generated
	 * @ordered
	 */
	public static final int REL_VALUE = 0;

	/**
	 * The '<em><b>Cu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * core update
	 * <!-- end-model-doc -->
	 * @see #CU
	 * @model name="cu"
	 * @generated
	 * @ordered
	 */
	public static final int CU_VALUE = 1;

	/**
	 * The '<em><b>Du</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * domain update
	 * <!-- end-model-doc -->
	 * @see #DU
	 * @model name="du"
	 * @generated
	 * @ordered
	 */
	public static final int DU_VALUE = 2;

	/**
	 * The '<em><b>Iepd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * information exchange package documentation
	 * 		  
	 * <!-- end-model-doc -->
	 * @see #IEPD
	 * @model name="iepd"
	 * @generated
	 * @ordered
	 */
	public static final int IEPD_VALUE = 3;

	/**
	 * The '<em><b>Eiem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * enterprise information exchange model
	 * <!-- end-model-doc -->
	 * @see #EIEM
	 * @model name="eiem"
	 * @generated
	 * @ordered
	 */
	public static final int EIEM_VALUE = 4;

	/**
	 * An array of all the '<em><b>MPD Class Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MPDClassCodeSimpleType[] VALUES_ARRAY =
		new MPDClassCodeSimpleType[] {
			REL,
			CU,
			DU,
			IEPD,
			EIEM,
		};

	/**
	 * A public read-only list of all the '<em><b>MPD Class Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MPDClassCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MPD Class Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPDClassCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MPDClassCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MPD Class Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPDClassCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MPDClassCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MPD Class Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPDClassCodeSimpleType get(int value) {
		switch (value) {
			case REL_VALUE: return REL;
			case CU_VALUE: return CU;
			case DU_VALUE: return DU;
			case IEPD_VALUE: return IEPD;
			case EIEM_VALUE: return EIEM;
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
	private MPDClassCodeSimpleType(int value, String name, String literal) {
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
	
} //MPDClassCodeSimpleType
