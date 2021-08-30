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
package org.emftext.language.java.references.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.references.impl.ElementReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.java.references.impl.ElementReferenceImpl#getContainedTarget <em>Contained Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementReferenceImpl extends ReferenceImpl implements ElementReference
{
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ReferenceableElement target;

	/**
	 * The cached value of the '{@link #getContainedTarget() <em>Contained Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedTarget()
	 * @generated
	 * @ordered
	 */
	protected ReferenceableElement containedTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementReferenceImpl()
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
		return ReferencesPackage.Literals.ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceableElement getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ReferenceableElement)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencesPackage.ELEMENT_REFERENCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableElement basicGetTarget()
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ReferenceableElement newTarget)
	{
		ReferenceableElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.ELEMENT_REFERENCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceableElement getContainedTarget()
	{
		if (containedTarget != null && containedTarget.eIsProxy())
		{
			InternalEObject oldContainedTarget = (InternalEObject)containedTarget;
			containedTarget = (ReferenceableElement)eResolveProxy(oldContainedTarget);
			if (containedTarget != oldContainedTarget)
			{
				InternalEObject newContainedTarget = (InternalEObject)containedTarget;
				NotificationChain msgs = oldContainedTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, null, null);
				if (newContainedTarget.eInternalContainer() == null)
				{
					msgs = newContainedTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, oldContainedTarget, containedTarget));
			}
		}
		return containedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableElement basicGetContainedTarget()
	{
		return containedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedTarget(ReferenceableElement newContainedTarget, NotificationChain msgs)
	{
		ReferenceableElement oldContainedTarget = containedTarget;
		containedTarget = newContainedTarget;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, oldContainedTarget, newContainedTarget);
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
	public void setContainedTarget(ReferenceableElement newContainedTarget)
	{
		if (newContainedTarget != containedTarget)
		{
			NotificationChain msgs = null;
			if (containedTarget != null)
				msgs = ((InternalEObject)containedTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, null, msgs);
			if (newContainedTarget != null)
				msgs = ((InternalEObject)newContainedTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, null, msgs);
			msgs = basicSetContainedTarget(newContainedTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET, newContainedTarget, newContainedTarget));
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
			case ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET:
				return basicSetContainedTarget(null, msgs);
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
			case ReferencesPackage.ELEMENT_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET:
				if (resolve) return getContainedTarget();
				return basicGetContainedTarget();
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
			case ReferencesPackage.ELEMENT_REFERENCE__TARGET:
				setTarget((ReferenceableElement)newValue);
				return;
			case ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET:
				setContainedTarget((ReferenceableElement)newValue);
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
			case ReferencesPackage.ELEMENT_REFERENCE__TARGET:
				setTarget((ReferenceableElement)null);
				return;
			case ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET:
				setContainedTarget((ReferenceableElement)null);
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
			case ReferencesPackage.ELEMENT_REFERENCE__TARGET:
				return target != null;
			case ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET:
				return containedTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementReferenceImpl
