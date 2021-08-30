/**
 * generated by Xtext 2.24.0
 */
package tools.vitruv.dsls.reactions.language.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.vitruv.dsls.reactions.language.InvariantViolationEvent;
import tools.vitruv.dsls.reactions.language.LanguagePackage;

import tools.vitruv.dsls.reactions.language.toplevelelements.impl.TriggerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Violation Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.impl.InvariantViolationEventImpl#getViolation <em>Violation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvariantViolationEventImpl extends TriggerImpl implements InvariantViolationEvent
{
  /**
   * The cached value of the '{@link #getViolation() <em>Violation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViolation()
   * @generated
   * @ordered
   */
  protected EClass violation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvariantViolationEventImpl()
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
    return LanguagePackage.Literals.INVARIANT_VIOLATION_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getViolation()
  {
    if (violation != null && violation.eIsProxy())
    {
      InternalEObject oldViolation = (InternalEObject)violation;
      violation = (EClass)eResolveProxy(oldViolation);
      if (violation != oldViolation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LanguagePackage.INVARIANT_VIOLATION_EVENT__VIOLATION, oldViolation, violation));
      }
    }
    return violation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetViolation()
  {
    return violation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setViolation(EClass newViolation)
  {
    EClass oldViolation = violation;
    violation = newViolation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.INVARIANT_VIOLATION_EVENT__VIOLATION, oldViolation, violation));
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
      case LanguagePackage.INVARIANT_VIOLATION_EVENT__VIOLATION:
        if (resolve) return getViolation();
        return basicGetViolation();
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
      case LanguagePackage.INVARIANT_VIOLATION_EVENT__VIOLATION:
        setViolation((EClass)newValue);
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
      case LanguagePackage.INVARIANT_VIOLATION_EVENT__VIOLATION:
        setViolation((EClass)null);
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
      case LanguagePackage.INVARIANT_VIOLATION_EVENT__VIOLATION:
        return violation != null;
    }
    return super.eIsSet(featureID);
  }

} //InvariantViolationEventImpl
