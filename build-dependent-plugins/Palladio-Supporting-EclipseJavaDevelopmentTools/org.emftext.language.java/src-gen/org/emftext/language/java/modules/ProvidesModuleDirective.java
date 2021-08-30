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

import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Module Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.modules.ProvidesModuleDirective#getServiceProviders <em>Service Providers</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.modules.ModulesPackage#getProvidesModuleDirective()
 * @model
 * @generated
 */
public interface ProvidesModuleDirective extends TypedElement, ModuleDirective
{
	/**
	 * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Providers</em>' containment reference list.
	 * @see org.emftext.language.java.modules.ModulesPackage#getProvidesModuleDirective_ServiceProviders()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<TypeReference> getServiceProviders();

} // ProvidesModuleDirective
