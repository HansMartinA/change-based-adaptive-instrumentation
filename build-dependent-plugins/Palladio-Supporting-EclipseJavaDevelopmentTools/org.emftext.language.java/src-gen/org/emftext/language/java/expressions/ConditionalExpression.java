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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.ConditionalExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.ConditionalExpression#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.ConditionalExpression#getGeneralExpressionElse <em>General Expression Else</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends AssignmentExpressionChild
{
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ConditionalExpressionChild)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getConditionalExpression_Child()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ConditionalExpressionChild getChild();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.ConditionalExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ConditionalExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Expression If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression If</em>' containment reference.
	 * @see #setExpressionIf(Expression)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getConditionalExpression_ExpressionIf()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Expression getExpressionIf();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.ConditionalExpression#getExpressionIf <em>Expression If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression If</em>' containment reference.
	 * @see #getExpressionIf()
	 * @generated
	 */
	void setExpressionIf(Expression value);

	/**
	 * Returns the value of the '<em><b>General Expression Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Expression Else</em>' containment reference.
	 * @see #setGeneralExpressionElse(Expression)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getConditionalExpression_GeneralExpressionElse()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Expression getGeneralExpressionElse();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.ConditionalExpression#getGeneralExpressionElse <em>General Expression Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Expression Else</em>' containment reference.
	 * @see #getGeneralExpressionElse()
	 * @generated
	 */
	void setGeneralExpressionElse(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	AssignmentExpressionChild getExpressionElse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newChildRequired="true"
	 * @generated
	 */
	void setExpressionChild(AssignmentExpressionChild newChild);

} // ConditionalExpression
