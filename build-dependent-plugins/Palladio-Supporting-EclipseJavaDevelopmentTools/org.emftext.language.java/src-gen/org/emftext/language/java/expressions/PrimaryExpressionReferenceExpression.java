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

import org.emftext.language.java.generics.CallTypeArgumentable;

import org.emftext.language.java.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression#getMethodReference <em>Method Reference</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getPrimaryExpressionReferenceExpression()
 * @model
 * @generated
 */
public interface PrimaryExpressionReferenceExpression extends MethodReferenceExpression, CallTypeArgumentable
{
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(MethodReferenceExpressionChild)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getPrimaryExpressionReferenceExpression_Child()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	MethodReferenceExpressionChild getChild();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(MethodReferenceExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Method Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Reference</em>' containment reference.
	 * @see #setMethodReference(Reference)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getPrimaryExpressionReferenceExpression_MethodReference()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Reference getMethodReference();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression#getMethodReference <em>Method Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Reference</em>' containment reference.
	 * @see #getMethodReference()
	 * @generated
	 */
	void setMethodReference(Reference value);

} // PrimaryExpressionReferenceExpression
