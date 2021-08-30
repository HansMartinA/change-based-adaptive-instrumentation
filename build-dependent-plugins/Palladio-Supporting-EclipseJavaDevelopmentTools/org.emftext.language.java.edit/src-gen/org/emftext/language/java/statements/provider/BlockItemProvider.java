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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftext.language.java.annotations.provider.JavaEditPlugin;

import org.emftext.language.java.classifiers.ClassifiersFactory;

import org.emftext.language.java.members.provider.MemberItemProvider;

import org.emftext.language.java.modifiers.ModifiersFactory;
import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.statements.Block;
import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.statements.StatementsPackage;

/**
 * This is the item provider adapter for a {@link org.emftext.language.java.statements.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider extends MemberItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS);
			childrenFeatures.add(StatementsPackage.Literals.BLOCK__STATEMENTS);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
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
		String label = ((Block)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Block_type") :
			getString("_UI_Block_type") + " " + label;
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

		switch (notification.getFeatureID(Block.class))
		{
			case StatementsPackage.BLOCK__MODIFIERS:
			case StatementsPackage.BLOCK__STATEMENTS:
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
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createFinal()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createNative()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createProtected()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createPublic()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createPrivate()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createStatic()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createStrictfp()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createSynchronized()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createTransient()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createVolatile()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createDefault()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createContinue()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createForEachLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createJumpLabel()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createLocalVariableStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createThrow()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createTryBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 StatementsFactory.eINSTANCE.createYieldStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.BLOCK__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));
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
