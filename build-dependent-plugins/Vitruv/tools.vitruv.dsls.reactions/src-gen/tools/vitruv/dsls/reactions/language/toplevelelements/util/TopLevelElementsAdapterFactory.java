/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.dsls.reactions.language.toplevelelements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage
 * @generated
 */
public class TopLevelElementsAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopLevelElementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelElementsAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = TopLevelElementsPackage.eINSTANCE;
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
	protected TopLevelElementsSwitch<Adapter> modelSwitch =
		new TopLevelElementsSwitch<Adapter>()
		{
			@Override
			public Adapter caseReactionsFile(ReactionsFile object)
			{
				return createReactionsFileAdapter();
			}
			@Override
			public Adapter caseReactionsSegment(ReactionsSegment object)
			{
				return createReactionsSegmentAdapter();
			}
			@Override
			public Adapter caseReactionsImport(ReactionsImport object)
			{
				return createReactionsImportAdapter();
			}
			@Override
			public Adapter caseReaction(Reaction object)
			{
				return createReactionAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object)
			{
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseRoutine(Routine object)
			{
				return createRoutineAdapter();
			}
			@Override
			public Adapter caseRoutineOverrideImportPath(RoutineOverrideImportPath object)
			{
				return createRoutineOverrideImportPathAdapter();
			}
			@Override
			public Adapter caseRoutineInput(RoutineInput object)
			{
				return createRoutineInputAdapter();
			}
			@Override
			public Adapter caseMatcher(Matcher object)
			{
				return createMatcherAdapter();
			}
			@Override
			public Adapter caseMatcherStatement(MatcherStatement object)
			{
				return createMatcherStatementAdapter();
			}
			@Override
			public Adapter caseAction(Action object)
			{
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionStatement(ActionStatement object)
			{
				return createActionStatementAdapter();
			}
			@Override
			public Adapter caseCodeBlock(CodeBlock object)
			{
				return createCodeBlockAdapter();
			}
			@Override
			public Adapter casePreconditionCodeBlock(PreconditionCodeBlock object)
			{
				return createPreconditionCodeBlockAdapter();
			}
			@Override
			public Adapter caseNamedJavaElementReference(NamedJavaElementReference object)
			{
				return createNamedJavaElementReferenceAdapter();
			}
			@Override
			public Adapter caseRoutineCallBlock(RoutineCallBlock object)
			{
				return createRoutineCallBlockAdapter();
			}
			@Override
			public Adapter caseReactionRoutineCall(ReactionRoutineCall object)
			{
				return createReactionRoutineCallAdapter();
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
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile <em>Reactions File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile
	 * @generated
	 */
	public Adapter createReactionsFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment
	 * @generated
	 */
	public Adapter createReactionsSegmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport <em>Reactions Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport
	 * @generated
	 */
	public Adapter createReactionsImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction
	 * @generated
	 */
	public Adapter createReactionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine <em>Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine
	 * @generated
	 */
	public Adapter createRoutineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath <em>Routine Override Import Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath
	 * @generated
	 */
	public Adapter createRoutineOverrideImportPathAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput <em>Routine Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput
	 * @generated
	 */
	public Adapter createRoutineInputAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Matcher
	 * @generated
	 */
	public Adapter createMatcherAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.MatcherStatement <em>Matcher Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.MatcherStatement
	 * @generated
	 */
	public Adapter createMatcherStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Action
	 * @generated
	 */
	public Adapter createActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ActionStatement
	 * @generated
	 */
	public Adapter createActionStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.CodeBlock
	 * @generated
	 */
	public Adapter createCodeBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.PreconditionCodeBlock <em>Precondition Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.PreconditionCodeBlock
	 * @generated
	 */
	public Adapter createPreconditionCodeBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference <em>Named Java Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference
	 * @generated
	 */
	public Adapter createNamedJavaElementReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineCallBlock <em>Routine Call Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineCallBlock
	 * @generated
	 */
	public Adapter createRoutineCallBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionRoutineCall <em>Reaction Routine Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionRoutineCall
	 * @generated
	 */
	public Adapter createReactionRoutineCallAdapter()
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

} //TopLevelElementsAdapterFactory
