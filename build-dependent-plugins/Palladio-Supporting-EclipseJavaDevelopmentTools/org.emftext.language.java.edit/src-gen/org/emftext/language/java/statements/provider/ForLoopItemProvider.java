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
package org.emftext.language.java.statements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.annotations.AnnotationsFactory;

import org.emftext.language.java.arrays.ArraysFactory;

import org.emftext.language.java.classifiers.ClassifiersFactory;

import org.emftext.language.java.expressions.ExpressionsFactory;

import org.emftext.language.java.instantiations.InstantiationsFactory;

import org.emftext.language.java.literals.LiteralsFactory;

import org.emftext.language.java.references.ReferencesFactory;

import org.emftext.language.java.statements.ForLoop;
import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.variables.VariablesFactory;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.statements.ForLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForLoopItemProvider extends StatementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoopItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT);
			childrenFeatures.add(StatementsPackage.Literals.CONDITIONAL__CONDITION);
			childrenFeatures.add(StatementsPackage.Literals.FOR_LOOP__INIT);
			childrenFeatures.add(StatementsPackage.Literals.FOR_LOOP__UPDATES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ForLoop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForLoop"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_ForLoop_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(ForLoop.class))
		{
			case StatementsPackage.FOR_LOOP__STATEMENT:
			case StatementsPackage.FOR_LOOP__CONDITION:
			case StatementsPackage.FOR_LOOP__INIT:
			case StatementsPackage.FOR_LOOP__UPDATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createContinue()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createForEachLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createJumpLabel()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createLocalVariableStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createThrow()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createTryBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 StatementsFactory.eINSTANCE.createYieldStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ExpressionsFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.CONDITIONAL__CONDITION,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INIT,
				 ExpressionsFactory.eINSTANCE.createExpressionList()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INIT,
				 VariablesFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ExpressionsFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__UPDATES,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT ||
			childFeature == StatementsPackage.Literals.CONDITIONAL__CONDITION ||
			childFeature == StatementsPackage.Literals.FOR_LOOP__UPDATES;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
