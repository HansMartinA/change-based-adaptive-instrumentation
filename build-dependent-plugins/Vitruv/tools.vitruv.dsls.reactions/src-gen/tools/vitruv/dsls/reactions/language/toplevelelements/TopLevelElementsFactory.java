/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage
 * @generated
 */
public interface TopLevelElementsFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopLevelElementsFactory eINSTANCE = tools.vitruv.dsls.reactions.language.toplevelelements.impl.TopLevelElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reactions File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactions File</em>'.
	 * @generated
	 */
	ReactionsFile createReactionsFile();

	/**
	 * Returns a new object of class '<em>Reactions Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactions Segment</em>'.
	 * @generated
	 */
	ReactionsSegment createReactionsSegment();

	/**
	 * Returns a new object of class '<em>Reactions Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactions Import</em>'.
	 * @generated
	 */
	ReactionsImport createReactionsImport();

	/**
	 * Returns a new object of class '<em>Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction</em>'.
	 * @generated
	 */
	Reaction createReaction();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Routine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine</em>'.
	 * @generated
	 */
	Routine createRoutine();

	/**
	 * Returns a new object of class '<em>Routine Override Import Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Override Import Path</em>'.
	 * @generated
	 */
	RoutineOverrideImportPath createRoutineOverrideImportPath();

	/**
	 * Returns a new object of class '<em>Routine Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Input</em>'.
	 * @generated
	 */
	RoutineInput createRoutineInput();

	/**
	 * Returns a new object of class '<em>Matcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher</em>'.
	 * @generated
	 */
	Matcher createMatcher();

	/**
	 * Returns a new object of class '<em>Matcher Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher Statement</em>'.
	 * @generated
	 */
	MatcherStatement createMatcherStatement();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Action Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Statement</em>'.
	 * @generated
	 */
	ActionStatement createActionStatement();

	/**
	 * Returns a new object of class '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block</em>'.
	 * @generated
	 */
	CodeBlock createCodeBlock();

	/**
	 * Returns a new object of class '<em>Precondition Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Code Block</em>'.
	 * @generated
	 */
	PreconditionCodeBlock createPreconditionCodeBlock();

	/**
	 * Returns a new object of class '<em>Named Java Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Java Element Reference</em>'.
	 * @generated
	 */
	NamedJavaElementReference createNamedJavaElementReference();

	/**
	 * Returns a new object of class '<em>Routine Call Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Call Block</em>'.
	 * @generated
	 */
	RoutineCallBlock createRoutineCallBlock();

	/**
	 * Returns a new object of class '<em>Reaction Routine Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Routine Call</em>'.
	 * @generated
	 */
	ReactionRoutineCall createReactionRoutineCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopLevelElementsPackage getTopLevelElementsPackage();

} //TopLevelElementsFactory
