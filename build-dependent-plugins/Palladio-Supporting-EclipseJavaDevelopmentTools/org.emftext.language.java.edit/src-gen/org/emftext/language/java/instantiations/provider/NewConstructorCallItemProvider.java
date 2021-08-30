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

import org.emftext.language.java.classifiers.ClassifiersFactory;

import org.emftext.language.java.expressions.ExpressionsFactory;

import org.emftext.language.java.generics.GenericsFactory;
import org.emftext.language.java.generics.GenericsPackage;

import org.emftext.language.java.instantiations.InstantiationsFactory;
import org.emftext.language.java.instantiations.InstantiationsPackage;
import org.emftext.language.java.instantiations.NewConstructorCall;

import org.emftext.language.java.literals.LiteralsFactory;

import org.emftext.language.java.references.ReferencesFactory;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.statements.StatementsFactory;

import org.emftext.language.java.types.TypesFactory;
import org.emftext.language.java.types.TypesPackage;

import org.emftext.language.java.types.provider.TypedElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.instantiations.NewConstructorCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NewConstructorCallItemProvider extends TypedElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewConstructorCallItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS);
			childrenFeatures.add(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS);
			childrenFeatures.add(ReferencesPackage.Literals.REFERENCE__NEXT);
			childrenFeatures.add(ReferencesPackage.Literals.REFERENCE__ARRAY_SELECTORS);
			childrenFeatures.add(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS);
			childrenFeatures.add(GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS);
			childrenFeatures.add(InstantiationsPackage.Literals.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS);
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
	 * This returns NewConstructorCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NewConstructorCall"));
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
		return getString("_UI_NewConstructorCall_type");
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

		switch (notification.getFeatureID(NewConstructorCall.class))
		{
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ACTUAL_TARGETS:
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
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
				(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createExtendsTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createQualifiedTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createSuperTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createUnknownTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createClassifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createNamespaceClassifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createChar()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createFloat()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createInt()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createLong()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createShort()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createVoid()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS,
				 TypesFactory.eINSTANCE.createInferableType()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__NEXT,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.REFERENCE__ARRAY_SELECTORS,
				 ArraysFactory.eINSTANCE.createArraySelector()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createPrimaryExpressionReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createClassTypeConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createArrayConstructorReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createBinaryIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createBinaryLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createTextBlockReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createExtendsTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createQualifiedTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createSuperTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS,
				 GenericsFactory.eINSTANCE.createUnknownTypeArgument()));

		newChildDescriptors.add
			(createChildParameter
				(InstantiationsPackage.Literals.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS,
				 ClassifiersFactory.eINSTANCE.createAnonymousClass()));
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
			childFeature == TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE ||
			childFeature == TypesPackage.Literals.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS ||
			childFeature == GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS ||
			childFeature == GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS ||
			childFeature == ReferencesPackage.Literals.REFERENCE__NEXT ||
			childFeature == ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
