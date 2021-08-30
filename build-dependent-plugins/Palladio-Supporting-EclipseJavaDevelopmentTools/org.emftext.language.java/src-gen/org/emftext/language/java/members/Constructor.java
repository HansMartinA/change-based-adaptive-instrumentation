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
package org.emftext.language.java.members;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.generics.TypeParametrizable;

import org.emftext.language.java.instantiations.Instantiation;

import org.emftext.language.java.modifiers.AnnotableAndModifiable;

import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.statements.BlockContainer;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.members.MembersPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends Member, Parametrizable, TypeParametrizable, ExceptionThrower, AnnotableAndModifiable, BlockContainer, StatementListContainer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" callRequired="true" needsPerfectMatchRequired="true"
	 * @generated
	 */
	boolean isConstructorForCall(Instantiation call, boolean needsPerfectMatch);

} // Constructor
