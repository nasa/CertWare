package net.certware.core.spi;

/**
 * Interface for the status ID.
 * @author mrb
 * @since 1.0
 */
public interface IStatusIdFinder {
	
	/**
	 * Gets the status ID.
	 * @param object status ID key
	 * @return status ID
	 */
	public String getStatusId(Object object);

}
