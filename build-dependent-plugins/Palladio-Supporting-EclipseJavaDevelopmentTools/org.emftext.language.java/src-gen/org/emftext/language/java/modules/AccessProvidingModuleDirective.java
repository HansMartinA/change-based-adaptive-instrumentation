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
package org.emftext.language.java.modules;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.NamespaceAwareElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Providing Module Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.modules.AccessProvidingModuleDirective#getModules <em>Modules</em>}</li>
 *   <li>{@link org.emftext.language.java.modules.AccessProvidingModuleDirective#getAccessablePackage <em>Accessable Package</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.modules.ModulesPackage#getAccessProvidingModuleDirective()
 * @model abstract="true"
 * @generated
 */
public interface AccessProvidingModuleDirective extends ModuleDirective, NamespaceAwareElement
{
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.modules.ModuleReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.emftext.language.java.modules.ModulesPackage#getAccessProvidingModuleDirective_Modules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ModuleReference> getModules();

	/**
	 * Returns the value of the '<em><b>Accessable Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessable Package</em>' reference.
	 * @see #setAccessablePackage(org.emftext.language.java.containers.Package)
	 * @see org.emftext.language.java.modules.ModulesPackage#getAccessProvidingModuleDirective_AccessablePackage()
	 * @model
	 * @generated
	 */
	org.emftext.language.java.containers.Package getAccessablePackage();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.modules.AccessProvidingModuleDirective#getAccessablePackage <em>Accessable Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessable Package</em>' reference.
	 * @see #getAccessablePackage()
	 * @generated
	 */
	void setAccessablePackage(org.emftext.language.java.containers.Package value);

} // AccessProvidingModuleDirective
