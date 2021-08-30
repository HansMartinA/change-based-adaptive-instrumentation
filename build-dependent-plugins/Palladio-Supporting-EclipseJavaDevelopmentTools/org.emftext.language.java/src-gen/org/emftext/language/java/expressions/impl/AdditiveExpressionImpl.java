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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.AdditiveExpression;
import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.operators.AdditiveOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.AdditiveExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.AdditiveExpressionImpl#getAdditiveOperators <em>Additive Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditiveExpressionImpl extends ShiftExpressionChildImpl implements AdditiveExpression
{
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditiveExpressionChild> children;

	/**
	 * The cached value of the '{@link #getAdditiveOperators() <em>Additive Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditiveOperator> additiveOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditiveExpressionImpl()
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
		return ExpressionsPackage.Literals.ADDITIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdditiveExpressionChild> getChildren()
	{
		if (children == null)
		{
			children = new EObjectContainmentEList.Resolving<AdditiveExpressionChild>(AdditiveExpressionChild.class, this, ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdditiveOperator> getAdditiveOperators()
	{
		if (additiveOperators == null)
		{
			additiveOperators = new EObjectContainmentEList.Resolving<AdditiveOperator>(AdditiveOperator.class, this, ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS);
		}
		return additiveOperators;
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
			case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
				return ((InternalEList<?>)getAdditiveOperators()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
				return getChildren();
			case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
				return getAdditiveOperators();
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
			case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends AdditiveExpressionChild>)newValue);
				return;
			case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
				getAdditiveOperators().clear();
				getAdditiveOperators().addAll((Collection<? extends AdditiveOperator>)newValue);
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
			case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
				getAdditiveOperators().clear();
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
			case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
				return additiveOperators != null && !additiveOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdditiveExpressionImpl
