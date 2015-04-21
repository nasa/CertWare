package net.certware.argument.gsz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.gsz.Assumption;
import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Evidence;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.Justification;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;
import net.certware.argument.gsz.diagram.edit.helpers.GszBaseEditHelper;
import net.certware.argument.gsz.diagram.part.GszDiagramEditorPlugin;
import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;
import net.certware.argument.gsz.diagram.providers.GszElementTypes;

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
public class GszBaseItemSemanticEditPolicy extends SemanticEditPolicy {

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
	protected GszBaseItemSemanticEditPolicy(IElementType elementType) {
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
						GszVisualIDRegistry.getVisualID((View) view));
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
			request.setParameter(GszBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GszBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GszBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(GszBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
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
		IElementType requestContextElementType = GszElementTypes
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
		LinkConstraints cached = GszDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			GszDiagramEditorPlugin.getInstance().setLinkConstraints(
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
		public boolean canCreateGoalSubGoals_4001(Goal source, Goal target) {
			if (source != null) {
				if (source.getSubGoals().contains(target)) {
					return false;
				}
			}

			return canExistGoalSubGoals_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalStrategies_4002(Goal source, Strategy target) {
			if (source != null) {
				if (source.getStrategies().contains(target)) {
					return false;
				}
			}

			return canExistGoalStrategies_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalGoalContexts_4003(Goal source,
				Context target) {
			if (source != null) {
				if (source.getGoalContexts().contains(target)) {
					return false;
				}
			}

			return canExistGoalGoalContexts_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalAssumptions_4004(Goal source,
				Assumption target) {
			if (source != null) {
				if (source.getAssumptions().contains(target)) {
					return false;
				}
			}

			return canExistGoalAssumptions_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalGoalSolutions_4005(Goal source,
				Solution target) {
			if (source != null) {
				if (source.getGoalSolutions().contains(target)) {
					return false;
				}
			}

			return canExistGoalGoalSolutions_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyGoals_4006(Strategy source, Goal target) {
			if (source != null) {
				if (source.getGoals().contains(target)) {
					return false;
				}
			}

			return canExistStrategyGoals_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyJustifications_4007(Strategy source,
				Justification target) {
			if (source != null) {
				if (source.getJustifications().contains(target)) {
					return false;
				}
			}

			return canExistStrategyJustifications_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategyContexts_4008(Strategy source,
				Context target) {
			if (source != null) {
				if (source.getStrategyContexts().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategyContexts_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStrategyStrategySolutions_4009(Strategy source,
				Solution target) {
			if (source != null) {
				if (source.getStrategySolutions().contains(target)) {
					return false;
				}
			}

			return canExistStrategyStrategySolutions_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSolutionSolutionEvidence_4010(Solution source,
				Evidence target) {
			if (source != null) {
				if (source.getSolutionEvidence().contains(target)) {
					return false;
				}
			}

			return canExistSolutionSolutionEvidence_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSolutionSolutionContexts_4011(Solution source,
				Context target) {
			if (source != null) {
				if (source.getSolutionContexts().contains(target)) {
					return false;
				}
			}

			return canExistSolutionSolutionContexts_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalSubGoals_4001(Goal source, Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalStrategies_4002(Goal source, Strategy target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalGoalContexts_4003(Goal source, Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalAssumptions_4004(Goal source,
				Assumption target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalGoalSolutions_4005(Goal source,
				Solution target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyGoals_4006(Strategy source, Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyJustifications_4007(Strategy source,
				Justification target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategyContexts_4008(Strategy source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStrategyStrategySolutions_4009(Strategy source,
				Solution target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSolutionSolutionEvidence_4010(Solution source,
				Evidence target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSolutionSolutionContexts_4011(Solution source,
				Context target) {
			return true;
		}
	}

}
