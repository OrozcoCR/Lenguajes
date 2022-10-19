
subcadena(X,Cadena) :-
           sub_string(Cadena, _, _, _, X),!.

filtro(Z,Y,V):-
    include(subcadena(Z),Y,V).


subconjunto([],[]).
subconjunto([X|L],[X|S]) :-
subconjunto(L,S).
subconjunto(L, [_|S]) :-
subconjunto(L,S).

aplanar([], []) :- !.
aplanar([L|Ls], FlatL) :-
    !,
    aplanar(L, NewL),
    aplanar(Ls, NewLs),
    append(NewL, NewLs, FlatL).
aplanar(L, [L]).

