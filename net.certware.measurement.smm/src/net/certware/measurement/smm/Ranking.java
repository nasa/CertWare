/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.Ranking#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getRanking()
 * @model
 * @generated
 */
public interface Ranking extends Measure {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.RankingInterval}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.RankingInterval#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getRanking_Interval()
	 * @see net.certware.measurement.smm.RankingInterval#getRank
	 * @model opposite="rank" containment="true" required="true"
	 * @generated
	 */
	EList<RankingInterval> getInterval();

} // Ranking
