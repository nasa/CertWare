/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AggregationRule;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Answer;
import net.certware.argument.aml.Belief;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.Evidence;
import net.certware.argument.aml.Witness;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getBelief <em>Belief</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getAggregationRule <em>Aggregation Rule</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AnswerImpl#getQuestionId <em>Question Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerImpl extends EObjectImpl implements Answer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getQuestionId() <em>Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionId() <em>Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionId()
	 * @generated
	 * @ordered
	 */
	protected String questionId = QUESTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AmlPackage.ANSWER__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Belief> getBelief() {
		return getGroup().list(AmlPackage.Literals.ANSWER__BELIEF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Witness> getWitness() {
		return getGroup().list(AmlPackage.Literals.ANSWER__WITNESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRationale() {
		return getGroup().list(AmlPackage.Literals.ANSWER__RATIONALE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		return getGroup().list(AmlPackage.Literals.ANSWER__ANNOTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregationRule> getAggregationRule() {
		return getGroup().list(AmlPackage.Literals.ANSWER__AGGREGATION_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getEvidence() {
		return getGroup().list(AmlPackage.Literals.ANSWER__EVIDENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscoveryMethod> getDiscoveryMethod() {
		return getGroup().list(AmlPackage.Literals.ANSWER__DISCOVERY_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionId(String newQuestionId) {
		String oldQuestionId = questionId;
		questionId = newQuestionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.ANSWER__QUESTION_ID, oldQuestionId, questionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.ANSWER__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AmlPackage.ANSWER__BELIEF:
				return ((InternalEList<?>)getBelief()).basicRemove(otherEnd, msgs);
			case AmlPackage.ANSWER__WITNESS:
				return ((InternalEList<?>)getWitness()).basicRemove(otherEnd, msgs);
			case AmlPackage.ANSWER__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case AmlPackage.ANSWER__AGGREGATION_RULE:
				return ((InternalEList<?>)getAggregationRule()).basicRemove(otherEnd, msgs);
			case AmlPackage.ANSWER__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AmlPackage.ANSWER__DISCOVERY_METHOD:
				return ((InternalEList<?>)getDiscoveryMethod()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.ANSWER__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AmlPackage.ANSWER__BELIEF:
				return getBelief();
			case AmlPackage.ANSWER__WITNESS:
				return getWitness();
			case AmlPackage.ANSWER__RATIONALE:
				return getRationale();
			case AmlPackage.ANSWER__ANNOTATION:
				return getAnnotation();
			case AmlPackage.ANSWER__AGGREGATION_RULE:
				return getAggregationRule();
			case AmlPackage.ANSWER__EVIDENCE:
				return getEvidence();
			case AmlPackage.ANSWER__DISCOVERY_METHOD:
				return getDiscoveryMethod();
			case AmlPackage.ANSWER__QUESTION_ID:
				return getQuestionId();
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
			case AmlPackage.ANSWER__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AmlPackage.ANSWER__BELIEF:
				getBelief().clear();
				getBelief().addAll((Collection<? extends Belief>)newValue);
				return;
			case AmlPackage.ANSWER__WITNESS:
				getWitness().clear();
				getWitness().addAll((Collection<? extends Witness>)newValue);
				return;
			case AmlPackage.ANSWER__RATIONALE:
				getRationale().clear();
				getRationale().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.ANSWER__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.ANSWER__AGGREGATION_RULE:
				getAggregationRule().clear();
				getAggregationRule().addAll((Collection<? extends AggregationRule>)newValue);
				return;
			case AmlPackage.ANSWER__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case AmlPackage.ANSWER__DISCOVERY_METHOD:
				getDiscoveryMethod().clear();
				getDiscoveryMethod().addAll((Collection<? extends DiscoveryMethod>)newValue);
				return;
			case AmlPackage.ANSWER__QUESTION_ID:
				setQuestionId((String)newValue);
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
			case AmlPackage.ANSWER__GROUP:
				getGroup().clear();
				return;
			case AmlPackage.ANSWER__BELIEF:
				getBelief().clear();
				return;
			case AmlPackage.ANSWER__WITNESS:
				getWitness().clear();
				return;
			case AmlPackage.ANSWER__RATIONALE:
				getRationale().clear();
				return;
			case AmlPackage.ANSWER__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.ANSWER__AGGREGATION_RULE:
				getAggregationRule().clear();
				return;
			case AmlPackage.ANSWER__EVIDENCE:
				getEvidence().clear();
				return;
			case AmlPackage.ANSWER__DISCOVERY_METHOD:
				getDiscoveryMethod().clear();
				return;
			case AmlPackage.ANSWER__QUESTION_ID:
				setQuestionId(QUESTION_ID_EDEFAULT);
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
			case AmlPackage.ANSWER__GROUP:
				return group != null && !group.isEmpty();
			case AmlPackage.ANSWER__BELIEF:
				return !getBelief().isEmpty();
			case AmlPackage.ANSWER__WITNESS:
				return !getWitness().isEmpty();
			case AmlPackage.ANSWER__RATIONALE:
				return !getRationale().isEmpty();
			case AmlPackage.ANSWER__ANNOTATION:
				return !getAnnotation().isEmpty();
			case AmlPackage.ANSWER__AGGREGATION_RULE:
				return !getAggregationRule().isEmpty();
			case AmlPackage.ANSWER__EVIDENCE:
				return !getEvidence().isEmpty();
			case AmlPackage.ANSWER__DISCOVERY_METHOD:
				return !getDiscoveryMethod().isEmpty();
			case AmlPackage.ANSWER__QUESTION_ID:
				return QUESTION_ID_EDEFAULT == null ? questionId != null : !QUESTION_ID_EDEFAULT.equals(questionId);
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", questionId: "); //$NON-NLS-1$
		result.append(questionId);
		result.append(')');
		return result.toString();
	}

} //AnswerImpl
