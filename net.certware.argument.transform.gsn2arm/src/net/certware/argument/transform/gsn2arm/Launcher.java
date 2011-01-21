package net.certware.argument.transform.gsn2arm;

import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;

public class Launcher implements ILauncher {

	public Launcher() {
		// TODO Auto-generated constructor stub
		System.err.println("ATL launcher constructor");
	}

	@Override
	public String getName() {
		return "CertWare GSN to ARM Launcher";
	}

	@Override
	public void addInModel(IModel model, String name, String referenceModelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addOutModel(IModel model, String name, String referenceModelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addInOutModel(IModel model, String name,
			String referenceModelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLibrary(String name, Object library) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(Map<String, Object> options) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object launch(String mode, IProgressMonitor monitor,
			Map<String, Object> options, Object... modules) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object loadModule(InputStream inputStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IModel getModel(String modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLibrary(String libraryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDefaultModelFactoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getModes() {
		// TODO Auto-generated method stub
		return null;
	}

}
