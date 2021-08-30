/**
 * generated by Xtext 2.24.0
 */
package tools.vitruv.dsls.reactions.language.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.vitruv.dsls.reactions.language.ElementCreationAndInsertionChangeType;
import tools.vitruv.dsls.reactions.language.ElementCreationChangeType;
import tools.vitruv.dsls.reactions.language.ElementInsertionChangeType;
import tools.vitruv.dsls.reactions.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Creation And Insertion Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.impl.ElementCreationAndInsertionChangeTypeImpl#getCreateChange <em>Create Change</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.impl.ElementCreationAndInsertionChangeTypeImpl#getInsertChange <em>Insert Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementCreationAndInsertionChangeTypeImpl extends ElementCompoundChangeTypeImpl implements ElementCreationAndInsertionChangeType
{
  /**
   * The cached value of the '{@link #getCreateChange() <em>Create Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateChange()
   * @generated
   * @ordered
   */
  protected ElementCreationChangeType createChange;

  /**
   * The cached value of the '{@link #getInsertChange() <em>Insert Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertChange()
   * @generated
   * @ordered
   */
  protected ElementInsertionChangeType insertChange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementCreationAndInsertionChangeTypeImpl()
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
    return LanguagePackage.Literals.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElementCreationChangeType getCreateChange()
  {
    return createChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateChange(ElementCreationChangeType newCreateChange, NotificationChain msgs)
  {
    ElementCreationChangeType oldCreateChange = createChange;
    createChange = newCreateChange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE, oldCreateChange, newCreateChange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreateChange(ElementCreationChangeType newCreateChange)
  {
    if (newCreateChange != createChange)
    {
      NotificationChain msgs = null;
      if (createChange != null)
        msgs = ((InternalEObject)createChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE, null, msgs);
      if (newCreateChange != null)
        msgs = ((InternalEObject)newCreateChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE, null, msgs);
      msgs = basicSetCreateChange(newCreateChange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE, newCreateChange, newCreateChange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElementInsertionChangeType getInsertChange()
  {
    return insertChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsertChange(ElementInsertionChangeType newInsertChange, NotificationChain msgs)
  {
    ElementInsertionChangeType oldInsertChange = insertChange;
    insertChange = newInsertChange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE, oldInsertChange, newInsertChange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInsertChange(ElementInsertionChangeType newInsertChange)
  {
    if (newInsertChange != insertChange)
    {
      NotificationChain msgs = null;
      if (insertChange != null)
        msgs = ((InternalEObject)insertChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE, null, msgs);
      if (newInsertChange != null)
        msgs = ((InternalEObject)newInsertChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE, null, msgs);
      msgs = basicSetInsertChange(newInsertChange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE, newInsertChange, newInsertChange));
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
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE:
        return basicSetCreateChange(null, msgs);
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE:
        return basicSetInsertChange(null, msgs);
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
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE:
        return getCreateChange();
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE:
        return getInsertChange();
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
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE:
        setCreateChange((ElementCreationChangeType)newValue);
        return;
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE:
        setInsertChange((ElementInsertionChangeType)newValue);
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
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE:
        setCreateChange((ElementCreationChangeType)null);
        return;
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE:
        setInsertChange((ElementInsertionChangeType)null);
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
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__CREATE_CHANGE:
        return createChange != null;
      case LanguagePackage.ELEMENT_CREATION_AND_INSERTION_CHANGE_TYPE__INSERT_CHANGE:
        return insertChange != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementCreationAndInsertionChangeTypeImpl
