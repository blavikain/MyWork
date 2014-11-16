-module(recordTest).
-author("Łukasz").

%% API
-export([recordTest/0]).

-record(grupa, {nazwa, licznosc, stan=aktywna}).

recordTest() ->
  Grupa1 = #grupa{nazwa="Gruppa1", licznosc=12},
  Grupa2 = #grupa{nazwa="Gruppa2", licznosc=7, stan=0},

  io:format(Grupa1#grupa.nazwa),
  io:format(Grupa2#grupa.nazwa).
