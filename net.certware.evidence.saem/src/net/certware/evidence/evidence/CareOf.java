/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.CareOf#getCurator <em>Curator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getCareOf()
 * @model
 * @generated
 */
public interface CareOf extends CustodyProperty {
	/**
	 * Returns the value of the '<em><b>Curator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curator</em>' reference.
	 * @see #setCurator(Person)
	 * @see net.certware.evidence.evidence.EvidencePackage#getCareOf_Curator()
	 * @model required="true"
	 * @generated
	 */
	Person getCurator();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.CareOf#getCurator <em>Curator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curator</em>' reference.
	 * @see #getCurator()
	 * @generated
	 */
	void setCurator(Person value);

} // CareOf
