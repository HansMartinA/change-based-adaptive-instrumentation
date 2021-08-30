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
package org.emftext.language.java.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.statements.Block;
import org.emftext.language.java.statements.BlockContainer;
import org.emftext.language.java.statements.CatchBlock;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.TryBlock;

import org.emftext.language.java.variables.LocalVariable;
import org.emftext.language.java.variables.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryBlockImpl extends StatementImpl implements TryBlock
{
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getCatchBlocks() <em>Catch Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchBlock> catchBlocks;

	/**
	 * The cached value of the '{@link #getFinallyBlock() <em>Finally Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinallyBlock()
	 * @generated
	 * @ordered
	 */
	protected Block finallyBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryBlockImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return StatementsPackage.Literals.TRY_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getBlock()
	{
		if (block != null && block.eIsProxy())
		{
			InternalEObject oldBlock = (InternalEObject)block;
			block = (Block)eResolveProxy(oldBlock);
			if (block != oldBlock)
			{
				InternalEObject newBlock = (InternalEObject)block;
				NotificationChain msgs = oldBlock.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__BLOCK, null, null);
				if (newBlock.eInternalContainer() == null)
				{
					msgs = newBlock.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__BLOCK, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.TRY_BLOCK__BLOCK, oldBlock, block));
			}
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBlock()
	{
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
	{
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlock(Block newBlock)
	{
		if (newBlock != block)
		{
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResources()
	{
		if (resources == null)
		{
			resources = new EObjectContainmentEList.Resolving<Resource>(Resource.class, this, StatementsPackage.TRY_BLOCK__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchBlock> getCatchBlocks()
	{
		if (catchBlocks == null)
		{
			catchBlocks = new EObjectContainmentEList.Resolving<CatchBlock>(CatchBlock.class, this, StatementsPackage.TRY_BLOCK__CATCH_BLOCKS);
		}
		return catchBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getFinallyBlock()
	{
		if (finallyBlock != null && finallyBlock.eIsProxy())
		{
			InternalEObject oldFinallyBlock = (InternalEObject)finallyBlock;
			finallyBlock = (Block)eResolveProxy(oldFinallyBlock);
			if (finallyBlock != oldFinallyBlock)
			{
				InternalEObject newFinallyBlock = (InternalEObject)finallyBlock;
				NotificationChain msgs = oldFinallyBlock.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, null);
				if (newFinallyBlock.eInternalContainer() == null)
				{
					msgs = newFinallyBlock.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, oldFinallyBlock, finallyBlock));
			}
		}
		return finallyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetFinallyBlock()
	{
		return finallyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinallyBlock(Block newFinallyBlock, NotificationChain msgs)
	{
		Block oldFinallyBlock = finallyBlock;
		finallyBlock = newFinallyBlock;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, oldFinallyBlock, newFinallyBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinallyBlock(Block newFinallyBlock)
	{
		if (newFinallyBlock != finallyBlock)
		{
			NotificationChain msgs = null;
			if (finallyBlock != null)
				msgs = ((InternalEObject)finallyBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
			if (newFinallyBlock != null)
				msgs = ((InternalEObject)newFinallyBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
			msgs = basicSetFinallyBlock(newFinallyBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, newFinallyBlock, newFinallyBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchBlock> getCatcheBlocks()
	{
		return org.emftext.language.java.extensions.statements.TryBlockExtension.getCatcheBlocks((org.emftext.language.java.statements.TryBlock) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getStatements()
	{
		return org.emftext.language.java.extensions.statements.TryBlockExtension.getStatements((org.emftext.language.java.statements.TryBlock) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariable getLocalVariable(final String name)
	{
		return org.emftext.language.java.extensions.statements.StatementListContainerExtension.getLocalVariable((org.emftext.language.java.statements.StatementListContainer) this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatementsPackage.TRY_BLOCK__BLOCK:
				return basicSetBlock(null, msgs);
			case StatementsPackage.TRY_BLOCK__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case StatementsPackage.TRY_BLOCK__CATCH_BLOCKS:
				return ((InternalEList<?>)getCatchBlocks()).basicRemove(otherEnd, msgs);
			case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
				return basicSetFinallyBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case StatementsPackage.TRY_BLOCK__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
			case StatementsPackage.TRY_BLOCK__RESOURCES:
				return getResources();
			case StatementsPackage.TRY_BLOCK__CATCH_BLOCKS:
				return getCatchBlocks();
			case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
				if (resolve) return getFinallyBlock();
				return basicGetFinallyBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case StatementsPackage.TRY_BLOCK__BLOCK:
				setBlock((Block)newValue);
				return;
			case StatementsPackage.TRY_BLOCK__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case StatementsPackage.TRY_BLOCK__CATCH_BLOCKS:
				getCatchBlocks().clear();
				getCatchBlocks().addAll((Collection<? extends CatchBlock>)newValue);
				return;
			case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
				setFinallyBlock((Block)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case StatementsPackage.TRY_BLOCK__BLOCK:
				setBlock((Block)null);
				return;
			case StatementsPackage.TRY_BLOCK__RESOURCES:
				getResources().clear();
				return;
			case StatementsPackage.TRY_BLOCK__CATCH_BLOCKS:
				getCatchBlocks().clear();
				return;
			case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
				setFinallyBlock((Block)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case StatementsPackage.TRY_BLOCK__BLOCK:
				return block != null;
			case StatementsPackage.TRY_BLOCK__RESOURCES:
				return resources != null && !resources.isEmpty();
			case StatementsPackage.TRY_BLOCK__CATCH_BLOCKS:
				return catchBlocks != null && !catchBlocks.isEmpty();
			case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
				return finallyBlock != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == StatementListContainer.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == BlockContainer.class)
		{
			switch (derivedFeatureID)
			{
				case StatementsPackage.TRY_BLOCK__BLOCK: return StatementsPackage.BLOCK_CONTAINER__BLOCK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == StatementListContainer.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == BlockContainer.class)
		{
			switch (baseFeatureID)
			{
				case StatementsPackage.BLOCK_CONTAINER__BLOCK: return StatementsPackage.TRY_BLOCK__BLOCK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TryBlockImpl
