package net.certware.evidence.hugin.view.preferences;

import edu.ucla.belief.inference.map.InitializationMethod;
import edu.ucla.belief.inference.map.SearchMethod;

/**
 * Constant definitions for plug-in preferences
 * @author mrb
 */
public class PreferenceConstants {
	public static final String P_NETWORK_VIEW_REFRESH_ON_RESOURCE_CHANGE = "networkViewRefreshOnResourceChange";
	public static final String P_LABEL_DECORATOR_FOREGROUND = "networkViewLabelDecoratorForeground";
	public static final String P_LABEL_DECORATOR_SUFFIX = "networkViewLabelDecoratorSuffix";
	public static final String P_WARNING_MESSAGE_FOREGROUND = "warningMessageForeground";
	public static final String P_INFORMATION_MESSAGE_FOREGROUND = "informationMessageForeground";
	
	public static final String P_MAP_SEARCH_METHOD = "searchMethod";
	public static final String P_MAP_SEARCH_METHOD_TABOO = "searchTaboo";
	public static final String P_MAP_SEARCH_METHOD_HILL_CLIMBING = "searchHillClimbing";
	
	public static final String P_MAP_COMPUTATION_METHOD = "mapComputationMethod";
	public static final String P_MAP_COMPUTATION_METHOD_EXACT = "mapComputationExact";
	public static final String P_MAP_COMPUTATION_METHOD_APPROXIMATE = "mapComputationApproximate";
	
	
	public static final String P_MAP_INITIALIZATION_METHOD = "mapInitializationMethod";
	public static final String P_MAP_INITIALIZATION_RANDOM = "mapInitializationRandom";
	public static final String P_MAP_INITIALIZATION_SEQUENTIAL = "mapInitializationSequential";
	public static final String P_MAP_INITIALIZATION_MPE = "mapInitializationMpe";
	public static final String P_MAP_INITIALIZATION_LIKELIHOOD = "mapInitializationLikelihood";
	
	public static final String P_MAP_TIMEOUT = "mapTimeout";
	public static final String P_MAP_WIDTH_BARRIER = "mapWidthBarrier";
	
	public static final String P_MAP_SEARCH_STEPS = "mapSearchSteps";

	/**
	 * Converts the property string to the network constant.
	 * @param initialization initialization value from property constants
	 * @return initialization method constant {@code ML}, {@code RANDOM}, {@code MPE}, {@code SEQ}
	 */
	public static InitializationMethod getInitializationMethod(String initialization) {
		if ( P_MAP_INITIALIZATION_RANDOM.equals(initialization))
			return InitializationMethod.RANDOM;
		if ( P_MAP_INITIALIZATION_SEQUENTIAL.equals(initialization))
			return InitializationMethod.SEQ;
		if ( P_MAP_INITIALIZATION_MPE.equals(initialization))
			return InitializationMethod.MPE;
		if ( P_MAP_INITIALIZATION_LIKELIHOOD.equals(initialization))
			return InitializationMethod.ML;
		return null;
	}

	/**
	 * Converts the property string to the search constant.
	 * @param search initialization value from property constants
	 * @return search method constants {@code TABOO} or {@code HILL}
	 */
	public static SearchMethod getSearchMethod(String search) {
		if ( P_MAP_SEARCH_METHOD_TABOO.equals(search))
			return SearchMethod.TABOO;
		if ( P_MAP_SEARCH_METHOD_HILL_CLIMBING.equals(search))
			return SearchMethod.HILL;
		return null;
	}
}
