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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimal Layout Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.commons.layout.MinimalLayoutInformation#getLength <em>Length</em>}</li>
 *   <li>{@link org.emftext.commons.layout.MinimalLayoutInformation#getRootLayout <em>Root Layout</em>}</li>
 * </ul>
 *
 * @see org.emftext.commons.layout.LayoutPackage#getMinimalLayoutInformation()
 * @model
 * @generated
 */
public interface MinimalLayoutInformation extends ReferenceLayoutInformation
{
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.emftext.commons.layout.LayoutPackage#getMinimalLayoutInformation_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.emftext.commons.layout.MinimalLayoutInformation#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Root Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Layout</em>' reference.
	 * @see #setRootLayout(LayoutInformation)
	 * @see org.emftext.commons.layout.LayoutPackage#getMinimalLayoutInformation_RootLayout()
	 * @model required="true"
	 * @generated
	 */
	LayoutInformation getRootLayout();

	/**
	 * Sets the value of the '{@link org.emftext.commons.layout.MinimalLayoutInformation#getRootLayout <em>Root Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Layout</em>' reference.
	 * @see #getRootLayout()
	 * @generated
	 */
	void setRootLayout(LayoutInformation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getSourceString();

} // MinimalLayoutInformation
