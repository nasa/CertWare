/*
 * 
 */
package stateAnalysis.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ControllerDelegatesReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ControllerDelegatesReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof stateAnalysis.Controller) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof stateAnalysis.Controller && newEnd instanceof stateAnalysis.Controller)) {
			return false;
		}
		return stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistControllerDelegates_4001(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof stateAnalysis.Controller && newEnd instanceof stateAnalysis.Controller)) {
			return false;
		}
		return stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistControllerDelegates_4001(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getDelegates().remove(getOldTarget());
		getNewSource().getDelegates().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getDelegates().remove(getOldTarget());
		getOldSource().getDelegates().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected stateAnalysis.Controller getOldSource() {
		return (stateAnalysis.Controller) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected stateAnalysis.Controller getNewSource() {
		return (stateAnalysis.Controller) newEnd;
	}

	/**
	 * @generated
	 */
	protected stateAnalysis.Controller getOldTarget() {
		return (stateAnalysis.Controller) oldEnd;
	}

	/**
	 * @generated
	 */
	protected stateAnalysis.Controller getNewTarget() {
		return (stateAnalysis.Controller) newEnd;
	}
}
