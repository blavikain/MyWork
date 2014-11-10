-module(onp).
-export([onp/1]).

onp(Expression) ->
  [Result] = lists:foldl(fun calculate/2, [], string:tokens(Expression, " ")),
  Result.

calculate("+", [A, B|Stack])    -> [A + B|Stack];
calculate("-", [A, B|Stack])    -> [B - A|Stack];
calculate("*", [A, B|Stack])    -> [B * A|Stack];
calculate("/", [A, B|Stack])    -> [B / A|Stack];
calculate("pow", [A, B|Stack])  -> [math:pow(B, A)|Stack];
calculate("sqrt", [A|Stack])    -> [math:sqrt(A)|Stack];
calculate("sin", [A|Stack])     -> [math:sin(A)|Stack];
calculate("cos", [A|Stack])     -> [math:cos(A)|Stack];
calculate("tan", [A|Stack])     -> [math:tan(A)|Stack];

calculate(X, Stack)             -> [list_to_integer(X)|Stack].


