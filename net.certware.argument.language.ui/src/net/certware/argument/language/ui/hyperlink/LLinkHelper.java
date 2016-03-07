package net.certware.argument.language.ui.hyperlink;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

public class LLinkHelper extends HyperlinkHelper {
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,IHyperlinkAcceptor acceptor) {


		EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
		@SuppressWarnings("unused")
		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		// unused...
		
/*		if (eObject instanceof TypVar) {

			TypVar variableName = (TypVar) eObject;
			CompositeNode adapter = (CompositeNode) NodeModelUtils.getNode(variableName);

			Region region = new Region(adapter.getOffset(), adapter.getLength());
			
			final URIConverter uriConverter = resource.getResourceSet().getURIConverter();
			final String hyperlinkText = "Variable";
			
			final URI uri = EcoreUtil.getURI( "***magic" );
			final URI normalized = uri.isPlatformResource() ? uri : uriConverter.normalize(uri);

			XtextHyperlink result = new XtextHyperlink(); 
			result.setHyperlinkRegion(region);
			result.setURI(normalized);
			result.setHyperlinkText(hyperlinkText);
			acceptor.accept(result);
		}*/
	}
}
