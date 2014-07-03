State Analysis GUI
==================

TODO:

* Try links across deployment sets.
* Add object help from MDS book.
* Add transformation support, e.g. http://www.eclipse.org/epsilon/doc/articles/eugenia-polishing/
* Add completeness validations EVL
* Fix wizard categories

NOTES:

Deployments: 
The partitions within the control system that are permanently assigned to 
various assets within the system. Interactions among deployments are generally 
intermittent or with high latency relative to local control needs.
A deployment is a tightly integrated set of software components operating 
locally within one of these deployment nodes — the physical manifestation 
of the software.

Items: 
Things in the system under control that have state or share state with other 
items. Items carry attributes that help to identify states or the associations 
among them.

Components:
Class of SV, HA, E, C

State Variables:
Entities that represent the state of the items in a system under control.
￼State variables are the central elements of the MDS architecture with most
other elements being defined in terms of state or involved intimately with
state in some way. The value of state knowledge for each state is captured
in an intervallic value history. A special type of state variable call graph 
state variable is provided for tracking relationships among items.

Hardware Adapters:
The interface between a control system and sensors and actuators in the system 
under control that provide measurements or accept commands, respectively. 
The measurements and commands supported by a system are also key elements in 
state analysis. Sequences of measurement and command values are captured in discrete 
value histories.

Goals:
Expressions of intent against state variables. Each goal specifies a state 
constraint on how the value of some state variable may evolve over time. 
Allocations are special state constraints that express reservations against the 
values of some state variables – the need within a control system to make 
allowances for specified ranges of state behavior.

Constraint Networks:
Linked sets of state and temporal constraints that specify part or all of a scenario. 
Constraint networks capture all of the required relationships among state behaviors 
necessary to accomplish the objectives of the scenario. Networks are constructed 
incrementally through a process know as elaboration.

Achievers:
The active elements of a deployment that guide the system in real time to accomplish 
its objectives. Achievers are divided into two types: estimators, which determine the 
state of the system; and controllers, which control the state. Both are directed 
through the constraint network. Estimators can interact in a controlled manner via 
distilled measurements. Controllers can interact in a controlled manner via delegation.

Data Collection:
The organized storage for data associated with value histories and other information that 
must be preserved or transported between deployments. Data collections are maintained 
via catalogs, and stored and transported in the form of data products. Their functions 
is guided through the use of policies that determine quality of service.




