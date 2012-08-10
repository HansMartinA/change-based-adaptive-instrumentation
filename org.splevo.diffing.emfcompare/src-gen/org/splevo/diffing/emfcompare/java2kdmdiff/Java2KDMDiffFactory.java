/**
 */
package org.splevo.diffing.emfcompare.java2kdmdiff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.splevo.diffing.emfcompare.java2kdmdiff.Java2KDMDiffPackage
 * @generated
 */
public interface Java2KDMDiffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java2KDMDiffFactory eINSTANCE = org.splevo.diffing.emfcompare.java2kdmdiff.impl.Java2KDMDiffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Statement Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Change</em>'.
	 * @generated
	 */
	StatementChange createStatementChange();

	/**
	 * Returns a new object of class '<em>Import Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Insert</em>'.
	 * @generated
	 */
	ImportInsert createImportInsert();

	/**
	 * Returns a new object of class '<em>Import Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Delete</em>'.
	 * @generated
	 */
	ImportDelete createImportDelete();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Java2KDMDiffPackage getJava2KDMDiffPackage();

} //Java2KDMDiffFactory
