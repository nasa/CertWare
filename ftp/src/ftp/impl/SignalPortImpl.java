/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.SignalPort;
import ftp.TypedPortValue;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SignalPortImpl extends PortImpl implements SignalPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.SIGNAL_PORT;
	}

	public TypedPortValue newPortValue() {
		return (TypedPortValue) new SignalValueImpl();
	}

} //SignalPortImpl
