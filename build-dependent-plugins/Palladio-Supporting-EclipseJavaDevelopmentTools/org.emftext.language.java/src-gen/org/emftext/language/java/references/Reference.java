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
package org.emftext.language.java.references;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.arrays.ArraySelector;

import org.emftext.language.java.expressions.PrimaryExpression;

import org.emftext.language.java.generics.TypeArgumentable;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.references.Reference#getNext <em>Next</em>}</li>
 *   <li>{@link org.emftext.language.java.references.Reference#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.references.ReferencesPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends PrimaryExpression, TypeArgumentable, TypedElementExtension
{
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Reference)
	 * @see org.emftext.language.java.references.ReferencesPackage#getReference_Next()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Reference getNext();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.references.Reference#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Reference value);

	/**
	 * Returns the value of the '<em><b>Array Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.arrays.ArraySelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Selectors</em>' containment reference list.
	 * @see org.emftext.language.java.references.ReferencesPackage#getReference_ArraySelectors()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ArraySelector> getArraySelectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Type getReferencedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Reference getPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TypeReference getReferencedTypeReference();

} // Reference
