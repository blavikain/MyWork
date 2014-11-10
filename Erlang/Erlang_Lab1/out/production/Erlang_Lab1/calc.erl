-module(calc).
-export([rpn/1]).

rpn(L) when is_list(L) ->
  [Result] = lists:foldl(fun rpn/2, [], string:tokens(L, " ")),
  Result.

%% rpn(Op, Stack)
rpn("+", [Num1, Num2|Stack])    -> [Num2 + Num1|Stack];
rpn("-", [Num1, Num2|Stack])    -> [Num2 - Num1|Stack];
rpn("*", [Num1, Num2|Stack])    -> [Num2 * Num1|Stack];
rpn("/", [Num1, Num2|Stack])    -> [Num2 / Num1|Stack];
rpn("^", [Num1, Num2|Stack])    -> [math:pow(Num2, Num1)|Stack];
rpn("sqrt", [Num1 | Stack])     -> [math:sqrt(Num1) | Stack];

rpn(X, Stack)                   -> [list_to_integer(X)|Stack].


