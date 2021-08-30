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
package org.emftext.language.java.statements;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Switch Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.NormalSwitchRule#getAdditionalConditions <em>Additional Conditions</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getNormalSwitchRule()
 * @model
 * @generated
 */
public interface NormalSwitchRule extends Conditional, SwitchRule
{
	/**
	 * Returns the value of the '<em><b>Additional Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Conditions</em>' containment reference list.
	 * @see org.emftext.language.java.statements.StatementsPackage#getNormalSwitchRule_AdditionalConditions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Expression> getAdditionalConditions();

} // NormalSwitchRule
