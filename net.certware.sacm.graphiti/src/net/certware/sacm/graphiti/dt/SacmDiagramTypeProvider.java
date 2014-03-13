package net.certware.sacm.graphiti.dt;

import net.certware.sacm.graphiti.fp.SacmFeatureProvider;
import net.certware.sacm.graphiti.tools.ArgumentationToolBehaviorProvider;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class SacmDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	public SacmDiagramTypeProvider() {
		setFeatureProvider(new SacmFeatureProvider(this));
	}
	
	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = 
					new IToolBehaviorProvider[] {
					new ArgumentationToolBehaviorProvider(this)
			};
			}
		return toolBehaviorProviders;
	}

}
