/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.vitruv.dsls.reactions.language.toplevelelements.Matcher;
import tools.vitruv.dsls.reactions.language.toplevelelements.MatcherStatement;
import tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.MatcherImpl#getMatcherStatements <em>Matcher Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatcherImpl extends MinimalEObjectImpl.Container implements Matcher
{
	/**
	 * The cached value of the '{@link #getMatcherStatements() <em>Matcher Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcherStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<MatcherStatement> matcherStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatcherImpl()
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
		return TopLevelElementsPackage.Literals.MATCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatcherStatement> getMatcherStatements()
	{
		if (matcherStatements == null)
		{
			matcherStatements = new EObjectContainmentEList<MatcherStatement>(MatcherStatement.class, this, TopLevelElementsPackage.MATCHER__MATCHER_STATEMENTS);
		}
		return matcherStatements;
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
			case TopLevelElementsPackage.MATCHER__MATCHER_STATEMENTS:
				return ((InternalEList<?>)getMatcherStatements()).basicRemove(otherEnd, msgs);
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
			case TopLevelElementsPackage.MATCHER__MATCHER_STATEMENTS:
				return getMatcherStatements();
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
			case TopLevelElementsPackage.MATCHER__MATCHER_STATEMENTS:
				getMatcherStatements().clear();
				getMatcherStatements().addAll((Collection<? extends MatcherStatement>)newValue);
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
			case TopLevelElementsPackage.MATCHER__MATCHER_STATEMENTS:
				getMatcherStatements().clear();
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
			case TopLevelElementsPackage.MATCHER__MATCHER_STATEMENTS:
				return matcherStatements != null && !matcherStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatcherImpl
