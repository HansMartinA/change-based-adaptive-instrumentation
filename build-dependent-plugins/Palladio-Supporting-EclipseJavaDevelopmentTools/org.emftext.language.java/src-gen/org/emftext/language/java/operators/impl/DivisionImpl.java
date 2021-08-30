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
package org.emftext.language.java.operators.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.operators.Division;
import org.emftext.language.java.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DivisionImpl extends MultiplicativeOperatorImpl implements Division
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionImpl()
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
		return OperatorsPackage.Literals.DIVISION;
	}

} //DivisionImpl
