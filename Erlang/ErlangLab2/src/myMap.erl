-module(myMap).
-author("Łukasz").

%% API
-export([map/2]).

map(TheFunction, TheList) -> [TheFunction(X) || X <- TheList].
