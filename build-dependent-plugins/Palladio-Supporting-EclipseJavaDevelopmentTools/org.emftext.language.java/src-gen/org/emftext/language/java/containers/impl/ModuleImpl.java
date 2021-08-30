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
package org.emftext.language.java.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.containers.ContainersPackage;

import org.emftext.language.java.modifiers.Open;

import org.emftext.language.java.modules.ModuleDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.impl.ModuleImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.impl.ModuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.impl.ModuleImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends JavaRootImpl implements org.emftext.language.java.containers.Module
{
	/**
	 * The cached value of the '{@link #getOpen() <em>Open</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected Open open;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDirective> target;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.emftext.language.java.containers.Package> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl()
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
		return ContainersPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Open getOpen()
	{
		if (open != null && open.eIsProxy())
		{
			InternalEObject oldOpen = (InternalEObject)open;
			open = (Open)eResolveProxy(oldOpen);
			if (open != oldOpen)
			{
				InternalEObject newOpen = (InternalEObject)open;
				NotificationChain msgs = oldOpen.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.MODULE__OPEN, null, null);
				if (newOpen.eInternalContainer() == null)
				{
					msgs = newOpen.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.MODULE__OPEN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainersPackage.MODULE__OPEN, oldOpen, open));
			}
		}
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open basicGetOpen()
	{
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpen(Open newOpen, NotificationChain msgs)
	{
		Open oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.MODULE__OPEN, oldOpen, newOpen);
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
	public void setOpen(Open newOpen)
	{
		if (newOpen != open)
		{
			NotificationChain msgs = null;
			if (open != null)
				msgs = ((InternalEObject)open).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.MODULE__OPEN, null, msgs);
			if (newOpen != null)
				msgs = ((InternalEObject)newOpen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.MODULE__OPEN, null, msgs);
			msgs = basicSetOpen(newOpen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.MODULE__OPEN, newOpen, newOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleDirective> getTarget()
	{
		if (target == null)
		{
			target = new EObjectContainmentEList.Resolving<ModuleDirective>(ModuleDirective.class, this, ContainersPackage.MODULE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.emftext.language.java.containers.Package> getPackages()
	{
		if (packages == null)
		{
			packages = new EObjectResolvingEList<org.emftext.language.java.containers.Package>(org.emftext.language.java.containers.Package.class, this, ContainersPackage.MODULE__PACKAGES);
		}
		return packages;
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
			case ContainersPackage.MODULE__OPEN:
				return basicSetOpen(null, msgs);
			case ContainersPackage.MODULE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case ContainersPackage.MODULE__OPEN:
				if (resolve) return getOpen();
				return basicGetOpen();
			case ContainersPackage.MODULE__TARGET:
				return getTarget();
			case ContainersPackage.MODULE__PACKAGES:
				return getPackages();
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
			case ContainersPackage.MODULE__OPEN:
				setOpen((Open)newValue);
				return;
			case ContainersPackage.MODULE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ModuleDirective>)newValue);
				return;
			case ContainersPackage.MODULE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.emftext.language.java.containers.Package>)newValue);
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
			case ContainersPackage.MODULE__OPEN:
				setOpen((Open)null);
				return;
			case ContainersPackage.MODULE__TARGET:
				getTarget().clear();
				return;
			case ContainersPackage.MODULE__PACKAGES:
				getPackages().clear();
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
			case ContainersPackage.MODULE__OPEN:
				return open != null;
			case ContainersPackage.MODULE__TARGET:
				return target != null && !target.isEmpty();
			case ContainersPackage.MODULE__PACKAGES:
				return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
