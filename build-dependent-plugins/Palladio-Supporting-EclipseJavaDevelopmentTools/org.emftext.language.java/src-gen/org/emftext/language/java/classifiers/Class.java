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

import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.Class#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ConcreteClassifier, Implementor
{
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(TypeReference)
	 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getClass_Extends()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	TypeReference getExtends();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.classifiers.Class#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Default Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Extends</em>' containment reference.
	 * @see #setDefaultExtends(TypeReference)
	 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getClass_DefaultExtends()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	TypeReference getDefaultExtends();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.classifiers.Class#getDefaultExtends <em>Default Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Extends</em>' containment reference.
	 * @see #getDefaultExtends()
	 * @generated
	 */
	void setDefaultExtends(TypeReference value);

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
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Class getSuperClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	PrimitiveType unWrapPrimitiveType();

} // Class
