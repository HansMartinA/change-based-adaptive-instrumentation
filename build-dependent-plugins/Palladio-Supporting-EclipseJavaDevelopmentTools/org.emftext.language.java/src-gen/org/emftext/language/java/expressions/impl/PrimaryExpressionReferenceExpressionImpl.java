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
package org.emftext.language.java.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.MethodReferenceExpressionChild;
import org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression;

import org.emftext.language.java.generics.CallTypeArgumentable;
import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeArgument;

import org.emftext.language.java.references.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expression Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.PrimaryExpressionReferenceExpressionImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.PrimaryExpressionReferenceExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.PrimaryExpressionReferenceExpressionImpl#getMethodReference <em>Method Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryExpressionReferenceExpressionImpl extends MethodReferenceExpressionImpl implements PrimaryExpressionReferenceExpression
{
	/**
	 * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> callTypeArguments;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected MethodReferenceExpressionChild child;

	/**
	 * The cached value of the '{@link #getMethodReference() <em>Method Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReference()
	 * @generated
	 * @ordered
	 */
	protected Reference methodReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryExpressionReferenceExpressionImpl()
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
		return ExpressionsPackage.Literals.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeArgument> getCallTypeArguments()
	{
		if (callTypeArguments == null)
		{
			callTypeArguments = new EObjectContainmentEList.Resolving<TypeArgument>(TypeArgument.class, this, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS);
		}
		return callTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodReferenceExpressionChild getChild()
	{
		if (child != null && child.eIsProxy())
		{
			InternalEObject oldChild = (InternalEObject)child;
			child = (MethodReferenceExpressionChild)eResolveProxy(oldChild);
			if (child != oldChild)
			{
				InternalEObject newChild = (InternalEObject)child;
				NotificationChain msgs = oldChild.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, null, null);
				if (newChild.eInternalContainer() == null)
				{
					msgs = newChild.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodReferenceExpressionChild basicGetChild()
	{
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(MethodReferenceExpressionChild newChild, NotificationChain msgs)
	{
		MethodReferenceExpressionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, oldChild, newChild);
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
	public void setChild(MethodReferenceExpressionChild newChild)
	{
		if (newChild != child)
		{
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getMethodReference()
	{
		if (methodReference != null && methodReference.eIsProxy())
		{
			InternalEObject oldMethodReference = (InternalEObject)methodReference;
			methodReference = (Reference)eResolveProxy(oldMethodReference);
			if (methodReference != oldMethodReference)
			{
				InternalEObject newMethodReference = (InternalEObject)methodReference;
				NotificationChain msgs = oldMethodReference.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, null, null);
				if (newMethodReference.eInternalContainer() == null)
				{
					msgs = newMethodReference.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, oldMethodReference, methodReference));
			}
		}
		return methodReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetMethodReference()
	{
		return methodReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodReference(Reference newMethodReference, NotificationChain msgs)
	{
		Reference oldMethodReference = methodReference;
		methodReference = newMethodReference;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, oldMethodReference, newMethodReference);
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
	public void setMethodReference(Reference newMethodReference)
	{
		if (newMethodReference != methodReference)
		{
			NotificationChain msgs = null;
			if (methodReference != null)
				msgs = ((InternalEObject)methodReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, null, msgs);
			if (newMethodReference != null)
				msgs = ((InternalEObject)newMethodReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, null, msgs);
			msgs = basicSetMethodReference(newMethodReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE, newMethodReference, newMethodReference));
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
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS:
				return ((InternalEList<?>)getCallTypeArguments()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE:
				return basicSetMethodReference(null, msgs);
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
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS:
				return getCallTypeArguments();
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE:
				if (resolve) return getMethodReference();
				return basicGetMethodReference();
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
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
				getCallTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD:
				setChild((MethodReferenceExpressionChild)newValue);
				return;
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE:
				setMethodReference((Reference)newValue);
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
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
				return;
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD:
				setChild((MethodReferenceExpressionChild)null);
				return;
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE:
				setMethodReference((Reference)null);
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
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS:
				return callTypeArguments != null && !callTypeArguments.isEmpty();
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD:
				return child != null;
			case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE:
				return methodReference != null;
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
		if (baseClass == CallTypeArgumentable.class)
		{
			switch (derivedFeatureID)
			{
				case ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS: return GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS;
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
		if (baseClass == CallTypeArgumentable.class)
		{
			switch (baseFeatureID)
			{
				case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS: return ExpressionsPackage.PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CALL_TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PrimaryExpressionReferenceExpressionImpl
