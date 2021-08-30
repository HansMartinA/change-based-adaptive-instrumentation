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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.modules.ModulesPackage
 * @generated
 */
public interface ModulesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModulesFactory eINSTANCE = org.emftext.language.java.modules.impl.ModulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uses Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Module Directive</em>'.
	 * @generated
	 */
	UsesModuleDirective createUsesModuleDirective();

	/**
	 * Returns a new object of class '<em>Provides Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Module Directive</em>'.
	 * @generated
	 */
	ProvidesModuleDirective createProvidesModuleDirective();

	/**
	 * Returns a new object of class '<em>Requires Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires Module Directive</em>'.
	 * @generated
	 */
	RequiresModuleDirective createRequiresModuleDirective();

	/**
	 * Returns a new object of class '<em>Opens Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opens Module Directive</em>'.
	 * @generated
	 */
	OpensModuleDirective createOpensModuleDirective();

	/**
	 * Returns a new object of class '<em>Exports Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exports Module Directive</em>'.
	 * @generated
	 */
	ExportsModuleDirective createExportsModuleDirective();

	/**
	 * Returns a new object of class '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Reference</em>'.
	 * @generated
	 */
	ModuleReference createModuleReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModulesPackage getModulesPackage();

} //ModulesFactory
