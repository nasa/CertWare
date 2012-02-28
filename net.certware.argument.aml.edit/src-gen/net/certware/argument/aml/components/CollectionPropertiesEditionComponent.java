/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Collection;
import net.certware.argument.aml.ObjectType2;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CollectionPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
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
public class CollectionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for annotation ReferencesTable
	 */
	protected ReferencesTableSettings annotationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CollectionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject collection, String editing_mode) {
		super(editingContext, collection, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Collection.class;
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
			final Collection collection = (Collection)elt;
			final CollectionPropertiesEditionPart basePart = (CollectionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AmlViewsRepository.Collection.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(collection, AmlPackage.eINSTANCE.getCollection_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			if (collection.getGroup() != null && isAccessible(AmlViewsRepository.Collection.Properties.group))
				basePart.setGroup(collection.getGroup());
			
			if (collection.getId() != null && isAccessible(AmlViewsRepository.Collection.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), collection.getId()));
			
			if (collection.getLabel1() != null && isAccessible(AmlViewsRepository.Collection.Properties.label1))
				basePart.setLabel1(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), collection.getLabel1()));
			
			if (isAccessible(AmlViewsRepository.Collection.Properties.objectType)) {
				basePart.initObjectType((EEnum) AmlPackage.eINSTANCE.getCollection_ObjectType().getEType(), collection.getObjectType());
			}
			// init filters
			basePart.addFilterToAnnotation(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Annotation); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for annotation
			
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
		if (editorKey == AmlViewsRepository.Collection.Properties.annotation) {
			return AmlPackage.eINSTANCE.getCollection_Annotation();
		}
		if (editorKey == AmlViewsRepository.Collection.Properties.group) {
			return AmlPackage.eINSTANCE.getCollection_Group();
		}
		if (editorKey == AmlViewsRepository.Collection.Properties.id) {
			return AmlPackage.eINSTANCE.getCollection_Id();
		}
		if (editorKey == AmlViewsRepository.Collection.Properties.label1) {
			return AmlPackage.eINSTANCE.getCollection_Label1();
		}
		if (editorKey == AmlViewsRepository.Collection.Properties.objectType) {
			return AmlPackage.eINSTANCE.getCollection_ObjectType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Collection collection = (Collection)semanticObject;
		if (AmlViewsRepository.Collection.Properties.annotation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, annotationSettings, editingContext.getAdapterFactory());
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
				annotationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				annotationSettings.move(event.getNewIndex(), (Annotation) event.getNewValue());
			}
		}
		if (AmlViewsRepository.Collection.Properties.group == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				collection.getGroup().clear();
				collection.getGroup().addAll(((List) event.getNewValue()));
			}
		}
		if (AmlViewsRepository.Collection.Properties.id == event.getAffectedEditor()) {
			collection.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Collection.Properties.label1 == event.getAffectedEditor()) {
			collection.setLabel1((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Collection.Properties.objectType == event.getAffectedEditor()) {
			collection.setObjectType((ObjectType2)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CollectionPropertiesEditionPart basePart = (CollectionPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getCollection_Annotation().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.Collection.Properties.annotation))
				basePart.updateAnnotation();
			if (AmlPackage.eINSTANCE.getCollection_Group().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Collection.Properties.group)) {
				basePart.setGroup(((Collection)semanticObject).getGroup());
			}
			
			if (AmlPackage.eINSTANCE.getCollection_Id().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Collection.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (AmlPackage.eINSTANCE.getCollection_Label1().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Collection.Properties.label1)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel1(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel1("");
				}
			}
			if (AmlPackage.eINSTANCE.getCollection_ObjectType().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.Collection.Properties.objectType))
				basePart.setObjectType((Enumerator)msg.getNewValue());
			
			
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
				if (AmlViewsRepository.Collection.Properties.group == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollection_Group().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (AmlViewsRepository.Collection.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCollection_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollection_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Collection.Properties.label1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCollection_Label1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollection_Label1().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Collection.Properties.objectType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCollection_ObjectType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollection_ObjectType().getEAttributeType(), newValue);
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
