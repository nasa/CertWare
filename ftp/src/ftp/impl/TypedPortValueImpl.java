/**
 */
package ftp.impl;

import ftp.ElectricalValue;
import ftp.FloatValue;
import ftp.FtpPackage;
import ftp.HydraulicValue;
import ftp.SignalValue;
import ftp.SignalValues;
import ftp.TypedPortValue;
import ftp.VisualValue;
import ftp.VisualValues;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Port Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypedPortValueImpl extends MinimalEObjectImpl.Container implements TypedPortValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedPortValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.TYPED_PORT_VALUE;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		toBuffer(sb);
		return sb.toString();
	}

	public void toBuffer(StringBuffer sb) {
		if (this instanceof SignalValue) {
			SignalValue sv = (SignalValue)this;
			switch (sv.getSignal().getValue()) {
				case SignalValues.ON_VALUE: {
					sb.append("signal(1)");
					break;
				}
				case SignalValues.OFF_VALUE: {
					sb.append("signal(0)");
					break;
				}
				case SignalValues.ANY_VALUE: {
					sb.append("_");
					break;
				}
			}
		}
		else if (this instanceof ElectricalValue) {
			ElectricalValue ev = (ElectricalValue)this;
			sb.append("electrical(");
			if (ev.isAnyVoltage())
				sb.append("_");
			else
				sb.append(ev.getVoltage());
			sb.append(",");
			if (ev.isAnyCurrent()) 
				sb.append("_");
			else
				sb.append(ev.getCurrent());
			sb.append(")");		
		}
		else if (this instanceof VisualValue) {
			VisualValue vv = (VisualValue)this;
			switch (vv.getBulb().getValue()) {
				case VisualValues.DARK_VALUE: {
					sb.append("visual(dark)");
					break;
				}
				case VisualValues.LIGHT_VALUE: {
					sb.append("visual(light)");
					break;
				}
				case VisualValues.ANY_VALUE: {
					sb.append("_");
					break;
				}
			}
		}
		else if (this instanceof HydraulicValue) {
			HydraulicValue hv = (HydraulicValue)this;
			sb.append("hydraulic(");
			if (hv.isAnyPressure())
				sb.append("_");
			else
				sb.append(hv.getPressure());
			sb.append(",");
			if (hv.isAnyFlow()) 
				sb.append("_");
			else
				sb.append(hv.getFlow());
			sb.append(")");
		}
		else if (this instanceof FloatValue) {
			FloatValue fv = (FloatValue)this;
			sb.append(fv.getValue());
			
		}
		else sb.append("_");
	}
	
} //TypedPortValueImpl
