
-module(checkTime).
-author("Łukasz").

%% API
-export([checkTime/0]).

checkTime() ->
  TheList = [random:uniform(1000000000000) || _ <- lists:seq(1,1000000)],
  {{Result1, _}, {Result2, _ }} = {timer:tc(qs,qs,[TheList]),timer:tc(lists,sort,[TheList])},
  {Result1, Result2}.
