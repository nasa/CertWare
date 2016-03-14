/**
 */
package ftp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faul Tree Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.FaulTreeSpec#getObservation <em>Observation</em>}</li>
 *   <li>{@link ftp.FaulTreeSpec#getFaultLimit <em>Fault Limit</em>}</li>
 *   <li>{@link ftp.FaulTreeSpec#getFaulttree <em>Faulttree</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getFaulTreeSpec()
 * @model
 * @generated
 */
public interface FaulTreeSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see ftp.FtpPackage#getFaulTreeSpec_Observation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link ftp.FaulTreeSpec#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Fault Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Limit</em>' attribute.
	 * @see #setFaultLimit(int)
	 * @see ftp.FtpPackage#getFaulTreeSpec_FaultLimit()
	 * @model required="true"
	 * @generated
	 */
	int getFaultLimit();

	/**
	 * Sets the value of the '{@link ftp.FaulTreeSpec#getFaultLimit <em>Fault Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Limit</em>' attribute.
	 * @see #getFaultLimit()
	 * @generated
	 */
	void setFaultLimit(int value);

	/**
	 * Returns the value of the '<em><b>Faulttree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faulttree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faulttree</em>' containment reference.
	 * @see #setFaulttree(FaultTree)
	 * @see ftp.FtpPackage#getFaulTreeSpec_Faulttree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FaultTree getFaulttree();

	/**
	 * Sets the value of the '{@link ftp.FaulTreeSpec#getFaulttree <em>Faulttree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faulttree</em>' containment reference.
	 * @see #getFaulttree()
	 * @generated
	 */
	void setFaulttree(FaultTree value);

} // FaulTreeSpec
