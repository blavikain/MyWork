
-module(qs).
-author("Łukasz").

%% API
-export([qs/1]).

qs([Pivot|Tail]) -> qs([X || X <- Tail, X < Pivot]) ++ [Pivot] ++ qs([X || X <- Tail, X >= Pivot]);
qs([]) -> [].