/**
 */
package net.certware.planning.cpn.cpnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Allocation#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Allocation#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Allocation#getTeam <em>Team</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Allocation#getFacility <em>Facility</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getAllocation_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Allocation#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getAllocation_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Allocation#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

  /**
   * Returns the value of the '<em><b>Team</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Team</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team</em>' attribute.
   * @see #setTeam(String)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getAllocation_Team()
   * @model
   * @generated
   */
  String getTeam();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Allocation#getTeam <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Team</em>' attribute.
   * @see #getTeam()
   * @generated
   */
  void setTeam(String value);

  /**
   * Returns the value of the '<em><b>Facility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facility</em>' attribute.
   * @see #setFacility(String)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getAllocation_Facility()
   * @model
   * @generated
   */
  String getFacility();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Allocation#getFacility <em>Facility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facility</em>' attribute.
   * @see #getFacility()
   * @generated
   */
  void setFacility(String value);

} // Allocation
