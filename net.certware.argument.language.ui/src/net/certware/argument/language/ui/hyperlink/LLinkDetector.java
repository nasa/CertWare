package net.certware.argument.language.ui.hyperlink;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.ui.editor.hyperlinking.DefaultHyperlinkDetector;

public class LLinkDetector extends DefaultHyperlinkDetector {
	@Override
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer,IRegion region, boolean canShowMultiplehyperlinks) {
		this.setHelper(new LLinkHelper());
		return super.detectHyperlinks(textViewer, region,canShowMultiplehyperlinks);
	}

}
