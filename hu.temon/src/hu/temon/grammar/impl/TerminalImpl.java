/**
 */
package hu.temon.grammar.impl;

import hu.temon.grammar.GrammarPackage;
import hu.temon.grammar.Replace;
import hu.temon.grammar.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#isHide <em>Hide</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#getConvertFrom <em>Convert From</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#getConvertTo <em>Convert To</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.TerminalImpl#getSuperTerminal <em>Super Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal {
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
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected boolean hide = HIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConvertFrom() <em>Convert From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Replace> convertFrom;

	/**
	 * The cached value of the '{@link #getConvertTo() <em>Convert To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Replace> convertTo;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperTerminal() <em>Super Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal superTerminal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(String newRegex) {
		String oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHide() {
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHide(boolean newHide) {
		boolean oldHide = hide;
		hide = newHide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__HIDE, oldHide, hide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replace> getConvertFrom() {
		if (convertFrom == null) {
			convertFrom = new EObjectContainmentEList<Replace>(Replace.class, this, GrammarPackage.TERMINAL__CONVERT_FROM);
		}
		return convertFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replace> getConvertTo() {
		if (convertTo == null) {
			convertTo = new EObjectContainmentEList<Replace>(Replace.class, this, GrammarPackage.TERMINAL__CONVERT_TO);
		}
		return convertTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getSuperTerminal() {
		if (superTerminal != null && superTerminal.eIsProxy()) {
			InternalEObject oldSuperTerminal = (InternalEObject)superTerminal;
			superTerminal = (Terminal)eResolveProxy(oldSuperTerminal);
			if (superTerminal != oldSuperTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.TERMINAL__SUPER_TERMINAL, oldSuperTerminal, superTerminal));
			}
		}
		return superTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetSuperTerminal() {
		return superTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperTerminal(Terminal newSuperTerminal) {
		Terminal oldSuperTerminal = superTerminal;
		superTerminal = newSuperTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__SUPER_TERMINAL, oldSuperTerminal, superTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.TERMINAL__CONVERT_FROM:
				return ((InternalEList<?>)getConvertFrom()).basicRemove(otherEnd, msgs);
			case GrammarPackage.TERMINAL__CONVERT_TO:
				return ((InternalEList<?>)getConvertTo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.TERMINAL__NAME:
				return getName();
			case GrammarPackage.TERMINAL__REGEX:
				return getRegex();
			case GrammarPackage.TERMINAL__HIDE:
				return isHide();
			case GrammarPackage.TERMINAL__CONVERT_FROM:
				return getConvertFrom();
			case GrammarPackage.TERMINAL__CONVERT_TO:
				return getConvertTo();
			case GrammarPackage.TERMINAL__PRIORITY:
				return getPriority();
			case GrammarPackage.TERMINAL__SUPER_TERMINAL:
				if (resolve) return getSuperTerminal();
				return basicGetSuperTerminal();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrammarPackage.TERMINAL__NAME:
				setName((String)newValue);
				return;
			case GrammarPackage.TERMINAL__REGEX:
				setRegex((String)newValue);
				return;
			case GrammarPackage.TERMINAL__HIDE:
				setHide((Boolean)newValue);
				return;
			case GrammarPackage.TERMINAL__CONVERT_FROM:
				getConvertFrom().clear();
				getConvertFrom().addAll((Collection<? extends Replace>)newValue);
				return;
			case GrammarPackage.TERMINAL__CONVERT_TO:
				getConvertTo().clear();
				getConvertTo().addAll((Collection<? extends Replace>)newValue);
				return;
			case GrammarPackage.TERMINAL__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case GrammarPackage.TERMINAL__SUPER_TERMINAL:
				setSuperTerminal((Terminal)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrammarPackage.TERMINAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__REGEX:
				setRegex(REGEX_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__HIDE:
				setHide(HIDE_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__CONVERT_FROM:
				getConvertFrom().clear();
				return;
			case GrammarPackage.TERMINAL__CONVERT_TO:
				getConvertTo().clear();
				return;
			case GrammarPackage.TERMINAL__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__SUPER_TERMINAL:
				setSuperTerminal((Terminal)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrammarPackage.TERMINAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrammarPackage.TERMINAL__REGEX:
				return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
			case GrammarPackage.TERMINAL__HIDE:
				return hide != HIDE_EDEFAULT;
			case GrammarPackage.TERMINAL__CONVERT_FROM:
				return convertFrom != null && !convertFrom.isEmpty();
			case GrammarPackage.TERMINAL__CONVERT_TO:
				return convertTo != null && !convertTo.isEmpty();
			case GrammarPackage.TERMINAL__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case GrammarPackage.TERMINAL__SUPER_TERMINAL:
				return superTerminal != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", regex: ");
		result.append(regex);
		result.append(", hide: ");
		result.append(hide);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl
