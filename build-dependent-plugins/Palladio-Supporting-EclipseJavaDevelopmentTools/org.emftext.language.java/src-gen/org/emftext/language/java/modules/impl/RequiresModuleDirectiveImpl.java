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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.modifiers.ModuleRequiresModifier;

import org.emftext.language.java.modules.ModuleReference;
import org.emftext.language.java.modules.ModulesPackage;
import org.emftext.language.java.modules.RequiresModuleDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Module Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.modules.impl.RequiresModuleDirectiveImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.emftext.language.java.modules.impl.RequiresModuleDirectiveImpl#getRequiredModule <em>Required Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiresModuleDirectiveImpl extends ModuleDirectiveImpl implements RequiresModuleDirective
{
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected ModuleRequiresModifier modifier;

	/**
	 * The cached value of the '{@link #getRequiredModule() <em>Required Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredModule()
	 * @generated
	 * @ordered
	 */
	protected ModuleReference requiredModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresModuleDirectiveImpl()
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
		return ModulesPackage.Literals.REQUIRES_MODULE_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleRequiresModifier getModifier()
	{
		if (modifier != null && modifier.eIsProxy())
		{
			InternalEObject oldModifier = (InternalEObject)modifier;
			modifier = (ModuleRequiresModifier)eResolveProxy(oldModifier);
			if (modifier != oldModifier)
			{
				InternalEObject newModifier = (InternalEObject)modifier;
				NotificationChain msgs = oldModifier.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, null, null);
				if (newModifier.eInternalContainer() == null)
				{
					msgs = newModifier.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, oldModifier, modifier));
			}
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRequiresModifier basicGetModifier()
	{
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(ModuleRequiresModifier newModifier, NotificationChain msgs)
	{
		ModuleRequiresModifier oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, oldModifier, newModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifier(ModuleRequiresModifier newModifier)
	{
		if (newModifier != modifier)
		{
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, null, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, null, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleReference getRequiredModule()
	{
		if (requiredModule != null && requiredModule.eIsProxy())
		{
			InternalEObject oldRequiredModule = (InternalEObject)requiredModule;
			requiredModule = (ModuleReference)eResolveProxy(oldRequiredModule);
			if (requiredModule != oldRequiredModule)
			{
				InternalEObject newRequiredModule = (InternalEObject)requiredModule;
				NotificationChain msgs = oldRequiredModule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, null, null);
				if (newRequiredModule.eInternalContainer() == null)
				{
					msgs = newRequiredModule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, oldRequiredModule, requiredModule));
			}
		}
		return requiredModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleReference basicGetRequiredModule()
	{
		return requiredModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredModule(ModuleReference newRequiredModule, NotificationChain msgs)
	{
		ModuleReference oldRequiredModule = requiredModule;
		requiredModule = newRequiredModule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, oldRequiredModule, newRequiredModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredModule(ModuleReference newRequiredModule)
	{
		if (newRequiredModule != requiredModule)
		{
			NotificationChain msgs = null;
			if (requiredModule != null)
				msgs = ((InternalEObject)requiredModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, null, msgs);
			if (newRequiredModule != null)
				msgs = ((InternalEObject)newRequiredModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, null, msgs);
			msgs = basicSetRequiredModule(newRequiredModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE, newRequiredModule, newRequiredModule));
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
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER:
				return basicSetModifier(null, msgs);
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE:
				return basicSetRequiredModule(null, msgs);
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
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER:
				if (resolve) return getModifier();
				return basicGetModifier();
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE:
				if (resolve) return getRequiredModule();
				return basicGetRequiredModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER:
				setModifier((ModuleRequiresModifier)newValue);
				return;
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE:
				setRequiredModule((ModuleReference)newValue);
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
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER:
				setModifier((ModuleRequiresModifier)null);
				return;
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE:
				setRequiredModule((ModuleReference)null);
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
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__MODIFIER:
				return modifier != null;
			case ModulesPackage.REQUIRES_MODULE_DIRECTIVE__REQUIRED_MODULE:
				return requiredModule != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiresModuleDirectiveImpl
