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
package org.emftext.language.java.annotations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationParameter;
import org.emftext.language.java.annotations.AnnotationValue;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.arrays.ArrayInitializationValue;
import org.emftext.language.java.arrays.ArraySelector;

import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.CommonsPackage;
import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;
import org.emftext.language.java.expressions.LambdaBody;
import org.emftext.language.java.expressions.MethodReferenceExpressionChild;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;
import org.emftext.language.java.expressions.PrimaryExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.ShiftExpressionChild;
import org.emftext.language.java.expressions.UnaryExpressionChild;
import org.emftext.language.java.expressions.UnaryModificationExpressionChild;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeArgumentable;

import org.emftext.language.java.modifiers.impl.AnnotationInstanceOrModifierImpl;

import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElementExtension;
import org.emftext.language.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getActualTargets <em>Actual Targets</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getArraySelectors <em>Array Selectors</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationInstanceImpl extends AnnotationInstanceOrModifierImpl implements AnnotationInstance
{
	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> namespaces;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> typeArguments;

	/**
	 * The cached value of the '{@link #getActualTargets() <em>Actual Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> actualTargets;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Reference next;

	/**
	 * The cached value of the '{@link #getArraySelectors() <em>Array Selectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ArraySelector> arraySelectors;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Classifier annotation;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected AnnotationParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationInstanceImpl()
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
		return AnnotationsPackage.Literals.ANNOTATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNamespaces()
	{
		if (namespaces == null)
		{
			namespaces = new EDataTypeEList<String>(String.class, this, AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeArgument> getTypeArguments()
	{
		if (typeArguments == null)
		{
			typeArguments = new EObjectContainmentEList.Resolving<TypeArgument>(TypeArgument.class, this, AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getActualTargets()
	{
		if (actualTargets == null)
		{
			actualTargets = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS);
		}
		return actualTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNext()
	{
		if (next != null && next.eIsProxy())
		{
			InternalEObject oldNext = (InternalEObject)next;
			next = (Reference)eResolveProxy(oldNext);
			if (next != oldNext)
			{
				InternalEObject newNext = (InternalEObject)next;
				NotificationChain msgs = oldNext.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, null, null);
				if (newNext.eInternalContainer() == null)
				{
					msgs = newNext.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetNext()
	{
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Reference newNext, NotificationChain msgs)
	{
		Reference oldNext = next;
		next = newNext;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(Reference newNext)
	{
		if (newNext != next)
		{
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArraySelector> getArraySelectors()
	{
		if (arraySelectors == null)
		{
			arraySelectors = new EObjectContainmentEList.Resolving<ArraySelector>(ArraySelector.class, this, AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS);
		}
		return arraySelectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getAnnotation()
	{
		if (annotation != null && annotation.eIsProxy())
		{
			InternalEObject oldAnnotation = (InternalEObject)annotation;
			annotation = (Classifier)eResolveProxy(oldAnnotation);
			if (annotation != oldAnnotation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
			}
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(Classifier newAnnotation)
	{
		Classifier oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationParameter getParameter()
	{
		if (parameter != null && parameter.eIsProxy())
		{
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (AnnotationParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter)
			{
				InternalEObject newParameter = (InternalEObject)parameter;
				NotificationChain msgs = oldParameter.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, null);
				if (newParameter.eInternalContainer() == null)
				{
					msgs = newParameter.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationParameter basicGetParameter()
	{
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(AnnotationParameter newParameter, NotificationChain msgs)
	{
		AnnotationParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(AnnotationParameter newParameter)
	{
		if (newParameter != parameter)
		{
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getReferencedType()
	{
		return org.emftext.language.java.extensions.references.ReferenceExtension.getReferencedType((org.emftext.language.java.references.Reference) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPrevious()
	{
		return org.emftext.language.java.extensions.references.ReferenceExtension.getPrevious((org.emftext.language.java.references.Reference) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getReferencedTypeReference()
	{
		return org.emftext.language.java.extensions.references.ReferenceExtension.getReferencedTypeReference((org.emftext.language.java.references.Reference) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType()
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getType((org.emftext.language.java.expressions.Expression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getAlternativeType()
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getAlternativeType((org.emftext.language.java.expressions.Expression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOneType(final boolean alternative)
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getOneType((org.emftext.language.java.expressions.Expression) this, alternative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getArrayDimension()
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getArrayDimension((org.emftext.language.java.expressions.Expression) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getOneTypeReference(final boolean alternative)
	{
		return org.emftext.language.java.extensions.expressions.ExpressionExtension.getOneTypeReference((org.emftext.language.java.expressions.Expression) this, alternative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespacesAsString()
	{
		return org.emftext.language.java.extensions.commons.NamespaceAwareElementExtension.getNamespacesAsString((org.emftext.language.java.commons.NamespaceAwareElement) this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteClassifier getClassifierAtNamespaces()
	{
		return org.emftext.language.java.extensions.commons.NamespaceAwareElementExtension.getClassifierAtNamespaces((org.emftext.language.java.commons.NamespaceAwareElement) this);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS:
				return ((InternalEList<?>)getActualTargets()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT:
				return basicSetNext(null, msgs);
			case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS:
				return ((InternalEList<?>)getArraySelectors()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				return basicSetParameter(null, msgs);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				return getNamespaces();
			case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS:
				return getTypeArguments();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS:
				return getActualTargets();
			case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS:
				return getArraySelectors();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				if (resolve) return getAnnotation();
				return basicGetAnnotation();
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS:
				getActualTargets().clear();
				getActualTargets().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT:
				setNext((Reference)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS:
				getArraySelectors().clear();
				getArraySelectors().addAll((Collection<? extends ArraySelector>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				setAnnotation((Classifier)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				setParameter((AnnotationParameter)newValue);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				getNamespaces().clear();
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS:
				getActualTargets().clear();
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT:
				setNext((Reference)null);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS:
				getArraySelectors().clear();
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				setAnnotation((Classifier)null);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				setParameter((AnnotationParameter)null);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS:
				return actualTargets != null && !actualTargets.isEmpty();
			case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT:
				return next != null;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS:
				return arraySelectors != null && !arraySelectors.isEmpty();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				return annotation != null;
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				return parameter != null;
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
		if (baseClass == NamespaceAwareElement.class)
		{
			switch (derivedFeatureID)
			{
				case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES: return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ArrayInitializationValue.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == LambdaBody.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == Expression.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AnnotationValue.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AssignmentExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == InclusiveOrExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ExclusiveOrExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AndExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == EqualityExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == InstanceOfExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == RelationExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ShiftExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AdditiveExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == UnaryExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == UnaryModificationExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == MethodReferenceExpressionChild.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class)
		{
			switch (derivedFeatureID)
			{
				case AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS: return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == TypedElementExtension.class)
		{
			switch (derivedFeatureID)
			{
				case AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS: return TypesPackage.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS;
				default: return -1;
			}
		}
		if (baseClass == Reference.class)
		{
			switch (derivedFeatureID)
			{
				case AnnotationsPackage.ANNOTATION_INSTANCE__NEXT: return ReferencesPackage.REFERENCE__NEXT;
				case AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS: return ReferencesPackage.REFERENCE__ARRAY_SELECTORS;
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
		if (baseClass == NamespaceAwareElement.class)
		{
			switch (baseFeatureID)
			{
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES: return AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ArrayInitializationValue.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == LambdaBody.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == Expression.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AnnotationValue.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AssignmentExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == InclusiveOrExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ExclusiveOrExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AndExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == EqualityExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == InstanceOfExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == RelationExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ShiftExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == AdditiveExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == UnaryExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == UnaryModificationExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == MethodReferenceExpressionChild.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class)
		{
			switch (baseFeatureID)
			{
				case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return AnnotationsPackage.ANNOTATION_INSTANCE__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == TypedElementExtension.class)
		{
			switch (baseFeatureID)
			{
				case TypesPackage.TYPED_ELEMENT_EXTENSION__ACTUAL_TARGETS: return AnnotationsPackage.ANNOTATION_INSTANCE__ACTUAL_TARGETS;
				default: return -1;
			}
		}
		if (baseClass == Reference.class)
		{
			switch (baseFeatureID)
			{
				case ReferencesPackage.REFERENCE__NEXT: return AnnotationsPackage.ANNOTATION_INSTANCE__NEXT;
				case ReferencesPackage.REFERENCE__ARRAY_SELECTORS: return AnnotationsPackage.ANNOTATION_INSTANCE__ARRAY_SELECTORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (namespaces: ");
		result.append(namespaces);
		result.append(')');
		return result.toString();
	}

} //AnnotationInstanceImpl
