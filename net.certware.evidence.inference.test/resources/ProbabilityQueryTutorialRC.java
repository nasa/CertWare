import edu.ucla.belief.*;
import edu.ucla.belief.inference.*;
import edu.ucla.belief.io.PropertySuperintendent;
import edu.ucla.belief.io.NetworkIO;

import edu.ucla.belief.inference.RCEngineGenerator;
import edu.ucla.belief.inference.RCSettings;
import edu.ucla.belief.inference.RCInfo;
import edu.ucla.belief.inference.RCEngine;
import java.math.BigInteger;
// import il2.inf.rc.RCEngine;

import java.util.*;

public class ProbabilityQueryTutorial
{
  public static void main(String[] args){
    ProbabilityQueryTutorial T = new ProbabilityQueryTutorial();
    T.doProbabilityQuery( T.readNetworkFile() );
  }

  public void doProbabilityQuery( BeliefNetwork bn )
  {
    Map evidence = new HashMap(2);
    FiniteVariable var = null;
    var = (FiniteVariable) bn.forID( "C" );
    evidence.put( var, var.instance( "Present" ) );
    var = (FiniteVariable) bn.forID( "B" );
    evidence.put( var, var.instance( "Increased" ) );

    edu.ucla.belief.inference.RCEngineGenerator dynamator = new edu.ucla.belief.inference.RCEngineGenerator();

    edu.ucla.belief.inference.RCSettings settings = dynamator.getSettings( (PropertySuperintendent)bn );
    settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );
    settings.setPrEOnly(              false );
    settings.setUserMemoryProportion( (double)1.0 );
    try{
      settings.validateAllocation( bn );
    }catch( Throwable throwable ){
       System.err.println( "Error, failed to validate cache allocation: " + throwable );
       return;
    }

    double     actualProportion          = settings.getActualMemoryProportion();
    RCInfo     info                      = settings.getInfo();
    BigInteger cacheEntriesFullCaching   = info.cacheEntriesFullCaching();
    BigInteger allocatedCacheEntries     = info.allocatedCacheEntries();
    double     recursiveCallsFullCaching = info.recursiveCallsFullCaching();
    double     recursiveCalls            = info.recursiveCalls();

    InferenceEngine engine = dynamator.manufactureInferenceEngine( bn );

    try{
      bn.getEvidenceController().setObservations( evidence );
    }catch( StateNotFoundException e ){
      System.err.println( "Error, failed to set evidence: " + e );
      return;
    };

    double pE = engine.probability();
    System.out.println( "Pr(e): " + pE );
    System.out.println();

    Set setMarginalVariables = new HashSet();
    String[] arrayMarginalVariableIDs = new String[] { "A", "C", "B", "E", "D" };
    for( int i=0; i<arrayMarginalVariableIDs.length; i++ ){
      setMarginalVariables.add( bn.forID( arrayMarginalVariableIDs[i] ) );
    }

    System.out.println( "Marginal probability tables:" );
    FiniteVariable varMarginal = null;
    Table answer = null;
    for( Iterator iterator = setMarginalVariables.iterator(); iterator.hasNext(); ){
      varMarginal = (FiniteVariable)iterator.next();
      answer = engine.conditional( varMarginal );
      System.out.println( answer.tableString() );
      System.out.println();
    }

    engine.die();

    return;
  }

  public BeliefNetwork readNetworkFile()
  {
    String path = "/Users/mrbarryold/./Applications/samiam/network_samples/cancer.net";

    BeliefNetwork ret = null;
    try{
      ret = NetworkIO.read( path );
    }catch( Exception e ){
      System.err.println( "Error, failed to read \"" + path + "\": " + e );
      return (BeliefNetwork)null;
    }
    return ret;
  }
}
