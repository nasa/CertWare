/**
 */
package ftp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.ComposedComponent#getComposition <em>Composition</em>}</li>
 *   <li>{@link ftp.ComposedComponent#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getComposedComponent()
 * @model
 * @generated
 */
public interface ComposedComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link ftp.CompositionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see ftp.FtpPackage#getComposedComponent_Composition()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionElement> getComposition();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ftp.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see ftp.FtpPackage#getComposedComponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // ComposedComponent
