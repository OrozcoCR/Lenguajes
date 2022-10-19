miembro(N,[N|Tail]).
miembro(N,[X|Tail]) :- miembro(N,Tail).

factorial(0,1).
factorial(A,B) :-
		A > 0,
		C is A-1,
		factorial(C,D),
		B is A*D.

insertar(E,[],[E]).
insertar(E,[H|T],[E|[H|T]]):-  E < H,!.
insertar(E,[H|T],[H|R]):- insertar(E,T,R).

eliminar(_, [], []).

eliminar(Y, [Y|Xs], Zs):-
          eliminar(Y, Xs, Zs), !.

eliminar(X, [Y|Xs], [Y|Zs]):-
          eliminar(X, Xs, Zs).
