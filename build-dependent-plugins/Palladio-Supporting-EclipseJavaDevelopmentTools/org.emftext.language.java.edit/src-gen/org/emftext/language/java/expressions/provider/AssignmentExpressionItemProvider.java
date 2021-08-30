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
package org.emftext.language.java.expressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.annotations.AnnotationsFactory;

import org.emftext.language.java.arrays.ArraysFactory;

import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.ExpressionsFactory;
import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.instantiations.InstantiationsFactory;

import org.emftext.language.java.literals.LiteralsFactory;

import org.emftext.language.java.operators.OperatorsFactory;

import org.emftext.language.java.references.ReferencesFactory;

import org.emftext.language.java.statements.StatementsFactory;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.expressions.AssignmentExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentExpressionItemProvider extends ExpressionItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExpressionItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD);
			childrenFeatures.add(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR);
			childrenFeatures.add(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE);
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
	 * This returns AssignmentExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssignmentExpression"));
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
		return getString("_UI_AssignmentExpression_type");
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

		switch (notification.getFeatureID(AssignmentExpression.class))
		{
			case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
			case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
			case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
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
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentDivision()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentExclusiveOr()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentModulo()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentLeftShift()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentOr()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentRightShift()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR,
				 OperatorsFactory.eINSTANCE.createAssignmentUnsignedRightShift()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ExpressionsFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE,
				 StatementsFactory.eINSTANCE.createSwitch()));
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
			childFeature == ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__CHILD ||
			childFeature == ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__VALUE;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
