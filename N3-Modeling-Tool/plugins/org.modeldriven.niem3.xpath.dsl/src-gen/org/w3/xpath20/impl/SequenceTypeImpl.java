/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.ItemType;
import org.w3.xpath20.OccurrenceIndicator;
import org.w3.xpath20.SequenceType;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.SequenceTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.SequenceTypeImpl#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceTypeImpl extends MinimalEObjectImpl.Container implements SequenceType
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ItemType type;

  /**
   * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrence()
   * @generated
   * @ordered
   */
  protected static final OccurrenceIndicator OCCURRENCE_EDEFAULT = OccurrenceIndicator.OPTIONAL;

  /**
   * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrence()
   * @generated
   * @ordered
   */
  protected OccurrenceIndicator occurrence = OCCURRENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Xpath20Package.Literals.SEQUENCE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ItemType newType, NotificationChain msgs)
  {
    ItemType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.SEQUENCE_TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ItemType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.SEQUENCE_TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.SEQUENCE_TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.SEQUENCE_TYPE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OccurrenceIndicator getOccurrence()
  {
    return occurrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOccurrence(OccurrenceIndicator newOccurrence)
  {
    OccurrenceIndicator oldOccurrence = occurrence;
    occurrence = newOccurrence == null ? OCCURRENCE_EDEFAULT : newOccurrence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.SEQUENCE_TYPE__OCCURRENCE, oldOccurrence, occurrence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Xpath20Package.SEQUENCE_TYPE__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Xpath20Package.SEQUENCE_TYPE__TYPE:
        return getType();
      case Xpath20Package.SEQUENCE_TYPE__OCCURRENCE:
        return getOccurrence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Xpath20Package.SEQUENCE_TYPE__TYPE:
        setType((ItemType)newValue);
        return;
      case Xpath20Package.SEQUENCE_TYPE__OCCURRENCE:
        setOccurrence((OccurrenceIndicator)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Xpath20Package.SEQUENCE_TYPE__TYPE:
        setType((ItemType)null);
        return;
      case Xpath20Package.SEQUENCE_TYPE__OCCURRENCE:
        setOccurrence(OCCURRENCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Xpath20Package.SEQUENCE_TYPE__TYPE:
        return type != null;
      case Xpath20Package.SEQUENCE_TYPE__OCCURRENCE:
        return occurrence != OCCURRENCE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (occurrence: ");
    result.append(occurrence);
    result.append(')');
    return result.toString();
  }

} //SequenceTypeImpl
