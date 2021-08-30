/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.dsls.common.elements.DomainReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactions Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getName <em>Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getFromDomain <em>From Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getToDomain <em>To Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getReactionsImports <em>Reactions Imports</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getReactions <em>Reactions</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getRoutines <em>Routines</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment()
 * @model
 * @generated
 */
public interface ReactionsSegment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Domain</em>' containment reference.
	 * @see #setFromDomain(DomainReference)
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment_FromDomain()
	 * @model containment="true"
	 * @generated
	 */
	DomainReference getFromDomain();

	/**
	 * Sets the value of the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getFromDomain <em>From Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Domain</em>' containment reference.
	 * @see #getFromDomain()
	 * @generated
	 */
	void setFromDomain(DomainReference value);

	/**
	 * Returns the value of the '<em><b>To Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Domain</em>' containment reference.
	 * @see #setToDomain(DomainReference)
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment_ToDomain()
	 * @model containment="true"
	 * @generated
	 */
	DomainReference getToDomain();

	/**
	 * Sets the value of the '{@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment#getToDomain <em>To Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Domain</em>' containment reference.
	 * @see #getToDomain()
	 * @generated
	 */
	void setToDomain(DomainReference value);

	/**
	 * Returns the value of the '<em><b>Reactions Imports</b></em>' containment reference list.
	 * The list contents are of type {@link tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions Imports</em>' containment reference list.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment_ReactionsImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReactionsImport> getReactionsImports();

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction}.
	 * It is bidirectional and its opposite is '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment_Reactions()
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Reaction#getReactionsSegment
	 * @model opposite="reactionsSegment" containment="true"
	 * @generated
	 */
	EList<Reaction> getReactions();

	/**
	 * Returns the value of the '<em><b>Routines</b></em>' containment reference list.
	 * The list contents are of type {@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine}.
	 * It is bidirectional and its opposite is '{@link tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getReactionsSegment <em>Reactions Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routines</em>' containment reference list.
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage#getReactionsSegment_Routines()
	 * @see tools.vitruv.dsls.reactions.language.toplevelelements.Routine#getReactionsSegment
	 * @model opposite="reactionsSegment" containment="true"
	 * @generated
	 */
	EList<Routine> getRoutines();

} // ReactionsSegment
