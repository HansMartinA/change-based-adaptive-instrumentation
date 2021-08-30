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

import org.emftext.language.java.modifiers.Open;

import org.emftext.language.java.modules.ModuleDirective;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.Module#getOpen <em>Open</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.Module#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.Module#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.containers.ContainersPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends JavaRoot
{
	/**
	 * Returns the value of the '<em><b>Open</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' containment reference.
	 * @see #setOpen(Open)
	 * @see org.emftext.language.java.containers.ContainersPackage#getModule_Open()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Open getOpen();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.containers.Module#getOpen <em>Open</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' containment reference.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(Open value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.modules.ModuleDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.emftext.language.java.containers.ContainersPackage#getModule_Target()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ModuleDirective> getTarget();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link org.emftext.language.java.containers.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see org.emftext.language.java.containers.ContainersPackage#getModule_Packages()
	 * @model
	 * @generated
	 */
	EList<org.emftext.language.java.containers.Package> getPackages();

} // Module
