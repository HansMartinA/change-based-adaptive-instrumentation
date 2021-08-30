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

import org.emftext.language.java.classifiers.Interface;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.LambdaExpression#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.LambdaExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getLambdaExpression()
 * @model
 * @generated
 */
public interface LambdaExpression extends Expression
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(LambdaParameters)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getLambdaExpression_Parameters()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	LambdaParameters getParameters();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.LambdaExpression#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(LambdaParameters value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(LambdaBody)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getLambdaExpression_Body()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	LambdaBody getBody();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.LambdaExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(LambdaBody value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" functionalInterfaceRequired="true"
	 * @generated
	 */
	boolean doesLambdaMatchFunctionalInterface(Interface functionalInterface);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Type getReturnType(Type potentialReturnType);

} // LambdaExpression
