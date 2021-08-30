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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.CommonsPackage;
import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.modules.AccessProvidingModuleDirective;
import org.emftext.language.java.modules.ModuleReference;
import org.emftext.language.java.modules.ModulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Providing Module Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.emftext.language.java.modules.impl.AccessProvidingModuleDirectiveImpl#getAccessablePackage <em>Accessable Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccessProvidingModuleDirectiveImpl extends ModuleDirectiveImpl implements AccessProvidingModuleDirective
{
	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> namespaces;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleReference> modules;

	/**
	 * The cached value of the '{@link #getAccessablePackage() <em>Accessable Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessablePackage()
	 * @generated
	 * @ordered
	 */
	protected org.emftext.language.java.containers.Package accessablePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessProvidingModuleDirectiveImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ModulesPackage.Literals.ACCESS_PROVIDING_MODULE_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNamespaces()
	{
		if (namespaces == null)
		{
			namespaces = new EDataTypeEList<String>(String.class, this, ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleReference> getModules()
	{
		if (modules == null)
		{
			modules = new EObjectContainmentEList.Resolving<ModuleReference>(ModuleReference.class, this, ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.emftext.language.java.containers.Package getAccessablePackage()
	{
		if (accessablePackage != null && accessablePackage.eIsProxy())
		{
			InternalEObject oldAccessablePackage = (InternalEObject)accessablePackage;
			accessablePackage = (org.emftext.language.java.containers.Package)eResolveProxy(oldAccessablePackage);
			if (accessablePackage != oldAccessablePackage)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE, oldAccessablePackage, accessablePackage));
			}
		}
		return accessablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftext.language.java.containers.Package basicGetAccessablePackage()
	{
		return accessablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessablePackage(org.emftext.language.java.containers.Package newAccessablePackage)
	{
		org.emftext.language.java.containers.Package oldAccessablePackage = accessablePackage;
		accessablePackage = newAccessablePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE, oldAccessablePackage, accessablePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespacesAsString()
	{
		return org.emftext.language.java.extensions.commons.NamespaceAwareElementExtension.getNamespacesAsString((org.emftext.language.java.commons.NamespaceAwareElement) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteClassifier getClassifierAtNamespaces()
	{
		return org.emftext.language.java.extensions.commons.NamespaceAwareElementExtension.getClassifierAtNamespaces((org.emftext.language.java.commons.NamespaceAwareElement) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES:
				return getNamespaces();
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES:
				return getModules();
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE:
				if (resolve) return getAccessablePackage();
				return basicGetAccessablePackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends ModuleReference>)newValue);
				return;
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE:
				setAccessablePackage((org.emftext.language.java.containers.Package)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES:
				getNamespaces().clear();
				return;
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES:
				getModules().clear();
				return;
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE:
				setAccessablePackage((org.emftext.language.java.containers.Package)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__MODULES:
				return modules != null && !modules.isEmpty();
			case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE:
				return accessablePackage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == NamespaceAwareElement.class)
		{
			switch (derivedFeatureID)
			{
				case ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES: return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == NamespaceAwareElement.class)
		{
			switch (baseFeatureID)
			{
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES: return ModulesPackage.ACCESS_PROVIDING_MODULE_DIRECTIVE__NAMESPACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (namespaces: ");
		result.append(namespaces);
		result.append(')');
		return result.toString();
	}

} //AccessProvidingModuleDirectiveImpl
