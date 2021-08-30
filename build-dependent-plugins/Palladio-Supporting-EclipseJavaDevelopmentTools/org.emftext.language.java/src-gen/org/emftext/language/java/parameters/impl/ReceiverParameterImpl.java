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
package org.emftext.language.java.parameters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.literals.This;

import org.emftext.language.java.parameters.ParametersPackage;
import org.emftext.language.java.parameters.ReceiverParameter;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receiver Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.parameters.impl.ReceiverParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.emftext.language.java.parameters.impl.ReceiverParameterImpl#getOuterTypeReference <em>Outer Type Reference</em>}</li>
 *   <li>{@link org.emftext.language.java.parameters.impl.ReceiverParameterImpl#getThisReference <em>This Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiverParameterImpl extends ParameterImpl implements ReceiverParameter
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotations;

	/**
	 * The cached value of the '{@link #getOuterTypeReference() <em>Outer Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterTypeReference()
	 * @generated
	 * @ordered
	 */
	protected TypeReference outerTypeReference;

	/**
	 * The cached value of the '{@link #getThisReference() <em>This Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThisReference()
	 * @generated
	 * @ordered
	 */
	protected This thisReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverParameterImpl()
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
		return ParametersPackage.Literals.RECEIVER_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationInstance> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentEList.Resolving<AnnotationInstance>(AnnotationInstance.class, this, ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getOuterTypeReference()
	{
		if (outerTypeReference != null && outerTypeReference.eIsProxy())
		{
			InternalEObject oldOuterTypeReference = (InternalEObject)outerTypeReference;
			outerTypeReference = (TypeReference)eResolveProxy(oldOuterTypeReference);
			if (outerTypeReference != oldOuterTypeReference)
			{
				InternalEObject newOuterTypeReference = (InternalEObject)outerTypeReference;
				NotificationChain msgs = oldOuterTypeReference.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, null, null);
				if (newOuterTypeReference.eInternalContainer() == null)
				{
					msgs = newOuterTypeReference.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, oldOuterTypeReference, outerTypeReference));
			}
		}
		return outerTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetOuterTypeReference()
	{
		return outerTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterTypeReference(TypeReference newOuterTypeReference, NotificationChain msgs)
	{
		TypeReference oldOuterTypeReference = outerTypeReference;
		outerTypeReference = newOuterTypeReference;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, oldOuterTypeReference, newOuterTypeReference);
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
	public void setOuterTypeReference(TypeReference newOuterTypeReference)
	{
		if (newOuterTypeReference != outerTypeReference)
		{
			NotificationChain msgs = null;
			if (outerTypeReference != null)
				msgs = ((InternalEObject)outerTypeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, null, msgs);
			if (newOuterTypeReference != null)
				msgs = ((InternalEObject)newOuterTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, null, msgs);
			msgs = basicSetOuterTypeReference(newOuterTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE, newOuterTypeReference, newOuterTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public This getThisReference()
	{
		if (thisReference != null && thisReference.eIsProxy())
		{
			InternalEObject oldThisReference = (InternalEObject)thisReference;
			thisReference = (This)eResolveProxy(oldThisReference);
			if (thisReference != oldThisReference)
			{
				InternalEObject newThisReference = (InternalEObject)thisReference;
				NotificationChain msgs = oldThisReference.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, null, null);
				if (newThisReference.eInternalContainer() == null)
				{
					msgs = newThisReference.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, oldThisReference, thisReference));
			}
		}
		return thisReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public This basicGetThisReference()
	{
		return thisReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThisReference(This newThisReference, NotificationChain msgs)
	{
		This oldThisReference = thisReference;
		thisReference = newThisReference;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, oldThisReference, newThisReference);
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
	public void setThisReference(This newThisReference)
	{
		if (newThisReference != thisReference)
		{
			NotificationChain msgs = null;
			if (thisReference != null)
				msgs = ((InternalEObject)thisReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, null, msgs);
			if (newThisReference != null)
				msgs = ((InternalEObject)newThisReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, null, msgs);
			msgs = basicSetThisReference(newThisReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE, newThisReference, newThisReference));
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
			case ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE:
				return basicSetOuterTypeReference(null, msgs);
			case ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE:
				return basicSetThisReference(null, msgs);
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
			case ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS:
				return getAnnotations();
			case ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE:
				if (resolve) return getOuterTypeReference();
				return basicGetOuterTypeReference();
			case ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE:
				if (resolve) return getThisReference();
				return basicGetThisReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE:
				setOuterTypeReference((TypeReference)newValue);
				return;
			case ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE:
				setThisReference((This)newValue);
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
			case ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE:
				setOuterTypeReference((TypeReference)null);
				return;
			case ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE:
				setThisReference((This)null);
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
			case ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ParametersPackage.RECEIVER_PARAMETER__OUTER_TYPE_REFERENCE:
				return outerTypeReference != null;
			case ParametersPackage.RECEIVER_PARAMETER__THIS_REFERENCE:
				return thisReference != null;
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
		if (baseClass == Annotable.class)
		{
			switch (derivedFeatureID)
			{
				case ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS: return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
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
		if (baseClass == Annotable.class)
		{
			switch (baseFeatureID)
			{
				case AnnotationsPackage.ANNOTABLE__ANNOTATIONS: return ParametersPackage.RECEIVER_PARAMETER__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReceiverParameterImpl
