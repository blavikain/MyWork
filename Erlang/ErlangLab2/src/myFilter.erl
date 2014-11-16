-module(myFilter).
-author("Łukasz").

%% API
-export([filter/2]).

filter(TheFunction, TheList) ->
  [X || X <- TheList, TheFunction(X)].