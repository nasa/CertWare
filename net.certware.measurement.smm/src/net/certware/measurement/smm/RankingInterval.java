/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.RankingInterval#getRank <em>Rank</em>}</li>
 *   <li>{@link net.certware.measurement.smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link net.certware.measurement.smm.RankingInterval#isMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link net.certware.measurement.smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link net.certware.measurement.smm.RankingInterval#isMinimumOpen <em>Minimum Open</em>}</li>
 *   <li>{@link net.certware.measurement.smm.RankingInterval#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval()
 * @model
 * @generated
 */
public interface RankingInterval extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Rank</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Ranking#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' container reference.
	 * @see #setRank(Ranking)
	 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval_Rank()
	 * @see net.certware.measurement.smm.Ranking#getInterval
	 * @model opposite="interval" transient="false"
	 * @generated
	 */
	Ranking getRank();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.RankingInterval#getRank <em>Rank</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' container reference.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(Ranking value);

	/**
	 * Returns the value of the '<em><b>Maximum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Endpoint</em>' attribute.
	 * @see #setMaximumEndpoint(double)
	 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval_MaximumEndpoint()
	 * @model required="true"
	 * @generated
	 */
	double getMaximumEndpoint();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Endpoint</em>' attribute.
	 * @see #getMaximumEndpoint()
	 * @generated
	 */
	void setMaximumEndpoint(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Open</em>' attribute.
	 * @see #setMaximumOpen(boolean)
	 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval_MaximumOpen()
	 * @model
	 * @generated
	 */
	boolean isMaximumOpen();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.RankingInterval#isMaximumOpen <em>Maximum Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Open</em>' attribute.
	 * @see #isMaximumOpen()
	 * @generated
	 */
	void setMaximumOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Endpoint</em>' attribute.
	 * @see #setMinimumEndpoint(double)
	 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval_MinimumEndpoint()
	 * @model required="true"
	 * @generated
	 */
	double getMinimumEndpoint();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Endpoint</em>' attribute.
	 * @see #getMinimumEndpoint()
	 * @generated
	 */
	void setMinimumEndpoint(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Open</em>' attribute.
	 * @see #setMinimumOpen(boolean)
	 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval_MinimumOpen()
	 * @model
	 * @generated
	 */
	boolean isMinimumOpen();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.RankingInterval#isMinimumOpen <em>Minimum Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Open</em>' attribute.
	 * @see #isMinimumOpen()
	 * @generated
	 */
	void setMinimumOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see net.certware.measurement.smm.SmmPackage#getRankingInterval_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.RankingInterval#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // RankingInterval
