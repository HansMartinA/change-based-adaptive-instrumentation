/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tools.vitruv.dsls.reactions.language.toplevelelements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopLevelElementsFactoryImpl extends EFactoryImpl implements TopLevelElementsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopLevelElementsFactory init()
	{
		try
		{
			TopLevelElementsFactory theTopLevelElementsFactory = (TopLevelElementsFactory)EPackage.Registry.INSTANCE.getEFactory(TopLevelElementsPackage.eNS_URI);
			if (theTopLevelElementsFactory != null)
			{
				return theTopLevelElementsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopLevelElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelElementsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case TopLevelElementsPackage.REACTIONS_FILE: return createReactionsFile();
			case TopLevelElementsPackage.REACTIONS_SEGMENT: return createReactionsSegment();
			case TopLevelElementsPackage.REACTIONS_IMPORT: return createReactionsImport();
			case TopLevelElementsPackage.REACTION: return createReaction();
			case TopLevelElementsPackage.TRIGGER: return createTrigger();
			case TopLevelElementsPackage.ROUTINE: return createRoutine();
			case TopLevelElementsPackage.ROUTINE_OVERRIDE_IMPORT_PATH: return createRoutineOverrideImportPath();
			case TopLevelElementsPackage.ROUTINE_INPUT: return createRoutineInput();
			case TopLevelElementsPackage.MATCHER: return createMatcher();
			case TopLevelElementsPackage.MATCHER_STATEMENT: return createMatcherStatement();
			case TopLevelElementsPackage.ACTION: return createAction();
			case TopLevelElementsPackage.ACTION_STATEMENT: return createActionStatement();
			case TopLevelElementsPackage.CODE_BLOCK: return createCodeBlock();
			case TopLevelElementsPackage.PRECONDITION_CODE_BLOCK: return createPreconditionCodeBlock();
			case TopLevelElementsPackage.NAMED_JAVA_ELEMENT_REFERENCE: return createNamedJavaElementReference();
			case TopLevelElementsPackage.ROUTINE_CALL_BLOCK: return createRoutineCallBlock();
			case TopLevelElementsPackage.REACTION_ROUTINE_CALL: return createReactionRoutineCall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionsFile createReactionsFile()
	{
		ReactionsFileImpl reactionsFile = new ReactionsFileImpl();
		return reactionsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionsSegment createReactionsSegment()
	{
		ReactionsSegmentImpl reactionsSegment = new ReactionsSegmentImpl();
		return reactionsSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionsImport createReactionsImport()
	{
		ReactionsImportImpl reactionsImport = new ReactionsImportImpl();
		return reactionsImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reaction createReaction()
	{
		ReactionImpl reaction = new ReactionImpl();
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger()
	{
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routine createRoutine()
	{
		RoutineImpl routine = new RoutineImpl();
		return routine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineOverrideImportPath createRoutineOverrideImportPath()
	{
		RoutineOverrideImportPathImpl routineOverrideImportPath = new RoutineOverrideImportPathImpl();
		return routineOverrideImportPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineInput createRoutineInput()
	{
		RoutineInputImpl routineInput = new RoutineInputImpl();
		return routineInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matcher createMatcher()
	{
		MatcherImpl matcher = new MatcherImpl();
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatcherStatement createMatcherStatement()
	{
		MatcherStatementImpl matcherStatement = new MatcherStatementImpl();
		return matcherStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction()
	{
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatement createActionStatement()
	{
		ActionStatementImpl actionStatement = new ActionStatementImpl();
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock createCodeBlock()
	{
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionCodeBlock createPreconditionCodeBlock()
	{
		PreconditionCodeBlockImpl preconditionCodeBlock = new PreconditionCodeBlockImpl();
		return preconditionCodeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedJavaElementReference createNamedJavaElementReference()
	{
		NamedJavaElementReferenceImpl namedJavaElementReference = new NamedJavaElementReferenceImpl();
		return namedJavaElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineCallBlock createRoutineCallBlock()
	{
		RoutineCallBlockImpl routineCallBlock = new RoutineCallBlockImpl();
		return routineCallBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionRoutineCall createReactionRoutineCall()
	{
		ReactionRoutineCallImpl reactionRoutineCall = new ReactionRoutineCallImpl();
		return reactionRoutineCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelElementsPackage getTopLevelElementsPackage()
	{
		return (TopLevelElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopLevelElementsPackage getPackage()
	{
		return TopLevelElementsPackage.eINSTANCE;
	}

} //TopLevelElementsFactoryImpl
