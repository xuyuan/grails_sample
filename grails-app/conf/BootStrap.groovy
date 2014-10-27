import sample_controller.Person

class BootStrap {

	def init = { servletContext ->

		if (Person.count() == 0) {
			def p = new Person(firstName: 'John', lastName: 'Doe', age: 20)
			if (!p.validate()) {
				p.errors.allErrors.each { println it }
			}
			p.save()

			new Person(firstName: 'Jane', lastName: 'Smith', age: 18).save()
			new Person(firstName: 'Scott', lastName: 'Robinson', age: 42).save()
			println "${Person.count()} persons was added in bootstrap"
		}
	}
	def destroy = {
	}
}
