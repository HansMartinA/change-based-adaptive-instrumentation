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

import org.emftext.language.java.statements.NormalSwitchRule;
import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.statements.StatementsPackage;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.statements.NormalSwitchRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalSwitchRuleItemProvider extends ConditionalItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalSwitchRuleItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS);
			childrenFeatures.add(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS);
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
	 * This returns NormalSwitchRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NormalSwitchRule"));
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
		return getString("_UI_NormalSwitchRule_type");
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

		switch (notification.getFeatureID(NormalSwitchRule.class))
		{
			case StatementsPackage.NORMAL_SWITCH_RULE__STATEMENTS:
			case StatementsPackage.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS:
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
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createContinue()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createForEachLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createJumpLabel()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createLocalVariableStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createThrow()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createTryBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 StatementsFactory.eINSTANCE.createYieldStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.SWITCH_CASE__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ExpressionsFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS,
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
			childFeature == StatementsPackage.Literals.CONDITIONAL__CONDITION ||
			childFeature == StatementsPackage.Literals.SWITCH_CASE__STATEMENTS ||
			childFeature == StatementsPackage.Literals.NORMAL_SWITCH_RULE__ADDITIONAL_CONDITIONS;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
