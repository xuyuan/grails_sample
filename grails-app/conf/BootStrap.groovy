import sample_controller.Person

class BootStrap {

	def init = { servletContext ->

		if (Person.count() == 0) {
			def p = new Person(firstName: 'John', lastName: 'Doe')
			if (!p.validate()) {
				println "error in bootstrap"
				p.errors.allErrors.each { println it }
			}
			p.save()

			new Person(firstName: 'Jane', lastName: 'Smith').save()
			new Person(firstName: 'Scott', lastName: 'Robinson').save()
			println "${Person.count()} persons was added in bootstrap"
		}
	}
	def destroy = {
	}
}
