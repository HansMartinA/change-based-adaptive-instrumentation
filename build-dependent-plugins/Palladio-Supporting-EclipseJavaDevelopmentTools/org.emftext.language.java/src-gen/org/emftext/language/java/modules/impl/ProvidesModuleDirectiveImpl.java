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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.modules.ModulesPackage;
import org.emftext.language.java.modules.ProvidesModuleDirective;

import org.emftext.language.java.types.TypeReference;

import org.emftext.language.java.types.impl.TypedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides Module Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.modules.impl.ProvidesModuleDirectiveImpl#getServiceProviders <em>Service Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidesModuleDirectiveImpl extends TypedElementImpl implements ProvidesModuleDirective
{
	/**
	 * The cached value of the '{@link #getServiceProviders() <em>Service Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> serviceProviders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesModuleDirectiveImpl()
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
		return ModulesPackage.Literals.PROVIDES_MODULE_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getServiceProviders()
	{
		if (serviceProviders == null)
		{
			serviceProviders = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, ModulesPackage.PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS);
		}
		return serviceProviders;
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
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS:
				return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
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
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS:
				return getServiceProviders();
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
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS:
				getServiceProviders().clear();
				getServiceProviders().addAll((Collection<? extends TypeReference>)newValue);
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
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS:
				getServiceProviders().clear();
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
			case ModulesPackage.PROVIDES_MODULE_DIRECTIVE__SERVICE_PROVIDERS:
				return serviceProviders != null && !serviceProviders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidesModuleDirectiveImpl
