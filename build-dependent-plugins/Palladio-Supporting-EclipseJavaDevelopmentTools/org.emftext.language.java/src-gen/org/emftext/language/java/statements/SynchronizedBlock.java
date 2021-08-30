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
package org.emftext.language.java.statements;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getSynchronizedBlock()
 * @model
 * @generated
 */
public interface SynchronizedBlock extends Statement, StatementListContainer, BlockContainer
{
	/**
	 * Returns the value of the '<em><b>Lock Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Provider</em>' containment reference.
	 * @see #setLockProvider(Expression)
	 * @see org.emftext.language.java.statements.StatementsPackage#getSynchronizedBlock_LockProvider()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Expression getLockProvider();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.statements.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Provider</em>' containment reference.
	 * @see #getLockProvider()
	 * @generated
	 */
	void setLockProvider(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<Statement> getStatements();

} // SynchronizedBlock
