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
package org.emftext.language.java.modules.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.emftext.language.java.modules.util.ModulesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulesItemProviderAdapterFactory extends ModulesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulesItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.modules.UsesModuleDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesModuleDirectiveItemProvider usesModuleDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.modules.UsesModuleDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsesModuleDirectiveAdapter()
	{
		if (usesModuleDirectiveItemProvider == null)
		{
			usesModuleDirectiveItemProvider = new UsesModuleDirectiveItemProvider(this);
		}

		return usesModuleDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.modules.ProvidesModuleDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesModuleDirectiveItemProvider providesModuleDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.modules.ProvidesModuleDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidesModuleDirectiveAdapter()
	{
		if (providesModuleDirectiveItemProvider == null)
		{
			providesModuleDirectiveItemProvider = new ProvidesModuleDirectiveItemProvider(this);
		}

		return providesModuleDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.modules.RequiresModuleDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresModuleDirectiveItemProvider requiresModuleDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.modules.RequiresModuleDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiresModuleDirectiveAdapter()
	{
		if (requiresModuleDirectiveItemProvider == null)
		{
			requiresModuleDirectiveItemProvider = new RequiresModuleDirectiveItemProvider(this);
		}

		return requiresModuleDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.modules.OpensModuleDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpensModuleDirectiveItemProvider opensModuleDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.modules.OpensModuleDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpensModuleDirectiveAdapter()
	{
		if (opensModuleDirectiveItemProvider == null)
		{
			opensModuleDirectiveItemProvider = new OpensModuleDirectiveItemProvider(this);
		}

		return opensModuleDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.modules.ExportsModuleDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportsModuleDirectiveItemProvider exportsModuleDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.modules.ExportsModuleDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExportsModuleDirectiveAdapter()
	{
		if (exportsModuleDirectiveItemProvider == null)
		{
			exportsModuleDirectiveItemProvider = new ExportsModuleDirectiveItemProvider(this);
		}

		return exportsModuleDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.modules.ModuleReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleReferenceItemProvider moduleReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.modules.ModuleReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleReferenceAdapter()
	{
		if (moduleReferenceItemProvider == null)
		{
			moduleReferenceItemProvider = new ModuleReferenceItemProvider(this);
		}

		return moduleReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose()
	{
		if (usesModuleDirectiveItemProvider != null) usesModuleDirectiveItemProvider.dispose();
		if (providesModuleDirectiveItemProvider != null) providesModuleDirectiveItemProvider.dispose();
		if (requiresModuleDirectiveItemProvider != null) requiresModuleDirectiveItemProvider.dispose();
		if (opensModuleDirectiveItemProvider != null) opensModuleDirectiveItemProvider.dispose();
		if (exportsModuleDirectiveItemProvider != null) exportsModuleDirectiveItemProvider.dispose();
		if (moduleReferenceItemProvider != null) moduleReferenceItemProvider.dispose();
	}

}
