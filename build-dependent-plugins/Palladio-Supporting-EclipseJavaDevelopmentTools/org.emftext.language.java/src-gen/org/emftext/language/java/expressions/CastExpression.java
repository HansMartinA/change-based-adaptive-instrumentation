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

import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.CastExpression#getAdditionalBounds <em>Additional Bounds</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.CastExpression#getGeneralChild <em>General Child</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends TypedElement, UnaryModificationExpressionChild
{
	/**
	 * Returns the value of the '<em><b>Additional Bounds</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Bounds</em>' containment reference list.
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getCastExpression_AdditionalBounds()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeReference> getAdditionalBounds();

	/**
	 * Returns the value of the '<em><b>General Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Child</em>' containment reference.
	 * @see #setGeneralChild(Expression)
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#getCastExpression_GeneralChild()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Expression getGeneralChild();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.expressions.CastExpression#getGeneralChild <em>General Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Child</em>' containment reference.
	 * @see #getGeneralChild()
	 * @generated
	 */
	void setGeneralChild(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	MultiplicativeExpressionChild getChild();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newChildRequired="true"
	 * @generated
	 */
	void setChild(MultiplicativeExpressionChild newChild);

} // CastExpression
