/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.pattern.impl;

import java.util.Collection;

import net.certware.argument.arm.Argument;

import net.certware.argument.pattern.Participant;
import net.certware.argument.pattern.Pattern;
import net.certware.argument.pattern.PatternPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link net.certware.argument.pattern.impl.PatternImpl#getRelatedPatterns <em>Related Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends EObjectImpl implements Pattern {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntent() <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected String intent = INTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected String motivation = MOTIVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Argument structure;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The default value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected String applicability = APPLICABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsequences() <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSEQUENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected String consequences = CONSEQUENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedPatterns() <em>Related Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> relatedPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(String newIntent) {
		String oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__INTENT, oldIntent, intent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotivation() {
		return motivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotivation(String newMotivation) {
		String oldMotivation = motivation;
		motivation = newMotivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__MOTIVATION, oldMotivation, motivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getStructure() {
		if (structure != null && structure.eIsProxy()) {
			InternalEObject oldStructure = (InternalEObject)structure;
			structure = (Argument)eResolveProxy(oldStructure);
			if (structure != oldStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PATTERN__STRUCTURE, oldStructure, structure));
			}
		}
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Argument newStructure) {
		Argument oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__STRUCTURE, oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, PatternPackage.PATTERN__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicability() {
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicability(String newApplicability) {
		String oldApplicability = applicability;
		applicability = newApplicability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__APPLICABILITY, oldApplicability, applicability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsequences() {
		return consequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequences(String newConsequences) {
		String oldConsequences = consequences;
		consequences = newConsequences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__CONSEQUENCES, oldConsequences, consequences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getRelatedPatterns() {
		if (relatedPatterns == null) {
			relatedPatterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, PatternPackage.PATTERN__RELATED_PATTERNS);
		}
		return relatedPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.PATTERN__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case PatternPackage.PATTERN__RELATED_PATTERNS:
				return ((InternalEList<?>)getRelatedPatterns()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.PATTERN__NAME:
				return getName();
			case PatternPackage.PATTERN__AUTHOR:
				return getAuthor();
			case PatternPackage.PATTERN__VERSION:
				return getVersion();
			case PatternPackage.PATTERN__INTENT:
				return getIntent();
			case PatternPackage.PATTERN__MOTIVATION:
				return getMotivation();
			case PatternPackage.PATTERN__STRUCTURE:
				if (resolve) return getStructure();
				return basicGetStructure();
			case PatternPackage.PATTERN__PARTICIPANTS:
				return getParticipants();
			case PatternPackage.PATTERN__APPLICABILITY:
				return getApplicability();
			case PatternPackage.PATTERN__CONSEQUENCES:
				return getConsequences();
			case PatternPackage.PATTERN__IMPLEMENTATION:
				return getImplementation();
			case PatternPackage.PATTERN__RELATED_PATTERNS:
				return getRelatedPatterns();
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
			case PatternPackage.PATTERN__NAME:
				setName((String)newValue);
				return;
			case PatternPackage.PATTERN__AUTHOR:
				setAuthor((String)newValue);
				return;
			case PatternPackage.PATTERN__VERSION:
				setVersion((String)newValue);
				return;
			case PatternPackage.PATTERN__INTENT:
				setIntent((String)newValue);
				return;
			case PatternPackage.PATTERN__MOTIVATION:
				setMotivation((String)newValue);
				return;
			case PatternPackage.PATTERN__STRUCTURE:
				setStructure((Argument)newValue);
				return;
			case PatternPackage.PATTERN__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case PatternPackage.PATTERN__APPLICABILITY:
				setApplicability((String)newValue);
				return;
			case PatternPackage.PATTERN__CONSEQUENCES:
				setConsequences((String)newValue);
				return;
			case PatternPackage.PATTERN__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case PatternPackage.PATTERN__RELATED_PATTERNS:
				getRelatedPatterns().clear();
				getRelatedPatterns().addAll((Collection<? extends Pattern>)newValue);
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
			case PatternPackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternPackage.PATTERN__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case PatternPackage.PATTERN__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PatternPackage.PATTERN__INTENT:
				setIntent(INTENT_EDEFAULT);
				return;
			case PatternPackage.PATTERN__MOTIVATION:
				setMotivation(MOTIVATION_EDEFAULT);
				return;
			case PatternPackage.PATTERN__STRUCTURE:
				setStructure((Argument)null);
				return;
			case PatternPackage.PATTERN__PARTICIPANTS:
				getParticipants().clear();
				return;
			case PatternPackage.PATTERN__APPLICABILITY:
				setApplicability(APPLICABILITY_EDEFAULT);
				return;
			case PatternPackage.PATTERN__CONSEQUENCES:
				setConsequences(CONSEQUENCES_EDEFAULT);
				return;
			case PatternPackage.PATTERN__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case PatternPackage.PATTERN__RELATED_PATTERNS:
				getRelatedPatterns().clear();
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
			case PatternPackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternPackage.PATTERN__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case PatternPackage.PATTERN__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PatternPackage.PATTERN__INTENT:
				return INTENT_EDEFAULT == null ? intent != null : !INTENT_EDEFAULT.equals(intent);
			case PatternPackage.PATTERN__MOTIVATION:
				return MOTIVATION_EDEFAULT == null ? motivation != null : !MOTIVATION_EDEFAULT.equals(motivation);
			case PatternPackage.PATTERN__STRUCTURE:
				return structure != null;
			case PatternPackage.PATTERN__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case PatternPackage.PATTERN__APPLICABILITY:
				return APPLICABILITY_EDEFAULT == null ? applicability != null : !APPLICABILITY_EDEFAULT.equals(applicability);
			case PatternPackage.PATTERN__CONSEQUENCES:
				return CONSEQUENCES_EDEFAULT == null ? consequences != null : !CONSEQUENCES_EDEFAULT.equals(consequences);
			case PatternPackage.PATTERN__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
			case PatternPackage.PATTERN__RELATED_PATTERNS:
				return relatedPatterns != null && !relatedPatterns.isEmpty();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", author: "); //$NON-NLS-1$
		result.append(author);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(", intent: "); //$NON-NLS-1$
		result.append(intent);
		result.append(", motivation: "); //$NON-NLS-1$
		result.append(motivation);
		result.append(", applicability: "); //$NON-NLS-1$
		result.append(applicability);
		result.append(", consequences: "); //$NON-NLS-1$
		result.append(consequences);
		result.append(", implementation: "); //$NON-NLS-1$
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //PatternImpl
