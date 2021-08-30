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
package org.emftext.commons.layout;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.commons.layout.LayoutInformation#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link org.emftext.commons.layout.LayoutInformation#getHiddenTokenText <em>Hidden Token Text</em>}</li>
 *   <li>{@link org.emftext.commons.layout.LayoutInformation#getVisibleTokenText <em>Visible Token Text</em>}</li>
 *   <li>{@link org.emftext.commons.layout.LayoutInformation#getSyntaxElementID <em>Syntax Element ID</em>}</li>
 * </ul>
 *
 * @see org.emftext.commons.layout.LayoutPackage#getLayoutInformation()
 * @model abstract="true"
 * @generated
 */
public interface LayoutInformation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Offset</em>' attribute.
	 * @see #setStartOffset(int)
	 * @see org.emftext.commons.layout.LayoutPackage#getLayoutInformation_StartOffset()
	 * @model required="true"
	 * @generated
	 */
	int getStartOffset();

	/**
	 * Sets the value of the '{@link org.emftext.commons.layout.LayoutInformation#getStartOffset <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Offset</em>' attribute.
	 * @see #getStartOffset()
	 * @generated
	 */
	void setStartOffset(int value);

	/**
	 * Returns the value of the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Token Text</em>' attribute.
	 * @see #setHiddenTokenText(String)
	 * @see org.emftext.commons.layout.LayoutPackage#getLayoutInformation_HiddenTokenText()
	 * @model
	 * @generated
	 */
	String getHiddenTokenText();

	/**
	 * Sets the value of the '{@link org.emftext.commons.layout.LayoutInformation#getHiddenTokenText <em>Hidden Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Token Text</em>' attribute.
	 * @see #getHiddenTokenText()
	 * @generated
	 */
	void setHiddenTokenText(String value);

	/**
	 * Returns the value of the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Token Text</em>' attribute.
	 * @see #setVisibleTokenText(String)
	 * @see org.emftext.commons.layout.LayoutPackage#getLayoutInformation_VisibleTokenText()
	 * @model
	 * @generated
	 */
	String getVisibleTokenText();

	/**
	 * Sets the value of the '{@link org.emftext.commons.layout.LayoutInformation#getVisibleTokenText <em>Visible Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Token Text</em>' attribute.
	 * @see #getVisibleTokenText()
	 * @generated
	 */
	void setVisibleTokenText(String value);

	/**
	 * Returns the value of the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax Element ID</em>' attribute.
	 * @see #setSyntaxElementID(String)
	 * @see org.emftext.commons.layout.LayoutPackage#getLayoutInformation_SyntaxElementID()
	 * @model
	 * @generated
	 */
	String getSyntaxElementID();

	/**
	 * Sets the value of the '{@link org.emftext.commons.layout.LayoutInformation#getSyntaxElementID <em>Syntax Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax Element ID</em>' attribute.
	 * @see #getSyntaxElementID()
	 * @generated
	 */
	void setSyntaxElementID(String value);

} // LayoutInformation
