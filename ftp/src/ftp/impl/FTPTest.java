package ftp.impl;

import org.eclipse.emf.common.util.EList;

import ftp.ComposedComponent;
import ftp.CompositionElement;
import ftp.DigitalBattery;
import ftp.DigitalLamp;
import ftp.DigitalSwitch;
import ftp.FaultTree;
import ftp.Observation;
import ftp.PortValue;
import ftp.SignalConnection;
import ftp.SignalPort;
import ftp.SignalValue;
import ftp.SignalValues;
import ftp.TypedPortValue;
import ftp.VisualPort;
import ftp.VisualValue;
import ftp.VisualValues;

public class FTPTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Build circuit4761A components in Java
		ComposedComponent circuit = new ComposedComponentImpl();
		circuit.setType("digital_circuit_4761A");
		
		SignalPort pSW1 = new SignalPortImpl();
		pSW1.setType("Switch1");
		circuit.getPorts().add(pSW1);
		
		SignalPort pSW2 = new SignalPortImpl();
		pSW2.setType("Switch2");
		circuit.getPorts().add(pSW2);
		
		VisualPort pObs = new VisualPortImpl();
		pObs.setType("Bulb");
		circuit.getPorts().add(pObs);
		
		EList<CompositionElement> graph = circuit.getComposition();
		
		DigitalSwitch sw1 = new DigitalSwitchImpl();
		DigitalSwitch sw2 = new DigitalSwitchImpl();
		DigitalLamp lamp = new DigitalLampImpl();
		DigitalBattery battery = new DigitalBatteryImpl();
		
		SignalConnection edge1 = new SignalConnectionImpl();
		edge1.setFromPort(battery.getOutPort());
		edge1.setToPort(sw1.getInPort());
		
		SignalConnection edge2 = new SignalConnectionImpl();
		edge2.setFromPort(battery.getOutPort());
		edge2.setToPort(sw2.getInPort());
		
		SignalConnection edge3 = new SignalConnectionImpl();
		edge3.setFromPort(sw1.getOutPort());
		edge3.setToPort(lamp.getInPort());
		
		SignalConnection edge4 = new SignalConnectionImpl();
		edge4.setFromPort(sw2.getOutPort());
		edge4.setToPort(lamp.getInPort());
				
		SignalConnection edge5 = new SignalConnectionImpl();
		edge5.setFromPort(pSW1);
		edge5.setToPort(sw1.getSetPort());
				
		SignalConnection edge6 = new SignalConnectionImpl();
		edge6.setFromPort(pSW2);
		edge6.setToPort(sw2.getSetPort());
				
		SignalConnection edge7 = new SignalConnectionImpl();
		edge7.setFromPort(lamp.getLightPort());
		edge7.setToPort(pObs);
				
		graph.add(sw1);
		graph.add(sw2);
		graph.add(lamp);
		graph.add(battery);
		graph.add(edge1);
		graph.add(edge2);
		graph.add(edge3);
		graph.add(edge4);
		graph.add(edge5);
		graph.add(edge6);
		graph.add(edge7);
		
		// embed in an Observation
		Observation obs = new ObservationImpl();
		obs.setComponent(circuit);
		
		PortValue pv = new PortValueImpl();
		SignalValue sv = new SignalValueImpl();
		sv.setSignal(SignalValues.ON);
		pv.setValue((TypedPortValue) sv);
		pv.setPort(circuit.getPorts().get(0));
		obs.getPortValues().add(pv);
		
		pv = new PortValueImpl();
		sv = new SignalValueImpl();
		sv.setSignal(SignalValues.ON);
		pv.setValue((TypedPortValue) sv);
		pv.setPort(circuit.getPorts().get(1));
		obs.getPortValues().add(pv);
		
		pv = new PortValueImpl();
		VisualValue ov = new VisualValueImpl();
		ov.setBulb(VisualValues.DARK);
		pv.setValue((TypedPortValue) ov);
		pv.setPort(circuit.getPorts().get(2));
		obs.getPortValues().add(pv);
		
		// getFaultTree()
		FaultTree ft = obs.buildFaultTree();
		
	}

}
