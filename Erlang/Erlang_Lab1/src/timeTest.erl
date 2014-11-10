
-module(timeTest).
-author("Łukasz").

%% API
-export([timeTest/0]).

timeTest() ->
  Randoms = [random:uniform(1000000000) || _ <- lists:seq(1,1000000)],
  {timer:tc(qsort,qs,[Randoms]),timer:tc(lists,sort,[Randoms])}.

