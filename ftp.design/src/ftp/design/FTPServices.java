package ftp.design;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.cs3.prolog.connector.Connector;
import org.cs3.prolog.connector.process.PrologProcess;
import org.cs3.prolog.connector.process.PrologProcessException;
import org.eclipse.emf.common.util.EList;

import ftp.AndGate;
import ftp.FTNode;
import ftp.Fault;
import ftp.FaultTree;
import ftp.FtpFactory;
import ftp.FtpPackage;
import ftp.Observation;
import ftp.OrGate;
import ftp.Port;
import ftp.PortValue;
import ftp.RootEvent;
import ftp.impl.Predicate;

public class FTPServices {

	public FaultTree deriveFaultTree(Observation obs) {
		if (obs.getComponent() == null || 
			obs.getPortValues() == null || 
			(obs.getPortValues() != null && obs.getPortValues().isEmpty())) {
			return null;
		}
		
		StringBuffer query = new StringBuffer();
		query.append("use_module(library(clpr)),");
					// NEED TO RELATIVIZE THIS REFERENCE ...
		//*************************************************************		
		query.append("consult('/Users/Mac/workspace-prolog/FTA/CertWare/fault_trees.pl'),");
		//*************************************************************		
		
		// assert all of the predicate definitions
		List<Predicate> preds = obs.getComponent().translateToLogic();
		for (Predicate p : preds) {
			List<String> clauses = p.clauses;
			for (String c : clauses) {
				query.append("assertz(" + c + "),");
			}
		}
		
		//translate PortValues to min_fault_tree query
		query.append("min_fault_tree(");
		query.append(obs.getComponent().getType() + "(");
		List<Port> ports = obs.getComponent().retrievePorts();
		EList<PortValue> pvs = obs.getPortValues();
		int number_of_args = 0;
		for (Port p : ports) {
			if (number_of_args > 0)
				query.append(",");
			boolean found = false;
			for (PortValue pv : pvs) {
				if (pv.getPort().equals(p)) {
					query.append(pv.getValue());
					found = true;
					break;
				}
			}
			if (!found) {
				query.append("_");
			}
			number_of_args++;
		}
		query.append(",State),State,Tree).");
		
		// execute query in a Prolog process
		Map<String, Object> result = null;
		PrologProcess prolog = null;
		try {
			// NEED TO PARAMATERIZE THE SWIPL EXECUTABLE ...
			//*************************************************************		
			prolog = Connector.newPrologProcess("/applications/swi-prolog.app/contents/macos/swipl");
			//*************************************************************		
			result = prolog.queryOnce(query.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrologProcessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				prolog.stop();
			} catch (PrologProcessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		  // Initialize the model
	    FtpPackage.eINSTANCE.eClass();
	    // Retrieve the default factory singleton
	    FtpFactory factory = FtpFactory.eINSTANCE;

		// build the root event
		RootEvent root = factory.createRootEvent();
		StringBuffer sb = new StringBuffer();
		
		if (result == null) {
			sb.append("NO FAULT STATES ARE COMPATIBLE WITH ");
		}
		sb.append(obs.getComponent().getType());
		sb.append(':');
		for (PortValue pv : pvs) {
			sb.append(' ');
			sb.append(pv.getPort().getType());
			sb.append(" = ");
			sb.append(pv.getValue());
			sb.append(',');
		}
		sb.deleteCharAt(sb.length()-1);
		root.setObservation(sb.toString());
		
		FaultTree ft = factory.createFaultTree();
		ft.getFtnodes().add(root);
		ft.setRoot(root);
		
		if (result != null) {		
			// parse Prolog string building Java objects
			String term = new String(result.get("Tree").toString());
			SubTree subtree = buildSubTree(term, 0, factory, ft);
			root.getInputs().add(subtree.faultTree);
		}
		return ft;	
	}
	
	private SubTree buildSubTree(String root, int start, FtpFactory factory, FaultTree ft) {
		
		int next;
		FTNode ftnode;
		EList<FTNode> inputs;
		
		if (root.indexOf("or",start) == start) {
			OrGate or = factory.createOrGate();
			inputs = or.getInputs();
			ftnode = or;
			next = start+3;
		}
		else if (root.indexOf("and",start) == start) {
			AndGate and = factory.createAndGate();
			inputs = and.getInputs();
			ftnode = and;
			next = start+4;
		}
		else if (root.indexOf("fault",start) == start) {
			Fault fault = factory.createFault();
			int begin = start+7; // start after opening "fault('"
			int end = root.indexOf('\'', begin); 
			fault.setDescription(root.substring(begin, end));
			ft.getFtnodes().add(fault);
			return new SubTree(fault,end+2); // after "')"
		}
		else
			return null;
		
		while (root.charAt(next) != ')') {
			if (root.charAt(next) == ',')
				next++;
			SubTree st = buildSubTree(root, next, factory, ft);
			inputs.add(st.faultTree);
			next = st.next;
		}
		ft.getFtnodes().add(ftnode);
		return new SubTree(ftnode,next+1);

	}
	
	private class SubTree {
		
		FTNode faultTree;
		int next;
		
		SubTree(FTNode ft, int i) {
			faultTree = ft;
			next = i;
		}
	}

}
