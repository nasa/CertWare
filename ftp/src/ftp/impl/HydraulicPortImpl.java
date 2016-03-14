/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.HydraulicPort;
import ftp.TypedPortValue;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydraulic Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HydraulicPortImpl extends PortImpl implements HydraulicPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.HYDRAULIC_PORT;
	}

	public TypedPortValue newPortValue() {
		return (TypedPortValue) new HydraulicValueImpl();
	}

} //HydraulicPortImpl
