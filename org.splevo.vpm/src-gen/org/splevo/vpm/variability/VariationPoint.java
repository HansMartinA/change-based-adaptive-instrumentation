/**
 */
package org.splevo.vpm.variability;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.splevo.vpm.realization.RealizationTechnique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.splevo.vpm.variability.VariationPoint#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.splevo.vpm.variability.VariationPoint#getRealizationTechnique <em>Realization Technique</em>}</li>
 *   <li>{@link org.splevo.vpm.variability.VariationPoint#getEnclosingSoftwareEntity <em>Enclosing Software Entity</em>}</li>
 *   <li>{@link org.splevo.vpm.variability.VariationPoint#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.splevo.vpm.variability.variabilityPackage#getVariationPoint()
 * @model
 * @generated
 */
public interface VariationPoint extends EObject {
	/**
     * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
     * The list contents are of type {@link org.splevo.vpm.variability.Variant}.
     * It is bidirectional and its opposite is '{@link org.splevo.vpm.variability.Variant#getVariationPoint <em>Variation Point</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Variants</em>' containment reference list.
     * @see org.splevo.vpm.variability.variabilityPackage#getVariationPoint_Variants()
     * @see org.splevo.vpm.variability.Variant#getVariationPoint
     * @model opposite="variationPoint" containment="true"
     * @generated
     */
	EList<Variant> getVariants();

	/**
     * Returns the value of the '<em><b>Realization Technique</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization Technique</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Realization Technique</em>' reference.
     * @see #setRealizationTechnique(RealizationTechnique)
     * @see org.splevo.vpm.variability.variabilityPackage#getVariationPoint_RealizationTechnique()
     * @model
     * @generated
     */
	RealizationTechnique getRealizationTechnique();

	/**
     * Sets the value of the '{@link org.splevo.vpm.variability.VariationPoint#getRealizationTechnique <em>Realization Technique</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realization Technique</em>' reference.
     * @see #getRealizationTechnique()
     * @generated
     */
	void setRealizationTechnique(RealizationTechnique value);

	/**
     * Returns the value of the '<em><b>Enclosing Software Entity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The software entity, the variation is enclosed by.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enclosing Software Entity</em>' reference.
     * @see #setEnclosingSoftwareEntity(ASTNode)
     * @see org.splevo.vpm.variability.variabilityPackage#getVariationPoint_EnclosingSoftwareEntity()
     * @model required="true"
     * @generated
     */
    ASTNode getEnclosingSoftwareEntity();

    /**
     * Sets the value of the '{@link org.splevo.vpm.variability.VariationPoint#getEnclosingSoftwareEntity <em>Enclosing Software Entity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enclosing Software Entity</em>' reference.
     * @see #getEnclosingSoftwareEntity()
     * @generated
     */
    void setEnclosingSoftwareEntity(ASTNode value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.splevo.vpm.variability.VariationPointGroup#getVariationPoints <em>Variation Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The variation point group containing the variation point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Group</em>' container reference.
     * @see #setGroup(VariationPointGroup)
     * @see org.splevo.vpm.variability.variabilityPackage#getVariationPoint_Group()
     * @see org.splevo.vpm.variability.VariationPointGroup#getVariationPoints
     * @model opposite="variationPoints" required="true" transient="false"
     * @generated
     */
	VariationPointGroup getGroup();

	/**
     * Sets the value of the '{@link org.splevo.vpm.variability.VariationPoint#getGroup <em>Group</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' container reference.
     * @see #getGroup()
     * @generated
     */
	void setGroup(VariationPointGroup value);

} // VariationPoint
