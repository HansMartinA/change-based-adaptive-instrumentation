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

import org.emftext.language.java.modifiers.ModuleRequiresModifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires Module Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.modules.RequiresModuleDirective#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.emftext.language.java.modules.RequiresModuleDirective#getRequiredModule <em>Required Module</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.modules.ModulesPackage#getRequiresModuleDirective()
 * @model
 * @generated
 */
public interface RequiresModuleDirective extends ModuleDirective
{
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(ModuleRequiresModifier)
	 * @see org.emftext.language.java.modules.ModulesPackage#getRequiresModuleDirective_Modifier()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ModuleRequiresModifier getModifier();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.modules.RequiresModuleDirective#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ModuleRequiresModifier value);

	/**
	 * Returns the value of the '<em><b>Required Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Module</em>' containment reference.
	 * @see #setRequiredModule(ModuleReference)
	 * @see org.emftext.language.java.modules.ModulesPackage#getRequiresModuleDirective_RequiredModule()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ModuleReference getRequiredModule();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.modules.RequiresModuleDirective#getRequiredModule <em>Required Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Module</em>' containment reference.
	 * @see #getRequiredModule()
	 * @generated
	 */
	void setRequiredModule(ModuleReference value);

} // RequiresModuleDirective
