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

import org.emftext.language.java.variables.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.references.ElementReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.java.references.ElementReference#getContainedTarget <em>Contained Target</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.references.ReferencesPackage#getElementReference()
 * @model abstract="true"
 * @generated
 */
public interface ElementReference extends Reference, Resource
{
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ReferenceableElement)
	 * @see org.emftext.language.java.references.ReferencesPackage#getElementReference_Target()
	 * @model required="true"
	 * @generated
	 */
	ReferenceableElement getTarget();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.references.ElementReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ReferenceableElement value);

	/**
	 * Returns the value of the '<em><b>Contained Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Target</em>' containment reference.
	 * @see #setContainedTarget(ReferenceableElement)
	 * @see org.emftext.language.java.references.ReferencesPackage#getElementReference_ContainedTarget()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ReferenceableElement getContainedTarget();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.references.ElementReference#getContainedTarget <em>Contained Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Target</em>' containment reference.
	 * @see #getContainedTarget()
	 * @generated
	 */
	void setContainedTarget(ReferenceableElement value);

} // ElementReference
