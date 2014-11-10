class PersonScala (val id: String, val givenName: String, var surname: String) {
	def getGivenName = givenName
	def getSurname = surname
	def setSurname_= (surname: String) = surname
	def getName = {
		givenName + " " + surname
	}

	def getID = id
}