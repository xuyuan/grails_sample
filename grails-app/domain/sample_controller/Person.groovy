package sample_controller

class Person {
	String firstName
	String lastName
	Date birthDate = new Date()


	static constraints = {
		firstName blank: false
		lastName blank: false
	}

	static mapping = { birthDate defaultValue: 'now()' // depends on database
	}
}
