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
package org.emftext.language.java.generics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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

import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.expressions.impl.ExpressionsPackageImpl;

import org.emftext.language.java.generics.CallTypeArgumentable;
import org.emftext.language.java.generics.ExtendsTypeArgument;
import org.emftext.language.java.generics.GenericsFactory;
import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.QualifiedTypeArgument;
import org.emftext.language.java.generics.SuperTypeArgument;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeArgumentable;
import org.emftext.language.java.generics.TypeParameter;
import org.emftext.language.java.generics.TypeParametrizable;
import org.emftext.language.java.generics.UnknownTypeArgument;

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
public class GenericsPackageImpl extends EPackageImpl implements GenericsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeArgumentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callTypeArgumentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParametrizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownTypeArgumentEClass = null;

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
	 * @see org.emftext.language.java.generics.GenericsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericsPackageImpl()
	{
		super(eNS_URI, GenericsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericsPackage init()
	{
		if (isInited) return (GenericsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenericsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenericsPackageImpl theGenericsPackage = registeredGenericsPackage instanceof GenericsPackageImpl ? (GenericsPackageImpl)registeredGenericsPackage : new GenericsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(registeredPackage instanceof ExpressionsPackageImpl ? registeredPackage : ExpressionsPackage.eINSTANCE);
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
		theGenericsPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
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
		theGenericsPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
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
		theGenericsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericsPackage.eNS_URI, theGenericsPackage);
		return theGenericsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeArgument()
	{
		return typeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeArgumentable()
	{
		return typeArgumentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeArgumentable_TypeArguments()
	{
		return (EReference)typeArgumentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallTypeArgumentable()
	{
		return callTypeArgumentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallTypeArgumentable_CallTypeArguments()
	{
		return (EReference)callTypeArgumentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParametrizable()
	{
		return typeParametrizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParametrizable_TypeParameters()
	{
		return (EReference)typeParametrizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendsTypeArgument()
	{
		return extendsTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendsTypeArgument_ExtendType()
	{
		return (EReference)extendsTypeArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifiedTypeArgument()
	{
		return qualifiedTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperTypeArgument()
	{
		return superTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperTypeArgument_SuperType()
	{
		return (EReference)superTypeArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter()
	{
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter_ExtendTypes()
	{
		return (EReference)typeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownTypeArgument()
	{
		return unknownTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericsFactory getGenericsFactory()
	{
		return (GenericsFactory)getEFactoryInstance();
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
		typeArgumentEClass = createEClass(TYPE_ARGUMENT);

		typeArgumentableEClass = createEClass(TYPE_ARGUMENTABLE);
		createEReference(typeArgumentableEClass, TYPE_ARGUMENTABLE__TYPE_ARGUMENTS);

		callTypeArgumentableEClass = createEClass(CALL_TYPE_ARGUMENTABLE);
		createEReference(callTypeArgumentableEClass, CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS);

		typeParametrizableEClass = createEClass(TYPE_PARAMETRIZABLE);
		createEReference(typeParametrizableEClass, TYPE_PARAMETRIZABLE__TYPE_PARAMETERS);

		extendsTypeArgumentEClass = createEClass(EXTENDS_TYPE_ARGUMENT);
		createEReference(extendsTypeArgumentEClass, EXTENDS_TYPE_ARGUMENT__EXTEND_TYPE);

		qualifiedTypeArgumentEClass = createEClass(QUALIFIED_TYPE_ARGUMENT);

		superTypeArgumentEClass = createEClass(SUPER_TYPE_ARGUMENT);
		createEReference(superTypeArgumentEClass, SUPER_TYPE_ARGUMENT__SUPER_TYPE);

		typeParameterEClass = createEClass(TYPE_PARAMETER);
		createEReference(typeParameterEClass, TYPE_PARAMETER__EXTEND_TYPES);

		unknownTypeArgumentEClass = createEClass(UNKNOWN_TYPE_ARGUMENT);
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
		ArraysPackage theArraysPackage = (ArraysPackage)EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeArgumentEClass.getESuperTypes().add(theArraysPackage.getArrayTypeable());
		typeArgumentableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		callTypeArgumentableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		typeParametrizableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		extendsTypeArgumentEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotable());
		extendsTypeArgumentEClass.getESuperTypes().add(this.getTypeArgument());
		qualifiedTypeArgumentEClass.getESuperTypes().add(this.getTypeArgument());
		qualifiedTypeArgumentEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		superTypeArgumentEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotable());
		superTypeArgumentEClass.getESuperTypes().add(this.getTypeArgument());
		typeParameterEClass.getESuperTypes().add(theClassifiersPackage.getClassifier());
		typeParameterEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotable());
		unknownTypeArgumentEClass.getESuperTypes().add(this.getTypeArgument());
		unknownTypeArgumentEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotable());

		// Initialize classes and features; add operations and parameters
		initEClass(typeArgumentEClass, TypeArgument.class, "TypeArgument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeArgumentableEClass, TypeArgumentable.class, "TypeArgumentable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeArgumentable_TypeArguments(), this.getTypeArgument(), null, "typeArguments", null, 0, -1, TypeArgumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callTypeArgumentableEClass, CallTypeArgumentable.class, "CallTypeArgumentable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallTypeArgumentable_CallTypeArguments(), this.getTypeArgument(), null, "callTypeArguments", null, 0, -1, CallTypeArgumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParametrizableEClass, TypeParametrizable.class, "TypeParametrizable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParametrizable_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, TypeParametrizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsTypeArgumentEClass, ExtendsTypeArgument.class, "ExtendsTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendsTypeArgument_ExtendType(), theTypesPackage.getTypeReference(), null, "extendType", null, 1, 1, ExtendsTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(extendsTypeArgumentEClass, null, "getExtendTypes", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(theTypesPackage.getTypeReference());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(qualifiedTypeArgumentEClass, QualifiedTypeArgument.class, "QualifiedTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superTypeArgumentEClass, SuperTypeArgument.class, "SuperTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperTypeArgument_SuperType(), theTypesPackage.getTypeReference(), null, "superType", null, 1, 1, SuperTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameter_ExtendTypes(), theTypesPackage.getTypeReference(), null, "extendTypes", null, 0, -1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(typeParameterEClass, theClassifiersPackage.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeParameterEClass, theMembersPackage.getMember(), "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeParameterEClass, theTypesPackage.getType(), "getBoundType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getTypeReference(), "typeReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReferencesPackage.getReference(), "reference", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeParameterEClass, theTypesPackage.getTypeReference(), "getBoundTypeReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getTypeReference(), "typeReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReferencesPackage.getReference(), "reference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unknownTypeArgumentEClass, UnknownTypeArgument.class, "UnknownTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericsPackageImpl
