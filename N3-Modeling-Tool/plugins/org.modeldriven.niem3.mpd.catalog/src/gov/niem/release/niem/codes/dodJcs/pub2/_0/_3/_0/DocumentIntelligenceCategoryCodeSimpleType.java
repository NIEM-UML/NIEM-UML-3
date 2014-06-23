/**
 */
package gov.niem.release.niem.codes.dodJcs.pub2._0._3._0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Document Intelligence Category Code Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A data type for natures or genres of a document or resource.
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package#getDocumentIntelligenceCategoryCodeSimpleType()
 * @model extendedMetaData="name='DocumentIntelligenceCategoryCodeSimpleType'"
 * @generated
 */
public enum DocumentIntelligenceCategoryCodeSimpleType implements Enumerator {
	/**
	 * The '<em><b>Comint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMINT_VALUE
	 * @generated
	 * @ordered
	 */
	COMINT(0, "comint", "comint"),

	/**
	 * The '<em><b>Elint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELINT_VALUE
	 * @generated
	 * @ordered
	 */
	ELINT(1, "elint", "elint"),

	/**
	 * The '<em><b>Fisint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISINT_VALUE
	 * @generated
	 * @ordered
	 */
	FISINT(2, "fisint", "fisint"),

	/**
	 * The '<em><b>Geoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOINT_VALUE
	 * @generated
	 * @ordered
	 */
	GEOINT(3, "geoint", "geoint"),

	/**
	 * The '<em><b>Obint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBINT_VALUE
	 * @generated
	 * @ordered
	 */
	OBINT(4, "obint", "obint");

	/**
	 * The '<em><b>Comint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * communications intelligence
	 * <!-- end-model-doc -->
	 * @see #COMINT
	 * @model name="comint"
	 * @generated
	 * @ordered
	 */
	public static final int COMINT_VALUE = 0;

	/**
	 * The '<em><b>Elint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * electronic intelligence
	 * <!-- end-model-doc -->
	 * @see #ELINT
	 * @model name="elint"
	 * @generated
	 * @ordered
	 */
	public static final int ELINT_VALUE = 1;

	/**
	 * The '<em><b>Fisint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * foreign instrumentation signals intelligence
	 * <!-- end-model-doc -->
	 * @see #FISINT
	 * @model name="fisint"
	 * @generated
	 * @ordered
	 */
	public static final int FISINT_VALUE = 2;

	/**
	 * The '<em><b>Geoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * geospatial intelligence
	 * <!-- end-model-doc -->
	 * @see #GEOINT
	 * @model name="geoint"
	 * @generated
	 * @ordered
	 */
	public static final int GEOINT_VALUE = 3;

	/**
	 * The '<em><b>Obint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * open-source intelligence
	 * <!-- end-model-doc -->
	 * @see #OBINT
	 * @model name="obint"
	 * @generated
	 * @ordered
	 */
	public static final int OBINT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Document Intelligence Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DocumentIntelligenceCategoryCodeSimpleType[] VALUES_ARRAY =
		new DocumentIntelligenceCategoryCodeSimpleType[] {
			COMINT,
			ELINT,
			FISINT,
			GEOINT,
			OBINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Intelligence Category Code Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentIntelligenceCategoryCodeSimpleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Intelligence Category Code Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentIntelligenceCategoryCodeSimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentIntelligenceCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Intelligence Category Code Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentIntelligenceCategoryCodeSimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentIntelligenceCategoryCodeSimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Intelligence Category Code Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentIntelligenceCategoryCodeSimpleType get(int value) {
		switch (value) {
			case COMINT_VALUE: return COMINT;
			case ELINT_VALUE: return ELINT;
			case FISINT_VALUE: return FISINT;
			case GEOINT_VALUE: return GEOINT;
			case OBINT_VALUE: return OBINT;
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
	private DocumentIntelligenceCategoryCodeSimpleType(int value, String name, String literal) {
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
	
} //DocumentIntelligenceCategoryCodeSimpleType
