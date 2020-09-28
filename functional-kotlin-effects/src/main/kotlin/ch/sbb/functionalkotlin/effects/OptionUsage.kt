package ch.sbb.functionalkotlin.effects

// Data classes automatically provide attribute-based equals and hashCode (among others)
data class Person(val id: String, val name: String, val address: String, val email: String)

// Exercise 3.5: Implement a function to return a person if and only if all necessary fields can be obtained using the dummy services below
fun findPerson(id: String): Option<Person> = TODO("implement")

private fun findName(id: String): Option<String> = when (id) {
    "42" -> Option("Adams, Douglas")
    "1984" -> Option("Orwell, George")
    else -> Option(null)
}

private fun findAddress(personName: String): Option<String> = when (personName) {
    "Adams, Douglas" -> Option("Galaxy")
    "Orwell, George" -> Option("Animal farm")
    else -> Option(null)
}

private fun findEmail(id: String): Option<String> = when (id) {
    "42" -> Option("marvin@earth.com")
    else -> Option(null)
}
