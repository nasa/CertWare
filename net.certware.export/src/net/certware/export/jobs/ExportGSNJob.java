/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

import java.util.Collection;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.util.GsnSwitch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Exports GSN model elements to a document file.
 * Uses ARM exporter as well for tree visitor.
 * @author mrb
 * @since 1.0
 */
public class ExportGSNJob extends ExportARMJob {

	/**
	 * Create the export job with a name.
	 * @param name
	 */
	public ExportGSNJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export
	 */
	public ExportGSNJob(String name, EObject node) {
		super(name,node);
	}

	/**
	 * Create the export job with a collection of model nodes.
	 * @param name job name
	 * @param nodes model elements to export
	 */
	public ExportGSNJob(String name, Collection nodes ) {
		super(name,nodes);
	}

	/**
	 * Create the export job for a given model resource.
	 * @param name job name
	 * @param resource model resource to export all nodes
	 */
	public ExportGSNJob(String name, Resource resource ) {
		super(name,resource);
	}
	
	/**
	 * Visitor to pass to the model's tree iterator.
	 * Overrides the case methods of the generated switch class.
	 */
	public GsnSwitch<Boolean> visitor = new GsnSwitch<Boolean>() {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseGoal(Goal goal) {
			System.err.println("visiting goal " + goal);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseStrategy(Strategy strategy) {
			System.err.println("visiting strategy " + strategy);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseSolution(Solution solution) {
			System.err.println("visiting solution " + solution);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssumption(Assumption assumption) {
			System.err.println("visiting assumption " + assumption);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseContext(net.certware.argument.gsn.Context context) {
			System.err.println("visiting context " + context);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseJustification(Justification justification) {
			System.err.println("visiting justification " + justification);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseModelElement(ModelElement modelElement) {
			System.err.println("visiting model element " + modelElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentElement(ArgumentElement argumentElement) {
			System.err.println("visiting argument element " + argumentElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseReasoningElement(ReasoningElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseClaim(Claim claim) {
			System.err.println("visiting claim " + claim);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentLink(ArgumentLink argumentLink) {
			System.err.println("visiting argument link " + argumentLink);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship assertedRelationship) {
			System.err.println("visiting asserted relationship " + assertedRelationship);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence assertedEvidence) {
			System.err.println("visiting asserted evidence " + assertedEvidence);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * <!-- begin-user-doc -->
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseInformationElement(InformationElement informationElement) {
			System.err.println("visiting information element");
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * <!-- begin-user-doc -->
		 * defer to the superclass visitor for switch
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Boolean defaultCase(EObject object) {
			if ( getVisitor().doSwitch(object) == Boolean.TRUE)
				return Boolean.TRUE;
			System.err.println("visiting unknown GSN object " + object);
			return Boolean.FALSE;
		}
	};
	
}
