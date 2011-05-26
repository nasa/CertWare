/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.euz.Argument;
import net.certware.argument.euz.Assumption;
import net.certware.argument.euz.Context;
import net.certware.argument.euz.Criteria;
import net.certware.argument.euz.Evidence;
import net.certware.argument.euz.Justification;
import net.certware.argument.euz.Solution;
import net.certware.argument.euz.Strategy;
import net.certware.argument.euz.diagram.edit.helpers.EuzBaseEditHelper;
import net.certware.argument.euz.diagram.part.EuzDiagramEditorPlugin;
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EuzBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected EuzBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						EuzVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(EuzBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(EuzBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(EuzBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(EuzBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = EuzElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = EuzDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			EuzDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentStrategies_4001(
				Argument source, Strategy target) {
			if (source != null) {
				if (source.getArgumentStrategies().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentStrategies_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentAssumptions_4002(
				Argument source, Assumption target) {
			if (source != null) {
				if (source.getArgumentAssumptions().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentAssumptions_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentContexts_4003(Argument source,
				Context target) {
			if (source != null) {
				if (source.getArgumentContexts().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentContexts_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentSolutions_4004(Argument source,
				Solution target) {
			if (source != null) {
				if (source.getArgumentSolutions().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentSolutions_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentCriteria_4005(Argument source,
				Criteria target) {
			if (source != null) {
				if (source.getArgumentCriteria().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentCriteria_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentJustifications_4006(
				Argument source, Justification target) {
			if (source != null) {
				if (source.getArgumentJustifications().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentJustifications_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentSubArguments_4017(Argument source,
				Argument target) {
			if (source != null) {
				if (source.getSubArguments().contains(target)) {
					return false;
				}
			}

			return canExistArgumentSubArguments_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateContextContextAssumptions_4007(Context source,
				Assumption target) {
			if (source != null) {
				if (source.getContextAssumptions().contains(target)) {
					return false;
				}
			}

			return canExistContextContextAssumptions_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCriteriaCriteriaContexts_4008(Criteria source,
				Context target) {
			if (source != null) {
				if (source.getCriteriaContexts().contains(target)) {
					return false;
				}
			}

			return canExistCriteriaCriteriaContexts_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCriteriaCriteriaAssumptions_4009(
				Criteria source, Assumption target) {
			if (source != null) {
				if (source.getCriteriaAssumptions().contains(target)) {
					return false;
				}
			}

			return canExistCriteriaCriteriaAssumptions_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyArguments_4010(Strategy source,
				Argument target) {
			if (source != null) {
				if (source.getStrategyArguments().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyArguments_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyJustifications_4011(
				Strategy source, Justification target) {
			if (source != null) {
				if (source.getStrategyJustifications().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyJustifications_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyCriteria_4012(Strategy source,
				Criteria target) {
			if (source != null) {
				if (source.getStrategyCriteria().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyCriteria_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyAssumptions_4013(
				Strategy source, Assumption target) {
			if (source != null) {
				if (source.getStrategyAssumptions().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyAssumptions_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyStrategies_4018(
				Strategy source, Strategy target) {
			if (source != null) {
				if (source.getStrategyStrategies().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyStrategies_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyContexts_4019(Strategy source,
				Context target) {
			if (source != null) {
				if (source.getStrategyContexts().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyContexts_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSolutionSolutionContexts_4014(Solution source,
				Context target) {
			if (source != null) {
				if (source.getSolutionContexts().contains(target)) {
					return false;
				}
			}

			return canExistSolutionSolutionContexts_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSolutionSolutionEvidence_4015(Solution source,
				Evidence target) {
			if (source != null) {
				if (source.getSolutionEvidence().contains(target)) {
					return false;
				}
			}

			return canExistSolutionSolutionEvidence_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSolutionSolutionCriteria_4016(Solution source,
				Criteria target) {
			if (source != null) {
				if (source.getSolutionCriteria().contains(target)) {
					return false;
				}
			}

			return canExistSolutionSolutionCriteria_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentStrategies_4001(Argument source,
				Strategy target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentAssumptions_4002(
				Argument source, Assumption target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentContexts_4003(Argument source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentSolutions_4004(Argument source,
				Solution target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentCriteria_4005(Argument source,
				Criteria target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentJustifications_4006(
				Argument source, Justification target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentSubArguments_4017(Argument source,
				Argument target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistContextContextAssumptions_4007(Context source,
				Assumption target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCriteriaCriteriaContexts_4008(Criteria source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCriteriaCriteriaAssumptions_4009(
				Criteria source, Assumption target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyArguments_4010(Strategy source,
				Argument target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyJustifications_4011(
				Strategy source, Justification target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyCriteria_4012(Strategy source,
				Criteria target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyAssumptions_4013(
				Strategy source, Assumption target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyStrategies_4018(Strategy source,
				Strategy target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyContexts_4019(Strategy source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSolutionSolutionContexts_4014(Solution source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSolutionSolutionEvidence_4015(Solution source,
				Evidence target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSolutionSolutionCriteria_4016(Solution source,
				Criteria target) {
			return true;
		}
	}

}
