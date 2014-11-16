-module(addressBook).
-author("Łukasz").

%% API
-export([createAddressBook/0, addContact/3]).

-record(person, {firstname = "", lastname = "", email = [], phone = []}).

createAddressBook() -> [].

addContact(Firstname, Lastname, AB) ->
  #person{firstname = Firstname, lastname = Lastname}.

