  /**
    Demonstrates an MPE query.
  */
  public void doMPE( BeliefNetwork bn )
  {
    /* Define evidence, by id. */
    Map evidence = new HashMap(2);
    FiniteVariable var = null;
    var = (FiniteVariable) bn.forID( "D" );
    evidence.put( var, var.instance( "Present" ) );
    var = (FiniteVariable) bn.forID( "A" );
    evidence.put( var, var.instance( "Present" ) );

    /* Create a new set of variables and remove those whose evidence have set keys. */
    Set allVarsMinusEvidence = new HashSet( bn );
    allVarsMinusEvidence.removeAll( evidence.keySet() );

    /* Initialize a MapEngine and perform the mpe computation. */
    MapEngine mpe = new MapEngine( bn, allVarsMinusEvidence, evidence );

    /* Get the results. */
    double score = mpe.probability();
    Map instantiation = mpe.getInstance();

    /* Print the results. */
    System.out.println( "MPE, P(MPE,e)= " + score );
    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
    System.out.println( "\t instantiation: " + instantiation );

    return;
  }
