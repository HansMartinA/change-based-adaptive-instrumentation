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
package org.emftext.language.java.classifiers.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.containers.ContainersFactory;

import org.emftext.language.java.generics.GenericsFactory;
import org.emftext.language.java.generics.GenericsPackage;

import org.emftext.language.java.members.MembersFactory;
import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.statements.StatementsFactory;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.classifiers.ConcreteClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteClassifierItemProvider extends ClassifierItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifierItemProvider(AdapterFactory adapterFactory)
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

			addAnnotationsAndModifiersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Annotations And Modifiers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationsAndModifiersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotableAndModifiable_annotationsAndModifiers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotableAndModifiable_annotationsAndModifiers_feature", "_UI_AnnotableAndModifiable_type"),
				 ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
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
			childrenFeatures.add(GenericsPackage.Literals.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS);
			childrenFeatures.add(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS);
			childrenFeatures.add(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS);
			childrenFeatures.add(ClassifiersPackage.Literals.CONCRETE_CLASSIFIER__PACKAGE);
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
		String label = ((ConcreteClassifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConcreteClassifier_type") :
			getString("_UI_ConcreteClassifier_type") + " " + label;
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

		switch (notification.getFeatureID(ConcreteClassifier.class))
		{
			case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
			case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
			case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
			case ClassifiersPackage.CONCRETE_CLASSIFIER__PACKAGE:
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
				(GenericsPackage.Literals.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS,
				 GenericsFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 MembersFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 MembersFactory.eINSTANCE.createEmptyMember()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 MembersFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 MembersFactory.eINSTANCE.createInterfaceMethod()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 MembersFactory.eINSTANCE.createClassMethod()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 MembersFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 MembersFactory.eINSTANCE.createEmptyMember()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 MembersFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 MembersFactory.eINSTANCE.createInterfaceMethod()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 MembersFactory.eINSTANCE.createClassMethod()));

		newChildDescriptors.add
			(createChildParameter
				(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.CONCRETE_CLASSIFIER__PACKAGE,
				 ContainersFactory.eINSTANCE.createPackage()));
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
			childFeature == MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS ||
			childFeature == MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
