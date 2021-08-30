/**
 * Copyright (c) 2006-2014
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 *   Martin Armbruster
 *      - Extension for Java 7-13
 *  
 */
package org.emftext.language.java.members.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.instantiations.Initializable;
import org.emftext.language.java.instantiations.InstantiationsPackage;

import org.emftext.language.java.members.AdditionalField;
import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.references.impl.ReferenceableElementImpl;

import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElement;
import org.emftext.language.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.members.impl.AdditionalFieldImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.AdditionalFieldImpl#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalFieldImpl extends ReferenceableElementImpl implements AdditionalField
{
	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Expression initialValue;

	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected TypeReference typeReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalFieldImpl()
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
		return MembersPackage.Literals.ADDITIONAL_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getInitialValue()
	{
		if (initialValue != null && initialValue.eIsProxy())
		{
			InternalEObject oldInitialValue = (InternalEObject)initialValue;
			initialValue = (Expression)eResolveProxy(oldInitialValue);
			if (initialValue != oldInitialValue)
			{
				InternalEObject newInitialValue = (InternalEObject)initialValue;
				NotificationChain msgs = oldInitialValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, null, null);
				if (newInitialValue.eInternalContainer() == null)
				{
					msgs = newInitialValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, oldInitialValue, initialValue));
			}
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetInitialValue()
	{
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs)
	{
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
	public void setInitialValue(Expression newInitialValue)
	{
		if (newInitialValue != initialValue)
		{
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE, newInitialValue, newInitialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getTypeReference()
	{
		if (typeReference != null && typeReference.eIsProxy())
		{
			InternalEObject oldTypeReference = (InternalEObject)typeReference;
			typeReference = (TypeReference)eResolveProxy(oldTypeReference);
			if (typeReference != oldTypeReference)
			{
				InternalEObject newTypeReference = (InternalEObject)typeReference;
				NotificationChain msgs = oldTypeReference.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, null, null);
				if (newTypeReference.eInternalContainer() == null)
				{
					msgs = newTypeReference.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, oldTypeReference, typeReference));
			}
		}
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetTypeReference()
	{
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs)
	{
		TypeReference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
	public void setTypeReference(TypeReference newTypeReference)
	{
		if (newTypeReference != typeReference)
		{
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE, newTypeReference, newTypeReference));
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
			case MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
			case MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
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
			case MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE:
				if (resolve) return getInitialValue();
				return basicGetInitialValue();
			case MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE:
				if (resolve) return getTypeReference();
				return basicGetTypeReference();
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
			case MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
				return;
			case MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
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
			case MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE:
				setInitialValue((Expression)null);
				return;
			case MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
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
			case MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE:
				return initialValue != null;
			case MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE:
				return typeReference != null;
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
		if (baseClass == Initializable.class)
		{
			switch (derivedFeatureID)
			{
				case MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE: return InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class)
		{
			switch (derivedFeatureID)
			{
				case MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE: return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
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
		if (baseClass == Initializable.class)
		{
			switch (baseFeatureID)
			{
				case InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE: return MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class)
		{
			switch (baseFeatureID)
			{
				case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE: return MembersPackage.ADDITIONAL_FIELD__TYPE_REFERENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AdditionalFieldImpl
