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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.statements.NormalSwitchRule;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.SwitchCase;
import org.emftext.language.java.statements.SwitchRule;

import org.emftext.language.java.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Switch Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.impl.NormalSwitchRuleImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.NormalSwitchRuleImpl#getAdditionalConditions <em>Additional Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalSwitchRuleImpl extends ConditionalImpl implements NormalSwitchRule
{
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The cached value of the '{@link #getAdditionalConditions() <em>Additional Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> additionalConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalSwitchRuleImpl()
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
		return StatementsPackage.Literals.NORMAL_SWITCH_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getStatements()
	{
		if (statements == null)
		{
			statements = new EObjectContainmentEList.Resolving<Statement>(Statement.class, this, StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getAdditionalConditions()
	{
		if (additionalConditions == null)
		{
			additionalConditions = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this, StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS);
		}
		return additionalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariable getLocalVariable(final String name)
	{
		return org.emftext.language.java.extensions.statements.StatementListContainerExtension.getLocalVariable((org.emftext.language.java.statements.StatementListContainer) this, name);
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
			case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS:
				return ((InternalEList<?>)getAdditionalConditions()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS:
				return getStatements();
			case StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS:
				return getAdditionalConditions();
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
			case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS:
				getAdditionalConditions().clear();
				getAdditionalConditions().addAll((Collection<? extends Expression>)newValue);
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
			case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS:
				getStatements().clear();
				return;
			case StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS:
				getAdditionalConditions().clear();
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
			case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS:
				return additionalConditions != null && !additionalConditions.isEmpty();
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
		if (baseClass == StatementListContainer.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == SwitchCase.class)
		{
			switch (derivedFeatureID)
			{
				case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS: return StatementsPackage.SWITCH_CASE__STATEMENTS;
				default: return -1;
			}
		}
		if (baseClass == SwitchRule.class)
		{
			switch (derivedFeatureID)
			{
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
		if (baseClass == StatementListContainer.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == SwitchCase.class)
		{
			switch (baseFeatureID)
			{
				case StatementsPackage.SWITCH_CASE__STATEMENTS: return StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS;
				default: return -1;
			}
		}
		if (baseClass == SwitchRule.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NormalSwitchRuleImpl
