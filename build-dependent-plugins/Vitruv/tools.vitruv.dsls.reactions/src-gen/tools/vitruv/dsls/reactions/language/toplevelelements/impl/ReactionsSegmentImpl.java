/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.vitruv.dsls.common.elements.DomainReference;

import tools.vitruv.dsls.reactions.language.toplevelelements.Reaction;
import tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsImport;
import tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment;
import tools.vitruv.dsls.reactions.language.toplevelelements.Routine;
import tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reactions Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl#getFromDomain <em>From Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl#getToDomain <em>To Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl#getReactionsImports <em>Reactions Imports</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.ReactionsSegmentImpl#getRoutines <em>Routines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionsSegmentImpl extends MinimalEObjectImpl.Container implements ReactionsSegment
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromDomain() <em>From Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainReference fromDomain;

	/**
	 * The cached value of the '{@link #getToDomain() <em>To Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainReference toDomain;

	/**
	 * The cached value of the '{@link #getReactionsImports() <em>Reactions Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactionsImport> reactionsImports;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reaction> reactions;

	/**
	 * The cached value of the '{@link #getRoutines() <em>Routines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutines()
	 * @generated
	 * @ordered
	 */
	protected EList<Routine> routines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionsSegmentImpl()
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
		return TopLevelElementsPackage.Literals.REACTIONS_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.REACTIONS_SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainReference getFromDomain()
	{
		return fromDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDomain(DomainReference newFromDomain, NotificationChain msgs)
	{
		DomainReference oldFromDomain = fromDomain;
		fromDomain = newFromDomain;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN, oldFromDomain, newFromDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDomain(DomainReference newFromDomain)
	{
		if (newFromDomain != fromDomain)
		{
			NotificationChain msgs = null;
			if (fromDomain != null)
				msgs = ((InternalEObject)fromDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN, null, msgs);
			if (newFromDomain != null)
				msgs = ((InternalEObject)newFromDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN, null, msgs);
			msgs = basicSetFromDomain(newFromDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN, newFromDomain, newFromDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainReference getToDomain()
	{
		return toDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDomain(DomainReference newToDomain, NotificationChain msgs)
	{
		DomainReference oldToDomain = toDomain;
		toDomain = newToDomain;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN, oldToDomain, newToDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDomain(DomainReference newToDomain)
	{
		if (newToDomain != toDomain)
		{
			NotificationChain msgs = null;
			if (toDomain != null)
				msgs = ((InternalEObject)toDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN, null, msgs);
			if (newToDomain != null)
				msgs = ((InternalEObject)newToDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN, null, msgs);
			msgs = basicSetToDomain(newToDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN, newToDomain, newToDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionsImport> getReactionsImports()
	{
		if (reactionsImports == null)
		{
			reactionsImports = new EObjectContainmentEList<ReactionsImport>(ReactionsImport.class, this, TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS_IMPORTS);
		}
		return reactionsImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reaction> getReactions()
	{
		if (reactions == null)
		{
			reactions = new EObjectContainmentWithInverseEList<Reaction>(Reaction.class, this, TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS, TopLevelElementsPackage.REACTION__REACTIONS_SEGMENT);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Routine> getRoutines()
	{
		if (routines == null)
		{
			routines = new EObjectContainmentWithInverseEList<Routine>(Routine.class, this, TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES, TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT);
		}
		return routines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReactions()).basicAdd(otherEnd, msgs);
			case TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoutines()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN:
				return basicSetFromDomain(null, msgs);
			case TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN:
				return basicSetToDomain(null, msgs);
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS_IMPORTS:
				return ((InternalEList<?>)getReactionsImports()).basicRemove(otherEnd, msgs);
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
			case TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES:
				return ((InternalEList<?>)getRoutines()).basicRemove(otherEnd, msgs);
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
			case TopLevelElementsPackage.REACTIONS_SEGMENT__NAME:
				return getName();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN:
				return getFromDomain();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN:
				return getToDomain();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS_IMPORTS:
				return getReactionsImports();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS:
				return getReactions();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES:
				return getRoutines();
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
			case TopLevelElementsPackage.REACTIONS_SEGMENT__NAME:
				setName((String)newValue);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN:
				setFromDomain((DomainReference)newValue);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN:
				setToDomain((DomainReference)newValue);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS_IMPORTS:
				getReactionsImports().clear();
				getReactionsImports().addAll((Collection<? extends ReactionsImport>)newValue);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS:
				getReactions().clear();
				getReactions().addAll((Collection<? extends Reaction>)newValue);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES:
				getRoutines().clear();
				getRoutines().addAll((Collection<? extends Routine>)newValue);
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
			case TopLevelElementsPackage.REACTIONS_SEGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN:
				setFromDomain((DomainReference)null);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN:
				setToDomain((DomainReference)null);
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS_IMPORTS:
				getReactionsImports().clear();
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS:
				getReactions().clear();
				return;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES:
				getRoutines().clear();
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
			case TopLevelElementsPackage.REACTIONS_SEGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopLevelElementsPackage.REACTIONS_SEGMENT__FROM_DOMAIN:
				return fromDomain != null;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__TO_DOMAIN:
				return toDomain != null;
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS_IMPORTS:
				return reactionsImports != null && !reactionsImports.isEmpty();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__REACTIONS:
				return reactions != null && !reactions.isEmpty();
			case TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES:
				return routines != null && !routines.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReactionsSegmentImpl
