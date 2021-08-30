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
package org.emftext.language.java.operators.provider;

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

import org.emftext.language.java.operators.util.OperatorsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsItemProviderAdapterFactory extends OperatorsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
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
	public OperatorsItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Assignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentItemProvider assignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentAdapter()
	{
		if (assignmentItemProvider == null)
		{
			assignmentItemProvider = new AssignmentItemProvider(this);
		}

		return assignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentAnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentAndItemProvider assignmentAndItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentAnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentAndAdapter()
	{
		if (assignmentAndItemProvider == null)
		{
			assignmentAndItemProvider = new AssignmentAndItemProvider(this);
		}

		return assignmentAndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentDivision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentDivisionItemProvider assignmentDivisionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentDivision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentDivisionAdapter()
	{
		if (assignmentDivisionItemProvider == null)
		{
			assignmentDivisionItemProvider = new AssignmentDivisionItemProvider(this);
		}

		return assignmentDivisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentExclusiveOr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExclusiveOrItemProvider assignmentExclusiveOrItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentExclusiveOr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentExclusiveOrAdapter()
	{
		if (assignmentExclusiveOrItemProvider == null)
		{
			assignmentExclusiveOrItemProvider = new AssignmentExclusiveOrItemProvider(this);
		}

		return assignmentExclusiveOrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentMinus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentMinusItemProvider assignmentMinusItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentMinus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentMinusAdapter()
	{
		if (assignmentMinusItemProvider == null)
		{
			assignmentMinusItemProvider = new AssignmentMinusItemProvider(this);
		}

		return assignmentMinusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentModulo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentModuloItemProvider assignmentModuloItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentModulo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentModuloAdapter()
	{
		if (assignmentModuloItemProvider == null)
		{
			assignmentModuloItemProvider = new AssignmentModuloItemProvider(this);
		}

		return assignmentModuloItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentMultiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentMultiplicationItemProvider assignmentMultiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentMultiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentMultiplicationAdapter()
	{
		if (assignmentMultiplicationItemProvider == null)
		{
			assignmentMultiplicationItemProvider = new AssignmentMultiplicationItemProvider(this);
		}

		return assignmentMultiplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentLeftShift} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentLeftShiftItemProvider assignmentLeftShiftItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentLeftShift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentLeftShiftAdapter()
	{
		if (assignmentLeftShiftItemProvider == null)
		{
			assignmentLeftShiftItemProvider = new AssignmentLeftShiftItemProvider(this);
		}

		return assignmentLeftShiftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentOr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentOrItemProvider assignmentOrItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentOr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentOrAdapter()
	{
		if (assignmentOrItemProvider == null)
		{
			assignmentOrItemProvider = new AssignmentOrItemProvider(this);
		}

		return assignmentOrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentPlus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentPlusItemProvider assignmentPlusItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentPlus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentPlusAdapter()
	{
		if (assignmentPlusItemProvider == null)
		{
			assignmentPlusItemProvider = new AssignmentPlusItemProvider(this);
		}

		return assignmentPlusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentRightShift} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentRightShiftItemProvider assignmentRightShiftItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentRightShift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentRightShiftAdapter()
	{
		if (assignmentRightShiftItemProvider == null)
		{
			assignmentRightShiftItemProvider = new AssignmentRightShiftItemProvider(this);
		}

		return assignmentRightShiftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.AssignmentUnsignedRightShift} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentUnsignedRightShiftItemProvider assignmentUnsignedRightShiftItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.AssignmentUnsignedRightShift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentUnsignedRightShiftAdapter()
	{
		if (assignmentUnsignedRightShiftItemProvider == null)
		{
			assignmentUnsignedRightShiftItemProvider = new AssignmentUnsignedRightShiftItemProvider(this);
		}

		return assignmentUnsignedRightShiftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Equal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualItemProvider equalItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Equal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualAdapter()
	{
		if (equalItemProvider == null)
		{
			equalItemProvider = new EqualItemProvider(this);
		}

		return equalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.NotEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotEqualItemProvider notEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.NotEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotEqualAdapter()
	{
		if (notEqualItemProvider == null)
		{
			notEqualItemProvider = new NotEqualItemProvider(this);
		}

		return notEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.GreaterThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanItemProvider greaterThanItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.GreaterThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterThanAdapter()
	{
		if (greaterThanItemProvider == null)
		{
			greaterThanItemProvider = new GreaterThanItemProvider(this);
		}

		return greaterThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.GreaterThanOrEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanOrEqualItemProvider greaterThanOrEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.GreaterThanOrEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterThanOrEqualAdapter()
	{
		if (greaterThanOrEqualItemProvider == null)
		{
			greaterThanOrEqualItemProvider = new GreaterThanOrEqualItemProvider(this);
		}

		return greaterThanOrEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.LessThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanItemProvider lessThanItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.LessThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessThanAdapter()
	{
		if (lessThanItemProvider == null)
		{
			lessThanItemProvider = new LessThanItemProvider(this);
		}

		return lessThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.LessThanOrEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanOrEqualItemProvider lessThanOrEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.LessThanOrEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessThanOrEqualAdapter()
	{
		if (lessThanOrEqualItemProvider == null)
		{
			lessThanOrEqualItemProvider = new LessThanOrEqualItemProvider(this);
		}

		return lessThanOrEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Addition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionItemProvider additionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditionAdapter()
	{
		if (additionItemProvider == null)
		{
			additionItemProvider = new AdditionItemProvider(this);
		}

		return additionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Subtraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtractionItemProvider subtractionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Subtraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubtractionAdapter()
	{
		if (subtractionItemProvider == null)
		{
			subtractionItemProvider = new SubtractionItemProvider(this);
		}

		return subtractionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Division} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionItemProvider divisionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivisionAdapter()
	{
		if (divisionItemProvider == null)
		{
			divisionItemProvider = new DivisionItemProvider(this);
		}

		return divisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Multiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationItemProvider multiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Multiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicationAdapter()
	{
		if (multiplicationItemProvider == null)
		{
			multiplicationItemProvider = new MultiplicationItemProvider(this);
		}

		return multiplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Remainder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemainderItemProvider remainderItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Remainder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRemainderAdapter()
	{
		if (remainderItemProvider == null)
		{
			remainderItemProvider = new RemainderItemProvider(this);
		}

		return remainderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Complement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementItemProvider complementItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Complement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplementAdapter()
	{
		if (complementItemProvider == null)
		{
			complementItemProvider = new ComplementItemProvider(this);
		}

		return complementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.MinusMinus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusMinusItemProvider minusMinusItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.MinusMinus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinusMinusAdapter()
	{
		if (minusMinusItemProvider == null)
		{
			minusMinusItemProvider = new MinusMinusItemProvider(this);
		}

		return minusMinusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.Negate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegateItemProvider negateItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.Negate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNegateAdapter()
	{
		if (negateItemProvider == null)
		{
			negateItemProvider = new NegateItemProvider(this);
		}

		return negateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.PlusPlus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusPlusItemProvider plusPlusItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.PlusPlus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusPlusAdapter()
	{
		if (plusPlusItemProvider == null)
		{
			plusPlusItemProvider = new PlusPlusItemProvider(this);
		}

		return plusPlusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.LeftShift} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftShiftItemProvider leftShiftItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.LeftShift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeftShiftAdapter()
	{
		if (leftShiftItemProvider == null)
		{
			leftShiftItemProvider = new LeftShiftItemProvider(this);
		}

		return leftShiftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.RightShift} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightShiftItemProvider rightShiftItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.RightShift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRightShiftAdapter()
	{
		if (rightShiftItemProvider == null)
		{
			rightShiftItemProvider = new RightShiftItemProvider(this);
		}

		return rightShiftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftext.language.java.operators.UnsignedRightShift} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsignedRightShiftItemProvider unsignedRightShiftItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftext.language.java.operators.UnsignedRightShift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsignedRightShiftAdapter()
	{
		if (unsignedRightShiftItemProvider == null)
		{
			unsignedRightShiftItemProvider = new UnsignedRightShiftItemProvider(this);
		}

		return unsignedRightShiftItemProvider;
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
		if (assignmentItemProvider != null) assignmentItemProvider.dispose();
		if (assignmentAndItemProvider != null) assignmentAndItemProvider.dispose();
		if (assignmentDivisionItemProvider != null) assignmentDivisionItemProvider.dispose();
		if (assignmentExclusiveOrItemProvider != null) assignmentExclusiveOrItemProvider.dispose();
		if (assignmentMinusItemProvider != null) assignmentMinusItemProvider.dispose();
		if (assignmentModuloItemProvider != null) assignmentModuloItemProvider.dispose();
		if (assignmentMultiplicationItemProvider != null) assignmentMultiplicationItemProvider.dispose();
		if (assignmentLeftShiftItemProvider != null) assignmentLeftShiftItemProvider.dispose();
		if (assignmentOrItemProvider != null) assignmentOrItemProvider.dispose();
		if (assignmentPlusItemProvider != null) assignmentPlusItemProvider.dispose();
		if (assignmentRightShiftItemProvider != null) assignmentRightShiftItemProvider.dispose();
		if (assignmentUnsignedRightShiftItemProvider != null) assignmentUnsignedRightShiftItemProvider.dispose();
		if (equalItemProvider != null) equalItemProvider.dispose();
		if (notEqualItemProvider != null) notEqualItemProvider.dispose();
		if (greaterThanItemProvider != null) greaterThanItemProvider.dispose();
		if (greaterThanOrEqualItemProvider != null) greaterThanOrEqualItemProvider.dispose();
		if (lessThanItemProvider != null) lessThanItemProvider.dispose();
		if (lessThanOrEqualItemProvider != null) lessThanOrEqualItemProvider.dispose();
		if (additionItemProvider != null) additionItemProvider.dispose();
		if (subtractionItemProvider != null) subtractionItemProvider.dispose();
		if (divisionItemProvider != null) divisionItemProvider.dispose();
		if (multiplicationItemProvider != null) multiplicationItemProvider.dispose();
		if (remainderItemProvider != null) remainderItemProvider.dispose();
		if (complementItemProvider != null) complementItemProvider.dispose();
		if (minusMinusItemProvider != null) minusMinusItemProvider.dispose();
		if (negateItemProvider != null) negateItemProvider.dispose();
		if (plusPlusItemProvider != null) plusPlusItemProvider.dispose();
		if (leftShiftItemProvider != null) leftShiftItemProvider.dispose();
		if (rightShiftItemProvider != null) rightShiftItemProvider.dispose();
		if (unsignedRightShiftItemProvider != null) unsignedRightShiftItemProvider.dispose();
	}

}
