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
package org.emftext.language.java.literals;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Long Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.literals.BinaryLongLiteral#getBinaryValue <em>Binary Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.literals.LiteralsPackage#getBinaryLongLiteral()
 * @model
 * @generated
 */
public interface BinaryLongLiteral extends LongLiteral
{
	/**
	 * Returns the value of the '<em><b>Binary Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Value</em>' attribute.
	 * @see #setBinaryValue(BigInteger)
	 * @see org.emftext.language.java.literals.LiteralsPackage#getBinaryLongLiteral_BinaryValue()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getBinaryValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.literals.BinaryLongLiteral#getBinaryValue <em>Binary Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Value</em>' attribute.
	 * @see #getBinaryValue()
	 * @generated
	 */
	void setBinaryValue(BigInteger value);

} // BinaryLongLiteral
