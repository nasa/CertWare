/**
 */
package ftp.impl;

import ftp.ElectricalPort;
import ftp.FtpPackage;
import ftp.TypedPortValue;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ElectricalPortImpl extends PortImpl implements ElectricalPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.ELECTRICAL_PORT;
	}

	public TypedPortValue newPortValue() {
		return (TypedPortValue) new ElectricalValueImpl();
	}

} //ElectricalPortImpl
