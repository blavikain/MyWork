
-module(filter).
-author("Łukasz").

%% API
-export([filter/1]).

filter(X) ->
  if
    (X rem 13 == 0) and (X rem 3 == 0) -> true;
    true -> false
  end.
