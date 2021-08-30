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
package org.emftext.commons.layout;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.commons.layout.LayoutFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "layout";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/commons/layout";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "layout";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutPackage eINSTANCE = org.emftext.commons.layout.impl.LayoutPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.commons.layout.impl.LayoutInformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.layout.impl.LayoutInformationImpl
	 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getLayoutInformation()
	 * @generated
	 */
	int LAYOUT_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION__START_OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID = 3;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.emftext.commons.layout.impl.ReferenceLayoutInformationImpl <em>Reference Layout Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.layout.impl.ReferenceLayoutInformationImpl
	 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getReferenceLayoutInformation()
	 * @generated
	 */
	int REFERENCE_LAYOUT_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LAYOUT_INFORMATION__START_OFFSET = LAYOUT_INFORMATION__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT = LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT = LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID = LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LAYOUT_INFORMATION__OBJECT = LAYOUT_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LAYOUT_INFORMATION_FEATURE_COUNT = LAYOUT_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.commons.layout.impl.AttributeLayoutInformationImpl <em>Attribute Layout Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.layout.impl.AttributeLayoutInformationImpl
	 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getAttributeLayoutInformation()
	 * @generated
	 */
	int ATTRIBUTE_LAYOUT_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT_INFORMATION__START_OFFSET = LAYOUT_INFORMATION__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT = LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT = LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID = LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID;

	/**
	 * The number of structural features of the '<em>Attribute Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT_INFORMATION_FEATURE_COUNT = LAYOUT_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.commons.layout.impl.KeywordLayoutInformationImpl <em>Keyword Layout Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.layout.impl.KeywordLayoutInformationImpl
	 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getKeywordLayoutInformation()
	 * @generated
	 */
	int KEYWORD_LAYOUT_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LAYOUT_INFORMATION__START_OFFSET = LAYOUT_INFORMATION__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT = LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT = LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID = LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID;

	/**
	 * The number of structural features of the '<em>Keyword Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LAYOUT_INFORMATION_FEATURE_COUNT = LAYOUT_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.commons.layout.impl.MinimalLayoutInformationImpl <em>Minimal Layout Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.layout.impl.MinimalLayoutInformationImpl
	 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getMinimalLayoutInformation()
	 * @generated
	 */
	int MINIMAL_LAYOUT_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__START_OFFSET = REFERENCE_LAYOUT_INFORMATION__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT = REFERENCE_LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT = REFERENCE_LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT;

	/**
	 * The feature id for the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID = REFERENCE_LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__OBJECT = REFERENCE_LAYOUT_INFORMATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__LENGTH = REFERENCE_LAYOUT_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT = REFERENCE_LAYOUT_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minimal Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_LAYOUT_INFORMATION_FEATURE_COUNT = REFERENCE_LAYOUT_INFORMATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.emftext.commons.layout.LayoutInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see org.emftext.commons.layout.LayoutInformation
	 * @generated
	 */
	EClass getLayoutInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.layout.LayoutInformation#getStartOffset <em>Start Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Offset</em>'.
	 * @see org.emftext.commons.layout.LayoutInformation#getStartOffset()
	 * @see #getLayoutInformation()
	 * @generated
	 */
	EAttribute getLayoutInformation_StartOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.layout.LayoutInformation#getHiddenTokenText <em>Hidden Token Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden Token Text</em>'.
	 * @see org.emftext.commons.layout.LayoutInformation#getHiddenTokenText()
	 * @see #getLayoutInformation()
	 * @generated
	 */
	EAttribute getLayoutInformation_HiddenTokenText();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.layout.LayoutInformation#getVisibleTokenText <em>Visible Token Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Token Text</em>'.
	 * @see org.emftext.commons.layout.LayoutInformation#getVisibleTokenText()
	 * @see #getLayoutInformation()
	 * @generated
	 */
	EAttribute getLayoutInformation_VisibleTokenText();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.layout.LayoutInformation#getSyntaxElementID <em>Syntax Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax Element ID</em>'.
	 * @see org.emftext.commons.layout.LayoutInformation#getSyntaxElementID()
	 * @see #getLayoutInformation()
	 * @generated
	 */
	EAttribute getLayoutInformation_SyntaxElementID();

	/**
	 * Returns the meta object for class '{@link org.emftext.commons.layout.ReferenceLayoutInformation <em>Reference Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Layout Information</em>'.
	 * @see org.emftext.commons.layout.ReferenceLayoutInformation
	 * @generated
	 */
	EClass getReferenceLayoutInformation();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.commons.layout.ReferenceLayoutInformation#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.emftext.commons.layout.ReferenceLayoutInformation#getObject()
	 * @see #getReferenceLayoutInformation()
	 * @generated
	 */
	EReference getReferenceLayoutInformation_Object();

	/**
	 * Returns the meta object for class '{@link org.emftext.commons.layout.AttributeLayoutInformation <em>Attribute Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Layout Information</em>'.
	 * @see org.emftext.commons.layout.AttributeLayoutInformation
	 * @generated
	 */
	EClass getAttributeLayoutInformation();

	/**
	 * Returns the meta object for class '{@link org.emftext.commons.layout.KeywordLayoutInformation <em>Keyword Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Layout Information</em>'.
	 * @see org.emftext.commons.layout.KeywordLayoutInformation
	 * @generated
	 */
	EClass getKeywordLayoutInformation();

	/**
	 * Returns the meta object for class '{@link org.emftext.commons.layout.MinimalLayoutInformation <em>Minimal Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimal Layout Information</em>'.
	 * @see org.emftext.commons.layout.MinimalLayoutInformation
	 * @generated
	 */
	EClass getMinimalLayoutInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.layout.MinimalLayoutInformation#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.emftext.commons.layout.MinimalLayoutInformation#getLength()
	 * @see #getMinimalLayoutInformation()
	 * @generated
	 */
	EAttribute getMinimalLayoutInformation_Length();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.commons.layout.MinimalLayoutInformation#getRootLayout <em>Root Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Layout</em>'.
	 * @see org.emftext.commons.layout.MinimalLayoutInformation#getRootLayout()
	 * @see #getMinimalLayoutInformation()
	 * @generated
	 */
	EReference getMinimalLayoutInformation_RootLayout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutFactory getLayoutFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.emftext.commons.layout.impl.LayoutInformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.layout.impl.LayoutInformationImpl
		 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getLayoutInformation()
		 * @generated
		 */
		EClass LAYOUT_INFORMATION = eINSTANCE.getLayoutInformation();

		/**
		 * The meta object literal for the '<em><b>Start Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_INFORMATION__START_OFFSET = eINSTANCE.getLayoutInformation_StartOffset();

		/**
		 * The meta object literal for the '<em><b>Hidden Token Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT = eINSTANCE.getLayoutInformation_HiddenTokenText();

		/**
		 * The meta object literal for the '<em><b>Visible Token Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT = eINSTANCE.getLayoutInformation_VisibleTokenText();

		/**
		 * The meta object literal for the '<em><b>Syntax Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID = eINSTANCE.getLayoutInformation_SyntaxElementID();

		/**
		 * The meta object literal for the '{@link org.emftext.commons.layout.impl.ReferenceLayoutInformationImpl <em>Reference Layout Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.layout.impl.ReferenceLayoutInformationImpl
		 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getReferenceLayoutInformation()
		 * @generated
		 */
		EClass REFERENCE_LAYOUT_INFORMATION = eINSTANCE.getReferenceLayoutInformation();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LAYOUT_INFORMATION__OBJECT = eINSTANCE.getReferenceLayoutInformation_Object();

		/**
		 * The meta object literal for the '{@link org.emftext.commons.layout.impl.AttributeLayoutInformationImpl <em>Attribute Layout Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.layout.impl.AttributeLayoutInformationImpl
		 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getAttributeLayoutInformation()
		 * @generated
		 */
		EClass ATTRIBUTE_LAYOUT_INFORMATION = eINSTANCE.getAttributeLayoutInformation();

		/**
		 * The meta object literal for the '{@link org.emftext.commons.layout.impl.KeywordLayoutInformationImpl <em>Keyword Layout Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.layout.impl.KeywordLayoutInformationImpl
		 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getKeywordLayoutInformation()
		 * @generated
		 */
		EClass KEYWORD_LAYOUT_INFORMATION = eINSTANCE.getKeywordLayoutInformation();

		/**
		 * The meta object literal for the '{@link org.emftext.commons.layout.impl.MinimalLayoutInformationImpl <em>Minimal Layout Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.layout.impl.MinimalLayoutInformationImpl
		 * @see org.emftext.commons.layout.impl.LayoutPackageImpl#getMinimalLayoutInformation()
		 * @generated
		 */
		EClass MINIMAL_LAYOUT_INFORMATION = eINSTANCE.getMinimalLayoutInformation();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMAL_LAYOUT_INFORMATION__LENGTH = eINSTANCE.getMinimalLayoutInformation_Length();

		/**
		 * The meta object literal for the '<em><b>Root Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMAL_LAYOUT_INFORMATION__ROOT_LAYOUT = eINSTANCE.getMinimalLayoutInformation_RootLayout();

	}

} //LayoutPackage
