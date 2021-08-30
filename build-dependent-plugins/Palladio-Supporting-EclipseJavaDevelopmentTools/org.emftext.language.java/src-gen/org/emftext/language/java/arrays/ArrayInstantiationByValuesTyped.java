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
package org.emftext.language.java.arrays;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instantiation By Values Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.arrays.ArraysPackage#getArrayInstantiationByValuesTyped()
 * @model
 * @generated
 */
public interface ArrayInstantiationByValuesTyped extends ArrayInstantiationByValues, TypedElement
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	long getArrayDimension();

} // ArrayInstantiationByValuesTyped
