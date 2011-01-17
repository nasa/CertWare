/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

import java.text.MessageFormat;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

/**
 * @author mrb
 * @since 1.0.3
 */
public class ExportOperation extends ExportContribution implements IExportContribution {

	/** model element ID */
	IExportResourceOperation operation;
	/** file extension to match */
	String fileExtension;

	/**
	 * Create the contribution for a file exporter.
	 * @param ce extension point contribution configuration element
	 */
	public ExportOperation(IConfigurationElement ce) {
		super(ce);
		
		if ( ce != null ) {
			// extract fields
			fileExtension = safeAssignment(ce,EXPORT_OPERATION_FILE_EXTENSION);
			try {
				Object o = ce.createExecutableExtension(EXPORT_OPERATION_CLASS);
				if ( o instanceof IExportResourceOperation ) {
					operation = (IExportResourceOperation)o;
				} else {
					CertWareLog.logWarning(MessageFormat.format("{0} {1}",
							"Wrong interface type encountered for extension contribution",
							fileExtension));
				}
			} catch (CoreException e) {
				CertWareLog.logError(MessageFormat.format("{0} {1}",
						"Creating export operation for",
						fileExtension),e);
			}
		}
	}
	
	public String getFileExtension() {
		return fileExtension;
	}
	
	public IExportResourceOperation getOperation() {
		return operation;
	}
}
