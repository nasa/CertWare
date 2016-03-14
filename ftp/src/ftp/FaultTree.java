/**
 */
package ftp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.FaultTree#getFtnodes <em>Ftnodes</em>}</li>
 *   <li>{@link ftp.FaultTree#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getFaultTree()
 * @model
 * @generated
 */
public interface FaultTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Ftnodes</b></em>' containment reference list.
	 * The list contents are of type {@link ftp.FTNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftnodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftnodes</em>' containment reference list.
	 * @see ftp.FtpPackage#getFaultTree_Ftnodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FTNode> getFtnodes();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(FTNode)
	 * @see ftp.FtpPackage#getFaultTree_Root()
	 * @model required="true"
	 * @generated
	 */
	FTNode getRoot();

	/**
	 * Sets the value of the '{@link ftp.FaultTree#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(FTNode value);

} // FaultTree
