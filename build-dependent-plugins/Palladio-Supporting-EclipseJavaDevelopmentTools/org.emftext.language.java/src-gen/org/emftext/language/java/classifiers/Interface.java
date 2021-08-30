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
package org.emftext.language.java.classifiers;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.members.Method;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.Interface#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ConcreteClassifier
{
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getInterface_Extends()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeReference> getExtends();

	/**
	 * Returns the value of the '<em><b>Default Extends</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Extends</em>' containment reference list.
	 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getInterface_DefaultExtends()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeReference> getDefaultExtends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Method getAbstractMethodOfFunctionalInterface();

} // Interface
