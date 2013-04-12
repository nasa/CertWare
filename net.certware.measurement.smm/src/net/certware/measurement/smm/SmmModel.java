/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.SmmModel#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getSmmModel()
 * @model
 * @generated
 */
public interface SmmModel extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.SmmElement}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.SmmElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getSmmModel_ModelElement()
	 * @see net.certware.measurement.smm.SmmElement#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<SmmElement> getModelElement();

} // SmmModel
