/**
 * generated by Xtext 2.24.0
 */
package tools.vitruv.dsls.reactions.language.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.vitruv.dsls.reactions.language.CreateCorrespondence;
import tools.vitruv.dsls.reactions.language.ExistingElementReference;
import tools.vitruv.dsls.reactions.language.LanguagePackage;
import tools.vitruv.dsls.reactions.language.TagCodeBlock;
import tools.vitruv.dsls.reactions.language.Taggable;

import tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.impl.CreateCorrespondenceImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.impl.CreateCorrespondenceImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.impl.CreateCorrespondenceImpl#getSecondElement <em>Second Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateCorrespondenceImpl extends ActionStatementImpl implements CreateCorrespondence
{
  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected TagCodeBlock tag;

  /**
   * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstElement()
   * @generated
   * @ordered
   */
  protected ExistingElementReference firstElement;

  /**
   * The cached value of the '{@link #getSecondElement() <em>Second Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondElement()
   * @generated
   * @ordered
   */
  protected ExistingElementReference secondElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateCorrespondenceImpl()
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
    return LanguagePackage.Literals.CREATE_CORRESPONDENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TagCodeBlock getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTag(TagCodeBlock newTag, NotificationChain msgs)
  {
    TagCodeBlock oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATE_CORRESPONDENCE__TAG, oldTag, newTag);
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
  public void setTag(TagCodeBlock newTag)
  {
    if (newTag != tag)
    {
      NotificationChain msgs = null;
      if (tag != null)
        msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.CREATE_CORRESPONDENCE__TAG, null, msgs);
      if (newTag != null)
        msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.CREATE_CORRESPONDENCE__TAG, null, msgs);
      msgs = basicSetTag(newTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATE_CORRESPONDENCE__TAG, newTag, newTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistingElementReference getFirstElement()
  {
    return firstElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstElement(ExistingElementReference newFirstElement, NotificationChain msgs)
  {
    ExistingElementReference oldFirstElement = firstElement;
    firstElement = newFirstElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT, oldFirstElement, newFirstElement);
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
  public void setFirstElement(ExistingElementReference newFirstElement)
  {
    if (newFirstElement != firstElement)
    {
      NotificationChain msgs = null;
      if (firstElement != null)
        msgs = ((InternalEObject)firstElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT, null, msgs);
      if (newFirstElement != null)
        msgs = ((InternalEObject)newFirstElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT, null, msgs);
      msgs = basicSetFirstElement(newFirstElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT, newFirstElement, newFirstElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistingElementReference getSecondElement()
  {
    return secondElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondElement(ExistingElementReference newSecondElement, NotificationChain msgs)
  {
    ExistingElementReference oldSecondElement = secondElement;
    secondElement = newSecondElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT, oldSecondElement, newSecondElement);
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
  public void setSecondElement(ExistingElementReference newSecondElement)
  {
    if (newSecondElement != secondElement)
    {
      NotificationChain msgs = null;
      if (secondElement != null)
        msgs = ((InternalEObject)secondElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT, null, msgs);
      if (newSecondElement != null)
        msgs = ((InternalEObject)newSecondElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT, null, msgs);
      msgs = basicSetSecondElement(newSecondElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT, newSecondElement, newSecondElement));
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
      case LanguagePackage.CREATE_CORRESPONDENCE__TAG:
        return basicSetTag(null, msgs);
      case LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT:
        return basicSetFirstElement(null, msgs);
      case LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT:
        return basicSetSecondElement(null, msgs);
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
      case LanguagePackage.CREATE_CORRESPONDENCE__TAG:
        return getTag();
      case LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT:
        return getFirstElement();
      case LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT:
        return getSecondElement();
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
      case LanguagePackage.CREATE_CORRESPONDENCE__TAG:
        setTag((TagCodeBlock)newValue);
        return;
      case LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT:
        setFirstElement((ExistingElementReference)newValue);
        return;
      case LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT:
        setSecondElement((ExistingElementReference)newValue);
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
      case LanguagePackage.CREATE_CORRESPONDENCE__TAG:
        setTag((TagCodeBlock)null);
        return;
      case LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT:
        setFirstElement((ExistingElementReference)null);
        return;
      case LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT:
        setSecondElement((ExistingElementReference)null);
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
      case LanguagePackage.CREATE_CORRESPONDENCE__TAG:
        return tag != null;
      case LanguagePackage.CREATE_CORRESPONDENCE__FIRST_ELEMENT:
        return firstElement != null;
      case LanguagePackage.CREATE_CORRESPONDENCE__SECOND_ELEMENT:
        return secondElement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Taggable.class)
    {
      switch (derivedFeatureID)
      {
        case LanguagePackage.CREATE_CORRESPONDENCE__TAG: return LanguagePackage.TAGGABLE__TAG;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Taggable.class)
    {
      switch (baseFeatureID)
      {
        case LanguagePackage.TAGGABLE__TAG: return LanguagePackage.CREATE_CORRESPONDENCE__TAG;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //CreateCorrespondenceImpl
