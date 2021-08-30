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

import org.emftext.language.java.expressions.CastExpression;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;

import org.emftext.language.java.types.impl.TypedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.CastExpressionImpl#getAdditionalBounds <em>Additional Bounds</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.CastExpressionImpl#getGeneralChild <em>General Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CastExpressionImpl extends TypedElementImpl implements CastExpression
{
	/**
	 * The cached value of the '{@link #getAdditionalBounds() <em>Additional Bounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> additionalBounds;

	/**
	 * The cached value of the '{@link #getGeneralChild() <em>General Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralChild()
	 * @generated
	 * @ordered
	 */
	protected Expression generalChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CastExpressionImpl()
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
		return ExpressionsPackage.Literals.CAST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getAdditionalBounds()
	{
		if (additionalBounds == null)
		{
			additionalBounds = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, ExpressionsPackage.CAST_EXPRESSION__ADDITIONAL_BOUNDS);
		}
		return additionalBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getGeneralChild()
	{
		if (generalChild != null && generalChild.eIsProxy())
		{
			InternalEObject oldGeneralChild = (InternalEObject)generalChild;
			generalChild = (Expression)eResolveProxy(oldGeneralChild);
			if (generalChild != oldGeneralChild)
			{
				InternalEObject newGeneralChild = (InternalEObject)generalChild;
				NotificationChain msgs = oldGeneralChild.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, null, null);
				if (newGeneralChild.eInternalContainer() == null)
				{
					msgs = newGeneralChild.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, oldGeneralChild, generalChild));
			}
		}
		return generalChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetGeneralChild()
	{
		return generalChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralChild(Expression newGeneralChild, NotificationChain msgs)
	{
		Expression oldGeneralChild = generalChild;
		generalChild = newGeneralChild;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, oldGeneralChild, newGeneralChild);
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
	public void setGeneralChild(Expression newGeneralChild)
	{
		if (newGeneralChild != generalChild)
		{
			NotificationChain msgs = null;
			if (generalChild != null)
				msgs = ((InternalEObject)generalChild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, null, msgs);
			if (newGeneralChild != null)
				msgs = ((InternalEObject)newGeneralChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, null, msgs);
			msgs = basicSetGeneralChild(newGeneralChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD, newGeneralChild, newGeneralChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicativeExpressionChild getChild()
	{
		return org.emftext.language.java.extensions.expressions.CastExpressionExtension.getChild((org.emftext.language.java.expressions.CastExpression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChild(final MultiplicativeExpressionChild newChild)
	{
		org.emftext.language.java.extensions.expressions.CastExpressionExtension.setChild((org.emftext.language.java.expressions.CastExpression) this, newChild);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType()
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getType((org.emftext.language.java.expressions.Expression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getAlternativeType()
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getAlternativeType((org.emftext.language.java.expressions.Expression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOneType(final boolean alternative)
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getOneType((org.emftext.language.java.expressions.Expression) this, alternative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getArrayDimension()
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getArrayDimension((org.emftext.language.java.expressions.Expression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getOneTypeReference(final boolean alternative)
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getOneTypeReference((org.emftext.language.java.expressions.Expression) this, alternative);
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
			case ExpressionsPackage.CAST_EXPRESSION__ADDITIONAL_BOUNDS:
				return ((InternalEList<?>)getAdditionalBounds()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD:
				return basicSetGeneralChild(null, msgs);
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
			case ExpressionsPackage.CAST_EXPRESSION__ADDITIONAL_BOUNDS:
				return getAdditionalBounds();
			case ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD:
				if (resolve) return getGeneralChild();
				return basicGetGeneralChild();
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
			case ExpressionsPackage.CAST_EXPRESSION__ADDITIONAL_BOUNDS:
				getAdditionalBounds().clear();
				getAdditionalBounds().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD:
				setGeneralChild((Expression)newValue);
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
			case ExpressionsPackage.CAST_EXPRESSION__ADDITIONAL_BOUNDS:
				getAdditionalBounds().clear();
				return;
			case ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD:
				setGeneralChild((Expression)null);
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
			case ExpressionsPackage.CAST_EXPRESSION__ADDITIONAL_BOUNDS:
				return additionalBounds != null && !additionalBounds.isEmpty();
			case ExpressionsPackage.CAST_EXPRESSION__GENERAL_CHILD:
				return generalChild != null;
		}
		return super.eIsSet(featureID);
	}

} //CastExpressionImpl
