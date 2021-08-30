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
package org.emftext.language.java.members;

import org.emftext.language.java.annotations.AnnotationValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.members.InterfaceMethod#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.members.MembersPackage#getInterfaceMethod()
 * @model
 * @generated
 */
public interface InterfaceMethod extends Method
{
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(AnnotationValue)
	 * @see org.emftext.language.java.members.MembersPackage#getInterfaceMethod_DefaultValue()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	AnnotationValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.members.InterfaceMethod#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AnnotationValue value);

} // InterfaceMethod
