/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getClaims <em>Claims</em>}</li>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getArguments <em>Arguments</em>}</li>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getContexts <em>Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.ArgumentDiagram#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram()
 * @model annotation="gmf.diagram model.extension='caz' diagram.extension='cazd' onefile='false'"
 * @generated
 */
public interface ArgumentDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.certware.argument.caz.ArgumentDiagram#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Claims</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Claim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claims</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claims</em>' containment reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Claims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Claim> getClaims();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Justifications</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justifications</em>' containment reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Justifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Justification> getJustifications();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgumentDiagram_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

} // ArgumentDiagram
