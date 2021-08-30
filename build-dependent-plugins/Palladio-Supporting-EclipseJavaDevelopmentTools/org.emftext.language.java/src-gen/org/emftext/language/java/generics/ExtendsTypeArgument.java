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
package org.emftext.language.java.generics;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.annotations.Annotable;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.generics.ExtendsTypeArgument#getExtendType <em>Extend Type</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.generics.GenericsPackage#getExtendsTypeArgument()
 * @model
 * @generated
 */
public interface ExtendsTypeArgument extends Annotable, TypeArgument
{
	/**
	 * Returns the value of the '<em><b>Extend Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend Type</em>' containment reference.
	 * @see #setExtendType(TypeReference)
	 * @see org.emftext.language.java.generics.GenericsPackage#getExtendsTypeArgument_ExtendType()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	TypeReference getExtendType();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.generics.ExtendsTypeArgument#getExtendType <em>Extend Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend Type</em>' containment reference.
	 * @see #getExtendType()
	 * @generated
	 */
	void setExtendType(TypeReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<TypeReference> getExtendTypes();

} // ExtendsTypeArgument
