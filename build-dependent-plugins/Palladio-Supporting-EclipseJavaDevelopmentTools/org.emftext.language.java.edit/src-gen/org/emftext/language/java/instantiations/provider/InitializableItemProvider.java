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
package org.emftext.language.java.instantiations.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.annotations.AnnotationsFactory;

import org.emftext.language.java.annotations.provider.JavaEditPlugin;

import org.emftext.language.java.arrays.ArraysFactory;

import org.emftext.language.java.commons.provider.CommentableItemProvider;

import org.emftext.language.java.expressions.ExpressionsFactory;

import org.emftext.language.java.instantiations.Initializable;
import org.emftext.language.java.instantiations.InstantiationsFactory;
import org.emftext.language.java.instantiations.InstantiationsPackage;

import org.emftext.language.java.literals.LiteralsFactory;

import org.emftext.language.java.references.ReferencesFactory;

import org.emftext.language.java.statements.StatementsFactory;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.instantiations.Initializable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InitializableItemProvider extends CommentableItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_Initializable_type");
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

		switch (notification.getFeatureID(Initializable.class))
		{
			case InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE:
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
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ExpressionsFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
				 StatementsFactory.eINSTANCE.createSwitch()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return JavaEditPlugin.INSTANCE;
	}

}
