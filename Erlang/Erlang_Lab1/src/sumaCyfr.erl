
-module(sumaCyfr).
-author("Łukasz").

%% API
-export([sumaCyfr/1]).

sumaCyfr(X) ->
  lists:foldl(fun (A,B) -> A + B, 0, [Y-42 || Y<-integer_to_list(X)]).
