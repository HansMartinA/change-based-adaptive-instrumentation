/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsFactory
 * @model kind="package"
 * @generated
 */
public interface TopLevelElementsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toplevelelements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://vitruv.tools/dsls/reactions/language/toplevelelements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toplevelelements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopLevelElementsPackage eINSTANCE = tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsFileImpl <em>Reactions File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsFileImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionsFile()
	 * @generated
	 */
	int REACTIONS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Namespace Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_FILE__NAMESPACE_IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_FILE__METAMODEL_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Reactions Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_FILE__REACTIONS_SEGMENTS = 2;

	/**
	 * The number of structural features of the '<em>Reactions File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_FILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reactions File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl <em>Reactions Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionsSegment()
	 * @generated
	 */
	int REACTIONS_SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>From Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT__FROM_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>To Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT__TO_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Reactions Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT__REACTIONS_IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT__REACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Routines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT__ROUTINES = 5;

	/**
	 * The number of structural features of the '<em>Reactions Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reactions Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsImportImpl <em>Reactions Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsImportImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionsImport()
	 * @generated
	 */
	int REACTIONS_IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Routines Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_IMPORT__ROUTINES_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Imported Reactions Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_IMPORT__IMPORTED_REACTIONS_SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Use Qualified Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_IMPORT__USE_QUALIFIED_NAMES = 2;

	/**
	 * The number of structural features of the '<em>Reactions Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reactions Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIONS_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionImpl <em>Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReaction()
	 * @generated
	 */
	int REACTION = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Overridden Reactions Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__OVERRIDDEN_REACTIONS_SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Call Routine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__CALL_ROUTINE = 4;

	/**
	 * The feature id for the '<em><b>Reactions Segment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__REACTIONS_SEGMENT = 5;

	/**
	 * The number of structural features of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TriggerImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PRECONDITION = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl <em>Routine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutine()
	 * @generated
	 */
	int ROUTINE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Override Import Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__OVERRIDE_IMPORT_PATH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__INPUT = 3;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__MATCHER = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__ACTION = 5;

	/**
	 * The feature id for the '<em><b>Reactions Segment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__REACTIONS_SEGMENT = 6;

	/**
	 * The number of structural features of the '<em>Routine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Routine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineOverrideImportPathImpl <em>Routine Override Import Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineOverrideImportPathImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutineOverrideImportPath()
	 * @generated
	 */
	int ROUTINE_OVERRIDE_IMPORT_PATH = 6;

	/**
	 * The feature id for the '<em><b>Reactions Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_OVERRIDE_IMPORT_PATH__REACTIONS_SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_OVERRIDE_IMPORT_PATH__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Routine Override Import Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_OVERRIDE_IMPORT_PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Routine Override Import Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_OVERRIDE_IMPORT_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineInputImpl <em>Routine Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineInputImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutineInput()
	 * @generated
	 */
	int ROUTINE_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Model Input Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_INPUT__MODEL_INPUT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Java Input Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_INPUT__JAVA_INPUT_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Routine Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Routine Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherImpl <em>Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getMatcher()
	 * @generated
	 */
	int MATCHER = 8;

	/**
	 * The feature id for the '<em><b>Matcher Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__MATCHER_STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherStatementImpl <em>Matcher Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherStatementImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getMatcherStatement()
	 * @generated
	 */
	int MATCHER_STATEMENT = 9;

	/**
	 * The number of structural features of the '<em>Matcher Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Matcher Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The feature id for the '<em><b>Action Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionStatementImpl <em>Action Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionStatementImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getActionStatement()
	 * @generated
	 */
	int ACTION_STATEMENT = 11;

	/**
	 * The number of structural features of the '<em>Action Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.CodeBlockImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODE = 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.PreconditionCodeBlockImpl <em>Precondition Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.PreconditionCodeBlockImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getPreconditionCodeBlock()
	 * @generated
	 */
	int PRECONDITION_CODE_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_CODE_BLOCK__CODE = CODE_BLOCK__CODE;

	/**
	 * The number of structural features of the '<em>Precondition Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_CODE_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precondition Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_CODE_BLOCK_OPERATION_COUNT = CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.NamedJavaElementReferenceImpl <em>Named Java Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.NamedJavaElementReferenceImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getNamedJavaElementReference()
	 * @generated
	 */
	int NAMED_JAVA_ELEMENT_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_JAVA_ELEMENT_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_JAVA_ELEMENT_REFERENCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Named Java Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_JAVA_ELEMENT_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Java Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_JAVA_ELEMENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineCallBlockImpl <em>Routine Call Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineCallBlockImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutineCallBlock()
	 * @generated
	 */
	int ROUTINE_CALL_BLOCK = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_CALL_BLOCK__CODE = CODE_BLOCK__CODE;

	/**
	 * The number of structural features of the '<em>Routine Call Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_CALL_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Routine Call Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_CALL_BLOCK_OPERATION_COUNT = CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionRoutineCallImpl <em>Reaction Routine Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionRoutineCallImpl
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionRoutineCall()
	 * @generated
	 */
	int REACTION_ROUTINE_CALL = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_ROUTINE_CALL__CODE = ROUTINE_CALL_BLOCK__CODE;

	/**
	 * The number of structural features of the '<em>Reaction Routine Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_ROUTINE_CALL_FEATURE_COUNT = ROUTINE_CALL_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reaction Routine Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_ROUTINE_CALL_OPERATION_COUNT = ROUTINE_CALL_BLOCK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile <em>Reactions File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactions File</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile
	 * @generated
	 */
	EClass getReactionsFile();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile#getNamespaceImports <em>Namespace Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Imports</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile#getNamespaceImports()
	 * @see #getReactionsFile()
	 * @generated
	 */
	EReference getReactionsFile_NamespaceImports();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile#getMetamodelImports <em>Metamodel Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Imports</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile#getMetamodelImports()
	 * @see #getReactionsFile()
	 * @generated
	 */
	EReference getReactionsFile_MetamodelImports();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile#getReactionsSegments <em>Reactions Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions Segments</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsFile#getReactionsSegments()
	 * @see #getReactionsFile()
	 * @generated
	 */
	EReference getReactionsFile_ReactionsSegments();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactions Segment</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment
	 * @generated
	 */
	EClass getReactionsSegment();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getName()
	 * @see #getReactionsSegment()
	 * @generated
	 */
	EAttribute getReactionsSegment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getFromDomain <em>From Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Domain</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getFromDomain()
	 * @see #getReactionsSegment()
	 * @generated
	 */
	EReference getReactionsSegment_FromDomain();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getToDomain <em>To Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Domain</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getToDomain()
	 * @see #getReactionsSegment()
	 * @generated
	 */
	EReference getReactionsSegment_ToDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getReactionsImports <em>Reactions Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions Imports</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getReactionsImports()
	 * @see #getReactionsSegment()
	 * @generated
	 */
	EReference getReactionsSegment_ReactionsImports();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getReactions()
	 * @see #getReactionsSegment()
	 * @generated
	 */
	EReference getReactionsSegment_Reactions();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getRoutines <em>Routines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routines</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getRoutines()
	 * @see #getReactionsSegment()
	 * @generated
	 */
	EReference getReactionsSegment_Routines();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport <em>Reactions Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactions Import</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport
	 * @generated
	 */
	EClass getReactionsImport();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport#isRoutinesOnly <em>Routines Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routines Only</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport#isRoutinesOnly()
	 * @see #getReactionsImport()
	 * @generated
	 */
	EAttribute getReactionsImport_RoutinesOnly();

	/**
	 * Returns the meta object for the reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport#getImportedReactionsSegment <em>Imported Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Reactions Segment</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport#getImportedReactionsSegment()
	 * @see #getReactionsImport()
	 * @generated
	 */
	EReference getReactionsImport_ImportedReactionsSegment();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport#isUseQualifiedNames <em>Use Qualified Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Qualified Names</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport#isUseQualifiedNames()
	 * @see #getReactionsImport()
	 * @generated
	 */
	EAttribute getReactionsImport_UseQualifiedNames();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction
	 * @generated
	 */
	EClass getReaction();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getDocumentation()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_Documentation();

	/**
	 * Returns the meta object for the reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getOverriddenReactionsSegment <em>Overridden Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overridden Reactions Segment</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getOverriddenReactionsSegment()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_OverriddenReactionsSegment();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getName()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getTrigger()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getCallRoutine <em>Call Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Routine</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getCallRoutine()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_CallRoutine();

	/**
	 * Returns the meta object for the container reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reactions Segment</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getReactionsSegment()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_ReactionsSegment();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Trigger#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Trigger#getPrecondition()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Precondition();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine <em>Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine
	 * @generated
	 */
	EClass getRoutine();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getDocumentation()
	 * @see #getRoutine()
	 * @generated
	 */
	EAttribute getRoutine_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getOverrideImportPath <em>Override Import Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Override Import Path</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getOverrideImportPath()
	 * @see #getRoutine()
	 * @generated
	 */
	EReference getRoutine_OverrideImportPath();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getName()
	 * @see #getRoutine()
	 * @generated
	 */
	EAttribute getRoutine_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getInput()
	 * @see #getRoutine()
	 * @generated
	 */
	EReference getRoutine_Input();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matcher</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getMatcher()
	 * @see #getRoutine()
	 * @generated
	 */
	EReference getRoutine_Matcher();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getAction()
	 * @see #getRoutine()
	 * @generated
	 */
	EReference getRoutine_Action();

	/**
	 * Returns the meta object for the container reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reactions Segment</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getReactionsSegment()
	 * @see #getRoutine()
	 * @generated
	 */
	EReference getRoutine_ReactionsSegment();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath <em>Routine Override Import Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine Override Import Path</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath
	 * @generated
	 */
	EClass getRoutineOverrideImportPath();

	/**
	 * Returns the meta object for the reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath#getReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reactions Segment</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath#getReactionsSegment()
	 * @see #getRoutineOverrideImportPath()
	 * @generated
	 */
	EReference getRoutineOverrideImportPath_ReactionsSegment();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath#getParent()
	 * @see #getRoutineOverrideImportPath()
	 * @generated
	 */
	EReference getRoutineOverrideImportPath_Parent();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput <em>Routine Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine Input</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput
	 * @generated
	 */
	EClass getRoutineInput();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput#getModelInputElements <em>Model Input Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Input Elements</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput#getModelInputElements()
	 * @see #getRoutineInput()
	 * @generated
	 */
	EReference getRoutineInput_ModelInputElements();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput#getJavaInputElements <em>Java Input Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Input Elements</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput#getJavaInputElements()
	 * @see #getRoutineInput()
	 * @generated
	 */
	EReference getRoutineInput_JavaInputElements();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Matcher
	 * @generated
	 */
	EClass getMatcher();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Matcher#getMatcherStatements <em>Matcher Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matcher Statements</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Matcher#getMatcherStatements()
	 * @see #getMatcher()
	 * @generated
	 */
	EReference getMatcher_MatcherStatements();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.MatcherStatement <em>Matcher Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher Statement</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.MatcherStatement
	 * @generated
	 */
	EClass getMatcherStatement();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Action#getActionStatements <em>Action Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Statements</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Action#getActionStatements()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionStatements();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Statement</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ActionStatement
	 * @generated
	 */
	EClass getActionStatement();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.CodeBlock#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.CodeBlock#getCode()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Code();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.PreconditionCodeBlock <em>Precondition Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition Code Block</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.PreconditionCodeBlock
	 * @generated
	 */
	EClass getPreconditionCodeBlock();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference <em>Named Java Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Java Element Reference</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference
	 * @generated
	 */
	EClass getNamedJavaElementReference();

	/**
	 * Returns the meta object for the attribute '{@link tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference#getName()
	 * @see #getNamedJavaElementReference()
	 * @generated
	 */
	EAttribute getNamedJavaElementReference_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.NamedJavaElementReference#getType()
	 * @see #getNamedJavaElementReference()
	 * @generated
	 */
	EReference getNamedJavaElementReference_Type();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.RoutineCallBlock <em>Routine Call Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine Call Block</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.RoutineCallBlock
	 * @generated
	 */
	EClass getRoutineCallBlock();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionRoutineCall <em>Reaction Routine Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Routine Call</em>'.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.ReactionRoutineCall
	 * @generated
	 */
	EClass getReactionRoutineCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopLevelElementsFactory getTopLevelElementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsFileImpl <em>Reactions File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsFileImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionsFile()
		 * @generated
		 */
		EClass REACTIONS_FILE = eINSTANCE.getReactionsFile();

		/**
		 * The meta object literal for the '<em><b>Namespace Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_FILE__NAMESPACE_IMPORTS = eINSTANCE.getReactionsFile_NamespaceImports();

		/**
		 * The meta object literal for the '<em><b>Metamodel Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_FILE__METAMODEL_IMPORTS = eINSTANCE.getReactionsFile_MetamodelImports();

		/**
		 * The meta object literal for the '<em><b>Reactions Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_FILE__REACTIONS_SEGMENTS = eINSTANCE.getReactionsFile_ReactionsSegments();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl <em>Reactions Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionsSegment()
		 * @generated
		 */
		EClass REACTIONS_SEGMENT = eINSTANCE.getReactionsSegment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTIONS_SEGMENT__NAME = eINSTANCE.getReactionsSegment_Name();

		/**
		 * The meta object literal for the '<em><b>From Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_SEGMENT__FROM_DOMAIN = eINSTANCE.getReactionsSegment_FromDomain();

		/**
		 * The meta object literal for the '<em><b>To Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_SEGMENT__TO_DOMAIN = eINSTANCE.getReactionsSegment_ToDomain();

		/**
		 * The meta object literal for the '<em><b>Reactions Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_SEGMENT__REACTIONS_IMPORTS = eINSTANCE.getReactionsSegment_ReactionsImports();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_SEGMENT__REACTIONS = eINSTANCE.getReactionsSegment_Reactions();

		/**
		 * The meta object literal for the '<em><b>Routines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_SEGMENT__ROUTINES = eINSTANCE.getReactionsSegment_Routines();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsImportImpl <em>Reactions Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsImportImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionsImport()
		 * @generated
		 */
		EClass REACTIONS_IMPORT = eINSTANCE.getReactionsImport();

		/**
		 * The meta object literal for the '<em><b>Routines Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTIONS_IMPORT__ROUTINES_ONLY = eINSTANCE.getReactionsImport_RoutinesOnly();

		/**
		 * The meta object literal for the '<em><b>Imported Reactions Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIONS_IMPORT__IMPORTED_REACTIONS_SEGMENT = eINSTANCE.getReactionsImport_ImportedReactionsSegment();

		/**
		 * The meta object literal for the '<em><b>Use Qualified Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTIONS_IMPORT__USE_QUALIFIED_NAMES = eINSTANCE.getReactionsImport_UseQualifiedNames();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionImpl <em>Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReaction()
		 * @generated
		 */
		EClass REACTION = eINSTANCE.getReaction();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__DOCUMENTATION = eINSTANCE.getReaction_Documentation();

		/**
		 * The meta object literal for the '<em><b>Overridden Reactions Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__OVERRIDDEN_REACTIONS_SEGMENT = eINSTANCE.getReaction_OverriddenReactionsSegment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__NAME = eINSTANCE.getReaction_Name();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__TRIGGER = eINSTANCE.getReaction_Trigger();

		/**
		 * The meta object literal for the '<em><b>Call Routine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__CALL_ROUTINE = eINSTANCE.getReaction_CallRoutine();

		/**
		 * The meta object literal for the '<em><b>Reactions Segment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__REACTIONS_SEGMENT = eINSTANCE.getReaction_ReactionsSegment();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TriggerImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__PRECONDITION = eINSTANCE.getTrigger_Precondition();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl <em>Routine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutine()
		 * @generated
		 */
		EClass ROUTINE = eINSTANCE.getRoutine();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTINE__DOCUMENTATION = eINSTANCE.getRoutine_Documentation();

		/**
		 * The meta object literal for the '<em><b>Override Import Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE__OVERRIDE_IMPORT_PATH = eINSTANCE.getRoutine_OverrideImportPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTINE__NAME = eINSTANCE.getRoutine_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE__INPUT = eINSTANCE.getRoutine_Input();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE__MATCHER = eINSTANCE.getRoutine_Matcher();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE__ACTION = eINSTANCE.getRoutine_Action();

		/**
		 * The meta object literal for the '<em><b>Reactions Segment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE__REACTIONS_SEGMENT = eINSTANCE.getRoutine_ReactionsSegment();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineOverrideImportPathImpl <em>Routine Override Import Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineOverrideImportPathImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutineOverrideImportPath()
		 * @generated
		 */
		EClass ROUTINE_OVERRIDE_IMPORT_PATH = eINSTANCE.getRoutineOverrideImportPath();

		/**
		 * The meta object literal for the '<em><b>Reactions Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE_OVERRIDE_IMPORT_PATH__REACTIONS_SEGMENT = eINSTANCE.getRoutineOverrideImportPath_ReactionsSegment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE_OVERRIDE_IMPORT_PATH__PARENT = eINSTANCE.getRoutineOverrideImportPath_Parent();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineInputImpl <em>Routine Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineInputImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutineInput()
		 * @generated
		 */
		EClass ROUTINE_INPUT = eINSTANCE.getRoutineInput();

		/**
		 * The meta object literal for the '<em><b>Model Input Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE_INPUT__MODEL_INPUT_ELEMENTS = eINSTANCE.getRoutineInput_ModelInputElements();

		/**
		 * The meta object literal for the '<em><b>Java Input Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE_INPUT__JAVA_INPUT_ELEMENTS = eINSTANCE.getRoutineInput_JavaInputElements();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherImpl <em>Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getMatcher()
		 * @generated
		 */
		EClass MATCHER = eINSTANCE.getMatcher();

		/**
		 * The meta object literal for the '<em><b>Matcher Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHER__MATCHER_STATEMENTS = eINSTANCE.getMatcher_MatcherStatements();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherStatementImpl <em>Matcher Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherStatementImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getMatcherStatement()
		 * @generated
		 */
		EClass MATCHER_STATEMENT = eINSTANCE.getMatcherStatement();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_STATEMENTS = eINSTANCE.getAction_ActionStatements();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionStatementImpl <em>Action Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ActionStatementImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getActionStatement()
		 * @generated
		 */
		EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.CodeBlockImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CODE = eINSTANCE.getCodeBlock_Code();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.PreconditionCodeBlockImpl <em>Precondition Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.PreconditionCodeBlockImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getPreconditionCodeBlock()
		 * @generated
		 */
		EClass PRECONDITION_CODE_BLOCK = eINSTANCE.getPreconditionCodeBlock();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.NamedJavaElementReferenceImpl <em>Named Java Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.NamedJavaElementReferenceImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getNamedJavaElementReference()
		 * @generated
		 */
		EClass NAMED_JAVA_ELEMENT_REFERENCE = eINSTANCE.getNamedJavaElementReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_JAVA_ELEMENT_REFERENCE__NAME = eINSTANCE.getNamedJavaElementReference_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_JAVA_ELEMENT_REFERENCE__TYPE = eINSTANCE.getNamedJavaElementReference_Type();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineCallBlockImpl <em>Routine Call Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineCallBlockImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getRoutineCallBlock()
		 * @generated
		 */
		EClass ROUTINE_CALL_BLOCK = eINSTANCE.getRoutineCallBlock();

		/**
		 * The meta object literal for the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionRoutineCallImpl <em>Reaction Routine Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionRoutineCallImpl
		 * @see tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsPackageImpl#getReactionRoutineCall()
		 * @generated
		 */
		EClass REACTION_ROUTINE_CALL = eINSTANCE.getReactionRoutineCall();

	}

} //TopLevelElementsPackage
