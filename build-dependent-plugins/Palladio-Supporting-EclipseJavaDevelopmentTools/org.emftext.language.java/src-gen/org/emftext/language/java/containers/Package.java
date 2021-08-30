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
package org.emftext.language.java.containers;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.Package#getModule <em>Module</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.Package#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.containers.ContainersPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends JavaRoot, ReferenceableElement
{
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(org.emftext.language.java.containers.Module)
	 * @see org.emftext.language.java.containers.ContainersPackage#getPackage_Module()
	 * @model
	 * @generated
	 */
	org.emftext.language.java.containers.Module getModule();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.containers.Package#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.emftext.language.java.containers.Module value);

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' reference list.
	 * The list contents are of type {@link org.emftext.language.java.classifiers.ConcreteClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' reference list.
	 * @see org.emftext.language.java.containers.ContainersPackage#getPackage_Classifiers()
	 * @model
	 * @generated
	 */
	EList<ConcreteClassifier> getClassifiers();

} // Package
