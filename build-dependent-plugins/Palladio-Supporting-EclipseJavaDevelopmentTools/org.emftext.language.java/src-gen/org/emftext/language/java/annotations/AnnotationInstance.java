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
package org.emftext.language.java.annotations;

import org.emftext.language.java.arrays.ArrayInitializationValue;

import org.emftext.language.java.classifiers.Classifier;

import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.modifiers.AnnotationInstanceOrModifier;

import org.emftext.language.java.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.annotations.AnnotationInstance#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.AnnotationInstance#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationInstance()
 * @model
 * @generated
 */
public interface AnnotationInstance extends AnnotationInstanceOrModifier, NamespaceAwareElement, Reference, AnnotationValue, ArrayInitializationValue
{
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Classifier)
	 * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationInstance_Annotation()
	 * @model required="true"
	 * @generated
	 */
	Classifier getAnnotation();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.annotations.AnnotationInstance#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Classifier value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(AnnotationParameter)
	 * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationInstance_Parameter()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	AnnotationParameter getParameter();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.annotations.AnnotationInstance#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AnnotationParameter value);

} // AnnotationInstance
