
min_fault_tree(Term,State,Tree) :-
% THIS VERSION MAY BE BROKEN !!!
	copy_term((Term,State),(TermX,StateX)),
	setof(StateX,TermX,States),
	filter_for_time_and_fails(States,FStates),!,
	eliminate_supersets(FStates,MinSets),!,
	factor_intersections(MinSets,SimplerSets),!,
	boolean_conversion(or,SimplerSets,Tree).

min_fault_tree(Term,State,Limit,Tree) :-
	findall(X,prune(Term,State,Limit,X),FStates0),
	sort(FStates0,FStates),
	eliminate_supersets(FStates,MinSets),!,
	factor_intersections(MinSets,SimplerSets),!,
	boolean_conversion(or,SimplerSets,Tree).

prune(Term,StatesX,Limit,States) :-
	call(Term),
	convert_time_series(StatesX,States0),
	filter_conj(States0,States),
	States = [_|_],
	fault_limit(Limit,States).

fault_limit(fault_limit(0),_).
fault_limit(fault_limit(N),List) :-
	N > 0,
	length(List,K),
	K < N+1.
	
filter_for_time_and_fails([],[]).
filter_for_time_and_fails([States0|MoreStates],FStates) :-
	convert_time_series(States0,States),
	filter_conj(States,FStates0),
	filter_for_time_and_fails(MoreStates,Rest),
	combine(FStates0,Rest,FStates).

combine([],A,A).
combine(A,B,[A|B]) :-
	A \= [].

convert_time_series(List,Series) :-
	is_a_list(List),!,
	convert_time_series(1,List,Series).
convert_time_series(state(Name,Val),state(0,Name,Val)).
%convert_time_series((state(Name,Val),Rest0),(state(0,Name,Val),Rest)) :-
%	convert_time_series(Rest0,Rest).
convert_time_series((First0,Rest0),(First,Rest)) :-
	convert_time_series(First0,First),
	convert_time_series(Rest0,Rest).
	
convert_time_series(N,[State0],State) :-
	convert_time_conj(N,State0,State).
convert_time_series(N,[State0|States0],(State,States)) :-
	convert_time_conj(N,State0,State),
	N1 is N+1,
	convert_time_series(N1,States0,States).

convert_time_conj(N,state(Name,Val),state(N,Name,Val)).
convert_time_conj(N,(state(Name,Val),Rest0),(state(N,Name,Val),Rest)) :-
	convert_time_conj(N,Rest0,Rest).

%filter_conj(state(_,_,OK),[]) :-
%	\+ fail_state(OK).
%filter_conj((state(_,_,OK),Rest0),Rest) :-
%	\+ fail_state(OK),
%	filter_conj(Rest0,Rest).
%filter_conj(state(N,Name,Fail),[state(N,Name,Fail)]) :-
%	fail_state(Fail).
%filter_conj((state(N,Name,Fail),Rest0),[state(N,Name,Fail)|Rest]) :-
%	fail_state(Fail),
%	filter_conj(Rest0,Rest).

filter_conj((A,B),C) :-
	filter_conj(A,D),
	filter_conj(B,E),
	append(D,E,C).
filter_conj(state(_,_,OK),[]) :-
	\+ fail_state(OK).
filter_conj(state(N,Name,Fail),[state(N,Name,Fail)]) :-
	fail_state(Fail).

	
	
fail_state(failed).
fail_state(failed(_)).

eliminate_supersets([],[]).
eliminate_supersets([Set|Sets],MinSets) :-
	part(Set,Sets,Remaining,Min),
	eliminate_supersets(Remaining,Mins),
	append(Min,Mins,MinSets).

part(Set,[],[],[Set]) :- !.
part(Set,[Set2|Sets],Rem,Min) :-
	subset(Set,Set2,Status),
	part(Status,Set,[Set2|Sets],Rem,Min).
	
part(right,_,Rem,Rem,[]) :- !.
part(Status,Sub,[_|Sets],Rem,Min) :- 
	(Status = left ; Status = both), !,
	part(Sub,Sets,Rem,Min).
part(neither,Set,[Set2|Sets],[Set2|Rem],Min) :-
	part(Set,Sets,Rem,Min).

subset(A,B,Result) :-
	intersection(A,B,C),!,
	size(A,AN),
	size(B,BN),
	size(C,CN),
	q(AN,BN,CN,Result).

q(N,N,N,both) :- !.
q(N,_,N,left) :- !.
q(_,N,N,right) :- !.
q(_,_,_,neither).

factor_intersections([],[]).
factor_intersections(InList,OutList) :-
	largest_common_subset(InList,Sub,Supers,Others),
	factor_intersections0(InList,Sub,Supers,Others,OutList).

factor_intersections0(InList,none,[],_,InList).
factor_intersections0(_,Sub,Supers,Others,OutList) :-
	differences(Sub,Supers,Diffs),
	append(Sub,[Diffs],Factored),
	factor_intersections(Others,SimplerOthers),
	append([Factored],SimplerOthers,OutList).

largest_common_subset(InList,Sub,Supers,Others) :-
	lcs([],InList,Candidates),
	most_leaves_eliminated(Candidates,Sub),
	split(InList,Sub,Supers,Others).
	
lcs(SoFar,[],SoFar).
lcs(SoFar0,[A|B],Sofar) :-
	lcs0(SoFar0,A,B,Sofar1),
	lcs(Sofar1,B,Sofar).

lcs0(SoFar,_,[],SoFar).
lcs0(SoFar0,A,[B|C],SoFar) :-
	intersection(A,B,Int),
	size(Int,N),
	add_unique((Int,N),SoFar0,SoFar1),
	lcs0(SoFar1,A,C,SoFar).
	
size([],0).
size([_|B],N1) :-
	size(B,N),
	N1 is N + 1.
	
add_unique(([],0),X,X).
add_unique((Set,N),[],[(Set,N)]).
add_unique((Set,N),[(Set,I)|Rest],[(Set,NI)|Rest]) :-
	NI is I + N.
add_unique((Set1,N),[(Set2,I)|Rest0],[(Set2,I)|Rest]) :-
	\+ Set1 = Set2,
	add_unique((Set1,N),Rest0,Rest).

most_leaves_eliminated(Candidates,Sub) :-
	mle((none,0),Candidates,Sub).

mle((Set,_),[],Set).
mle((_,N),[(Set2,I)|Rest],Subset) :-
	N < I,
	mle((Set2,I),Rest,Subset).
mle((Set,N),[(_,I)|Rest],Subset) :-
	\+ N < I,
	mle((Set,N),Rest,Subset).

differences(_,[],[]).
differences(Sub,[Super|Supers],[Diff|Diffs]) :-
	diff(Sub,Super,Diff),
	differences(Sub,Supers,Diffs).
	
diff([],A,A).
diff(_,[],[]).
diff([A|B],C,E) :-
	remove(A,C,D),
	diff(B,D,E).
	
remove(_,[],[]).
remove(A,[A|B],B).
remove(A,[B|C],[B|D]) :-
	\+ A = B,
	remove(A,C,D).
	
split(X,none,[],X).
split([],_,[],[]).
split([Sub|Rest],Sub,Supers,Others) :-
	split(Rest,Sub,Supers,Others).
split([A|Rest],Sub,Supers,[A|Others]) :-
	\+ A = Sub,
	intersection(A,Sub,[]),
	split(Rest,Sub,Supers,Others).
split([A|Rest],Sub,[A|Supers],Others) :-
	\+ A = Sub,
	intersection(A,Sub,[_|_]),
	split(Rest,Sub,Supers,Others).

intersection([],_,[]).
intersection(_,[],[]).
intersection([A|B],C,[A|D]) :-
	member(A,C),
	intersection(B,C,D).
intersection([A|B],C,D) :-
	\+ member(A,C),
	intersection(B,C,D).

member(A,[A|_]) :- !.
member(A,[_|C]) :-
	member(A,C).

boolean_conversion(_,[],[]).
%boolean_conversion(_,State,State) :-
%	State = state(_,_,_).
boolean_conversion(_,Fault,Fault) :-
	Fault = fault(_).
boolean_conversion(_,State0,Fault) :-
	State0 = state(_,_,_),
	flatten_state(State0,Fault).
boolean_conversion(Op,[Term0],Term) :-
	switch_op(Op,SubOp),
	boolean_conversion(SubOp,Term0,Term).
boolean_conversion(Op,Terms0,Term) :-
	Terms0 = [_,_|_],
	switch_op(Op,SubOp),
	convert_subterms(SubOp,Terms0,Terms),
	Term =.. [Op|Terms].

flatten_state(state(N,Name,Val),fault(Atom)) :-
	flatten_list(Name,NameAtom),
	atomize_term(Val,ValAtom),
	atom_concat(NameAtom,ValAtom,Atom0),
	add_time(Atom0,N,Atom).

flatten_list([],'').
flatten_list([Atom|Atoms],NameAtom) :-
	flatten_list(Atoms,AtomRest),
	atom_concat(Atom,' ',AtomFirst),
	atom_concat(AtomFirst,AtomRest,NameAtom).

atomize_term(A,A) :-
	atom(A),!.
atomize_term(N,A) :-
	number(N),!,
	atom_number(A,N).
atomize_term(Term,TermAtom) :-
	Term =..[F|Args],
	atom_concat(F,'(',LeadAtom),
	atomize_args(Args,ArgsAtom),
	atom_concat(LeadAtom,ArgsAtom,TermAtom).

atomize_args([],')').
atomize_args([A|B],C) :-
	atomize_args(B,D),
	atomize_term(A,E),
	atom_concat(E,D,C).
	

add_time(Atom,0,Atom).
add_time(Atom0,N,Atom) :-
	N > 0,
	atom_concat(Atom0,' in state ',Atom1),
	atom_number(AN,N),
	atom_concat(Atom1,AN,Atom).

switch_op(or,and).
switch_op(and,or).
	
convert_subterms(_,[],[]).
convert_subterms(Op,[C0|Cs0],[C|Cs]) :-
	boolean_conversion(Op,C0,C),
	convert_subterms(Op,Cs0,Cs).

component(Name, Component, State) :-
	functor(Component,F,Arity),
	call(Component),
% COULD WE FILTER FOR NON-FAIL STATES RIGHT HERE ?
	arg(Arity,Component,Val),
	rename_state(Val,F,Name,State).

rename_state(state(SubName,Val),Parent,the,state(NewName,Val)) :- !,
	append(SubName,[of, the, Parent],NewName).
rename_state(state(Sub,Val),Parent,Name,state(XX,Val)) :- !,
	append(Sub,[of, Parent, Name],XX).
rename_state((State,States),Parent,Name,(NewState,NewStates)) :- !,
	rename_state(State,Parent,Name,NewState),
	rename_state(States,Parent,Name,NewStates).
rename_state(List,_,_,List) :- 
	is_a_list(List),!.
rename_state(Val,SmKind,the,state([the, SmKind],Val)) :- !.
rename_state(Val,SmKind,SmName,state([SmKind, SmName],Val)).

is_a_list([]).
is_a_list([_|_]).

connected([]).
%connected([signal(_)]).
connected([_]).
connected([T|Ts]) :-
	terminal_type(T,_,_),
	connected([T|Ts],0).
%connected([signal(A),signal(B)|Rest]) :-
%	A = B,
%	connected([signal(B)|Rest]).
connected([A,B|Rest]) :-
	A = B,
	connected([B|Rest]).

connected([T],Sum) :-
	terminal_type(T,_V,I),
	{Sum + I = 0}.
connected([T1,T2|Rest],Sum):-
	terminal_type(T1,V1,I1),
	terminal_type(T2,V2,_),
    {V1=V2, Sum1=Sum+I1},
    connected([T2|Rest],Sum1).
      
terminal_type(electrical(V,I),V,I).
terminal_type(hydraulic(V,I),V,I).
terminal_type(mechanical(V,I),V,I).

