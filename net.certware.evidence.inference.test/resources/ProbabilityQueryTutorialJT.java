  /**
    Demonstrates a probability query.
  */
  public void doProbabilityQuery( BeliefNetwork bn )
  {
    /* Define evidence, by id. */
    Map evidence = new HashMap(2);
    FiniteVariable var = null;
    var = (FiniteVariable) bn.forID( "E" );
    evidence.put( var, var.instance( "Present" ) );
    var = (FiniteVariable) bn.forID( "C" );
    evidence.put( var, var.instance( "Absent" ) );

    /* Create the Dynamator(edu.ucla.belief.inference.SynchronizedInferenceEngine$SynchronizedPartialDerivativeEngine). */
    edu.ucla.belief.inference.JEngineGenerator dynamator = new edu.ucla.belief.inference.JEngineGenerator();

    /* Edit settings. */
    edu.ucla.belief.inference.JoinTreeSettings settings = dynamator.getSettings( (PropertySuperintendent)bn, true );
    /*
      Define the elimination order heuristic used to create the join tree, one of:
        MIN_FILL (Min Fill), MIN_SIZE (Min Size)
    */
    settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );

    /* Create the InferenceEngine. */
    InferenceEngine engine = dynamator.manufactureInferenceEngine( bn );

    /* Set evidence. */
    try{
      bn.getEvidenceController().setObservations( evidence );
    }catch( StateNotFoundException e ){
      System.err.println( "Error, failed to set evidence: " + e );
      return;
    };

    /* Calculate Pr(e). */
    double pE = engine.probability();
    System.out.println( "Pr(e): " + pE );
    System.out.println();

    /* Define the set of 5 variables for which we want marginal probabilities, by id. */
    Set setMarginalVariables = new HashSet();
    String[] arrayMarginalVariableIDs = new String[] { "E", "C", "B", "A", "D" };
    for( int i=0; i<arrayMarginalVariableIDs.length; i++ ){
      setMarginalVariables.add( bn.forID( arrayMarginalVariableIDs[i] ) );
    }

    /* Calculate marginals. */
    System.out.println( "Marginal probability tables:" );
    FiniteVariable varMarginal = null;
    Table answer = null;
    for( Iterator iterator = setMarginalVariables.iterator(); iterator.hasNext(); ){
      varMarginal = (FiniteVariable)iterator.next();
      answer = engine.conditional( varMarginal );
      System.out.println( answer.tableString() );
      System.out.println();
    }

    /* Clean up to avoid memory leaks. */
    engine.die();

    return;
  }
