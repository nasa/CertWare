package net.certware.sacm.graphiti.wizard;

import net.certware.sacm.SACM.SACMFactory;

import org.eclipse.emf.ecore.EObject;
import net.certware.core.ICertWareConstants;

public class SacmNewDiagramWiz extends GraphitiNewWizard {

	public SacmNewDiagramWiz() {

		super("SACM Diagram", 
				ICertWareConstants.SACM_DIAGRAM_EXTENSION,
				ICertWareConstants.SACM_EXTENSION,
				ICertWareConstants.SACM_EXTENSION, 
				org.eclipse.graphiti.ui.editor.DiagramEditor.DIAGRAM_EDITOR_ID
				);
	}

	protected EObject createModel(String name) {
		return SACMFactory.eINSTANCE.createAssuranceCase();
	}

}
