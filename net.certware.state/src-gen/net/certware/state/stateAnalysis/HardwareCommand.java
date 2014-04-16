/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareCommand#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareCommand#getController <em>Controller</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareCommand#getAdapter <em>Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareCommand()
 * @model
 * @generated
 */
public interface HardwareCommand extends EObject
{
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareCommand#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controller</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' reference.
   * @see #setController(Controller)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareCommand_Controller()
   * @model
   * @generated
   */
  Controller getController();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareCommand#getController <em>Controller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller</em>' reference.
   * @see #getController()
   * @generated
   */
  void setController(Controller value);

  /**
   * Returns the value of the '<em><b>Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapter</em>' reference.
   * @see #setAdapter(HardwareAdapter)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareCommand_Adapter()
   * @model
   * @generated
   */
  HardwareAdapter getAdapter();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareCommand#getAdapter <em>Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adapter</em>' reference.
   * @see #getAdapter()
   * @generated
   */
  void setAdapter(HardwareAdapter value);

} // HardwareCommand
