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
package org.emftext.language.java.modifiers.impl;

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

import org.emftext.language.java.modifiers.Abstract;
import org.emftext.language.java.modifiers.AnnotableAndModifiable;
import org.emftext.language.java.modifiers.AnnotationInstanceOrModifier;
import org.emftext.language.java.modifiers.Default;
import org.emftext.language.java.modifiers.Final;
import org.emftext.language.java.modifiers.Modifiable;
import org.emftext.language.java.modifiers.Modifier;
import org.emftext.language.java.modifiers.ModifiersFactory;
import org.emftext.language.java.modifiers.ModifiersPackage;
import org.emftext.language.java.modifiers.ModuleRequiresModifier;
import org.emftext.language.java.modifiers.Native;
import org.emftext.language.java.modifiers.Open;
import org.emftext.language.java.modifiers.Private;
import org.emftext.language.java.modifiers.Protected;
import org.emftext.language.java.modifiers.Public;
import org.emftext.language.java.modifiers.Static;
import org.emftext.language.java.modifiers.Strictfp;
import org.emftext.language.java.modifiers.Synchronized;
import org.emftext.language.java.modifiers.Transient;
import org.emftext.language.java.modifiers.Transitive;
import org.emftext.language.java.modifiers.Volatile;

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
public class ModifiersPackageImpl extends EPackageImpl implements ModifiersPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationInstanceOrModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotableAndModifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictfpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volatileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRequiresModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openEClass = null;

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
	 * @see org.emftext.language.java.modifiers.ModifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModifiersPackageImpl()
	{
		super(eNS_URI, ModifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModifiersPackage init()
	{
		if (isInited) return (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModifiersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModifiersPackageImpl theModifiersPackage = registeredModifiersPackage instanceof ModifiersPackageImpl ? (ModifiersPackageImpl)registeredModifiersPackage : new ModifiersPackageImpl();

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
		theModifiersPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theGenericsPackage.createPackageContents();
		theImportsPackage.createPackageContents();
		theInstantiationsPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theModulesPackage.createPackageContents();
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theModifiersPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theGenericsPackage.initializePackageContents();
		theImportsPackage.initializePackageContents();
		theInstantiationsPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theModulesPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModifiersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModifiersPackage.eNS_URI, theModifiersPackage);
		return theModifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier()
	{
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationInstanceOrModifier()
	{
		return annotationInstanceOrModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotableAndModifiable()
	{
		return annotableAndModifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotableAndModifiable_AnnotationsAndModifiers()
	{
		return (EReference)annotableAndModifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifiable()
	{
		return modifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifiable_Modifiers()
	{
		return (EReference)modifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstract()
	{
		return abstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinal()
	{
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNative()
	{
		return nativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProtected()
	{
		return protectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublic()
	{
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivate()
	{
		return privateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatic()
	{
		return staticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrictfp()
	{
		return strictfpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronized()
	{
		return synchronizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransient()
	{
		return transientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolatile()
	{
		return volatileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefault()
	{
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitive()
	{
		return transitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleRequiresModifier()
	{
		return moduleRequiresModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpen()
	{
		return openEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifiersFactory getModifiersFactory()
	{
		return (ModifiersFactory)getEFactoryInstance();
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
		modifierEClass = createEClass(MODIFIER);

		annotationInstanceOrModifierEClass = createEClass(ANNOTATION_INSTANCE_OR_MODIFIER);

		annotableAndModifiableEClass = createEClass(ANNOTABLE_AND_MODIFIABLE);
		createEReference(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS);

		modifiableEClass = createEClass(MODIFIABLE);
		createEReference(modifiableEClass, MODIFIABLE__MODIFIERS);

		abstractEClass = createEClass(ABSTRACT);

		finalEClass = createEClass(FINAL);

		nativeEClass = createEClass(NATIVE);

		protectedEClass = createEClass(PROTECTED);

		publicEClass = createEClass(PUBLIC);

		privateEClass = createEClass(PRIVATE);

		staticEClass = createEClass(STATIC);

		strictfpEClass = createEClass(STRICTFP);

		synchronizedEClass = createEClass(SYNCHRONIZED);

		transientEClass = createEClass(TRANSIENT);

		volatileEClass = createEClass(VOLATILE);

		defaultEClass = createEClass(DEFAULT);

		transitiveEClass = createEClass(TRANSITIVE);

		moduleRequiresModifierEClass = createEClass(MODULE_REQUIRES_MODIFIER);

		openEClass = createEClass(OPEN);
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
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modifierEClass.getESuperTypes().add(this.getAnnotationInstanceOrModifier());
		annotationInstanceOrModifierEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		annotableAndModifiableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		modifiableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		abstractEClass.getESuperTypes().add(this.getModifier());
		finalEClass.getESuperTypes().add(this.getModifier());
		nativeEClass.getESuperTypes().add(this.getModifier());
		protectedEClass.getESuperTypes().add(this.getModifier());
		publicEClass.getESuperTypes().add(this.getModifier());
		privateEClass.getESuperTypes().add(this.getModifier());
		staticEClass.getESuperTypes().add(this.getModifier());
		staticEClass.getESuperTypes().add(this.getModuleRequiresModifier());
		strictfpEClass.getESuperTypes().add(this.getModifier());
		synchronizedEClass.getESuperTypes().add(this.getModifier());
		transientEClass.getESuperTypes().add(this.getModifier());
		volatileEClass.getESuperTypes().add(this.getModifier());
		defaultEClass.getESuperTypes().add(this.getModifier());
		transitiveEClass.getESuperTypes().add(this.getModuleRequiresModifier());
		moduleRequiresModifierEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		openEClass.getESuperTypes().add(theCommonsPackage.getCommentable());

		// Initialize classes and features; add operations and parameters
		initEClass(modifierEClass, Modifier.class, "Modifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationInstanceOrModifierEClass, AnnotationInstanceOrModifier.class, "AnnotationInstanceOrModifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotableAndModifiableEClass, AnnotableAndModifiable.class, "AnnotableAndModifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotableAndModifiable_AnnotationsAndModifiers(), this.getAnnotationInstanceOrModifier(), null, "annotationsAndModifiers", null, 0, -1, AnnotableAndModifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(annotableAndModifiableEClass, ecorePackage.getEBoolean(), "isHidden", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, ecorePackage.getEBoolean(), "isStatic", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(annotableAndModifiableEClass, null, "removeModifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "modifierType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, null, "makePublic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, null, "makePrivate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, null, "makeProtected", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, this.getModifier(), "getModifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, null, "removeAllModifiers", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(annotableAndModifiableEClass, ecorePackage.getEBoolean(), "hasModifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, ecorePackage.getEBoolean(), "isPublic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, ecorePackage.getEBoolean(), "isPrivate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, ecorePackage.getEBoolean(), "isProtected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(annotableAndModifiableEClass, null, "addModifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModifier(), "newModifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(annotableAndModifiableEClass, theAnnotationsPackage.getAnnotationInstance(), "getAnnotationInstances", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(modifiableEClass, Modifiable.class, "Modifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiable_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, Modifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nativeEClass, Native.class, "Native", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protectedEClass, Protected.class, "Protected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicEClass, Public.class, "Public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privateEClass, Private.class, "Private", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticEClass, Static.class, "Static", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strictfpEClass, Strictfp.class, "Strictfp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizedEClass, Synchronized.class, "Synchronized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transientEClass, Transient.class, "Transient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volatileEClass, Volatile.class, "Volatile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitiveEClass, Transitive.class, "Transitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleRequiresModifierEClass, ModuleRequiresModifier.class, "ModuleRequiresModifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openEClass, Open.class, "Open", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModifiersPackageImpl
