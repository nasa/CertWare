/** Import statements necessary for il1 classes. */
import edu.ucla.belief.*;


/** Import statements necessary for il2 classes. */
import il2.model.*;
import il2.model.Table;
import il2.util.*;


/**
  This class hard codes the network
  /Users/mrbarryold/./Applications/samiam/network_samples/cancer.net

  To compile this class, make sure
  inflib.jar occurs in the command line classpath,
  e.g. javac -classpath inflib.jar CBOutput.java

  To run it, do the same,
  but also include the path to
  the compiled class,
  e.g. java -classpath .:inflib.jar CBOutput

  @author Keith Cascio
  @since Feb 24, 2011 4:44:47 PM
*/
public class CBOutput
{
  /** Test. */
  public static void main( String[] args ){
    CBOutput T = new CBOutput();
    T.createBeliefNetwork();
    T.createBayesianNetwork();
  }

  /**
    Builds a new model from scratch, as simply as possible, using classes in package edu.ucla.belief (il1).
  */
  public BeliefNetwork createBeliefNetwork()
  {
    /* Contruct an empty BeliefNetwork. */
    BeliefNetwork model = new BeliefNetworkImpl();

    /* Setup a discrete variable called "A",
       with states "Present", "Absent". */
    String              id0 = "A";
    String[]        values0 = new String[]{ "Present", "Absent" };
    FiniteVariable     var0 = new FiniteVariableImpl( id0, values0 );
    model.addVariable( var0, true );//pass second argument true, to construct a default CPTShell (TableShell) for var0

    /* Setup a discrete variable called "B",
       with states "Increased", "Not increased". */
    String              id1 = "B";
    String[]        values1 = new String[]{ "Increased", "Not increased" };
    FiniteVariable     var1 = new FiniteVariableImpl( id1, values1 );
    model.addVariable( var1, true );//pass second argument true, to construct a default CPTShell (TableShell) for var1

    /* Setup a discrete variable called "C",
       with states "Present", "Absent". */
    String              id2 = "C";
    String[]        values2 = new String[]{ "Present", "Absent" };
    FiniteVariable     var2 = new FiniteVariableImpl( id2, values2 );
    model.addVariable( var2, true );//pass second argument true, to construct a default CPTShell (TableShell) for var2

    /* Setup a discrete variable called "D",
       with states "Present", "Absent". */
    String              id3 = "D";
    String[]        values3 = new String[]{ "Present", "Absent" };
    FiniteVariable     var3 = new FiniteVariableImpl( id3, values3 );
    model.addVariable( var3, true );//pass second argument true, to construct a default CPTShell (TableShell) for var3

    /* Setup a discrete variable called "E",
       with states "Present", "Absent". */
    String              id4 = "E";
    String[]        values4 = new String[]{ "Present", "Absent" };
    FiniteVariable     var4 = new FiniteVariableImpl( id4, values4 );
    model.addVariable( var4, true );//pass second argument true, to construct a default CPTShell (TableShell) for var4

    /* Add edges stopping at var1 ("B") */
    model.addEdge( var0, var1 );

    /* Add edges stopping at var2 ("C") */
    model.addEdge( var0, var2 );

    /* Add edges stopping at var3 ("D") */
    model.addEdge( var2, var3 );
    model.addEdge( var1, var3 );

    /* Add edges stopping at var4 ("E") */
    model.addEdge( var2, var4 );

    /* For the cpts, create arrays of double-precision floating point values. */
    //A       Value
    //Present 0.2
    //Absent  0.8
    double[] cpt0 = new double[]{ 0.2, 0.8 };
    //A       B             Value
    //Present Increased     0.8
    //Present Not increased 0.2
    //Absent  Increased     0.2
    //Absent  Not increased 0.8
    double[] cpt1 = new double[]{ 0.8, 0.2, 0.2, 0.8 };
    //A       C       Value
    //Present Present 0.2
    //Present Absent  0.8
    //Absent  Present 0.05
    //Absent  Absent  0.95
    double[] cpt2 = new double[]{ 0.2, 0.8, 0.05, 0.95 };
    //C       B             D       Value
    //Present Increased     Present 0.8
    //Present Increased     Absent  0.2
    //Present Not increased Present 0.8
    //Present Not increased Absent  0.2
    //Absent  Increased     Present 0.8
    //Absent  Increased     Absent  0.2
    //Absent  Not increased Present 0.05
    //Absent  Not increased Absent  0.95
    double[] cpt3 = new double[]{ 0.8, 0.2, 0.8, 0.2, 0.8, 0.2, 0.05, 0.95 };
    //C       E       Value
    //Present Present 0.8
    //Present Absent  0.2
    //Absent  Present 0.6
    //Absent  Absent  0.4
    double[] cpt4 = new double[]{ 0.8, 0.2, 0.6, 0.4 };

    /* Specify parameters as full conditional probability tables. */
    edu.ucla.belief.io.dsl.DSLNodeType cpt_type = edu.ucla.belief.io.dsl.DSLNodeType.CPT;

    /* Set the cpt data for each variable. */
    TableShell      tShell0 = (TableShell) var0.getCPTShell( cpt_type );
    tShell0.setValues( cpt0 );
    TableShell      tShell1 = (TableShell) var1.getCPTShell( cpt_type );
    tShell1.setValues( cpt1 );
    TableShell      tShell2 = (TableShell) var2.getCPTShell( cpt_type );
    tShell2.setValues( cpt2 );
    TableShell      tShell3 = (TableShell) var3.getCPTShell( cpt_type );
    tShell3.setValues( cpt3 );
    TableShell      tShell4 = (TableShell) var4.getCPTShell( cpt_type );
    tShell4.setValues( cpt4 );

    /* Done. */
    return model;
  }

  /**
    Builds a new model from scratch, as simply as possible, using classes in package il2.model (il2).
  */
  public BayesianNetwork createBayesianNetwork()
  {
    /* Create a domain of size 5. */
    Domain domain = new Domain(5);

    /* Add a discrete variable called "A" to the domain,
       with states "Present", "Absent". */
    String     name0 = "A";
    String[] values0 = new String[]{ "Present", "Absent" };
    int          id0 = domain.addDim( name0, values0 );

    /* Add a discrete variable called "B" to the domain,
       with states "Increased", "Not increased". */
    String     name1 = "B";
    String[] values1 = new String[]{ "Increased", "Not increased" };
    int          id1 = domain.addDim( name1, values1 );

    /* Add a discrete variable called "C" to the domain,
       with states "Present", "Absent". */
    String     name2 = "C";
    String[] values2 = new String[]{ "Present", "Absent" };
    int          id2 = domain.addDim( name2, values2 );

    /* Add a discrete variable called "D" to the domain,
       with states "Present", "Absent". */
    String     name3 = "D";
    String[] values3 = new String[]{ "Present", "Absent" };
    int          id3 = domain.addDim( name3, values3 );

    /* Add a discrete variable called "E" to the domain,
       with states "Present", "Absent". */
    String     name4 = "E";
    String[] values4 = new String[]{ "Present", "Absent" };
    int          id4 = domain.addDim( name4, values4 );

    /* For the cpts, create arrays of double-precision floating point values. */
    //A       Value
    //Present 0.2
    //Absent  0.8
    double[] cpt0 = new double[]{ 0.2, 0.8 };
    //B             A       Value
    //Increased     Present 0.8
    //Increased     Absent  0.2
    //Not increased Present 0.2
    //Not increased Absent  0.8
    double[] cpt1 = new double[]{ 0.8, 0.2, 0.2, 0.8 };
    //C       A       Value
    //Present Present 0.2
    //Present Absent  0.05
    //Absent  Present 0.8
    //Absent  Absent  0.95
    double[] cpt2 = new double[]{ 0.2, 0.05, 0.8, 0.95 };
    //D       C       B             Value
    //Present Present Increased     0.8
    //Present Present Not increased 0.8
    //Present Absent  Increased     0.8
    //Present Absent  Not increased 0.05
    //Absent  Present Increased     0.2
    //Absent  Present Not increased 0.2
    //Absent  Absent  Increased     0.2
    //Absent  Absent  Not increased 0.95
    double[] cpt3 = new double[]{ 0.8, 0.8, 0.8, 0.05, 0.2, 0.2, 0.2, 0.95 };
    //E       C       Value
    //Present Present 0.8
    //Present Absent  0.6
    //Absent  Present 0.2
    //Absent  Absent  0.4
    double[] cpt4 = new double[]{ 0.8, 0.6, 0.2, 0.4 };

    /*
      Create a IL2 Table for each cpt.
      The parameters to the Table constructor are:
      (1) the domain,
      (2) the variable ids that name the dimensions of the table (in the form of an IntSet),
      (3) the cpt data.
    */
    Table table0 = new Table( domain, new IntSet( new int[]{ id0 } ), cpt0 );
    Table table1 = new Table( domain, new IntSet( new int[]{ id0, id1 } ), cpt1 );
    Table table2 = new Table( domain, new IntSet( new int[]{ id0, id2 } ), cpt2 );
    Table table3 = new Table( domain, new IntSet( new int[]{ id1, id2, id3 } ), cpt3 );
    Table table4 = new Table( domain, new IntSet( new int[]{ id2, id4 } ), cpt4 );

    /* Create an array of all the Tables. */
    Table[] tables = new Table[]{ table0, table1, table2, table3, table4 }; 

    /*
      The simple BayesianNetwork constructor takes only one argument:
      an array of Tables.
    */
    BayesianNetwork model = new BayesianNetwork( tables );
    return model;
  }
}
