/**
 */
package org.w3.xpath20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>General Comp</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.xpath20.Xpath20Package#getGeneralComp()
 * @model
 * @generated
 */
public enum GeneralComp implements Enumerator
{
  /**
   * The '<em><b>Eq</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQ_VALUE
   * @generated
   * @ordered
   */
  EQ(0, "eq", "="),

  /**
   * The '<em><b>Ne</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NE_VALUE
   * @generated
   * @ordered
   */
  NE(1, "ne", "!="),

  /**
   * The '<em><b>Lt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LT_VALUE
   * @generated
   * @ordered
   */
  LT(2, "lt", "<"),

  /**
   * The '<em><b>Le</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LE_VALUE
   * @generated
   * @ordered
   */
  LE(3, "le", "<="),

  /**
   * The '<em><b>Gt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GT_VALUE
   * @generated
   * @ordered
   */
  GT(4, "gt", ">"),

  /**
   * The '<em><b>Ge</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GE_VALUE
   * @generated
   * @ordered
   */
  GE(5, "ge", ">=");

  /**
   * The '<em><b>Eq</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Eq</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQ
   * @model name="eq" literal="="
   * @generated
   * @ordered
   */
  public static final int EQ_VALUE = 0;

  /**
   * The '<em><b>Ne</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ne</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NE
   * @model name="ne" literal="!="
   * @generated
   * @ordered
   */
  public static final int NE_VALUE = 1;

  /**
   * The '<em><b>Lt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LT
   * @model name="lt" literal="<"
   * @generated
   * @ordered
   */
  public static final int LT_VALUE = 2;

  /**
   * The '<em><b>Le</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Le</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LE
   * @model name="le" literal="<="
   * @generated
   * @ordered
   */
  public static final int LE_VALUE = 3;

  /**
   * The '<em><b>Gt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GT
   * @model name="gt" literal=">"
   * @generated
   * @ordered
   */
  public static final int GT_VALUE = 4;

  /**
   * The '<em><b>Ge</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ge</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GE
   * @model name="ge" literal=">="
   * @generated
   * @ordered
   */
  public static final int GE_VALUE = 5;

  /**
   * An array of all the '<em><b>General Comp</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GeneralComp[] VALUES_ARRAY =
    new GeneralComp[]
    {
      EQ,
      NE,
      LT,
      LE,
      GT,
      GE,
    };

  /**
   * A public read-only list of all the '<em><b>General Comp</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<GeneralComp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>General Comp</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GeneralComp get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GeneralComp result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>General Comp</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GeneralComp getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GeneralComp result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>General Comp</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GeneralComp get(int value)
  {
    switch (value)
    {
      case EQ_VALUE: return EQ;
      case NE_VALUE: return NE;
      case LT_VALUE: return LT;
      case LE_VALUE: return LE;
      case GT_VALUE: return GT;
      case GE_VALUE: return GE;
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
  private GeneralComp(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //GeneralComp
