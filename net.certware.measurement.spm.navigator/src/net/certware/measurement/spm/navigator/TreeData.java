/**
 * 
 */
package net.certware.measurement.spm.navigator;

import net.certware.measurement.smm.DimensionalMeasurement;
import net.certware.measurement.smm.Measure;
import net.certware.measurement.smm.Measurement;
import net.certware.measurement.smm.Observation;

import org.eclipse.core.resources.IFile;

/**
 * Content record for various tree content providers.
 * Presumes at some point ratios, trends, and other measures will deserve different treatment.
 * For now, these could have been done with one super class reference. 
 * @author mrb
 * @since 1.1
 */
public class TreeData
{
	/** node description */
	String description = null;
	/** key identifier, reusing image keys */
	String key = null;
	/** reference parent file */
	IFile ifile = null;
	/** measure */
	Measure measure = null;

	/**
	 * Tree data constructor. 
	 */
	public TreeData() {
	}

	/**
	 * Tree data constructor, loading all fields.
	 * @param description description
	 * @param obs metric observation
	 * @param key node type key, one of the keys from the plug-in activator
	 * @param file reference file
	 */
	public TreeData(String description, Measure m, String key, IFile file) {
		this.description = description;
		this.measure = m;
		this.key = key;
		this.ifile = file;
	}

	/**
	 * Tree data constructor, loading all fields.
	 * @param m measure
	 * @param key image key
	 * @param file reference model file
	 */
	public TreeData(Measure m, String key,IFile file) {
		this(m.getName(),m,key,file);

	}
	
	/**
	 * Get the description.
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Get the metric observation.
	 * @return metric observation
	 */
	public Observation getObservation(int index) {
		assert(index >= 0);
		if ( measure.getMeasurement() != null && measure.getMeasurement().size() > 0 ) {
			return measure.getMeasurement().get(index).getObservation();
		}
		return null;
	}

	/**
	 * Returns the value from the first attribute of the observation.
	 * @return value formatted, or none string
	 */
	public String getValue(int index) {
		if ( measure.getMeasurement() != null && measure.getMeasurement().size() > 0 ) {
			Measurement measurement = measure.getMeasurement().get(index);
			// direct measurement
			if ( measurement instanceof DimensionalMeasurement ) {
				DimensionalMeasurement dm = (DimensionalMeasurement)measurement;
				return String.format("%7.2f",dm.getValue());
			}
			// other measurement types, such as ranking, not used 
		}

		return "<none>";
	}
	
	/**
	 * Gets the node key. 
	 * @return one of the plug-in image keys
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Gets the reference resource file.
	 * @return resource file or null
	 */
	public IFile getIFile() {
		return ifile;
	}
}
