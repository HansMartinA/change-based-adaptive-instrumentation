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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.modules.*;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.modules.ModulesPackage
 * @generated
 */
public class ModulesSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulesSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ModulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ModulesPackage.MODULE_DIRECTIVE:
			{
				ModuleDirective moduleDirective = (ModuleDirective)theEObject;
				T result = caseModuleDirective(moduleDirective);
				if (result == null) result = caseCommentable(moduleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.USES_MODULE_DIRECTIVE:
			{
				UsesModuleDirective usesModuleDirective = (UsesModuleDirective)theEObject;
				T result = caseUsesModuleDirective(usesModuleDirective);
				if (result == null) result = caseModuleDirective(usesModuleDirective);
				if (result == null) result = caseTypedElement(usesModuleDirective);
				if (result == null) result = caseCommentable(usesModuleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE:
			{
				ProvidesModuleDirective providesModuleDirective = (ProvidesModuleDirective)theEObject;
				T result = caseProvidesModuleDirective(providesModuleDirective);
				if (result == null) result = caseTypedElement(providesModuleDirective);
				if (result == null) result = caseModuleDirective(providesModuleDirective);
				if (result == null) result = caseCommentable(providesModuleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE:
			{
				AccessProvidingModuleDirective accessProvidingModuleDirective = (AccessProvidingModuleDirective)theEObject;
				T result = caseAccessProvidingModuleDirective(accessProvidingModuleDirective);
				if (result == null) result = caseModuleDirective(accessProvidingModuleDirective);
				if (result == null) result = caseNamespaceAwareElement(accessProvidingModuleDirective);
				if (result == null) result = caseCommentable(accessProvidingModuleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE:
			{
				RequiresModuleDirective requiresModuleDirective = (RequiresModuleDirective)theEObject;
				T result = caseRequiresModuleDirective(requiresModuleDirective);
				if (result == null) result = caseModuleDirective(requiresModuleDirective);
				if (result == null) result = caseCommentable(requiresModuleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.OPENS_MODULE_DIRECTIVE:
			{
				OpensModuleDirective opensModuleDirective = (OpensModuleDirective)theEObject;
				T result = caseOpensModuleDirective(opensModuleDirective);
				if (result == null) result = caseAccessProvidingModuleDirective(opensModuleDirective);
				if (result == null) result = caseModuleDirective(opensModuleDirective);
				if (result == null) result = caseNamespaceAwareElement(opensModuleDirective);
				if (result == null) result = caseCommentable(opensModuleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.EXPORTS_MODULE_DIRECTIVE:
			{
				ExportsModuleDirective exportsModuleDirective = (ExportsModuleDirective)theEObject;
				T result = caseExportsModuleDirective(exportsModuleDirective);
				if (result == null) result = caseAccessProvidingModuleDirective(exportsModuleDirective);
				if (result == null) result = caseModuleDirective(exportsModuleDirective);
				if (result == null) result = caseNamespaceAwareElement(exportsModuleDirective);
				if (result == null) result = caseCommentable(exportsModuleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulesPackage.MODULE_REFERENCE:
			{
				ModuleReference moduleReference = (ModuleReference)theEObject;
				T result = caseModuleReference(moduleReference);
				if (result == null) result = caseNamespaceAwareElement(moduleReference);
				if (result == null) result = caseCommentable(moduleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDirective(ModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesModuleDirective(UsesModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesModuleDirective(ProvidesModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Providing Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Providing Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessProvidingModuleDirective(AccessProvidingModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresModuleDirective(RequiresModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opens Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opens Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpensModuleDirective(OpensModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exports Module Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exports Module Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportsModuleDirective(ExportsModuleDirective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleReference(ModuleReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentable(Commentable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAwareElement(NamespaceAwareElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ModulesSwitch
