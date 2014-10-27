package sample_controller

class Person {
	String firstName
	String lastName
	Date birthDate = new Date()
	String home = new String()


	static constraints = {
		firstName blank: false
		lastName blank: false
		home blank: true
	}

	static mapping = { birthDate defaultValue: 'now()' // depends on database
	}
}
