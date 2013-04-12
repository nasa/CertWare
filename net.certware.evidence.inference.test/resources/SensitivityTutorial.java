/** Import il1 classes. */
import edu.ucla.belief.sensitivity.*;
import edu.ucla.belief.*;
import edu.ucla.belief.inference.*;
import edu.ucla.belief.io.NetworkIO;
import edu.ucla.belief.io.PropertySuperintendent;
import edu.ucla.util.ProbabilityInterval;

/** Import classes for recursive conditioning. */
import edu.ucla.belief.inference.RCEngineGenerator;
import edu.ucla.belief.inference.RCSettings;
import edu.ucla.belief.inference.RCInfo;
import edu.ucla.belief.inference.RCEngine;
import java.math.BigInteger;
// import il2.inf.rc.RCEngine;

/** Import standard Java classes. */
import java.util.*;
import java.io.PrintWriter;

/**
  This class demonstrates code for a sensitivity query

  To compile this class, make sure
  inflib.jar occurs in the command line classpath,
  e.g. javac -classpath inflib.jar SensitivityTutorial.java

  To run it, do the same,
  but also include the path to
  the compiled class,
  e.g. java -classpath .:inflib.jar SensitivityTutorial

  @author Keith Cascio
  @since Mar 23, 2011 7:14:32 PM
*/
public class SensitivityTutorial
{
  /** Test. */
  public static void main(String[] args){
    SensitivityTutorial T = new SensitivityTutorial();
    T.getSuggestions( T.readNetworkFile() );
  }

  /**
    Demonstrates a single sensitivity query.
  */
  public void getSuggestions( BeliefNetwork bn )
  {
    /* Define evidence, by id. */
    Map evidence = Collections.EMPTY_MAP;

    /* Define the constraint, by variable id. */

    /* Define event 1. */
    FiniteVariable varEvent1 = (FiniteVariable) bn.forID( "B" );
    Object valueEvent1 = varEvent1.instance( "Increased" );

    /* Define the comparison operator, one of:
       SensitivityEngine.OPERATOR_EQUALS (=), SensitivityEngine.OPERATOR_GTE (>=), SensitivityEngine.OPERATOR_LTE (<=)
    */
    Object opComparison = SensitivityEngine.OPERATOR_GTE;

    /* Define the constraint constant. */
    double constant = (double)0.8;

    /* Create the Dynamator(edu.ucla.belief.inference.SynchronizedInferenceEngine$SynchronizedPartialDerivativeEngine). */
    edu.ucla.belief.inference.RCEngineGenerator dynamator = new edu.ucla.belief.inference.RCEngineGenerator();

    /* Edit settings. */
    edu.ucla.belief.inference.RCSettings settings = dynamator.getSettings( (PropertySuperintendent)bn );
    /*
      Define the elimination heuristic used to create the dtree, one of:
        MIN_FILL (Min Fill), MIN_SIZE (Min Size)
    */
    settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );
    /* Do not create an InferenceEngine optimized for only Pr(e). */
    settings.setPrEOnly(              false );
    /* Set the fraction of full memory to use. */
    settings.setUserMemoryProportion( (double)1.0 );
    /* Create the cache allocation (very important). */
    try{
      settings.validateAllocation( bn );
    }catch( Throwable throwable ){
       System.err.println( "Error, failed to validate cache allocation: " + throwable );
       return;
    }

    /* Characterize the cache allocation and estimated run time. */
    double     actualProportion          = settings.getActualMemoryProportion();
    RCInfo     info                      = settings.getInfo();
    BigInteger cacheEntriesFullCaching   = info.cacheEntriesFullCaching();
    BigInteger allocatedCacheEntries     = info.allocatedCacheEntries();
    double     recursiveCallsFullCaching = info.recursiveCallsFullCaching();
    double     recursiveCalls            = info.recursiveCalls();

    /* Create the InferenceEngine. */
    InferenceEngine engine = dynamator.manufactureInferenceEngine( bn );

    /* Set evidence. */
    try{
      bn.getEvidenceController().setObservations( evidence );
    }catch( StateNotFoundException e ){
      System.err.println( "Error, failed to set evidence: " + e );
      return;
    };

    /* Create the SensitivityEngine. */
    SensitivityEngine sensitivityengine = new SensitivityEngine( bn, engine, (PartialDerivativeEngine)engine, new PrintWriter( System.out ) );

    /* Get the results. */
    SensitivityReport report = sensitivityengine.getResults( varEvent1, valueEvent1, (FiniteVariable)null, (Object)null, (Object)null, opComparison, constant, /* flagSingleParameter */ true, /* flagSingleCPT */ true );

    /* Print the results. */
    if( report == null ){
      System.out.println( "The current belief network already satisfies the specified constraint." );
      return;
    }

    List singleParameterSuggestions = report.generateSingleParamSuggestions();
    Map mapFiniteVariablesToSingleCPTSuggestions = report.getSingleCPTMap();

    if( singleParameterSuggestions.isEmpty() && mapFiniteVariablesToSingleCPTSuggestions.isEmpty() ){
      System.out.println( "The specified constraint is unsatisfiable." );
      return;
    }

    System.out.println( "Single parameter suggestions:\n{" );
    SingleParamSuggestion current = null;
    for( Iterator iterator = singleParameterSuggestions.iterator(); iterator.hasNext(); ){
      current = (SingleParamSuggestion)iterator.next();
      System.out.print( "\t" + current.getCPTParameter().toString() );
      System.out.print( " == " + current.getCurrentValue() );
      System.out.print( ", suggested: " + current.getSuggestedValue() );
      System.out.print( ", log odds change: " + current.getLogOddsChange() );
      System.out.println();
    }
    System.out.println( "}" );
    System.out.println();

    System.out.println( "Single CPT (multiple parameter) suggestions:\n{" );
    FiniteVariable target = null;
    SingleCPTSuggestion suggestion = null;
    ProbabilityInterval[] intervals = null;
    for( Iterator iterator = mapFiniteVariablesToSingleCPTSuggestions.keySet().iterator(); iterator.hasNext(); ){
      target = (FiniteVariable)iterator.next();
      suggestion = (SingleCPTSuggestion) mapFiniteVariablesToSingleCPTSuggestions.get( target );
      intervals = suggestion.probabilityIntervals();
      System.out.println( "Suggestion for " + target.getID() + "'s CPT, log odds change " + suggestion.getLogOddsChange() );
      System.out.print( suggestion.toString() );
      System.out.println();
    }
    System.out.println( "}" );
    System.out.println();


    /* Clean up to avoid memory leaks. */
    engine.die();

    return;
  }

  /**
    Open the network file used to create this tutorial.
  */
  public BeliefNetwork readNetworkFile()
  {
    String path = "/Users/mrbarryold/./Applications/samiam/network_samples/cancer.net";

    BeliefNetwork ret = null;
    try{
      /* Use NetworkIO static method to read network file. */
      ret = NetworkIO.read( path );
    }catch( Exception e ){
      System.err.println( "Error, failed to read \"" + path + "\": " + e );
      return (BeliefNetwork)null;
    }
    return ret;
  }
}
