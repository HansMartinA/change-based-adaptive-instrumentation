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
package org.emftext.language.java.modules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.java.modules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulesFactoryImpl extends EFactoryImpl implements ModulesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModulesFactory init()
	{
		try
		{
			ModulesFactory theModulesFactory = (ModulesFactory)EPackage.Registry.INSTANCE.getEFactory(ModulesPackage.eNS_URI);
			if (theModulesFactory != null)
			{
				return theModulesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulesFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ModulesPackage.USES_MODULE_DIRECTIVE: return createUsesModuleDirective();
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE: return createProvidesModuleDirective();
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE: return createRequiresModuleDirective();
			case ModulesPackage.OPENS_MODULE_DIRECTIVE: return createOpensModuleDirective();
			case ModulesPackage.EXPORTS_MODULE_DIRECTIVE: return createExportsModuleDirective();
			case ModulesPackage.MODULE_REFERENCE: return createModuleReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsesModuleDirective createUsesModuleDirective()
	{
		UsesModuleDirectiveImpl usesModuleDirective = new UsesModuleDirectiveImpl();
		return usesModuleDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidesModuleDirective createProvidesModuleDirective()
	{
		ProvidesModuleDirectiveImpl providesModuleDirective = new ProvidesModuleDirectiveImpl();
		return providesModuleDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiresModuleDirective createRequiresModuleDirective()
	{
		RequiresModuleDirectiveImpl requiresModuleDirective = new RequiresModuleDirectiveImpl();
		return requiresModuleDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpensModuleDirective createOpensModuleDirective()
	{
		OpensModuleDirectiveImpl opensModuleDirective = new OpensModuleDirectiveImpl();
		return opensModuleDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportsModuleDirective createExportsModuleDirective()
	{
		ExportsModuleDirectiveImpl exportsModuleDirective = new ExportsModuleDirectiveImpl();
		return exportsModuleDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleReference createModuleReference()
	{
		ModuleReferenceImpl moduleReference = new ModuleReferenceImpl();
		return moduleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModulesPackage getModulesPackage()
	{
		return (ModulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModulesPackage getPackage()
	{
		return ModulesPackage.eINSTANCE;
	}

} //ModulesFactoryImpl
