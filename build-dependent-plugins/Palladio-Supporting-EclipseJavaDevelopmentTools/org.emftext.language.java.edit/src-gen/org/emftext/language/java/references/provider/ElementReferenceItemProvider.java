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
package org.emftext.language.java.references.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.classifiers.ClassifiersFactory;

import org.emftext.language.java.containers.ContainersFactory;

import org.emftext.language.java.generics.GenericsFactory;

import org.emftext.language.java.members.MembersFactory;

import org.emftext.language.java.parameters.ParametersFactory;

import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.ReferencesFactory;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.variables.VariablesFactory;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.references.ElementReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementReferenceItemProvider extends ReferenceItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReferenceItemProvider(AdapterFactory adapterFactory)
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

			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementReference_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementReference_target_feature", "_UI_ElementReference_type"),
				 ReferencesPackage.Literals.ELEMENT_REFERENCE__TARGET,
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
			childrenFeatures.add(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET);
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
		return getString("_UI_ElementReference_type");
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

		switch (notification.getFeatureID(ElementReference.class))
		{
			case ReferencesPackage.ELEMENT_REFERENCE__CONTAINED_TARGET:
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
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ReferencesFactory.eINSTANCE.createPackageReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ContainersFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 GenericsFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 MembersFactory.eINSTANCE.createAdditionalField()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 MembersFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 MembersFactory.eINSTANCE.createInterfaceMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 MembersFactory.eINSTANCE.createClassMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 MembersFactory.eINSTANCE.createEnumConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ParametersFactory.eINSTANCE.createOrdinaryParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ParametersFactory.eINSTANCE.createVariableLengthParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ParametersFactory.eINSTANCE.createCatchParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 ParametersFactory.eINSTANCE.createReceiverParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 VariablesFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ELEMENT_REFERENCE__CONTAINED_TARGET,
				 VariablesFactory.eINSTANCE.createAdditionalLocalVariable()));
	}

}
