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

import org.emftext.language.java.variables.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getResources <em>Resources</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock()
 * @model
 * @generated
 */
public interface TryBlock extends Statement, StatementListContainer, BlockContainer
{
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.variables.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock_Resources()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.statements.CatchBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Blocks</em>' containment reference list.
	 * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock_CatchBlocks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CatchBlock> getCatchBlocks();

	/**
	 * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally Block</em>' containment reference.
	 * @see #setFinallyBlock(Block)
	 * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock_FinallyBlock()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Block getFinallyBlock();

	/**
	 * Sets the value of the '{@link org.emftext.language.java.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally Block</em>' containment reference.
	 * @see #getFinallyBlock()
	 * @generated
	 */
	void setFinallyBlock(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<CatchBlock> getCatcheBlocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<Statement> getStatements();

} // TryBlock
