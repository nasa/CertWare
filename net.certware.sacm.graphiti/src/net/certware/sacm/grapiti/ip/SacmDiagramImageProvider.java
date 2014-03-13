package net.certware.sacm.grapiti.ip;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class SacmDiagramImageProvider extends AbstractImageProvider {

	protected static final String PREFIX = "net.certware.sacm.graphiti."; //$NON-NLS-1$
	
	public static final String IMG_ANNOTATE = PREFIX + "annotate";
	public static final String IMG_ARGUMENTATION = PREFIX + "argumentation";
	public static final String IMG_EVIDENCE_CONTAINER = PREFIX + "evidence_container";
	public static final String IMG_TAG = PREFIX + "tag";
	
	@Override
	protected void addAvailableImages() {
		addImageFilePath(IMG_ANNOTATE,"icons/obj16/annotate.gif");
		addImageFilePath(IMG_ARGUMENTATION,"icons/obj16/sacm_arg.png");
		addImageFilePath(IMG_EVIDENCE_CONTAINER,"icons/obj16/evidence_container.gif");
		addImageFilePath(IMG_TAG,"icons/obj16/tag.png");
	}

}
