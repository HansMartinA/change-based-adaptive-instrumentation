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
package org.emftext.language.java.parameters;

import org.emftext.language.java.annotations.Annotable;

import org.emftext.language.java.literals.This;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.parameters.ReceiverParameter#getOuterTypeReference <em>Outer Type Reference</em>}</li>
 *   <li>{@link org.emftext.language.java.parameters.ReceiverParameter#getThisReference <em>This Reference</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.parameters.ParametersPackage#getReceiverParameter()
 * @model
 * @generated
 */
public interface ReceiverParameter extends Parameter, Annotable
{
	/**
	 * Returns the value of the '<em><b>Outer Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Type Reference</em>' containment reference.
	 * @see #setOuterTypeReference(TypeReference)
	 * @see org.emftext.language.java.parameters.ParametersPackage#getReceiverParameter_OuterTypeReference()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	TypeReference getOuterTypeReference();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.parameters.ReceiverParameter#getOuterTypeReference <em>Outer Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Type Reference</em>' containment reference.
	 * @see #getOuterTypeReference()
	 * @generated
	 */
	void setOuterTypeReference(TypeReference value);

	/**
	 * Returns the value of the '<em><b>This Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Reference</em>' containment reference.
	 * @see #setThisReference(This)
	 * @see org.emftext.language.java.parameters.ParametersPackage#getReceiverParameter_ThisReference()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	This getThisReference();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.parameters.ReceiverParameter#getThisReference <em>This Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Reference</em>' containment reference.
	 * @see #getThisReference()
	 * @generated
	 */
	void setThisReference(This value);

} // ReceiverParameter
