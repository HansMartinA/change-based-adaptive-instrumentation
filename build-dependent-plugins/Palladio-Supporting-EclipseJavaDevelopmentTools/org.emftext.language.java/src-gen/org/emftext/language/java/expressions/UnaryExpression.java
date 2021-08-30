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
package org.emftext.language.java.expressions;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.operators.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.UnaryExpression#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.UnaryExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends MultiplicativeExpressionChild
{
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.operators.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getUnaryExpression_Operators()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UnaryOperator> getOperators();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(UnaryExpressionChild)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getUnaryExpression_Child()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	UnaryExpressionChild getChild();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.UnaryExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(UnaryExpressionChild value);

} // UnaryExpression
