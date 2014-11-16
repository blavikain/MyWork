-module(abTests).
-author("Łukasz").

%% API
-export([tAddContact/0]).

tAddContact() ->
  AB = addressBook:createAddressBook(),
  AB1 = addressBook:addContact("Imie1", "Nazwisko1", AB),
  AB1.
