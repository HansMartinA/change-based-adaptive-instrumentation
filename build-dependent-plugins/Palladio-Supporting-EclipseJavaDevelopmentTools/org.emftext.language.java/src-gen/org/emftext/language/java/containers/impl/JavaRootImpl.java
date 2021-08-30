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
package org.emftext.language.java.containers.impl;

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

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.CommonsPackage;
import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.commons.impl.NamedElementImpl;

import org.emftext.language.java.containers.ContainersPackage;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.containers.Origin;

import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.ImportingElement;
import org.emftext.language.java.imports.ImportsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.impl.JavaRootImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.impl.JavaRootImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.impl.JavaRootImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.impl.JavaRootImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaRootImpl extends NamedElementImpl implements JavaRoot
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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

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
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Origin ORIGIN_EDEFAULT = Origin.FILE;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Origin origin = ORIGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRootImpl()
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
		return ContainersPackage.Literals.JAVA_ROOT;
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
			namespaces = new EDataTypeEList<String>(String.class, this, ContainersPackage.JAVA_ROOT__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList.Resolving<Import>(Import.class, this, ContainersPackage.JAVA_ROOT__IMPORTS);
		}
		return imports;
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
			annotations = new EObjectContainmentEList.Resolving<AnnotationInstance>(AnnotationInstance.class, this, ContainersPackage.JAVA_ROOT__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Origin getOrigin()
	{
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Origin newOrigin)
	{
		Origin oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.JAVA_ROOT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcreteClassifier> getClassifiersInSamePackage()
	{
		return org.emftext.language.java.extensions.containers.JavaRootExtension.getClassifiersInSamePackage((org.emftext.language.java.containers.JavaRoot) this);
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
			case ContainersPackage.JAVA_ROOT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case ContainersPackage.JAVA_ROOT__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				return getNamespaces();
			case ContainersPackage.JAVA_ROOT__IMPORTS:
				return getImports();
			case ContainersPackage.JAVA_ROOT__ANNOTATIONS:
				return getAnnotations();
			case ContainersPackage.JAVA_ROOT__ORIGIN:
				return getOrigin();
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case ContainersPackage.JAVA_ROOT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case ContainersPackage.JAVA_ROOT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case ContainersPackage.JAVA_ROOT__ORIGIN:
				setOrigin((Origin)newValue);
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				getNamespaces().clear();
				return;
			case ContainersPackage.JAVA_ROOT__IMPORTS:
				getImports().clear();
				return;
			case ContainersPackage.JAVA_ROOT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ContainersPackage.JAVA_ROOT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case ContainersPackage.JAVA_ROOT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ContainersPackage.JAVA_ROOT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ContainersPackage.JAVA_ROOT__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
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
				case ContainersPackage.JAVA_ROOT__NAMESPACES: return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ImportingElement.class)
		{
			switch (derivedFeatureID)
			{
				case ContainersPackage.JAVA_ROOT__IMPORTS: return ImportsPackage.IMPORTING_ELEMENT__IMPORTS;
				default: return -1;
			}
		}
		if (baseClass == Annotable.class)
		{
			switch (derivedFeatureID)
			{
				case ContainersPackage.JAVA_ROOT__ANNOTATIONS: return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
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
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES: return ContainersPackage.JAVA_ROOT__NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ImportingElement.class)
		{
			switch (baseFeatureID)
			{
				case ImportsPackage.IMPORTING_ELEMENT__IMPORTS: return ContainersPackage.JAVA_ROOT__IMPORTS;
				default: return -1;
			}
		}
		if (baseClass == Annotable.class)
		{
			switch (baseFeatureID)
			{
				case AnnotationsPackage.ANNOTABLE__ANNOTATIONS: return ContainersPackage.JAVA_ROOT__ANNOTATIONS;
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
		result.append(", origin: ");
		result.append(origin);
		result.append(')');
		return result.toString();
	}

} //JavaRootImpl
