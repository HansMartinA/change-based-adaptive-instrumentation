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
package org.emftext.language.java.annotations.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsFactory;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.arrays.ArraysFactory;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.expressions.ExpressionsFactory;

import org.emftext.language.java.generics.GenericsFactory;
import org.emftext.language.java.generics.GenericsPackage;

import org.emftext.language.java.instantiations.InstantiationsFactory;

import org.emftext.language.java.modifiers.provider.AnnotationInstanceOrModifierItemProvider;

import org.emftext.language.java.references.ReferencesFactory;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.types.TypesFactory;
import org.emftext.language.java.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.annotations.AnnotationInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationInstanceItemProvider extends AnnotationInstanceOrModifierItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationInstanceItemProvider(AdapterFactory adapterFactory)
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

			addNamespacesPropertyDescriptor(object);
			addAnnotationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Namespaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamespaceAwareElement_namespaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamespaceAwareElement_namespaces_feature", "_UI_NamespaceAwareElement_type"),
				 CommonsPackage.Literals.NAMESPACE_AWARE_ELEMENT__NAMESPACES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotationInstance_annotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationInstance_annotation_feature", "_UI_AnnotationInstance_type"),
				 AnnotationsPackage.Literals.ANNOTATION_INSTANCE__ANNOTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(AnnotationsPackage.Literals.ANNOTATION_INSTANCE__PARAMETER);
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
	 * This returns AnnotationInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotationInstance"));
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
		return getString("_UI_AnnotationInstance_type");
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

		switch (notification.getFeatureID(AnnotationInstance.class))
		{
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS:
			case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS:
			case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT:
			case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS:
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
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
				(AnnotationsPackage.Literals.ANNOTATION_INSTANCE__PARAMETER,
				 AnnotationsFactory.eINSTANCE.createSingleAnnotationParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATION_INSTANCE__PARAMETER,
				 AnnotationsFactory.eINSTANCE.createAnnotationParameterList()));
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
