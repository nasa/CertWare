
/* Author: Evgenii Balai */

/* Given a graph defined by a collection of edges, 
 * the program checks whether it is possible to remove 
 * <=k nodes from the graph to make it disconnected
 */

/* the number of nodes in graph */
const n = 6.
/* the maximal number of nodes to be removed */
const k = 4.


/* node is an integer in the range 1..n*/
type node = {1..n}.

/* edges of the graph */
edge(node X, node Y) if X%n = (Y+1)%n.
edge(node X, node Y) if X%n = (Y+2)%n.
edge(node X, node Y) if edge(Y,X).

/* every node can be removed */
maybe removed(node N).
/* cannot remove more than k nodes */
0 <= |{removed(node N)}| <= k.

/* every node which was not removed is reachable from itself */
reachable(node X, X) if not removed(X).


/* a node Y is reachable from X if there is an edge from X to Y and both nodes
 * were not removed */
reachable(node X,node Y) if edge(X,Y) 
                            and not removed(X)                                                                                                               
                            and not removed(Y). 

/* a node Y is reachable from X through node Z if 
 * Z is reachable from X and Y is reachable from Z,
 * and none of the three nodes is removed */
reachable_through(node X,node Z, node Y) if reachable(X,Z)
                            and reachable(Z,Y) 
                            and not removed(X) 
                            and not removed(Y) 
                            and not removed(Z).
                            

/* a node Y is reachable from node X if Y is reachable from X through some node */
reachable(node X,node Y) if reachable_through(X,some node, Y).

/* a node Y is disconnected from X if they are not removed and 
 * Y is not reachable from X
 */
disconnected(node X, node Y)  if    not reachable(X, Y) 
                   and not removed(X)
                   and not removed(Y).                

/* a graph is disconnected if two of its nodes are disconnected  */
disconnected_graph  if   disconnected(some node, some node).                 


/* we require the graph to be disconnected */
1<=|{disconnected_graph}|<=1.

/* the program has three models, each of which, among other atoms,
contains the nodes to be removed to make the graph disconnected:
removed(1) removed(2) removed(4) removed(5) ... 
removed(1) removed(3) removed(4) removed(6) ...
removed(2) removed(3) removed(5) removed(6) ...
 */

