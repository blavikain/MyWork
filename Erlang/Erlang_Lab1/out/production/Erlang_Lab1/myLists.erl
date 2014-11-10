%%%-------------------------------------------------------------------
%%% @author Łukasz
%%% @copyright (C) 2014, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 22. paź 2014 10:08
%%%-------------------------------------------------------------------
-module(myLists).

%% API
-export([contains/2]).
-export([duplicateElements/1]).
-export([sumFloats/1]).
-export([sumFloatsT/2]).

  contains(_,[]) ->
    false;
  contains(H,[H|_]) ->
    true;
  contains(N,[_|T]) ->
    contains(N,T).




  duplicateElements([]) ->
    [];

  duplicateElements([H|T]) ->
    [H,H|duplicateElements(T)].



  sumFloats([H|T]) ->
    if
      is_float(H) -> H + sumFloats(T);
      true -> sumFloats(T)
    end;

  sumFloats([]) ->
    0.0.


  sumFloatsT([H|T],Sum) ->
    if
      is_float(H) -> sumFloatsT(T,Sum+H);
      true -> sumFloatsT(T,Sum)
    end;
  sumFloatsT([],Sum) ->
    Sum.