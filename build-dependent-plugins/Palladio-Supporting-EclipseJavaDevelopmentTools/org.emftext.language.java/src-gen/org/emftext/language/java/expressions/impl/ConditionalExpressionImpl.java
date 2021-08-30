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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpression;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl#getGeneralExpressionElse <em>General Expression Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends AssignmentExpressionChildImpl implements ConditionalExpression
{
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected ConditionalExpressionChild child;

	/**
	 * The cached value of the '{@link #getExpressionIf() <em>Expression If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionIf()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionIf;

	/**
	 * The cached value of the '{@link #getGeneralExpressionElse() <em>General Expression Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralExpressionElse()
	 * @generated
	 * @ordered
	 */
	protected Expression generalExpressionElse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl()
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
		return ExpressionsPackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpressionChild getChild()
	{
		if (child != null && child.eIsProxy())
		{
			InternalEObject oldChild = (InternalEObject)child;
			child = (ConditionalExpressionChild)eResolveProxy(oldChild);
			if (child != oldChild)
			{
				InternalEObject newChild = (InternalEObject)child;
				NotificationChain msgs = oldChild.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, null);
				if (newChild.eInternalContainer() == null)
				{
					msgs = newChild.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpressionChild basicGetChild()
	{
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(ConditionalExpressionChild newChild, NotificationChain msgs)
	{
		ConditionalExpressionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, oldChild, newChild);
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
	public void setChild(ConditionalExpressionChild newChild)
	{
		if (newChild != child)
		{
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpressionIf()
	{
		if (expressionIf != null && expressionIf.eIsProxy())
		{
			InternalEObject oldExpressionIf = (InternalEObject)expressionIf;
			expressionIf = (Expression)eResolveProxy(oldExpressionIf);
			if (expressionIf != oldExpressionIf)
			{
				InternalEObject newExpressionIf = (InternalEObject)expressionIf;
				NotificationChain msgs = oldExpressionIf.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, null);
				if (newExpressionIf.eInternalContainer() == null)
				{
					msgs = newExpressionIf.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, expressionIf));
			}
		}
		return expressionIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetExpressionIf()
	{
		return expressionIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionIf(Expression newExpressionIf, NotificationChain msgs)
	{
		Expression oldExpressionIf = expressionIf;
		expressionIf = newExpressionIf;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, newExpressionIf);
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
	public void setExpressionIf(Expression newExpressionIf)
	{
		if (newExpressionIf != expressionIf)
		{
			NotificationChain msgs = null;
			if (expressionIf != null)
				msgs = ((InternalEObject)expressionIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
			if (newExpressionIf != null)
				msgs = ((InternalEObject)newExpressionIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
			msgs = basicSetExpressionIf(newExpressionIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, newExpressionIf, newExpressionIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getGeneralExpressionElse()
	{
		if (generalExpressionElse != null && generalExpressionElse.eIsProxy())
		{
			InternalEObject oldGeneralExpressionElse = (InternalEObject)generalExpressionElse;
			generalExpressionElse = (Expression)eResolveProxy(oldGeneralExpressionElse);
			if (generalExpressionElse != oldGeneralExpressionElse)
			{
				InternalEObject newGeneralExpressionElse = (InternalEObject)generalExpressionElse;
				NotificationChain msgs = oldGeneralExpressionElse.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, null, null);
				if (newGeneralExpressionElse.eInternalContainer() == null)
				{
					msgs = newGeneralExpressionElse.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, oldGeneralExpressionElse, generalExpressionElse));
			}
		}
		return generalExpressionElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetGeneralExpressionElse()
	{
		return generalExpressionElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralExpressionElse(Expression newGeneralExpressionElse, NotificationChain msgs)
	{
		Expression oldGeneralExpressionElse = generalExpressionElse;
		generalExpressionElse = newGeneralExpressionElse;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, oldGeneralExpressionElse, newGeneralExpressionElse);
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
	public void setGeneralExpressionElse(Expression newGeneralExpressionElse)
	{
		if (newGeneralExpressionElse != generalExpressionElse)
		{
			NotificationChain msgs = null;
			if (generalExpressionElse != null)
				msgs = ((InternalEObject)generalExpressionElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, null, msgs);
			if (newGeneralExpressionElse != null)
				msgs = ((InternalEObject)newGeneralExpressionElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, null, msgs);
			msgs = basicSetGeneralExpressionElse(newGeneralExpressionElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE, newGeneralExpressionElse, newGeneralExpressionElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentExpressionChild getExpressionElse()
	{
		return org.emftext.language.java.extensions.expressions.ConditionalExpressionExtension.getExpressionElse((org.emftext.language.java.expressions.ConditionalExpression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionChild(final AssignmentExpressionChild newChild)
	{
		org.emftext.language.java.extensions.expressions.ConditionalExpressionExtension.setExpressionElse((org.emftext.language.java.expressions.ConditionalExpression) this, newChild);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				return basicSetExpressionIf(null, msgs);
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE:
				return basicSetGeneralExpressionElse(null, msgs);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				if (resolve) return getExpressionIf();
				return basicGetExpressionIf();
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE:
				if (resolve) return getGeneralExpressionElse();
				return basicGetGeneralExpressionElse();
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				setChild((ConditionalExpressionChild)newValue);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				setExpressionIf((Expression)newValue);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE:
				setGeneralExpressionElse((Expression)newValue);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				setChild((ConditionalExpressionChild)null);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				setExpressionIf((Expression)null);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE:
				setGeneralExpressionElse((Expression)null);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				return child != null;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				return expressionIf != null;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE:
				return generalExpressionElse != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionImpl
