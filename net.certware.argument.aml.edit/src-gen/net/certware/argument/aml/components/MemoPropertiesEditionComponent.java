/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.Memo;
import net.certware.argument.aml.Reader;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.MemoPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
public class MemoPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for creator ReferencesTable
	 */
	protected ReferencesTableSettings creatorSettings;
	
	/**
	 * Settings for reader ReferencesTable
	 */
	protected ReferencesTableSettings readerSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MemoPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject memo, String editing_mode) {
		super(editingContext, memo, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Memo.class;
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
			final Memo memo = (Memo)elt;
			final MemoPropertiesEditionPart basePart = (MemoPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AmlViewsRepository.Memo.Properties.creator)) {
				creatorSettings = new ReferencesTableSettings(memo, AmlPackage.eINSTANCE.getMemo_Creator());
				basePart.initCreator(creatorSettings);
			}
			if (isAccessible(AmlViewsRepository.Memo.Properties.reader)) {
				readerSettings = new ReferencesTableSettings(memo, AmlPackage.eINSTANCE.getMemo_Reader());
				basePart.initReader(readerSettings);
			}
			if (memo.getSubject() != null && isAccessible(AmlViewsRepository.Memo.Properties.subject))
				basePart.setSubject(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getSubject()));
			
			if (memo.getBody() != null && isAccessible(AmlViewsRepository.Memo.Properties.body))
				basePart.setBody(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getBody()));
			
			if (memo.getId() != null && isAccessible(AmlViewsRepository.Memo.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getId()));
			
			if (memo.getType() != null && isAccessible(AmlViewsRepository.Memo.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getType()));
			
			// init filters
			basePart.addFilterToCreator(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Creator);
					}
			
			});
			// Start of user code for additional businessfilters for creator
			
			// End of user code
			
			basePart.addFilterToReader(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Reader); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for reader
			
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
		if (editorKey == AmlViewsRepository.Memo.Properties.creator) {
			return AmlPackage.eINSTANCE.getMemo_Creator();
		}
		if (editorKey == AmlViewsRepository.Memo.Properties.reader) {
			return AmlPackage.eINSTANCE.getMemo_Reader();
		}
		if (editorKey == AmlViewsRepository.Memo.Properties.subject) {
			return AmlPackage.eINSTANCE.getMemo_Subject();
		}
		if (editorKey == AmlViewsRepository.Memo.Properties.body) {
			return AmlPackage.eINSTANCE.getMemo_Body();
		}
		if (editorKey == AmlViewsRepository.Memo.Properties.id) {
			return AmlPackage.eINSTANCE.getMemo_Id();
		}
		if (editorKey == AmlViewsRepository.Memo.Properties.type) {
			return AmlPackage.eINSTANCE.getMemo_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Memo memo = (Memo)semanticObject;
		if (AmlViewsRepository.Memo.Properties.creator == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, creatorSettings, editingContext.getAdapterFactory());
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
				creatorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				creatorSettings.move(event.getNewIndex(), (Creator) event.getNewValue());
			}
		}
		if (AmlViewsRepository.Memo.Properties.reader == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, readerSettings, editingContext.getAdapterFactory());
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
				readerSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				readerSettings.move(event.getNewIndex(), (Reader) event.getNewValue());
			}
		}
		if (AmlViewsRepository.Memo.Properties.subject == event.getAffectedEditor()) {
			memo.setSubject((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Memo.Properties.body == event.getAffectedEditor()) {
			memo.setBody((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Memo.Properties.id == event.getAffectedEditor()) {
			memo.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Memo.Properties.type == event.getAffectedEditor()) {
			memo.setType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MemoPropertiesEditionPart basePart = (MemoPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getMemo_Creator().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.Memo.Properties.creator))
				basePart.updateCreator();
			if (AmlPackage.eINSTANCE.getMemo_Reader().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.Memo.Properties.reader))
				basePart.updateReader();
			if (AmlPackage.eINSTANCE.getMemo_Subject().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Memo.Properties.subject)) {
				if (msg.getNewValue() != null) {
					basePart.setSubject(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setSubject("");
				}
			}
			if (AmlPackage.eINSTANCE.getMemo_Body().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Memo.Properties.body)) {
				if (msg.getNewValue() != null) {
					basePart.setBody(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setBody("");
				}
			}
			if (AmlPackage.eINSTANCE.getMemo_Id().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Memo.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (AmlPackage.eINSTANCE.getMemo_Type().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Memo.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AmlViewsRepository.Memo.Properties.creator || key == AmlViewsRepository.Memo.Properties.subject;
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
				if (AmlViewsRepository.Memo.Properties.subject == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Subject().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Subject().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Memo.Properties.body == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Body().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Body().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Memo.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Memo.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Type().getEAttributeType(), newValue);
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
