/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.TypedPortValue;
import ftp.VisualPort;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VisualPortImpl extends PortImpl implements VisualPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.VISUAL_PORT;
	}
	
	public TypedPortValue newPortValue() {
		return (TypedPortValue) new VisualValueImpl();
	}

} //VisualPortImpl
