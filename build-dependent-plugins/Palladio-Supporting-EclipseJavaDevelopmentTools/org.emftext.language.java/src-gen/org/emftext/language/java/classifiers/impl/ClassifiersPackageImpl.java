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
package org.emftext.language.java.classifiers.impl;

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

import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Implementor;
import org.emftext.language.java.classifiers.Interface;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.commons.impl.CommonsPackageImpl;

import org.emftext.language.java.containers.ContainersPackage;

import org.emftext.language.java.containers.impl.ContainersPackageImpl;

import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.expressions.impl.ExpressionsPackageImpl;

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
public class ClassifiersPackageImpl extends EPackageImpl implements ClassifiersPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

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
	 * @see org.emftext.language.java.classifiers.ClassifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassifiersPackageImpl()
	{
		super(eNS_URI, ClassifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClassifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassifiersPackage init()
	{
		if (isInited) return (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredClassifiersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ClassifiersPackageImpl theClassifiersPackage = registeredClassifiersPackage instanceof ClassifiersPackageImpl ? (ClassifiersPackageImpl)registeredClassifiersPackage : new ClassifiersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(registeredPackage instanceof AnnotationsPackageImpl ? registeredPackage : AnnotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(registeredPackage instanceof ArraysPackageImpl ? registeredPackage : ArraysPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(registeredPackage instanceof ContainersPackageImpl ? registeredPackage : ContainersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(registeredPackage instanceof ExpressionsPackageImpl ? registeredPackage : ExpressionsPackage.eINSTANCE);
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
		theClassifiersPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
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
		theClassifiersPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
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
		theClassifiersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassifiersPackage.eNS_URI, theClassifiersPackage);
		return theClassifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifier()
	{
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcreteClassifier()
	{
		return concreteClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteClassifier_Package()
	{
		return (EReference)concreteClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementor()
	{
		return implementorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementor_Implements()
	{
		return (EReference)implementorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_()
	{
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Extends()
	{
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_DefaultExtends()
	{
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface()
	{
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Extends()
	{
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_DefaultExtends()
	{
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeration()
	{
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeration_Constants()
	{
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass()
	{
		return anonymousClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifiersFactory getClassifiersFactory()
	{
		return (ClassifiersFactory)getEFactoryInstance();
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
		classifierEClass = createEClass(CLASSIFIER);

		concreteClassifierEClass = createEClass(CONCRETE_CLASSIFIER);
		createEReference(concreteClassifierEClass, CONCRETE_CLASSIFIER__PACKAGE);

		implementorEClass = createEClass(IMPLEMENTOR);
		createEReference(implementorEClass, IMPLEMENTOR__IMPLEMENTS);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__EXTENDS);
		createEReference(classEClass, CLASS__DEFAULT_EXTENDS);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__EXTENDS);
		createEReference(interfaceEClass, INTERFACE__DEFAULT_EXTENDS);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__CONSTANTS);

		annotationEClass = createEClass(ANNOTATION);

		anonymousClassEClass = createEClass(ANONYMOUS_CLASS);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		GenericsPackage theGenericsPackage = (GenericsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		ModifiersPackage theModifiersPackage = (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
		ContainersPackage theContainersPackage = (ContainersPackage)EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierEClass.getESuperTypes().add(theTypesPackage.getType());
		classifierEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		concreteClassifierEClass.getESuperTypes().add(this.getClassifier());
		concreteClassifierEClass.getESuperTypes().add(theGenericsPackage.getTypeParametrizable());
		concreteClassifierEClass.getESuperTypes().add(theMembersPackage.getMemberContainer());
		concreteClassifierEClass.getESuperTypes().add(theMembersPackage.getMember());
		concreteClassifierEClass.getESuperTypes().add(theStatementsPackage.getStatement());
		concreteClassifierEClass.getESuperTypes().add(theModifiersPackage.getAnnotableAndModifiable());
		implementorEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		classEClass.getESuperTypes().add(this.getConcreteClassifier());
		classEClass.getESuperTypes().add(this.getImplementor());
		interfaceEClass.getESuperTypes().add(this.getConcreteClassifier());
		enumerationEClass.getESuperTypes().add(this.getConcreteClassifier());
		enumerationEClass.getESuperTypes().add(this.getImplementor());
		annotationEClass.getESuperTypes().add(this.getConcreteClassifier());
		anonymousClassEClass.getESuperTypes().add(theTypesPackage.getType());
		anonymousClassEClass.getESuperTypes().add(theMembersPackage.getMemberContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(classifierEClass, this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(classifierEClass, null, "addImport", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameOfClassToImport", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classifierEClass, null, "addPackageImport", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteClassifierEClass, ConcreteClassifier.class, "ConcreteClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteClassifier_Package(), theContainersPackage.getPackage(), null, "package", null, 0, 1, ConcreteClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(concreteClassifierEClass, this.getConcreteClassifier(), "getInnerClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(concreteClassifierEClass, this.getConcreteClassifier(), "getAllInnerClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(concreteClassifierEClass, theTypesPackage.getClassifierReference(), "getSuperTypeReferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concreteClassifierEClass, theMembersPackage.getMember(), "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(concreteClassifierEClass, ecorePackage.getEString(), "getQualifiedName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concreteClassifierEClass, ecorePackage.getEBoolean(), "isJavaLangObject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConcreteClassifier(), "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementorEClass, Implementor.class, "Implementor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementor_Implements(), theTypesPackage.getTypeReference(), null, "implements", null, 0, -1, Implementor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.emftext.language.java.classifiers.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Extends(), theTypesPackage.getTypeReference(), null, "extends", null, 0, 1, org.emftext.language.java.classifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_DefaultExtends(), theTypesPackage.getTypeReference(), null, "defaultExtends", null, 0, 1, org.emftext.language.java.classifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(classEClass, this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getClass_(), "getSuperClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, theTypesPackage.getPrimitiveType(), "unWrapPrimitiveType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Extends(), theTypesPackage.getTypeReference(), null, "extends", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_DefaultExtends(), theTypesPackage.getTypeReference(), null, "defaultExtends", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(interfaceEClass, this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(interfaceEClass, theMembersPackage.getMethod(), "getAbstractMethodOfFunctionalInterface", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Constants(), theMembersPackage.getEnumConstant(), null, "constants", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(enumerationEClass, this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enumerationEClass, theMembersPackage.getEnumConstant(), "getContainedConstant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(annotationEClass, this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(anonymousClassEClass, AnonymousClass.class, "AnonymousClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(anonymousClassEClass, this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(anonymousClassEClass, this.getConcreteClassifier(), "getSuperClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(anonymousClassEClass, theMembersPackage.getMember(), "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassifiersPackageImpl
