/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.providers;

import net.certware.sacm.SACM.util.SACMAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class SACMEEFAdapterFactory extends SACMAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.util.SACMAdapterFactory#createAnnotationAdapter()
	 * 
	 */
	public Adapter createAnnotationAdapter() {
		return new AnnotationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.util.SACMAdapterFactory#createAssuranceCaseAdapter()
	 * 
	 */
	public Adapter createAssuranceCaseAdapter() {
		return new AssuranceCasePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.util.SACMAdapterFactory#createDatetimeAdapter()
	 * 
	 */
	public Adapter createDatetimeAdapter() {
		return new DatetimePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.util.SACMAdapterFactory#createTaggedValueAdapter()
	 * 
	 */
	public Adapter createTaggedValueAdapter() {
		return new TaggedValuePropertiesEditionProvider();
	}

}
