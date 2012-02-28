/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.cae.Argument;
import net.certware.argument.cae.Assumption;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.cae.Claim;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.parts.CaeViewsRepository;
import net.certware.argument.cae.parts.ClaimPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * 
 * 
 */
public class ClaimPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for strategy ReferencesTable
	 */
	protected ReferencesTableSettings strategySettings;
	
	/**
	 * Settings for assumption ReferencesTable
	 */
	protected ReferencesTableSettings assumptionSettings;
	
	/**
	 * Settings for context ReferencesTable
	 */
	protected ReferencesTableSettings contextSettings;
	
	/**
	 * Settings for solution ReferencesTable
	 */
	protected ReferencesTableSettings solutionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ClaimPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject claim, String editing_mode) {
		super(editingContext, claim, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CaeViewsRepository.class;
		partKey = CaeViewsRepository.Claim.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Claim claim = (Claim)elt;
			final ClaimPropertiesEditionPart basePart = (ClaimPropertiesEditionPart)editingPart;
			// init values
			if (claim.getIdentifier() != null && isAccessible(CaeViewsRepository.Claim.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), claim.getIdentifier()));
			
			if (claim.getDescription() != null && isAccessible(CaeViewsRepository.Claim.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), claim.getDescription()));
			
			if (claim.getContent() != null && isAccessible(CaeViewsRepository.Claim.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), claim.getContent()));
			
			if (isAccessible(CaeViewsRepository.Claim.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(claim, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(CaeViewsRepository.Claim.Properties.assumed)) {
				basePart.setAssumed(claim.isAssumed());
			}
			if (isAccessible(CaeViewsRepository.Claim.Properties.toBeSupported)) {
				basePart.setToBeSupported(claim.isToBeSupported());
			}
			if (isAccessible(CaeViewsRepository.Claim.Properties.strategy)) {
				strategySettings = new ReferencesTableSettings(claim, CaePackage.eINSTANCE.getClaim_Strategy());
				basePart.initStrategy(strategySettings);
			}
			if (isAccessible(CaeViewsRepository.Claim.Properties.assumption)) {
				assumptionSettings = new ReferencesTableSettings(claim, CaePackage.eINSTANCE.getClaim_Assumption());
				basePart.initAssumption(assumptionSettings);
			}
			if (isAccessible(CaeViewsRepository.Claim.Properties.context)) {
				contextSettings = new ReferencesTableSettings(claim, CaePackage.eINSTANCE.getClaim_Context());
				basePart.initContext(contextSettings);
			}
			if (isAccessible(CaeViewsRepository.Claim.Properties.solution)) {
				solutionSettings = new ReferencesTableSettings(claim, CaePackage.eINSTANCE.getClaim_Solution());
				basePart.initSolution(solutionSettings);
			}
			// init filters
			
			
			
			basePart.addFilterToIsTagged(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TaggedValue); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for isTagged
			
			// End of user code
			
			
			
			basePart.addFilterToStrategy(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Argument); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for strategy
			
			// End of user code
			
			basePart.addFilterToAssumption(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Assumption); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for assumption
			
			// End of user code
			
			basePart.addFilterToContext(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Context); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for context
			
			// End of user code
			
			basePart.addFilterToSolution(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Evidence); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for solution
			
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}













	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == CaeViewsRepository.Claim.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.assumed) {
			return ArmPackage.eINSTANCE.getClaim_Assumed();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.toBeSupported) {
			return ArmPackage.eINSTANCE.getClaim_ToBeSupported();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.strategy) {
			return CaePackage.eINSTANCE.getClaim_Strategy();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.assumption) {
			return CaePackage.eINSTANCE.getClaim_Assumption();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.context) {
			return CaePackage.eINSTANCE.getClaim_Context();
		}
		if (editorKey == CaeViewsRepository.Claim.Properties.solution) {
			return CaePackage.eINSTANCE.getClaim_Solution();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Claim claim = (Claim)semanticObject;
		if (CaeViewsRepository.Claim.Properties.identifier == event.getAffectedEditor()) {
			claim.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (CaeViewsRepository.Claim.Properties.description == event.getAffectedEditor()) {
			claim.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (CaeViewsRepository.Claim.Properties.content == event.getAffectedEditor()) {
			claim.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (CaeViewsRepository.Claim.Properties.isTagged == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, isTaggedSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isTaggedSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isTaggedSettings.move(event.getNewIndex(), (TaggedValue) event.getNewValue());
			}
		}
		if (CaeViewsRepository.Claim.Properties.assumed == event.getAffectedEditor()) {
			claim.setAssumed((Boolean)event.getNewValue());
		}
		if (CaeViewsRepository.Claim.Properties.toBeSupported == event.getAffectedEditor()) {
			claim.setToBeSupported((Boolean)event.getNewValue());
		}
		if (CaeViewsRepository.Claim.Properties.strategy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, strategySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				strategySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				strategySettings.move(event.getNewIndex(), (Argument) event.getNewValue());
			}
		}
		if (CaeViewsRepository.Claim.Properties.assumption == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, assumptionSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				assumptionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				assumptionSettings.move(event.getNewIndex(), (Assumption) event.getNewValue());
			}
		}
		if (CaeViewsRepository.Claim.Properties.context == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, contextSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				contextSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				contextSettings.move(event.getNewIndex(), (Context) event.getNewValue());
			}
		}
		if (CaeViewsRepository.Claim.Properties.solution == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, solutionSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				solutionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				solutionSettings.move(event.getNewIndex(), (Evidence) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ClaimPropertiesEditionPart basePart = (ClaimPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(CaeViewsRepository.Claim.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CaeViewsRepository.Claim.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(CaeViewsRepository.Claim.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(CaeViewsRepository.Claim.Properties.isTagged))
				basePart.updateIsTagged();
			if (ArmPackage.eINSTANCE.getClaim_Assumed().equals(msg.getFeature()) && basePart != null && isAccessible(CaeViewsRepository.Claim.Properties.assumed))
				basePart.setAssumed((Boolean)msg.getNewValue());
			
			if (ArmPackage.eINSTANCE.getClaim_ToBeSupported().equals(msg.getFeature()) && basePart != null && isAccessible(CaeViewsRepository.Claim.Properties.toBeSupported))
				basePart.setToBeSupported((Boolean)msg.getNewValue());
			
			if (CaePackage.eINSTANCE.getClaim_Strategy().equals(msg.getFeature()) && isAccessible(CaeViewsRepository.Claim.Properties.strategy))
				basePart.updateStrategy();
			if (CaePackage.eINSTANCE.getClaim_Assumption().equals(msg.getFeature()) && isAccessible(CaeViewsRepository.Claim.Properties.assumption))
				basePart.updateAssumption();
			if (CaePackage.eINSTANCE.getClaim_Context().equals(msg.getFeature()) && isAccessible(CaeViewsRepository.Claim.Properties.context))
				basePart.updateContext();
			if (CaePackage.eINSTANCE.getClaim_Solution().equals(msg.getFeature()) && isAccessible(CaeViewsRepository.Claim.Properties.solution))
				basePart.updateSolution();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (CaeViewsRepository.Claim.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (CaeViewsRepository.Claim.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (CaeViewsRepository.Claim.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
				if (CaeViewsRepository.Claim.Properties.assumed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newValue);
				}
				if (CaeViewsRepository.Claim.Properties.toBeSupported == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_ToBeSupported().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_ToBeSupported().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
