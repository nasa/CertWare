/**
 */
package ftp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.Observation#getComponent <em>Component</em>}</li>
 *   <li>{@link ftp.Observation#getPortValues <em>Port Values</em>}</li>
 *   <li>{@link ftp.Observation#getName <em>Name</em>}</li>
 *   <li>{@link ftp.Observation#getFaultLimit <em>Fault Limit</em>}</li>
 *   <li>{@link ftp.Observation#getFaulttree <em>Faulttree</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see ftp.FtpPackage#getObservation_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link ftp.Observation#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Port Values</b></em>' containment reference list.
	 * The list contents are of type {@link ftp.PortValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Values</em>' containment reference list.
	 * @see ftp.FtpPackage#getObservation_PortValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortValue> getPortValues();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ftp.FtpPackage#getObservation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ftp.Observation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ftp.FtpPackage#getObservation_FaultLimit()
	 * @model
	 * @generated
	 */
	int getFaultLimit();

	/**
	 * Sets the value of the '{@link ftp.Observation#getFaultLimit <em>Fault Limit</em>}' attribute.
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
	 * @see ftp.FtpPackage#getObservation_Faulttree()
	 * @model containment="true"
	 * @generated
	 */
	FaultTree getFaulttree();

	/**
	 * Sets the value of the '{@link ftp.Observation#getFaulttree <em>Faulttree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faulttree</em>' containment reference.
	 * @see #getFaulttree()
	 * @generated
	 */
	void setFaulttree(FaultTree value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	FaultTree buildFaultTree();

} // Observation
