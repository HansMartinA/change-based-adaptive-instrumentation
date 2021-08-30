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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case StatementsPackage.STATEMENT_CONTAINER:
			{
				StatementContainer statementContainer = (StatementContainer)theEObject;
				T result = caseStatementContainer(statementContainer);
				if (result == null) result = caseCommentable(statementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STATEMENT_LIST_CONTAINER:
			{
				StatementListContainer statementListContainer = (StatementListContainer)theEObject;
				T result = caseStatementListContainer(statementListContainer);
				if (result == null) result = caseCommentable(statementListContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONDITIONAL:
			{
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseCommentable(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.FOR_LOOP_INITIALIZER:
			{
				ForLoopInitializer forLoopInitializer = (ForLoopInitializer)theEObject;
				T result = caseForLoopInitializer(forLoopInitializer);
				if (result == null) result = caseCommentable(forLoopInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STATEMENT:
			{
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseCommentable(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SWITCH_CASE:
			{
				SwitchCase switchCase = (SwitchCase)theEObject;
				T result = caseSwitchCase(switchCase);
				if (result == null) result = caseStatementListContainer(switchCase);
				if (result == null) result = caseCommentable(switchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ASSERT:
			{
				Assert assert_ = (Assert)theEObject;
				T result = caseAssert(assert_);
				if (result == null) result = caseStatement(assert_);
				if (result == null) result = caseConditional(assert_);
				if (result == null) result = caseCommentable(assert_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.BREAK:
			{
				Break break_ = (Break)theEObject;
				T result = caseBreak(break_);
				if (result == null) result = caseJump(break_);
				if (result == null) result = caseStatement(break_);
				if (result == null) result = caseCommentable(break_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.BLOCK:
			{
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseMember(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = caseStatementListContainer(block);
				if (result == null) result = caseModifiable(block);
				if (result == null) result = caseLambdaBody(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = caseCommentable(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CATCH_BLOCK:
			{
				CatchBlock catchBlock = (CatchBlock)theEObject;
				T result = caseCatchBlock(catchBlock);
				if (result == null) result = caseStatementListContainer(catchBlock);
				if (result == null) result = caseBlockContainer(catchBlock);
				if (result == null) result = caseCommentable(catchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONDITION:
			{
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseStatement(condition);
				if (result == null) result = caseStatementContainer(condition);
				if (result == null) result = caseConditional(condition);
				if (result == null) result = caseCommentable(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONTINUE:
			{
				Continue continue_ = (Continue)theEObject;
				T result = caseContinue(continue_);
				if (result == null) result = caseJump(continue_);
				if (result == null) result = caseStatement(continue_);
				if (result == null) result = caseCommentable(continue_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.DEFAULT_SWITCH_CASE:
			{
				DefaultSwitchCase defaultSwitchCase = (DefaultSwitchCase)theEObject;
				T result = caseDefaultSwitchCase(defaultSwitchCase);
				if (result == null) result = caseSwitchCase(defaultSwitchCase);
				if (result == null) result = caseStatementListContainer(defaultSwitchCase);
				if (result == null) result = caseCommentable(defaultSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.DO_WHILE_LOOP:
			{
				DoWhileLoop doWhileLoop = (DoWhileLoop)theEObject;
				T result = caseDoWhileLoop(doWhileLoop);
				if (result == null) result = caseWhileLoop(doWhileLoop);
				if (result == null) result = caseStatement(doWhileLoop);
				if (result == null) result = caseStatementContainer(doWhileLoop);
				if (result == null) result = caseConditional(doWhileLoop);
				if (result == null) result = caseCommentable(doWhileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EMPTY_STATEMENT:
			{
				EmptyStatement emptyStatement = (EmptyStatement)theEObject;
				T result = caseEmptyStatement(emptyStatement);
				if (result == null) result = caseStatement(emptyStatement);
				if (result == null) result = caseCommentable(emptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EXPRESSION_STATEMENT:
			{
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseCommentable(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.FOR_LOOP:
			{
				ForLoop forLoop = (ForLoop)theEObject;
				T result = caseForLoop(forLoop);
				if (result == null) result = caseStatement(forLoop);
				if (result == null) result = caseStatementContainer(forLoop);
				if (result == null) result = caseConditional(forLoop);
				if (result == null) result = caseCommentable(forLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.FOR_EACH_LOOP:
			{
				ForEachLoop forEachLoop = (ForEachLoop)theEObject;
				T result = caseForEachLoop(forEachLoop);
				if (result == null) result = caseStatement(forEachLoop);
				if (result == null) result = caseStatementContainer(forEachLoop);
				if (result == null) result = caseCommentable(forEachLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.JUMP:
			{
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseStatement(jump);
				if (result == null) result = caseCommentable(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.JUMP_LABEL:
			{
				JumpLabel jumpLabel = (JumpLabel)theEObject;
				T result = caseJumpLabel(jumpLabel);
				if (result == null) result = caseStatement(jumpLabel);
				if (result == null) result = caseStatementContainer(jumpLabel);
				if (result == null) result = caseNamedElement(jumpLabel);
				if (result == null) result = caseCommentable(jumpLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.LOCAL_VARIABLE_STATEMENT:
			{
				LocalVariableStatement localVariableStatement = (LocalVariableStatement)theEObject;
				T result = caseLocalVariableStatement(localVariableStatement);
				if (result == null) result = caseStatement(localVariableStatement);
				if (result == null) result = caseCommentable(localVariableStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NORMAL_SWITCH_CASE:
			{
				NormalSwitchCase normalSwitchCase = (NormalSwitchCase)theEObject;
				T result = caseNormalSwitchCase(normalSwitchCase);
				if (result == null) result = caseSwitchCase(normalSwitchCase);
				if (result == null) result = caseConditional(normalSwitchCase);
				if (result == null) result = caseStatementListContainer(normalSwitchCase);
				if (result == null) result = caseCommentable(normalSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.RETURN:
			{
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseCommentable(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SWITCH:
			{
				org.emftext.language.java.statements.Switch switch_ = (org.emftext.language.java.statements.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseStatement(switch_);
				if (result == null) result = caseUnaryModificationExpressionChild(switch_);
				if (result == null) result = caseUnaryExpressionChild(switch_);
				if (result == null) result = caseMultiplicativeExpressionChild(switch_);
				if (result == null) result = caseAdditiveExpressionChild(switch_);
				if (result == null) result = caseShiftExpressionChild(switch_);
				if (result == null) result = caseRelationExpressionChild(switch_);
				if (result == null) result = caseInstanceOfExpressionChild(switch_);
				if (result == null) result = caseEqualityExpressionChild(switch_);
				if (result == null) result = caseAndExpressionChild(switch_);
				if (result == null) result = caseExclusiveOrExpressionChild(switch_);
				if (result == null) result = caseInclusiveOrExpressionChild(switch_);
				if (result == null) result = caseConditionalAndExpressionChild(switch_);
				if (result == null) result = caseConditionalOrExpressionChild(switch_);
				if (result == null) result = caseConditionalExpressionChild(switch_);
				if (result == null) result = caseAssignmentExpressionChild(switch_);
				if (result == null) result = caseExpression(switch_);
				if (result == null) result = caseAnnotationValue(switch_);
				if (result == null) result = caseArrayInitializationValue(switch_);
				if (result == null) result = caseLambdaBody(switch_);
				if (result == null) result = caseCommentable(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SYNCHRONIZED_BLOCK:
			{
				SynchronizedBlock synchronizedBlock = (SynchronizedBlock)theEObject;
				T result = caseSynchronizedBlock(synchronizedBlock);
				if (result == null) result = caseStatement(synchronizedBlock);
				if (result == null) result = caseStatementListContainer(synchronizedBlock);
				if (result == null) result = caseBlockContainer(synchronizedBlock);
				if (result == null) result = caseCommentable(synchronizedBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.THROW:
			{
				Throw throw_ = (Throw)theEObject;
				T result = caseThrow(throw_);
				if (result == null) result = caseStatement(throw_);
				if (result == null) result = caseCommentable(throw_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.TRY_BLOCK:
			{
				TryBlock tryBlock = (TryBlock)theEObject;
				T result = caseTryBlock(tryBlock);
				if (result == null) result = caseStatement(tryBlock);
				if (result == null) result = caseStatementListContainer(tryBlock);
				if (result == null) result = caseBlockContainer(tryBlock);
				if (result == null) result = caseCommentable(tryBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.WHILE_LOOP:
			{
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T result = caseWhileLoop(whileLoop);
				if (result == null) result = caseStatement(whileLoop);
				if (result == null) result = caseStatementContainer(whileLoop);
				if (result == null) result = caseConditional(whileLoop);
				if (result == null) result = caseCommentable(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.BLOCK_CONTAINER:
			{
				BlockContainer blockContainer = (BlockContainer)theEObject;
				T result = caseBlockContainer(blockContainer);
				if (result == null) result = caseCommentable(blockContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.YIELD_STATEMENT:
			{
				YieldStatement yieldStatement = (YieldStatement)theEObject;
				T result = caseYieldStatement(yieldStatement);
				if (result == null) result = caseStatement(yieldStatement);
				if (result == null) result = caseCommentable(yieldStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SWITCH_RULE:
			{
				SwitchRule switchRule = (SwitchRule)theEObject;
				T result = caseSwitchRule(switchRule);
				if (result == null) result = caseSwitchCase(switchRule);
				if (result == null) result = caseStatementListContainer(switchRule);
				if (result == null) result = caseCommentable(switchRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.DEFAULT_SWITCH_RULE:
			{
				DefaultSwitchRule defaultSwitchRule = (DefaultSwitchRule)theEObject;
				T result = caseDefaultSwitchRule(defaultSwitchRule);
				if (result == null) result = caseSwitchRule(defaultSwitchRule);
				if (result == null) result = caseSwitchCase(defaultSwitchRule);
				if (result == null) result = caseStatementListContainer(defaultSwitchRule);
				if (result == null) result = caseCommentable(defaultSwitchRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NORMAL_SWITCH_RULE:
			{
				NormalSwitchRule normalSwitchRule = (NormalSwitchRule)theEObject;
				T result = caseNormalSwitchRule(normalSwitchRule);
				if (result == null) result = caseConditional(normalSwitchRule);
				if (result == null) result = caseSwitchRule(normalSwitchRule);
				if (result == null) result = caseSwitchCase(normalSwitchRule);
				if (result == null) result = caseStatementListContainer(normalSwitchRule);
				if (result == null) result = caseCommentable(normalSwitchRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementContainer(StatementContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementListContainer(StatementListContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoopInitializer(ForLoopInitializer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssert(Assert object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreak(Break object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchBlock(CatchBlock object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinue(Continue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultSwitchCase(DefaultSwitchCase object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhileLoop(DoWhileLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyStatement(EmptyStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoop(ForLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachLoop(ForEachLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpLabel(JumpLabel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariableStatement(LocalVariableStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalSwitchCase(NormalSwitchCase object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(org.emftext.language.java.statements.Switch object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedBlock(SynchronizedBlock object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrow(Throw object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryBlock(TryBlock object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockContainer(BlockContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yield Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yield Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYieldStatement(YieldStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchRule(SwitchRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Switch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Switch Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultSwitchRule(DefaultSwitchRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Switch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Switch Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalSwitchRule(NormalSwitchRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentable(Commentable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiable(Modifiable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaBody(LambdaBody object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializationValue(ArrayInitializationValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationValue(AnnotationValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentExpressionChild(AssignmentExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpressionChild(ConditionalExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOrExpressionChild(ConditionalOrExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAndExpressionChild(ConditionalAndExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusive Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusive Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpressionChild(AndExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityExpressionChild(EqualityExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOfExpressionChild(InstanceOfExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationExpressionChild(RelationExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftExpressionChild(ShiftExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveExpressionChild(AdditiveExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpressionChild(UnaryExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Modification Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Modification Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //StatementsSwitch
