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
package org.emftext.language.java.statements.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.annotations.AnnotationValue;

import org.emftext.language.java.arrays.ArrayInitializationValue;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamedElement;

import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;
import org.emftext.language.java.expressions.LambdaBody;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.ShiftExpressionChild;
import org.emftext.language.java.expressions.UnaryExpressionChild;
import org.emftext.language.java.expressions.UnaryModificationExpressionChild;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.modifiers.Modifiable;

import org.emftext.language.java.statements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.statements.StatementsPackage
 * @generated
 */
public class StatementsAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementsSwitch<Adapter> modelSwitch =
		new StatementsSwitch<Adapter>()
		{
			@Override
			public Adapter caseStatementContainer(StatementContainer object)
			{
				return createStatementContainerAdapter();
			}
			@Override
			public Adapter caseStatementListContainer(StatementListContainer object)
			{
				return createStatementListContainerAdapter();
			}
			@Override
			public Adapter caseConditional(Conditional object)
			{
				return createConditionalAdapter();
			}
			@Override
			public Adapter caseForLoopInitializer(ForLoopInitializer object)
			{
				return createForLoopInitializerAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object)
			{
				return createStatementAdapter();
			}
			@Override
			public Adapter caseSwitchCase(SwitchCase object)
			{
				return createSwitchCaseAdapter();
			}
			@Override
			public Adapter caseAssert(Assert object)
			{
				return createAssertAdapter();
			}
			@Override
			public Adapter caseBreak(Break object)
			{
				return createBreakAdapter();
			}
			@Override
			public Adapter caseBlock(Block object)
			{
				return createBlockAdapter();
			}
			@Override
			public Adapter caseCatchBlock(CatchBlock object)
			{
				return createCatchBlockAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object)
			{
				return createConditionAdapter();
			}
			@Override
			public Adapter caseContinue(Continue object)
			{
				return createContinueAdapter();
			}
			@Override
			public Adapter caseDefaultSwitchCase(DefaultSwitchCase object)
			{
				return createDefaultSwitchCaseAdapter();
			}
			@Override
			public Adapter caseDoWhileLoop(DoWhileLoop object)
			{
				return createDoWhileLoopAdapter();
			}
			@Override
			public Adapter caseEmptyStatement(EmptyStatement object)
			{
				return createEmptyStatementAdapter();
			}
			@Override
			public Adapter caseExpressionStatement(ExpressionStatement object)
			{
				return createExpressionStatementAdapter();
			}
			@Override
			public Adapter caseForLoop(ForLoop object)
			{
				return createForLoopAdapter();
			}
			@Override
			public Adapter caseForEachLoop(ForEachLoop object)
			{
				return createForEachLoopAdapter();
			}
			@Override
			public Adapter caseJump(Jump object)
			{
				return createJumpAdapter();
			}
			@Override
			public Adapter caseJumpLabel(JumpLabel object)
			{
				return createJumpLabelAdapter();
			}
			@Override
			public Adapter caseLocalVariableStatement(LocalVariableStatement object)
			{
				return createLocalVariableStatementAdapter();
			}
			@Override
			public Adapter caseNormalSwitchCase(NormalSwitchCase object)
			{
				return createNormalSwitchCaseAdapter();
			}
			@Override
			public Adapter caseReturn(Return object)
			{
				return createReturnAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object)
			{
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseSynchronizedBlock(SynchronizedBlock object)
			{
				return createSynchronizedBlockAdapter();
			}
			@Override
			public Adapter caseThrow(Throw object)
			{
				return createThrowAdapter();
			}
			@Override
			public Adapter caseTryBlock(TryBlock object)
			{
				return createTryBlockAdapter();
			}
			@Override
			public Adapter caseWhileLoop(WhileLoop object)
			{
				return createWhileLoopAdapter();
			}
			@Override
			public Adapter caseBlockContainer(BlockContainer object)
			{
				return createBlockContainerAdapter();
			}
			@Override
			public Adapter caseYieldStatement(YieldStatement object)
			{
				return createYieldStatementAdapter();
			}
			@Override
			public Adapter caseSwitchRule(SwitchRule object)
			{
				return createSwitchRuleAdapter();
			}
			@Override
			public Adapter caseDefaultSwitchRule(DefaultSwitchRule object)
			{
				return createDefaultSwitchRuleAdapter();
			}
			@Override
			public Adapter caseNormalSwitchRule(NormalSwitchRule object)
			{
				return createNormalSwitchRuleAdapter();
			}
			@Override
			public Adapter caseCommentable(Commentable object)
			{
				return createCommentableAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object)
			{
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseMember(Member object)
			{
				return createMemberAdapter();
			}
			@Override
			public Adapter caseModifiable(Modifiable object)
			{
				return createModifiableAdapter();
			}
			@Override
			public Adapter caseLambdaBody(LambdaBody object)
			{
				return createLambdaBodyAdapter();
			}
			@Override
			public Adapter caseArrayInitializationValue(ArrayInitializationValue object)
			{
				return createArrayInitializationValueAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseAnnotationValue(AnnotationValue object)
			{
				return createAnnotationValueAdapter();
			}
			@Override
			public Adapter caseAssignmentExpressionChild(AssignmentExpressionChild object)
			{
				return createAssignmentExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalExpressionChild(ConditionalExpressionChild object)
			{
				return createConditionalExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalOrExpressionChild(ConditionalOrExpressionChild object)
			{
				return createConditionalOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalAndExpressionChild(ConditionalAndExpressionChild object)
			{
				return createConditionalAndExpressionChildAdapter();
			}
			@Override
			public Adapter caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object)
			{
				return createInclusiveOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object)
			{
				return createExclusiveOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseAndExpressionChild(AndExpressionChild object)
			{
				return createAndExpressionChildAdapter();
			}
			@Override
			public Adapter caseEqualityExpressionChild(EqualityExpressionChild object)
			{
				return createEqualityExpressionChildAdapter();
			}
			@Override
			public Adapter caseInstanceOfExpressionChild(InstanceOfExpressionChild object)
			{
				return createInstanceOfExpressionChildAdapter();
			}
			@Override
			public Adapter caseRelationExpressionChild(RelationExpressionChild object)
			{
				return createRelationExpressionChildAdapter();
			}
			@Override
			public Adapter caseShiftExpressionChild(ShiftExpressionChild object)
			{
				return createShiftExpressionChildAdapter();
			}
			@Override
			public Adapter caseAdditiveExpressionChild(AdditiveExpressionChild object)
			{
				return createAdditiveExpressionChildAdapter();
			}
			@Override
			public Adapter caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object)
			{
				return createMultiplicativeExpressionChildAdapter();
			}
			@Override
			public Adapter caseUnaryExpressionChild(UnaryExpressionChild object)
			{
				return createUnaryExpressionChildAdapter();
			}
			@Override
			public Adapter caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object)
			{
				return createUnaryModificationExpressionChildAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.StatementContainer <em>Statement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.StatementContainer
	 * @generated
	 */
	public Adapter createStatementContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.StatementListContainer <em>Statement List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.StatementListContainer
	 * @generated
	 */
	public Adapter createStatementListContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Conditional
	 * @generated
	 */
	public Adapter createConditionalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.ForLoopInitializer <em>For Loop Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.ForLoopInitializer
	 * @generated
	 */
	public Adapter createForLoopInitializerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Assert
	 * @generated
	 */
	public Adapter createAssertAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Break
	 * @generated
	 */
	public Adapter createBreakAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Block
	 * @generated
	 */
	public Adapter createBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.CatchBlock <em>Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.CatchBlock
	 * @generated
	 */
	public Adapter createCatchBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Continue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Continue
	 * @generated
	 */
	public Adapter createContinueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.DefaultSwitchCase <em>Default Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.DefaultSwitchCase
	 * @generated
	 */
	public Adapter createDefaultSwitchCaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.DoWhileLoop <em>Do While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.DoWhileLoop
	 * @generated
	 */
	public Adapter createDoWhileLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.EmptyStatement
	 * @generated
	 */
	public Adapter createEmptyStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.ExpressionStatement
	 * @generated
	 */
	public Adapter createExpressionStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.ForLoop
	 * @generated
	 */
	public Adapter createForLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.ForEachLoop <em>For Each Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.ForEachLoop
	 * @generated
	 */
	public Adapter createForEachLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Jump
	 * @generated
	 */
	public Adapter createJumpAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.JumpLabel <em>Jump Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.JumpLabel
	 * @generated
	 */
	public Adapter createJumpLabelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.LocalVariableStatement <em>Local Variable Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.LocalVariableStatement
	 * @generated
	 */
	public Adapter createLocalVariableStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.NormalSwitchCase <em>Normal Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.NormalSwitchCase
	 * @generated
	 */
	public Adapter createNormalSwitchCaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Return
	 * @generated
	 */
	public Adapter createReturnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.SynchronizedBlock <em>Synchronized Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.SynchronizedBlock
	 * @generated
	 */
	public Adapter createSynchronizedBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.Throw
	 * @generated
	 */
	public Adapter createThrowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.TryBlock <em>Try Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.TryBlock
	 * @generated
	 */
	public Adapter createTryBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.WhileLoop
	 * @generated
	 */
	public Adapter createWhileLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.BlockContainer <em>Block Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.BlockContainer
	 * @generated
	 */
	public Adapter createBlockContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.YieldStatement <em>Yield Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.YieldStatement
	 * @generated
	 */
	public Adapter createYieldStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.SwitchRule <em>Switch Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.SwitchRule
	 * @generated
	 */
	public Adapter createSwitchRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.DefaultSwitchRule <em>Default Switch Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.DefaultSwitchRule
	 * @generated
	 */
	public Adapter createDefaultSwitchRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.NormalSwitchRule <em>Normal Switch Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.NormalSwitchRule
	 * @generated
	 */
	public Adapter createNormalSwitchRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.commons.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.commons.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.members.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.members.Member
	 * @generated
	 */
	public Adapter createMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modifiers.Modifiable <em>Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modifiers.Modifiable
	 * @generated
	 */
	public Adapter createModifiableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.LambdaBody <em>Lambda Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.LambdaBody
	 * @generated
	 */
	public Adapter createLambdaBodyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.arrays.ArrayInitializationValue
	 * @generated
	 */
	public Adapter createArrayInitializationValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.annotations.AnnotationValue <em>Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.annotations.AnnotationValue
	 * @generated
	 */
	public Adapter createAnnotationValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.AssignmentExpressionChild
	 * @generated
	 */
	public Adapter createAssignmentExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.ConditionalExpressionChild
	 * @generated
	 */
	public Adapter createConditionalExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.ConditionalOrExpressionChild
	 * @generated
	 */
	public Adapter createConditionalOrExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.ConditionalAndExpressionChild
	 * @generated
	 */
	public Adapter createConditionalAndExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.InclusiveOrExpressionChild <em>Inclusive Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.InclusiveOrExpressionChild
	 * @generated
	 */
	public Adapter createInclusiveOrExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ExclusiveOrExpressionChild <em>Exclusive Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.ExclusiveOrExpressionChild
	 * @generated
	 */
	public Adapter createExclusiveOrExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AndExpressionChild <em>And Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.AndExpressionChild
	 * @generated
	 */
	public Adapter createAndExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.EqualityExpressionChild <em>Equality Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.EqualityExpressionChild
	 * @generated
	 */
	public Adapter createEqualityExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.InstanceOfExpressionChild <em>Instance Of Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.InstanceOfExpressionChild
	 * @generated
	 */
	public Adapter createInstanceOfExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.RelationExpressionChild <em>Relation Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.RelationExpressionChild
	 * @generated
	 */
	public Adapter createRelationExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ShiftExpressionChild <em>Shift Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.ShiftExpressionChild
	 * @generated
	 */
	public Adapter createShiftExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AdditiveExpressionChild <em>Additive Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.AdditiveExpressionChild
	 * @generated
	 */
	public Adapter createAdditiveExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.MultiplicativeExpressionChild <em>Multiplicative Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.MultiplicativeExpressionChild
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.UnaryExpressionChild <em>Unary Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.UnaryExpressionChild
	 * @generated
	 */
	public Adapter createUnaryExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.UnaryModificationExpressionChild <em>Unary Modification Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.expressions.UnaryModificationExpressionChild
	 * @generated
	 */
	public Adapter createUnaryModificationExpressionChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //StatementsAdapterFactory
