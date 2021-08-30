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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.modules.ModulesFactory
 * @model kind="package"
 * @generated
 */
public interface ModulesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/java/modules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModulesPackage eINSTANCE = org.emftext.language.java.modules.impl.ModulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.ModuleDirectiveImpl <em>Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.ModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getModuleDirective()
	 * @generated
	 */
	int MODULE_DIRECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DIRECTIVE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.UsesModuleDirectiveImpl <em>Uses Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.UsesModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getUsesModuleDirective()
	 * @generated
	 */
	int USES_MODULE_DIRECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = MODULE_DIRECTIVE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_MODULE_DIRECTIVE__TYPE_REFERENCE = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uses Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_MODULE_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.ProvidesModuleDirectiveImpl <em>Provides Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.ProvidesModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getProvidesModuleDirective()
	 * @generated
	 */
	int PROVIDES_MODULE_DIRECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = TypesPackage.TYPED_ELEMENT__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_MODULE_DIRECTIVE__TYPE_REFERENCE = TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provides Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_MODULE_DIRECTIVE_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl <em>Access Providing Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getAccessProvidingModuleDirective()
	 * @generated
	 */
	int ACCESS_PROVIDING_MODULE_DIRECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PROVIDING_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = MODULE_DIRECTIVE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accessable Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE = MODULE_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Access Providing Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PROVIDING_MODULE_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.RequiresModuleDirectiveImpl <em>Requires Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.RequiresModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getRequiresModuleDirective()
	 * @generated
	 */
	int REQUIRES_MODULE_DIRECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = MODULE_DIRECTIVE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_MODULE_DIRECTIVE__MODIFIER = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requires Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_MODULE_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.OpensModuleDirectiveImpl <em>Opens Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.OpensModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getOpensModuleDirective()
	 * @generated
	 */
	int OPENS_MODULE_DIRECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = ACCESS_PROVIDING_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_MODULE_DIRECTIVE__NAMESPACES = ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_MODULE_DIRECTIVE__MODULES = ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES;

	/**
	 * The feature id for the '<em><b>Accessable Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE = ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE;

	/**
	 * The number of structural features of the '<em>Opens Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_MODULE_DIRECTIVE_FEATURE_COUNT = ACCESS_PROVIDING_MODULE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.ExportsModuleDirectiveImpl <em>Exports Module Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.ExportsModuleDirectiveImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getExportsModuleDirective()
	 * @generated
	 */
	int EXPORTS_MODULE_DIRECTIVE = 6;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS = ACCESS_PROVIDING_MODULE_DIRECTIVE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_MODULE_DIRECTIVE__NAMESPACES = ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_MODULE_DIRECTIVE__MODULES = ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES;

	/**
	 * The feature id for the '<em><b>Accessable Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE = ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE;

	/**
	 * The number of structural features of the '<em>Exports Module Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_MODULE_DIRECTIVE_FEATURE_COUNT = ACCESS_PROVIDING_MODULE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.java.modules.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modules.impl.ModuleReferenceImpl
	 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getModuleReference()
	 * @generated
	 */
	int MODULE_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__LAYOUT_INFORMATIONS = CommonsPackage.NAMESPACE_AWARE_ELEMENT__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__NAMESPACES = CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__TARGET = CommonsPackage.NAMESPACE_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_FEATURE_COUNT = CommonsPackage.NAMESPACE_AWARE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.ModuleDirective <em>Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Directive</em>'.
	 * @see org.emftext.language.java.modules.ModuleDirective
	 * @generated
	 */
	EClass getModuleDirective();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.UsesModuleDirective <em>Uses Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Module Directive</em>'.
	 * @see org.emftext.language.java.modules.UsesModuleDirective
	 * @generated
	 */
	EClass getUsesModuleDirective();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.ProvidesModuleDirective <em>Provides Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Module Directive</em>'.
	 * @see org.emftext.language.java.modules.ProvidesModuleDirective
	 * @generated
	 */
	EClass getProvidesModuleDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.java.modules.ProvidesModuleDirective#getServiceProviders <em>Service Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Providers</em>'.
	 * @see org.emftext.language.java.modules.ProvidesModuleDirective#getServiceProviders()
	 * @see #getProvidesModuleDirective()
	 * @generated
	 */
	EReference getProvidesModuleDirective_ServiceProviders();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.AccessProvidingModuleDirective <em>Access Providing Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Providing Module Directive</em>'.
	 * @see org.emftext.language.java.modules.AccessProvidingModuleDirective
	 * @generated
	 */
	EClass getAccessProvidingModuleDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.java.modules.AccessProvidingModuleDirective#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.emftext.language.java.modules.AccessProvidingModuleDirective#getModules()
	 * @see #getAccessProvidingModuleDirective()
	 * @generated
	 */
	EReference getAccessProvidingModuleDirective_Modules();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.java.modules.AccessProvidingModuleDirective#getAccessablePackage <em>Accessable Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessable Package</em>'.
	 * @see org.emftext.language.java.modules.AccessProvidingModuleDirective#getAccessablePackage()
	 * @see #getAccessProvidingModuleDirective()
	 * @generated
	 */
	EReference getAccessProvidingModuleDirective_AccessablePackage();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.RequiresModuleDirective <em>Requires Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Module Directive</em>'.
	 * @see org.emftext.language.java.modules.RequiresModuleDirective
	 * @generated
	 */
	EClass getRequiresModuleDirective();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.java.modules.RequiresModuleDirective#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modifier</em>'.
	 * @see org.emftext.language.java.modules.RequiresModuleDirective#getModifier()
	 * @see #getRequiresModuleDirective()
	 * @generated
	 */
	EReference getRequiresModuleDirective_Modifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.java.modules.RequiresModuleDirective#getRequiredModule <em>Required Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Module</em>'.
	 * @see org.emftext.language.java.modules.RequiresModuleDirective#getRequiredModule()
	 * @see #getRequiresModuleDirective()
	 * @generated
	 */
	EReference getRequiresModuleDirective_RequiredModule();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.OpensModuleDirective <em>Opens Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opens Module Directive</em>'.
	 * @see org.emftext.language.java.modules.OpensModuleDirective
	 * @generated
	 */
	EClass getOpensModuleDirective();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.ExportsModuleDirective <em>Exports Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exports Module Directive</em>'.
	 * @see org.emftext.language.java.modules.ExportsModuleDirective
	 * @generated
	 */
	EClass getExportsModuleDirective();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.java.modules.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Reference</em>'.
	 * @see org.emftext.language.java.modules.ModuleReference
	 * @generated
	 */
	EClass getModuleReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.java.modules.ModuleReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftext.language.java.modules.ModuleReference#getTarget()
	 * @see #getModuleReference()
	 * @generated
	 */
	EReference getModuleReference_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModulesFactory getModulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.ModuleDirectiveImpl <em>Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.ModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getModuleDirective()
		 * @generated
		 */
		EClass MODULE_DIRECTIVE = eINSTANCE.getModuleDirective();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.UsesModuleDirectiveImpl <em>Uses Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.UsesModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getUsesModuleDirective()
		 * @generated
		 */
		EClass USES_MODULE_DIRECTIVE = eINSTANCE.getUsesModuleDirective();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.ProvidesModuleDirectiveImpl <em>Provides Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.ProvidesModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getProvidesModuleDirective()
		 * @generated
		 */
		EClass PROVIDES_MODULE_DIRECTIVE = eINSTANCE.getProvidesModuleDirective();

		/**
		 * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS = eINSTANCE.getProvidesModuleDirective_ServiceProviders();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl <em>Access Providing Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getAccessProvidingModuleDirective()
		 * @generated
		 */
		EClass ACCESS_PROVIDING_MODULE_DIRECTIVE = eINSTANCE.getAccessProvidingModuleDirective();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES = eINSTANCE.getAccessProvidingModuleDirective_Modules();

		/**
		 * The meta object literal for the '<em><b>Accessable Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE = eINSTANCE.getAccessProvidingModuleDirective_AccessablePackage();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.RequiresModuleDirectiveImpl <em>Requires Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.RequiresModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getRequiresModuleDirective()
		 * @generated
		 */
		EClass REQUIRES_MODULE_DIRECTIVE = eINSTANCE.getRequiresModuleDirective();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_MODULE_DIRECTIVE__MODIFIER = eINSTANCE.getRequiresModuleDirective_Modifier();

		/**
		 * The meta object literal for the '<em><b>Required Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE = eINSTANCE.getRequiresModuleDirective_RequiredModule();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.OpensModuleDirectiveImpl <em>Opens Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.OpensModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getOpensModuleDirective()
		 * @generated
		 */
		EClass OPENS_MODULE_DIRECTIVE = eINSTANCE.getOpensModuleDirective();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.ExportsModuleDirectiveImpl <em>Exports Module Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.ExportsModuleDirectiveImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getExportsModuleDirective()
		 * @generated
		 */
		EClass EXPORTS_MODULE_DIRECTIVE = eINSTANCE.getExportsModuleDirective();

		/**
		 * The meta object literal for the '{@link org.emftext.language.java.modules.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.java.modules.impl.ModuleReferenceImpl
		 * @see org.emftext.language.java.modules.impl.ModulesPackageImpl#getModuleReference()
		 * @generated
		 */
		EClass MODULE_REFERENCE = eINSTANCE.getModuleReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REFERENCE__TARGET = eINSTANCE.getModuleReference_Target();

	}

} //ModulesPackage
