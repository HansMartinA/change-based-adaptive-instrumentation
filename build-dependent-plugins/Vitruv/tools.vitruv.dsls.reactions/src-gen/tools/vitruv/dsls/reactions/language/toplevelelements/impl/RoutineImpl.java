/**
 */
package tools.vitruv.dsls.reactions.language.toplevelelements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tools.vitruv.dsls.reactions.language.toplevelelements.Action;
import tools.vitruv.dsls.reactions.language.toplevelelements.Matcher;
import tools.vitruv.dsls.reactions.language.toplevelelements.ReactionsSegment;
import tools.vitruv.dsls.reactions.language.toplevelelements.Routine;
import tools.vitruv.dsls.reactions.language.toplevelelements.RoutineInput;
import tools.vitruv.dsls.reactions.language.toplevelelements.RoutineOverrideImportPath;
import tools.vitruv.dsls.reactions.language.toplevelelements.TopLevelElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getOverrideImportPath <em>Override Import Path</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getName <em>Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getInput <em>Input</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getAction <em>Action</em>}</li>
 *   <li>{@link tools.vitruv.dsls.reactions.language.toplevelelements.impl.RoutineImpl#getReactionsSegment <em>Reactions Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutineImpl extends MinimalEObjectImpl.Container implements Routine
{
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverrideImportPath() <em>Override Import Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideImportPath()
	 * @generated
	 * @ordered
	 */
	protected RoutineOverrideImportPath overrideImportPath;

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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected RoutineInput input;

	/**
	 * The cached value of the '{@link #getMatcher() <em>Matcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcher()
	 * @generated
	 * @ordered
	 */
	protected Matcher matcher;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutineImpl()
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
		return TopLevelElementsPackage.Literals.ROUTINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation()
	{
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation)
	{
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineOverrideImportPath getOverrideImportPath()
	{
		return overrideImportPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrideImportPath(RoutineOverrideImportPath newOverrideImportPath, NotificationChain msgs)
	{
		RoutineOverrideImportPath oldOverrideImportPath = overrideImportPath;
		overrideImportPath = newOverrideImportPath;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH, oldOverrideImportPath, newOverrideImportPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideImportPath(RoutineOverrideImportPath newOverrideImportPath)
	{
		if (newOverrideImportPath != overrideImportPath)
		{
			NotificationChain msgs = null;
			if (overrideImportPath != null)
				msgs = ((InternalEObject)overrideImportPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH, null, msgs);
			if (newOverrideImportPath != null)
				msgs = ((InternalEObject)newOverrideImportPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH, null, msgs);
			msgs = basicSetOverrideImportPath(newOverrideImportPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH, newOverrideImportPath, newOverrideImportPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineInput getInput()
	{
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(RoutineInput newInput, NotificationChain msgs)
	{
		RoutineInput oldInput = input;
		input = newInput;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(RoutineInput newInput)
	{
		if (newInput != input)
		{
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matcher getMatcher()
	{
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatcher(Matcher newMatcher, NotificationChain msgs)
	{
		Matcher oldMatcher = matcher;
		matcher = newMatcher;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__MATCHER, oldMatcher, newMatcher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatcher(Matcher newMatcher)
	{
		if (newMatcher != matcher)
		{
			NotificationChain msgs = null;
			if (matcher != null)
				msgs = ((InternalEObject)matcher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__MATCHER, null, msgs);
			if (newMatcher != null)
				msgs = ((InternalEObject)newMatcher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__MATCHER, null, msgs);
			msgs = basicSetMatcher(newMatcher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__MATCHER, newMatcher, newMatcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction()
	{
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
	{
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction)
	{
		if (newAction != action)
		{
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopLevelElementsPackage.ROUTINE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionsSegment getReactionsSegment()
	{
		if (eContainerFeatureID() != TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT) return null;
		return (ReactionsSegment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactionsSegment(ReactionsSegment newReactionsSegment, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newReactionsSegment, TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactionsSegment(ReactionsSegment newReactionsSegment)
	{
		if (newReactionsSegment != eInternalContainer() || (eContainerFeatureID() != TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT && newReactionsSegment != null))
		{
			if (EcoreUtil.isAncestor(this, newReactionsSegment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReactionsSegment != null)
				msgs = ((InternalEObject)newReactionsSegment).eInverseAdd(this, TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES, ReactionsSegment.class, msgs);
			msgs = basicSetReactionsSegment(newReactionsSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT, newReactionsSegment, newReactionsSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReactionsSegment((ReactionsSegment)otherEnd, msgs);
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
			case TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH:
				return basicSetOverrideImportPath(null, msgs);
			case TopLevelElementsPackage.ROUTINE__INPUT:
				return basicSetInput(null, msgs);
			case TopLevelElementsPackage.ROUTINE__MATCHER:
				return basicSetMatcher(null, msgs);
			case TopLevelElementsPackage.ROUTINE__ACTION:
				return basicSetAction(null, msgs);
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				return basicSetReactionsSegment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				return eInternalContainer().eInverseRemove(this, TopLevelElementsPackage.REACTIONS_SEGMENT__ROUTINES, ReactionsSegment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case TopLevelElementsPackage.ROUTINE__DOCUMENTATION:
				return getDocumentation();
			case TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH:
				return getOverrideImportPath();
			case TopLevelElementsPackage.ROUTINE__NAME:
				return getName();
			case TopLevelElementsPackage.ROUTINE__INPUT:
				return getInput();
			case TopLevelElementsPackage.ROUTINE__MATCHER:
				return getMatcher();
			case TopLevelElementsPackage.ROUTINE__ACTION:
				return getAction();
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				return getReactionsSegment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TopLevelElementsPackage.ROUTINE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH:
				setOverrideImportPath((RoutineOverrideImportPath)newValue);
				return;
			case TopLevelElementsPackage.ROUTINE__NAME:
				setName((String)newValue);
				return;
			case TopLevelElementsPackage.ROUTINE__INPUT:
				setInput((RoutineInput)newValue);
				return;
			case TopLevelElementsPackage.ROUTINE__MATCHER:
				setMatcher((Matcher)newValue);
				return;
			case TopLevelElementsPackage.ROUTINE__ACTION:
				setAction((Action)newValue);
				return;
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				setReactionsSegment((ReactionsSegment)newValue);
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
			case TopLevelElementsPackage.ROUTINE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH:
				setOverrideImportPath((RoutineOverrideImportPath)null);
				return;
			case TopLevelElementsPackage.ROUTINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopLevelElementsPackage.ROUTINE__INPUT:
				setInput((RoutineInput)null);
				return;
			case TopLevelElementsPackage.ROUTINE__MATCHER:
				setMatcher((Matcher)null);
				return;
			case TopLevelElementsPackage.ROUTINE__ACTION:
				setAction((Action)null);
				return;
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				setReactionsSegment((ReactionsSegment)null);
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
			case TopLevelElementsPackage.ROUTINE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case TopLevelElementsPackage.ROUTINE__OVERRIDE_IMPORT_PATH:
				return overrideImportPath != null;
			case TopLevelElementsPackage.ROUTINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopLevelElementsPackage.ROUTINE__INPUT:
				return input != null;
			case TopLevelElementsPackage.ROUTINE__MATCHER:
				return matcher != null;
			case TopLevelElementsPackage.ROUTINE__ACTION:
				return action != null;
			case TopLevelElementsPackage.ROUTINE__REACTIONS_SEGMENT:
				return getReactionsSegment() != null;
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoutineImpl
