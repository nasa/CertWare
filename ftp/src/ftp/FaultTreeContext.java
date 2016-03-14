/**
 */
package ftp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Tree Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.FaultTreeContext#getComposition <em>Composition</em>}</li>
 *   <li>{@link ftp.FaultTreeContext#getObservations <em>Observations</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getFaultTreeContext()
 * @model
 * @generated
 */
public interface FaultTreeContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(ComposedComponent)
	 * @see ftp.FtpPackage#getFaultTreeContext_Composition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComposedComponent getComposition();

	/**
	 * Sets the value of the '{@link ftp.FaultTreeContext#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(ComposedComponent value);

	/**
	 * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
	 * The list contents are of type {@link ftp.Observation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' containment reference list.
	 * @see ftp.FtpPackage#getFaultTreeContext_Observations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observation> getObservations();

} // FaultTreeContext
