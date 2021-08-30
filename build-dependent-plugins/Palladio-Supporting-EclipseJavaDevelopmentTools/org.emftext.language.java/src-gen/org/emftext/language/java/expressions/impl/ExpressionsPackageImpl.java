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
package org.emftext.language.java.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.commons.layout.LayoutPackage;

import org.emftext.commons.layout.impl.LayoutPackageImpl;

import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.annotations.impl.AnnotationsPackageImpl;

import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.arrays.impl.ArraysPackageImpl;

import org.emftext.language.java.classifiers.ClassifiersPackage;

import org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.commons.impl.CommonsPackageImpl;

import org.emftext.language.java.containers.ContainersPackage;

import org.emftext.language.java.containers.impl.ContainersPackageImpl;

import org.emftext.language.java.expressions.AdditiveExpression;
import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.AndExpression;
import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.ArrayConstructorReferenceExpression;
import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.CastExpression;
import org.emftext.language.java.expressions.ClassTypeConstructorReferenceExpression;
import org.emftext.language.java.expressions.ConditionalAndExpression;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpression;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpression;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpression;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpression;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.ExplicitlyTypedLambdaParameters;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionList;
import org.emftext.language.java.expressions.ExpressionsFactory;
import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.ImplicitlyTypedLambdaParameters;
import org.emftext.language.java.expressions.InclusiveOrExpression;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpression;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;
import org.emftext.language.java.expressions.LambdaBody;
import org.emftext.language.java.expressions.LambdaExpression;
import org.emftext.language.java.expressions.LambdaParameters;
import org.emftext.language.java.expressions.MethodReferenceExpression;
import org.emftext.language.java.expressions.MethodReferenceExpressionChild;
import org.emftext.language.java.expressions.MultiplicativeExpression;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;
import org.emftext.language.java.expressions.NestedExpression;
import org.emftext.language.java.expressions.PrefixUnaryModificationExpression;
import org.emftext.language.java.expressions.PrimaryExpression;
import org.emftext.language.java.expressions.PrimaryExpressionReferenceExpression;
import org.emftext.language.java.expressions.RelationExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.ShiftExpression;
import org.emftext.language.java.expressions.ShiftExpressionChild;
import org.emftext.language.java.expressions.SingleImplicitLambdaParameter;
import org.emftext.language.java.expressions.SuffixUnaryModificationExpression;
import org.emftext.language.java.expressions.UnaryExpression;
import org.emftext.language.java.expressions.UnaryExpressionChild;
import org.emftext.language.java.expressions.UnaryModificationExpression;
import org.emftext.language.java.expressions.UnaryModificationExpressionChild;

import org.emftext.language.java.generics.GenericsPackage;

import org.emftext.language.java.generics.impl.GenericsPackageImpl;

import org.emftext.language.java.imports.ImportsPackage;

import org.emftext.language.java.imports.impl.ImportsPackageImpl;

import org.emftext.language.java.instantiations.InstantiationsPackage;

import org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl;

import org.emftext.language.java.literals.LiteralsPackage;

import org.emftext.language.java.literals.impl.LiteralsPackageImpl;

import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.members.impl.MembersPackageImpl;

import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.modifiers.impl.ModifiersPackageImpl;

import org.emftext.language.java.modules.ModulesPackage;

import org.emftext.language.java.modules.impl.ModulesPackageImpl;

import org.emftext.language.java.operators.OperatorsPackage;

import org.emftext.language.java.operators.impl.OperatorsPackageImpl;

import org.emftext.language.java.parameters.ParametersPackage;

import org.emftext.language.java.parameters.impl.ParametersPackageImpl;

import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.references.impl.ReferencesPackageImpl;

import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.statements.impl.StatementsPackageImpl;

import org.emftext.language.java.types.TypesPackage;

import org.emftext.language.java.types.impl.TypesPackageImpl;

import org.emftext.language.java.variables.VariablesPackage;

import org.emftext.language.java.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAndExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAndExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryModificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixUnaryModificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suffixUnaryModificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryModificationExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryExpressionReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeConstructorReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayConstructorReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodReferenceExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitlyTypedLambdaParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitlyTypedLambdaParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleImplicitLambdaParameterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emftext.language.java.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl()
	{
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init()
	{
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExpressionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = registeredExpressionsPackage instanceof ExpressionsPackageImpl ? (ExpressionsPackageImpl)registeredExpressionsPackage : new ExpressionsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(registeredPackage instanceof AnnotationsPackageImpl ? registeredPackage : AnnotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(registeredPackage instanceof ArraysPackageImpl ? registeredPackage : ArraysPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(registeredPackage instanceof ClassifiersPackageImpl ? registeredPackage : ClassifiersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(registeredPackage instanceof ContainersPackageImpl ? registeredPackage : ContainersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
		GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl)(registeredPackage instanceof GenericsPackageImpl ? registeredPackage : GenericsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI);
		ImportsPackageImpl theImportsPackage = (ImportsPackageImpl)(registeredPackage instanceof ImportsPackageImpl ? registeredPackage : ImportsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI);
		InstantiationsPackageImpl theInstantiationsPackage = (InstantiationsPackageImpl)(registeredPackage instanceof InstantiationsPackageImpl ? registeredPackage : InstantiationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(registeredPackage instanceof LiteralsPackageImpl ? registeredPackage : LiteralsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		MembersPackageImpl theMembersPackage = (MembersPackageImpl)(registeredPackage instanceof MembersPackageImpl ? registeredPackage : MembersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
		ModifiersPackageImpl theModifiersPackage = (ModifiersPackageImpl)(registeredPackage instanceof ModifiersPackageImpl ? registeredPackage : ModifiersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(registeredPackage instanceof OperatorsPackageImpl ? registeredPackage : OperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(registeredPackage instanceof ReferencesPackageImpl ? registeredPackage : ReferencesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(registeredPackage instanceof StatementsPackageImpl ? registeredPackage : StatementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(registeredPackage instanceof VariablesPackageImpl ? registeredPackage : VariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModulesPackage.eNS_URI);
		ModulesPackageImpl theModulesPackage = (ModulesPackageImpl)(registeredPackage instanceof ModulesPackageImpl ? registeredPackage : ModulesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(registeredPackage instanceof LayoutPackageImpl ? registeredPackage : LayoutPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theGenericsPackage.createPackageContents();
		theImportsPackage.createPackageContents();
		theInstantiationsPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theModifiersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theModulesPackage.createPackageContents();
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theGenericsPackage.initializePackageContents();
		theImportsPackage.initializePackageContents();
		theInstantiationsPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theModifiersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theModulesPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionList()
	{
		return expressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionList_Expressions()
	{
		return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression()
	{
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentExpression()
	{
		return assignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentExpression_Child()
	{
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentExpression_AssignmentOperator()
	{
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentExpression_Value()
	{
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentExpressionChild()
	{
		return assignmentExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalExpression()
	{
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_Child()
	{
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_ExpressionIf()
	{
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_GeneralExpressionElse()
	{
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalExpressionChild()
	{
		return conditionalExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalOrExpression()
	{
		return conditionalOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalOrExpression_Children()
	{
		return (EReference)conditionalOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalOrExpressionChild()
	{
		return conditionalOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalAndExpression()
	{
		return conditionalAndExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalAndExpression_Children()
	{
		return (EReference)conditionalAndExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalAndExpressionChild()
	{
		return conditionalAndExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInclusiveOrExpression()
	{
		return inclusiveOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInclusiveOrExpression_Children()
	{
		return (EReference)inclusiveOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInclusiveOrExpressionChild()
	{
		return inclusiveOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExclusiveOrExpression()
	{
		return exclusiveOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExclusiveOrExpression_Children()
	{
		return (EReference)exclusiveOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExclusiveOrExpressionChild()
	{
		return exclusiveOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndExpression()
	{
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndExpression_Children()
	{
		return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndExpressionChild()
	{
		return andExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEqualityExpression()
	{
		return equalityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEqualityExpression_EqualityOperators()
	{
		return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEqualityExpression_Children()
	{
		return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEqualityExpressionChild()
	{
		return equalityExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceOfExpression()
	{
		return instanceOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceOfExpression_Child()
	{
		return (EReference)instanceOfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceOfExpressionChild()
	{
		return instanceOfExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationExpression()
	{
		return relationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationExpression_Children()
	{
		return (EReference)relationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationExpression_RelationOperators()
	{
		return (EReference)relationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationExpressionChild()
	{
		return relationExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShiftExpression()
	{
		return shiftExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShiftExpression_Children()
	{
		return (EReference)shiftExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShiftExpression_ShiftOperators()
	{
		return (EReference)shiftExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShiftExpressionChild()
	{
		return shiftExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditiveExpression()
	{
		return additiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditiveExpression_Children()
	{
		return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditiveExpression_AdditiveOperators()
	{
		return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditiveExpressionChild()
	{
		return additiveExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicativeExpression()
	{
		return multiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicativeExpression_Children()
	{
		return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicativeExpression_MultiplicativeOperators()
	{
		return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicativeExpressionChild()
	{
		return multiplicativeExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpression()
	{
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Operators()
	{
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Child()
	{
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpressionChild()
	{
		return unaryExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryModificationExpression()
	{
		return unaryModificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryModificationExpression_Child()
	{
		return (EReference)unaryModificationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryModificationExpression_Operator()
	{
		return (EReference)unaryModificationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrefixUnaryModificationExpression()
	{
		return prefixUnaryModificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuffixUnaryModificationExpression()
	{
		return suffixUnaryModificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryModificationExpressionChild()
	{
		return unaryModificationExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCastExpression()
	{
		return castExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCastExpression_AdditionalBounds()
	{
		return (EReference)castExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCastExpression_GeneralChild()
	{
		return (EReference)castExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaryExpression()
	{
		return primaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedExpression()
	{
		return nestedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedExpression_Expression()
	{
		return (EReference)nestedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodReferenceExpression()
	{
		return methodReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaryExpressionReferenceExpression()
	{
		return primaryExpressionReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimaryExpressionReferenceExpression_Child()
	{
		return (EReference)primaryExpressionReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimaryExpressionReferenceExpression_MethodReference()
	{
		return (EReference)primaryExpressionReferenceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassTypeConstructorReferenceExpression()
	{
		return classTypeConstructorReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayConstructorReferenceExpression()
	{
		return arrayConstructorReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodReferenceExpressionChild()
	{
		return methodReferenceExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaExpression()
	{
		return lambdaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLambdaExpression_Parameters()
	{
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLambdaExpression_Body()
	{
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaBody()
	{
		return lambdaBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaParameters()
	{
		return lambdaParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExplicitlyTypedLambdaParameters()
	{
		return explicitlyTypedLambdaParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplicitlyTypedLambdaParameters()
	{
		return implicitlyTypedLambdaParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleImplicitLambdaParameter()
	{
		return singleImplicitLambdaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionsFactory getExpressionsFactory()
	{
		return (ExpressionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		expressionListEClass = createEClass(EXPRESSION_LIST);
		createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);

		expressionEClass = createEClass(EXPRESSION);

		assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__CHILD);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__VALUE);

		assignmentExpressionChildEClass = createEClass(ASSIGNMENT_EXPRESSION_CHILD);

		conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__CHILD);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION_IF);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__GENERAL_EXPRESSION_ELSE);

		conditionalExpressionChildEClass = createEClass(CONDITIONAL_EXPRESSION_CHILD);

		conditionalOrExpressionEClass = createEClass(CONDITIONAL_OR_EXPRESSION);
		createEReference(conditionalOrExpressionEClass, CONDITIONAL_OR_EXPRESSION__CHILDREN);

		conditionalOrExpressionChildEClass = createEClass(CONDITIONAL_OR_EXPRESSION_CHILD);

		conditionalAndExpressionEClass = createEClass(CONDITIONAL_AND_EXPRESSION);
		createEReference(conditionalAndExpressionEClass, CONDITIONAL_AND_EXPRESSION__CHILDREN);

		conditionalAndExpressionChildEClass = createEClass(CONDITIONAL_AND_EXPRESSION_CHILD);

		inclusiveOrExpressionEClass = createEClass(INCLUSIVE_OR_EXPRESSION);
		createEReference(inclusiveOrExpressionEClass, INCLUSIVE_OR_EXPRESSION__CHILDREN);

		inclusiveOrExpressionChildEClass = createEClass(INCLUSIVE_OR_EXPRESSION_CHILD);

		exclusiveOrExpressionEClass = createEClass(EXCLUSIVE_OR_EXPRESSION);
		createEReference(exclusiveOrExpressionEClass, EXCLUSIVE_OR_EXPRESSION__CHILDREN);

		exclusiveOrExpressionChildEClass = createEClass(EXCLUSIVE_OR_EXPRESSION_CHILD);

		andExpressionEClass = createEClass(AND_EXPRESSION);
		createEReference(andExpressionEClass, AND_EXPRESSION__CHILDREN);

		andExpressionChildEClass = createEClass(AND_EXPRESSION_CHILD);

		equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);
		createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__EQUALITY_OPERATORS);
		createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__CHILDREN);

		equalityExpressionChildEClass = createEClass(EQUALITY_EXPRESSION_CHILD);

		instanceOfExpressionEClass = createEClass(INSTANCE_OF_EXPRESSION);
		createEReference(instanceOfExpressionEClass, INSTANCE_OF_EXPRESSION__CHILD);

		instanceOfExpressionChildEClass = createEClass(INSTANCE_OF_EXPRESSION_CHILD);

		relationExpressionEClass = createEClass(RELATION_EXPRESSION);
		createEReference(relationExpressionEClass, RELATION_EXPRESSION__CHILDREN);
		createEReference(relationExpressionEClass, RELATION_EXPRESSION__RELATION_OPERATORS);

		relationExpressionChildEClass = createEClass(RELATION_EXPRESSION_CHILD);

		shiftExpressionEClass = createEClass(SHIFT_EXPRESSION);
		createEReference(shiftExpressionEClass, SHIFT_EXPRESSION__CHILDREN);
		createEReference(shiftExpressionEClass, SHIFT_EXPRESSION__SHIFT_OPERATORS);

		shiftExpressionChildEClass = createEClass(SHIFT_EXPRESSION_CHILD);

		additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
		createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__CHILDREN);
		createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS);

		additiveExpressionChildEClass = createEClass(ADDITIVE_EXPRESSION_CHILD);

		multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
		createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__CHILDREN);
		createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS);

		multiplicativeExpressionChildEClass = createEClass(MULTIPLICATIVE_EXPRESSION_CHILD);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERATORS);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__CHILD);

		unaryExpressionChildEClass = createEClass(UNARY_EXPRESSION_CHILD);

		unaryModificationExpressionEClass = createEClass(UNARY_MODIFICATION_EXPRESSION);
		createEReference(unaryModificationExpressionEClass, UNARY_MODIFICATION_EXPRESSION__CHILD);
		createEReference(unaryModificationExpressionEClass, UNARY_MODIFICATION_EXPRESSION__OPERATOR);

		prefixUnaryModificationExpressionEClass = createEClass(PREFIX_UNARY_MODIFICATION_EXPRESSION);

		suffixUnaryModificationExpressionEClass = createEClass(SUFFIX_UNARY_MODIFICATION_EXPRESSION);

		unaryModificationExpressionChildEClass = createEClass(UNARY_MODIFICATION_EXPRESSION_CHILD);

		castExpressionEClass = createEClass(CAST_EXPRESSION);
		createEReference(castExpressionEClass, CAST_EXPRESSION__ADDITIONAL_BOUNDS);
		createEReference(castExpressionEClass, CAST_EXPRESSION__GENERAL_CHILD);

		primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);

		nestedExpressionEClass = createEClass(NESTED_EXPRESSION);
		createEReference(nestedExpressionEClass, NESTED_EXPRESSION__EXPRESSION);

		methodReferenceExpressionEClass = createEClass(METHOD_REFERENCE_EXPRESSION);

		primaryExpressionReferenceExpressionEClass = createEClass(PRIMARY_EXPRESSION_REFERENCE_EXPRESSION);
		createEReference(primaryExpressionReferenceExpressionEClass, PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__CHILD);
		createEReference(primaryExpressionReferenceExpressionEClass, PRIMARY_EXPRESSION_REFERENCE_EXPRESSION__METHOD_REFERENCE);

		classTypeConstructorReferenceExpressionEClass = createEClass(CLASS_TYPE_CONSTRUCTOR_REFERENCE_EXPRESSION);

		arrayConstructorReferenceExpressionEClass = createEClass(ARRAY_CONSTRUCTOR_REFERENCE_EXPRESSION);

		methodReferenceExpressionChildEClass = createEClass(METHOD_REFERENCE_EXPRESSION_CHILD);

		lambdaExpressionEClass = createEClass(LAMBDA_EXPRESSION);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__PARAMETERS);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__BODY);

		lambdaBodyEClass = createEClass(LAMBDA_BODY);

		lambdaParametersEClass = createEClass(LAMBDA_PARAMETERS);

		explicitlyTypedLambdaParametersEClass = createEClass(EXPLICITLY_TYPED_LAMBDA_PARAMETERS);

		implicitlyTypedLambdaParametersEClass = createEClass(IMPLICITLY_TYPED_LAMBDA_PARAMETERS);

		singleImplicitLambdaParameterEClass = createEClass(SINGLE_IMPLICIT_LAMBDA_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		ArraysPackage theArraysPackage = (ArraysPackage)EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		GenericsPackage theGenericsPackage = (GenericsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionListEClass.getESuperTypes().add(theStatementsPackage.getForLoopInitializer());
		expressionEClass.getESuperTypes().add(theArraysPackage.getArrayInitializationValue());
		expressionEClass.getESuperTypes().add(this.getLambdaBody());
		assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
		assignmentExpressionChildEClass.getESuperTypes().add(this.getExpression());
		assignmentExpressionChildEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotationValue());
		conditionalExpressionEClass.getESuperTypes().add(this.getAssignmentExpressionChild());
		conditionalExpressionChildEClass.getESuperTypes().add(this.getAssignmentExpressionChild());
		conditionalOrExpressionEClass.getESuperTypes().add(this.getConditionalExpressionChild());
		conditionalOrExpressionChildEClass.getESuperTypes().add(this.getConditionalExpressionChild());
		conditionalAndExpressionEClass.getESuperTypes().add(this.getConditionalOrExpressionChild());
		conditionalAndExpressionChildEClass.getESuperTypes().add(this.getConditionalOrExpressionChild());
		inclusiveOrExpressionEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
		inclusiveOrExpressionChildEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
		exclusiveOrExpressionEClass.getESuperTypes().add(this.getInclusiveOrExpressionChild());
		exclusiveOrExpressionChildEClass.getESuperTypes().add(this.getInclusiveOrExpressionChild());
		andExpressionEClass.getESuperTypes().add(this.getExclusiveOrExpressionChild());
		andExpressionChildEClass.getESuperTypes().add(this.getExclusiveOrExpressionChild());
		equalityExpressionEClass.getESuperTypes().add(this.getAndExpressionChild());
		equalityExpressionChildEClass.getESuperTypes().add(this.getAndExpressionChild());
		instanceOfExpressionEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		instanceOfExpressionEClass.getESuperTypes().add(this.getEqualityExpressionChild());
		instanceOfExpressionChildEClass.getESuperTypes().add(this.getEqualityExpressionChild());
		relationExpressionEClass.getESuperTypes().add(this.getInstanceOfExpressionChild());
		relationExpressionChildEClass.getESuperTypes().add(this.getInstanceOfExpressionChild());
		shiftExpressionEClass.getESuperTypes().add(this.getRelationExpressionChild());
		shiftExpressionChildEClass.getESuperTypes().add(this.getRelationExpressionChild());
		additiveExpressionEClass.getESuperTypes().add(this.getShiftExpressionChild());
		additiveExpressionChildEClass.getESuperTypes().add(this.getShiftExpressionChild());
		multiplicativeExpressionEClass.getESuperTypes().add(this.getAdditiveExpressionChild());
		multiplicativeExpressionChildEClass.getESuperTypes().add(this.getAdditiveExpressionChild());
		unaryExpressionEClass.getESuperTypes().add(this.getMultiplicativeExpressionChild());
		unaryExpressionChildEClass.getESuperTypes().add(this.getMultiplicativeExpressionChild());
		unaryModificationExpressionEClass.getESuperTypes().add(this.getUnaryExpressionChild());
		prefixUnaryModificationExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpression());
		suffixUnaryModificationExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpression());
		unaryModificationExpressionChildEClass.getESuperTypes().add(this.getUnaryExpressionChild());
		castExpressionEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		castExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpressionChild());
		primaryExpressionEClass.getESuperTypes().add(this.getMethodReferenceExpressionChild());
		nestedExpressionEClass.getESuperTypes().add(theReferencesPackage.getReference());
		methodReferenceExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpressionChild());
		primaryExpressionReferenceExpressionEClass.getESuperTypes().add(this.getMethodReferenceExpression());
		primaryExpressionReferenceExpressionEClass.getESuperTypes().add(theGenericsPackage.getCallTypeArgumentable());
		classTypeConstructorReferenceExpressionEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		classTypeConstructorReferenceExpressionEClass.getESuperTypes().add(theGenericsPackage.getCallTypeArgumentable());
		classTypeConstructorReferenceExpressionEClass.getESuperTypes().add(this.getMethodReferenceExpression());
		arrayConstructorReferenceExpressionEClass.getESuperTypes().add(this.getMethodReferenceExpression());
		arrayConstructorReferenceExpressionEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		methodReferenceExpressionChildEClass.getESuperTypes().add(this.getUnaryModificationExpressionChild());
		lambdaExpressionEClass.getESuperTypes().add(this.getExpression());
		lambdaBodyEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		lambdaParametersEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		lambdaParametersEClass.getESuperTypes().add(theParametersPackage.getParametrizable());
		explicitlyTypedLambdaParametersEClass.getESuperTypes().add(this.getLambdaParameters());
		implicitlyTypedLambdaParametersEClass.getESuperTypes().add(this.getLambdaParameters());
		singleImplicitLambdaParameterEClass.getESuperTypes().add(this.getImplicitlyTypedLambdaParameters());

		// Initialize classes and features; add operations and parameters
		initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(expressionEClass, theTypesPackage.getType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(expressionEClass, theTypesPackage.getType(), "getAlternativeType", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(expressionEClass, theTypesPackage.getType(), "getOneType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "alternative", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(expressionEClass, ecorePackage.getELong(), "getArrayDimension", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionEClass, theTypesPackage.getTypeReference(), "getOneTypeReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "alternative", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentExpression_Child(), this.getAssignmentExpressionChild(), null, "child", null, 1, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentExpression_AssignmentOperator(), theOperatorsPackage.getAssignmentOperator(), null, "assignmentOperator", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentExpression_Value(), this.getExpression(), null, "value", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentExpressionChildEClass, AssignmentExpressionChild.class, "AssignmentExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExpression_Child(), this.getConditionalExpressionChild(), null, "child", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_ExpressionIf(), this.getExpression(), null, "expressionIf", null, 0, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_GeneralExpressionElse(), this.getExpression(), null, "generalExpressionElse", null, 0, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(conditionalExpressionEClass, this.getAssignmentExpressionChild(), "getExpressionElse", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conditionalExpressionEClass, null, "setExpressionChild", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignmentExpressionChild(), "newChild", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionalExpressionChildEClass, ConditionalExpressionChild.class, "ConditionalExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalOrExpressionEClass, ConditionalOrExpression.class, "ConditionalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalOrExpression_Children(), this.getConditionalOrExpressionChild(), null, "children", null, 1, -1, ConditionalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalOrExpressionChildEClass, ConditionalOrExpressionChild.class, "ConditionalOrExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalAndExpressionEClass, ConditionalAndExpression.class, "ConditionalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalAndExpression_Children(), this.getConditionalAndExpressionChild(), null, "children", null, 1, -1, ConditionalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalAndExpressionChildEClass, ConditionalAndExpressionChild.class, "ConditionalAndExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inclusiveOrExpressionEClass, InclusiveOrExpression.class, "InclusiveOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclusiveOrExpression_Children(), this.getInclusiveOrExpressionChild(), null, "children", null, 1, -1, InclusiveOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inclusiveOrExpressionChildEClass, InclusiveOrExpressionChild.class, "InclusiveOrExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveOrExpressionEClass, ExclusiveOrExpression.class, "ExclusiveOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusiveOrExpression_Children(), this.getExclusiveOrExpressionChild(), null, "children", null, 1, -1, ExclusiveOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveOrExpressionChildEClass, ExclusiveOrExpressionChild.class, "ExclusiveOrExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExpression_Children(), this.getAndExpressionChild(), null, "children", null, 1, -1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExpressionChildEClass, AndExpressionChild.class, "AndExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEqualityExpression_EqualityOperators(), theOperatorsPackage.getEqualityOperator(), null, "equalityOperators", null, 0, -1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqualityExpression_Children(), this.getEqualityExpressionChild(), null, "children", null, 1, -1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalityExpressionChildEClass, EqualityExpressionChild.class, "EqualityExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceOfExpressionEClass, InstanceOfExpression.class, "InstanceOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceOfExpression_Child(), this.getInstanceOfExpressionChild(), null, "child", null, 1, 1, InstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceOfExpressionChildEClass, InstanceOfExpressionChild.class, "InstanceOfExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationExpressionEClass, RelationExpression.class, "RelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationExpression_Children(), this.getRelationExpressionChild(), null, "children", null, 1, -1, RelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationExpression_RelationOperators(), theOperatorsPackage.getRelationOperator(), null, "relationOperators", null, 0, -1, RelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationExpressionChildEClass, RelationExpressionChild.class, "RelationExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shiftExpressionEClass, ShiftExpression.class, "ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShiftExpression_Children(), this.getShiftExpressionChild(), null, "children", null, 1, -1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShiftExpression_ShiftOperators(), theOperatorsPackage.getShiftOperator(), null, "shiftOperators", null, 0, -1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftExpressionChildEClass, ShiftExpressionChild.class, "ShiftExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditiveExpression_Children(), this.getAdditiveExpressionChild(), null, "children", null, 1, -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditiveExpression_AdditiveOperators(), theOperatorsPackage.getAdditiveOperator(), null, "additiveOperators", null, 0, -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additiveExpressionChildEClass, AdditiveExpressionChild.class, "AdditiveExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicativeExpression_Children(), this.getMultiplicativeExpressionChild(), null, "children", null, 1, -1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicativeExpression_MultiplicativeOperators(), theOperatorsPackage.getMultiplicativeOperator(), null, "multiplicativeOperators", null, 0, -1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicativeExpressionChildEClass, MultiplicativeExpressionChild.class, "MultiplicativeExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Operators(), theOperatorsPackage.getUnaryOperator(), null, "operators", null, 0, -1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Child(), this.getUnaryExpressionChild(), null, "child", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionChildEClass, UnaryExpressionChild.class, "UnaryExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryModificationExpressionEClass, UnaryModificationExpression.class, "UnaryModificationExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryModificationExpression_Child(), this.getUnaryModificationExpressionChild(), null, "child", null, 1, 1, UnaryModificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryModificationExpression_Operator(), theOperatorsPackage.getUnaryModificationOperator(), null, "operator", null, 0, 1, UnaryModificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefixUnaryModificationExpressionEClass, PrefixUnaryModificationExpression.class, "PrefixUnaryModificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suffixUnaryModificationExpressionEClass, SuffixUnaryModificationExpression.class, "SuffixUnaryModificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryModificationExpressionChildEClass, UnaryModificationExpressionChild.class, "UnaryModificationExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCastExpression_AdditionalBounds(), theTypesPackage.getTypeReference(), null, "additionalBounds", null, 0, -1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCastExpression_GeneralChild(), this.getExpression(), null, "generalChild", null, 1, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(castExpressionEClass, this.getMultiplicativeExpressionChild(), "getChild", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(castExpressionEClass, null, "setChild", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMultiplicativeExpressionChild(), "newChild", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nestedExpressionEClass, NestedExpression.class, "NestedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, NestedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodReferenceExpressionEClass, MethodReferenceExpression.class, "MethodReferenceExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(methodReferenceExpressionEClass, theTypesPackage.getType(), "getTargetType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(methodReferenceExpressionEClass, theTypesPackage.getTypeReference(), "getTargetTypeReference", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(primaryExpressionReferenceExpressionEClass, PrimaryExpressionReferenceExpression.class, "PrimaryExpressionReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryExpressionReferenceExpression_Child(), this.getMethodReferenceExpressionChild(), null, "child", null, 1, 1, PrimaryExpressionReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryExpressionReferenceExpression_MethodReference(), theReferencesPackage.getReference(), null, "methodReference", null, 0, 1, PrimaryExpressionReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classTypeConstructorReferenceExpressionEClass, ClassTypeConstructorReferenceExpression.class, "ClassTypeConstructorReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayConstructorReferenceExpressionEClass, ArrayConstructorReferenceExpression.class, "ArrayConstructorReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodReferenceExpressionChildEClass, MethodReferenceExpressionChild.class, "MethodReferenceExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lambdaExpressionEClass, LambdaExpression.class, "LambdaExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaExpression_Parameters(), this.getLambdaParameters(), null, "parameters", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_Body(), this.getLambdaBody(), null, "body", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(lambdaExpressionEClass, ecorePackage.getEBoolean(), "doesLambdaMatchFunctionalInterface", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theClassifiersPackage.getInterface(), "functionalInterface", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lambdaExpressionEClass, theTypesPackage.getType(), "getReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getType(), "potentialReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lambdaBodyEClass, LambdaBody.class, "LambdaBody", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lambdaParametersEClass, LambdaParameters.class, "LambdaParameters", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(explicitlyTypedLambdaParametersEClass, ExplicitlyTypedLambdaParameters.class, "ExplicitlyTypedLambdaParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implicitlyTypedLambdaParametersEClass, ImplicitlyTypedLambdaParameters.class, "ImplicitlyTypedLambdaParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleImplicitLambdaParameterEClass, SingleImplicitLambdaParameter.class, "SingleImplicitLambdaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpressionsPackageImpl
