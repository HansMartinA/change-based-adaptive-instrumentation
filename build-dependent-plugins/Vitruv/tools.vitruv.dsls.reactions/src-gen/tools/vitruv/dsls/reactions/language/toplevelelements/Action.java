/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.Action#getActionStatements <em>Action Statements</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
	/**
	 * Returns the value of the '<em><b>Action Statements</b></em>' containment reference list.
	 * The list contents are of type {@link tools.vitruv.dsls.reactions.language.toplevelelements.ActionStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statements</em>' containment reference list.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getAction_ActionStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionStatement> getActionStatements();

} // Action
