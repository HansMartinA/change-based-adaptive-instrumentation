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
package org.emftext.language.java.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.YieldStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yield Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.impl.YieldStatementImpl#getYieldExpression <em>Yield Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YieldStatementImpl extends StatementImpl implements YieldStatement
{
	/**
	 * The cached value of the '{@link #getYieldExpression() <em>Yield Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression yieldExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YieldStatementImpl()
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
		return StatementsPackage.Literals.YIELD_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getYieldExpression()
	{
		if (yieldExpression != null && yieldExpression.eIsProxy())
		{
			InternalEObject oldYieldExpression = (InternalEObject)yieldExpression;
			yieldExpression = (Expression)eResolveProxy(oldYieldExpression);
			if (yieldExpression != oldYieldExpression)
			{
				InternalEObject newYieldExpression = (InternalEObject)yieldExpression;
				NotificationChain msgs = oldYieldExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, null, null);
				if (newYieldExpression.eInternalContainer() == null)
				{
					msgs = newYieldExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, oldYieldExpression, yieldExpression));
			}
		}
		return yieldExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetYieldExpression()
	{
		return yieldExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYieldExpression(Expression newYieldExpression, NotificationChain msgs)
	{
		Expression oldYieldExpression = yieldExpression;
		yieldExpression = newYieldExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, oldYieldExpression, newYieldExpression);
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
	public void setYieldExpression(Expression newYieldExpression)
	{
		if (newYieldExpression != yieldExpression)
		{
			NotificationChain msgs = null;
			if (yieldExpression != null)
				msgs = ((InternalEObject)yieldExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, null, msgs);
			if (newYieldExpression != null)
				msgs = ((InternalEObject)newYieldExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, null, msgs);
			msgs = basicSetYieldExpression(newYieldExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION, newYieldExpression, newYieldExpression));
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
			case StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION:
				return basicSetYieldExpression(null, msgs);
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
			case StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION:
				if (resolve) return getYieldExpression();
				return basicGetYieldExpression();
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
			case StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION:
				setYieldExpression((Expression)newValue);
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
			case StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION:
				setYieldExpression((Expression)null);
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
			case StatementsPackage.YIELD_STATEMENT__YIELD_EXPRESSION:
				return yieldExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //YieldStatementImpl
