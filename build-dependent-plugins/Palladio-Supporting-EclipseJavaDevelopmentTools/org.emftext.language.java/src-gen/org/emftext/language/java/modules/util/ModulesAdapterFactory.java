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
package org.emftext.language.java.modules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.modules.*;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.modules.ModulesPackage
 * @generated
 */
public class ModulesAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulesAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ModulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulesSwitch<Adapter> modelSwitch =
		new ModulesSwitch<Adapter>()
		{
			@Override
			public Adapter caseModuleDirective(ModuleDirective object)
			{
				return createModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseUsesModuleDirective(UsesModuleDirective object)
			{
				return createUsesModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseProvidesModuleDirective(ProvidesModuleDirective object)
			{
				return createProvidesModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseAccessProvidingModuleDirective(AccessProvidingModuleDirective object)
			{
				return createAccessProvidingModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseRequiresModuleDirective(RequiresModuleDirective object)
			{
				return createRequiresModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseOpensModuleDirective(OpensModuleDirective object)
			{
				return createOpensModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseExportsModuleDirective(ExportsModuleDirective object)
			{
				return createExportsModuleDirectiveAdapter();
			}
			@Override
			public Adapter caseModuleReference(ModuleReference object)
			{
				return createModuleReferenceAdapter();
			}
			@Override
			public Adapter caseCommentable(Commentable object)
			{
				return createCommentableAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object)
			{
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseNamespaceAwareElement(NamespaceAwareElement object)
			{
				return createNamespaceAwareElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.ModuleDirective <em>Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.ModuleDirective
	 * @generated
	 */
	public Adapter createModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.UsesModuleDirective <em>Uses Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.UsesModuleDirective
	 * @generated
	 */
	public Adapter createUsesModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.ProvidesModuleDirective <em>Provides Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.ProvidesModuleDirective
	 * @generated
	 */
	public Adapter createProvidesModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.AccessProvidingModuleDirective <em>Access Providing Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.AccessProvidingModuleDirective
	 * @generated
	 */
	public Adapter createAccessProvidingModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.RequiresModuleDirective <em>Requires Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.RequiresModuleDirective
	 * @generated
	 */
	public Adapter createRequiresModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.OpensModuleDirective <em>Opens Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.OpensModuleDirective
	 * @generated
	 */
	public Adapter createOpensModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.ExportsModuleDirective <em>Exports Module Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.ExportsModuleDirective
	 * @generated
	 */
	public Adapter createExportsModuleDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modules.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modules.ModuleReference
	 * @generated
	 */
	public Adapter createModuleReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.commons.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.types.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.types.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.NamespaceAwareElement <em>Namespace Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.commons.NamespaceAwareElement
	 * @generated
	 */
	public Adapter createNamespaceAwareElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ModulesAdapterFactory
