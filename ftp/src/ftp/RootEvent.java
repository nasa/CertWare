/**
 */
package ftp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.RootEvent#getObservation <em>Observation</em>}</li>
 *   <li>{@link ftp.RootEvent#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getRootEvent()
 * @model
 * @generated
 */
public interface RootEvent extends FTNode {
	/**
	 * Returns the value of the '<em><b>Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' attribute.
	 * @see #setObservation(String)
	 * @see ftp.FtpPackage#getRootEvent_Observation()
	 * @model required="true"
	 * @generated
	 */
	String getObservation();

	/**
	 * Sets the value of the '{@link ftp.RootEvent#getObservation <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' attribute.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link ftp.FTNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see ftp.FtpPackage#getRootEvent_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<FTNode> getInputs();

} // RootEvent
