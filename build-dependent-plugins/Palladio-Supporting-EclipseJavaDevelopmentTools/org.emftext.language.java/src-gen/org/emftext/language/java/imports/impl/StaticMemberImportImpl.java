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
package org.emftext.language.java.imports.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftext.language.java.imports.ImportsPackage;
import org.emftext.language.java.imports.StaticMemberImport;

import org.emftext.language.java.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Member Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.imports.impl.StaticMemberImportImpl#getStaticMembers <em>Static Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticMemberImportImpl extends StaticImportImpl implements StaticMemberImport
{
	/**
	 * The cached value of the '{@link #getStaticMembers() <em>Static Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableElement> staticMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticMemberImportImpl()
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
		return ImportsPackage.Literals.STATIC_MEMBER_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceableElement> getStaticMembers()
	{
		if (staticMembers == null)
		{
			staticMembers = new EObjectResolvingEList<ReferenceableElement>(ReferenceableElement.class, this, ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS);
		}
		return staticMembers;
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
			case ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				return getStaticMembers();
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
			case ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				getStaticMembers().clear();
				getStaticMembers().addAll((Collection<? extends ReferenceableElement>)newValue);
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
			case ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				getStaticMembers().clear();
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
			case ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				return staticMembers != null && !staticMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StaticMemberImportImpl
