  /**
    Demonstrates a MAP query.
  */
  public void doMAP( BeliefNetwork bn )
  {
    /* Define evidence, by id. */
    Map evidence = Collections.EMPTY_MAP;

    /* Define the set of MAP variables, by id. */
    Set setMAPVariables = new HashSet();
    String[] arrayMAPVariableIDs = new String[] { "B", "C", "A" };
    for( int i=0; i<arrayMAPVariableIDs.length; i++ ){
      setMAPVariables.add( bn.forID( arrayMAPVariableIDs[i] ) );
    }

    /* Calculate MAP exactly. */

    /* Define a time limit in seconds (default 60). 0 means no limit. */
    int timeoutsecs = 60;

    /* Define a width barrier (default 0). 0 means no limit. */
    int widthbarrier = 0;

    /* Call static ExactMap method (unsloppy version). */
    MapSearch.MapInfo mapinfo = ExactMap.computeMap( bn, setMAPVariables, evidence, timeoutsecs, widthbarrier );
    MapSearch.MapResult exactmapresult = (MapSearch.MapResult) mapinfo.results.iterator().next();
    Map instantiation = exactmapresult.getConvertedInstatiation();
    double score = exactmapresult.score;
    boolean flagExact = mapinfo.finished;

    /* Print the results. */
    System.out.println( "Exact MAP, P(MAP,e)= " + score );
    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
    System.out.println( "\t instantiation: " + instantiation );
    if( flagExact ) System.out.println( "\t Result is guaranteed exact." );
    else System.out.println( "\t Result is not guaranteed exact." );

    /* Print timings. */
    System.out.println();
    System.out.println( "Pruning time, cpu: " + mapinfo.pruneDurationMillisProfiled + ", elapsed: " + mapinfo.pruneDurationMillisElapsed );
    System.out.println( "Initialization time, cpu: " + mapinfo.initDurationMillisProfiled + ", elapsed: " + mapinfo.initDurationMillisElapsed );
    System.out.println( "Search time, cpu: " + mapinfo.searchDurationMillisProfiled + ", elapsed: " + mapinfo.searchDurationMillisElapsed );
    System.out.println();

    return;
  }
