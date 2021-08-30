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
package org.emftext.language.java.generics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.classifiers.impl.ClassifierImpl;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeParameter;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.references.Reference;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.generics.impl.TypeParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.emftext.language.java.generics.impl.TypeParameterImpl#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ClassifierImpl implements TypeParameter
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotations;

	/**
	 * The cached value of the '{@link #getExtendTypes() <em>Extend Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> extendTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GenericsPackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationInstance> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentEList.Resolving<AnnotationInstance>(AnnotationInstance.class, this, GenericsPackage.TYPE_PARAMETER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getExtendTypes()
	{
		if (extendTypes == null)
		{
			extendTypes = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES);
		}
		return extendTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcreteClassifier> getAllSuperClassifiers()
	{
		return org.emftext.language.java.extensions.generics.TypeParameterExtension.getAllSuperClassifiers((org.emftext.language.java.generics.TypeParameter) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Member> getAllMembers(final Commentable context)
	{
		return org.emftext.language.java.extensions.generics.TypeParameterExtension.getAllMembers((org.emftext.language.java.generics.TypeParameter) this, (org.emftext.language.java.commons.Commentable) context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getBoundType(final TypeReference typeReference, final Reference reference)
	{
		return org.emftext.language.java.extensions.generics.TypeParameterExtension.getBoundType((org.emftext.language.java.generics.TypeParameter) this, (org.emftext.language.java.types.TypeReference) typeReference, (org.emftext.language.java.references.Reference) reference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getBoundTypeReference(final TypeReference typeReference, final Reference reference)
	{
		return org.emftext.language.java.extensions.generics.TypeParameterExtension.getBoundTypeReference((org.emftext.language.java.generics.TypeParameter) this, (org.emftext.language.java.types.TypeReference) typeReference, (org.emftext.language.java.references.Reference) reference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GenericsPackage.TYPE_PARAMETER__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
				return ((InternalEList<?>)getExtendTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case GenericsPackage.TYPE_PARAMETER__ANNOTATIONS:
				return getAnnotations();
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
				return getExtendTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GenericsPackage.TYPE_PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
				getExtendTypes().clear();
				getExtendTypes().addAll((Collection<? extends TypeReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case GenericsPackage.TYPE_PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
				getExtendTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case GenericsPackage.TYPE_PARAMETER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
				return extendTypes != null && !extendTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Annotable.class)
		{
			switch (derivedFeatureID)
			{
				case GenericsPackage.TYPE_PARAMETER__ANNOTATIONS: return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Annotable.class)
		{
			switch (baseFeatureID)
			{
				case AnnotationsPackage.ANNOTABLE__ANNOTATIONS: return GenericsPackage.TYPE_PARAMETER__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TypeParameterImpl
