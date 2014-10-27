package sample_controller

class Person {
	String firstName
	String lastName
	//Date birthDate
	int age


	static constraints = {
		firstName blank: false
		lastName blank: false
		//birthDate blank: false
		age blank: false
	}

	//static mapping = { birthDate defaultValue: new Date() }
}
