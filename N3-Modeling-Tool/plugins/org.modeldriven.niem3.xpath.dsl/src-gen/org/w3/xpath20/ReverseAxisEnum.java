/**
 */
package org.w3.xpath20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reverse Axis Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.xpath20.Xpath20Package#getReverseAxisEnum()
 * @model
 * @generated
 */
public enum ReverseAxisEnum implements Enumerator
{
  /**
   * The '<em><b>Parent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARENT_VALUE
   * @generated
   * @ordered
   */
  PARENT(0, "parent", "parent"),

  /**
   * The '<em><b>Ancestor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANCESTOR_VALUE
   * @generated
   * @ordered
   */
  ANCESTOR(1, "ancestor", "ancestor"),

  /**
   * The '<em><b>Preceding Sibling</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRECEDING_SIBLING_VALUE
   * @generated
   * @ordered
   */
  PRECEDING_SIBLING(2, "precedingSibling", "preceding-sibling"),

  /**
   * The '<em><b>Preceding</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRECEDING_VALUE
   * @generated
   * @ordered
   */
  PRECEDING(3, "preceding", "preceding"),

  /**
   * The '<em><b>Ancestor Or Self</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANCESTOR_OR_SELF_VALUE
   * @generated
   * @ordered
   */
  ANCESTOR_OR_SELF(4, "ancestorOrSelf", "ancestor-or-self");

  /**
   * The '<em><b>Parent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARENT
   * @model name="parent"
   * @generated
   * @ordered
   */
  public static final int PARENT_VALUE = 0;

  /**
   * The '<em><b>Ancestor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ancestor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANCESTOR
   * @model name="ancestor"
   * @generated
   * @ordered
   */
  public static final int ANCESTOR_VALUE = 1;

  /**
   * The '<em><b>Preceding Sibling</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Preceding Sibling</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRECEDING_SIBLING
   * @model name="precedingSibling" literal="preceding-sibling"
   * @generated
   * @ordered
   */
  public static final int PRECEDING_SIBLING_VALUE = 2;

  /**
   * The '<em><b>Preceding</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Preceding</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRECEDING
   * @model name="preceding"
   * @generated
   * @ordered
   */
  public static final int PRECEDING_VALUE = 3;

  /**
   * The '<em><b>Ancestor Or Self</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ancestor Or Self</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANCESTOR_OR_SELF
   * @model name="ancestorOrSelf" literal="ancestor-or-self"
   * @generated
   * @ordered
   */
  public static final int ANCESTOR_OR_SELF_VALUE = 4;

  /**
   * An array of all the '<em><b>Reverse Axis Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ReverseAxisEnum[] VALUES_ARRAY =
    new ReverseAxisEnum[]
    {
      PARENT,
      ANCESTOR,
      PRECEDING_SIBLING,
      PRECEDING,
      ANCESTOR_OR_SELF,
    };

  /**
   * A public read-only list of all the '<em><b>Reverse Axis Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ReverseAxisEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Reverse Axis Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReverseAxisEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ReverseAxisEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Reverse Axis Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReverseAxisEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ReverseAxisEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Reverse Axis Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReverseAxisEnum get(int value)
  {
    switch (value)
    {
      case PARENT_VALUE: return PARENT;
      case ANCESTOR_VALUE: return ANCESTOR;
      case PRECEDING_SIBLING_VALUE: return PRECEDING_SIBLING;
      case PRECEDING_VALUE: return PRECEDING;
      case ANCESTOR_OR_SELF_VALUE: return ANCESTOR_OR_SELF;
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
  private ReverseAxisEnum(int value, String name, String literal)
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
  
} //ReverseAxisEnum
