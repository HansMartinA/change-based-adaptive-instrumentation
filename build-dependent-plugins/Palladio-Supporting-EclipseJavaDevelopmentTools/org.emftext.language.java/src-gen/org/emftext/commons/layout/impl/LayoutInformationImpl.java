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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.commons.layout.LayoutInformation;
import org.emftext.commons.layout.LayoutPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.commons.layout.impl.LayoutInformationImpl#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link org.emftext.commons.layout.impl.LayoutInformationImpl#getHiddenTokenText <em>Hidden Token Text</em>}</li>
 *   <li>{@link org.emftext.commons.layout.impl.LayoutInformationImpl#getVisibleTokenText <em>Visible Token Text</em>}</li>
 *   <li>{@link org.emftext.commons.layout.impl.LayoutInformationImpl#getSyntaxElementID <em>Syntax Element ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LayoutInformationImpl extends MinimalEObjectImpl implements LayoutInformation
{
	/**
	 * The default value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int START_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected int startOffset = START_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHiddenTokenText() <em>Hidden Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenTokenText()
	 * @generated
	 * @ordered
	 */
	protected static final String HIDDEN_TOKEN_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHiddenTokenText() <em>Hidden Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenTokenText()
	 * @generated
	 * @ordered
	 */
	protected String hiddenTokenText = HIDDEN_TOKEN_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleTokenText() <em>Visible Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTokenText()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_TOKEN_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleTokenText() <em>Visible Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTokenText()
	 * @generated
	 * @ordered
	 */
	protected String visibleTokenText = VISIBLE_TOKEN_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyntaxElementID() <em>Syntax Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntaxElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTAX_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyntaxElementID() <em>Syntax Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntaxElementID()
	 * @generated
	 * @ordered
	 */
	protected String syntaxElementID = SYNTAX_ELEMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutInformationImpl()
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
		return LayoutPackage.Literals.LAYOUT_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartOffset()
	{
		return startOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartOffset(int newStartOffset)
	{
		int oldStartOffset = startOffset;
		startOffset = newStartOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT_INFORMATION__START_OFFSET, oldStartOffset, startOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHiddenTokenText()
	{
		return hiddenTokenText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHiddenTokenText(String newHiddenTokenText)
	{
		String oldHiddenTokenText = hiddenTokenText;
		hiddenTokenText = newHiddenTokenText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT, oldHiddenTokenText, hiddenTokenText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisibleTokenText()
	{
		return visibleTokenText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleTokenText(String newVisibleTokenText)
	{
		String oldVisibleTokenText = visibleTokenText;
		visibleTokenText = newVisibleTokenText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT, oldVisibleTokenText, visibleTokenText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSyntaxElementID()
	{
		return syntaxElementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyntaxElementID(String newSyntaxElementID)
	{
		String oldSyntaxElementID = syntaxElementID;
		syntaxElementID = newSyntaxElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID, oldSyntaxElementID, syntaxElementID));
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
			case LayoutPackage.LAYOUT_INFORMATION__START_OFFSET:
				return getStartOffset();
			case LayoutPackage.LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT:
				return getHiddenTokenText();
			case LayoutPackage.LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT:
				return getVisibleTokenText();
			case LayoutPackage.LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID:
				return getSyntaxElementID();
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
			case LayoutPackage.LAYOUT_INFORMATION__START_OFFSET:
				setStartOffset((Integer)newValue);
				return;
			case LayoutPackage.LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT:
				setHiddenTokenText((String)newValue);
				return;
			case LayoutPackage.LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT:
				setVisibleTokenText((String)newValue);
				return;
			case LayoutPackage.LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID:
				setSyntaxElementID((String)newValue);
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
			case LayoutPackage.LAYOUT_INFORMATION__START_OFFSET:
				setStartOffset(START_OFFSET_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT:
				setHiddenTokenText(HIDDEN_TOKEN_TEXT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT:
				setVisibleTokenText(VISIBLE_TOKEN_TEXT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID:
				setSyntaxElementID(SYNTAX_ELEMENT_ID_EDEFAULT);
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
			case LayoutPackage.LAYOUT_INFORMATION__START_OFFSET:
				return startOffset != START_OFFSET_EDEFAULT;
			case LayoutPackage.LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT:
				return HIDDEN_TOKEN_TEXT_EDEFAULT == null ? hiddenTokenText != null : !HIDDEN_TOKEN_TEXT_EDEFAULT.equals(hiddenTokenText);
			case LayoutPackage.LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT:
				return VISIBLE_TOKEN_TEXT_EDEFAULT == null ? visibleTokenText != null : !VISIBLE_TOKEN_TEXT_EDEFAULT.equals(visibleTokenText);
			case LayoutPackage.LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID:
				return SYNTAX_ELEMENT_ID_EDEFAULT == null ? syntaxElementID != null : !SYNTAX_ELEMENT_ID_EDEFAULT.equals(syntaxElementID);
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
		result.append(" (startOffset: ");
		result.append(startOffset);
		result.append(", hiddenTokenText: ");
		result.append(hiddenTokenText);
		result.append(", visibleTokenText: ");
		result.append(visibleTokenText);
		result.append(", syntaxElementID: ");
		result.append(syntaxElementID);
		result.append(')');
		return result.toString();
	}

} //LayoutInformationImpl
