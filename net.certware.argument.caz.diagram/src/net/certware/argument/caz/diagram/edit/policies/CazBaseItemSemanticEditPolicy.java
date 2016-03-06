package net.certware.argument.caz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.arm.InformationElement;
import net.certware.argument.caz.Argument;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;
import net.certware.argument.caz.diagram.edit.helpers.CazBaseEditHelper;
import net.certware.argument.caz.diagram.part.CazDiagramEditorPlugin;
import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;
import net.certware.argument.caz.diagram.providers.CazElementTypes;

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
public class CazBaseItemSemanticEditPolicy extends SemanticEditPolicy {

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
	protected CazBaseItemSemanticEditPolicy(IElementType elementType) {
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
						CazVisualIDRegistry.getVisualID((View) view));
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
			request.setParameter(CazBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(CazBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(CazBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(CazBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
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
		IElementType requestContextElementType = CazElementTypes
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
		LinkConstraints cached = CazDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			CazDiagramEditorPlugin.getInstance().setLinkConstraints(
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
		public boolean canCreateClaimClaimStrategies_4001(Claim source,
				Argument target) {
			if (source != null) {
				if (source.getClaimStrategies().contains(target)) {
					return false;
				}
			}

			return canExistClaimClaimStrategies_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClaimClaimAssumptions_4002(Claim source,
				Assumption target) {
			if (source != null) {
				if (source.getClaimAssumptions().contains(target)) {
					return false;
				}
			}

			return canExistClaimClaimAssumptions_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClaimClaimContexts_4003(Claim source,
				Context target) {
			if (source != null) {
				if (source.getClaimContexts().contains(target)) {
					return false;
				}
			}

			return canExistClaimClaimContexts_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClaimClaimSolutions_4004(Claim source,
				Evidence target) {
			if (source != null) {
				if (source.getClaimSolutions().contains(target)) {
					return false;
				}
			}

			return canExistClaimClaimSolutions_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClaimSubClaims_4005(Claim source, Claim target) {
			if (source != null) {
				if (source.getSubClaims().contains(target)) {
					return false;
				}
			}

			return canExistClaimSubClaims_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentJustification_4006(
				Argument source, Justification target) {
			if (source != null) {
				if (source.getArgumentJustification().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentJustification_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentEvidence_4007(Argument source,
				Evidence target) {
			if (source != null) {
				if (source.getArgumentEvidence().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentEvidence_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateArgumentArgumentClaims_4008(Argument source,
				Claim target) {
			if (source != null) {
				if (source.getArgumentClaims().contains(target)) {
					return false;
				}
			}

			return canExistArgumentArgumentClaims_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEvidenceEvidenceContexts_4009(Evidence source,
				Context target) {
			if (source != null) {
				if (source.getEvidenceContexts().contains(target)) {
					return false;
				}
			}

			return canExistEvidenceEvidenceContexts_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEvidenceEvidence_4010(Evidence source,
				InformationElement target) {
			if (source != null) {
				if (source.getEvidence().contains(target)) {
					return false;
				}
			}

			return canExistEvidenceEvidence_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistClaimClaimStrategies_4001(Claim source,
				Argument target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClaimClaimAssumptions_4002(Claim source,
				Assumption target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClaimClaimContexts_4003(Claim source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClaimClaimSolutions_4004(Claim source,
				Evidence target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClaimSubClaims_4005(Claim source, Claim target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentJustification_4006(
				Argument source, Justification target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentEvidence_4007(Argument source,
				Evidence target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistArgumentArgumentClaims_4008(Argument source,
				Claim target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEvidenceEvidenceContexts_4009(Evidence source,
				Context target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEvidenceEvidence_4010(Evidence source,
				InformationElement target) {
			return true;
		}
	}

}
