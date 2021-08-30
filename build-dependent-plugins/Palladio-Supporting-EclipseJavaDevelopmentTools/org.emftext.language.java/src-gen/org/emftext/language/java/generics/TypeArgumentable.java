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

import org.emftext.language.java.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.generics.TypeArgumentable#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.generics.GenericsPackage#getTypeArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface TypeArgumentable extends Commentable
{
	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.generics.TypeArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see org.emftext.language.java.generics.GenericsPackage#getTypeArgumentable_TypeArguments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeArgument> getTypeArguments();

} // TypeArgumentable
