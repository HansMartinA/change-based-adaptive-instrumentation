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
package org.emftext.commons.layout.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.commons.layout.LayoutInformation;
import org.emftext.commons.layout.LayoutPackage;
import org.emftext.commons.layout.MinimalLayoutInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimal Layout Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.commons.layout.impl.MinimalLayoutInformationImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.emftext.commons.layout.impl.MinimalLayoutInformationImpl#getRootLayout <em>Root Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimalLayoutInformationImpl extends ReferenceLayoutInformationImpl implements MinimalLayoutInformation
{
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootLayout() <em>Root Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootLayout()
	 * @generated
	 * @ordered
	 */
	protected LayoutInformation rootLayout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimalLayoutInformationImpl()
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
		return LayoutPackage.Literals.MINIMAL_LAYOUT_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength()
	{
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength)
	{
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.MINIMAL_LAYOUT_INFORMATION__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayoutInformation getRootLayout()
	{
		if (rootLayout != null && rootLayout.eIsProxy())
		{
			InternalEObject oldRootLayout = (InternalEObject)rootLayout;
			rootLayout = (LayoutInformation)eResolveProxy(oldRootLayout);
			if (rootLayout != oldRootLayout)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT, oldRootLayout, rootLayout));
			}
		}
		return rootLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutInformation basicGetRootLayout()
	{
		return rootLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootLayout(LayoutInformation newRootLayout)
	{
		LayoutInformation oldRootLayout = rootLayout;
		rootLayout = newRootLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT, oldRootLayout, rootLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceString()
	{
		if (rootLayout != null) { String rootSource = rootLayout.getVisibleTokenText(); if (rootSource.length() >= getStartOffset() + getLength()) { return rootSource.substring(getStartOffset(), getStartOffset() + getLength()); } return ""; } else { return ""; }
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
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__LENGTH:
				return getLength();
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT:
				if (resolve) return getRootLayout();
				return basicGetRootLayout();
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
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__LENGTH:
				setLength((Integer)newValue);
				return;
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT:
				setRootLayout((LayoutInformation)newValue);
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
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT:
				setRootLayout((LayoutInformation)null);
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
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__LENGTH:
				return length != LENGTH_EDEFAULT;
			case LayoutPackage.MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT:
				return rootLayout != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //MinimalLayoutInformationImpl
