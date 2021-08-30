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
package org.emftext.language.java.types;

import org.emftext.language.java.annotations.Annotable;

import org.emftext.language.java.classifiers.Classifier;

import org.emftext.language.java.generics.TypeArgumentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.types.ClassifierReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.types.TypesPackage#getClassifierReference()
 * @model
 * @generated
 */
public interface ClassifierReference extends TypeReference, TypeArgumentable, Annotable
{
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Classifier)
	 * @see org.emftext.language.java.types.TypesPackage#getClassifierReference_Target()
	 * @model required="true"
	 * @generated
	 */
	Classifier getTarget();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.types.ClassifierReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Classifier value);

} // ClassifierReference
