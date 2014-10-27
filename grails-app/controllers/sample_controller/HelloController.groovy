package sample_controller

class HelloController {

	def index() {
		def list = Person.list()
		def person = new Person(age:55)
		def numberofRecodrds = Person.count()
		[list:list, person: person, numberofRecodrds: numberofRecodrds]
	}

	def hi() {
		render (view:'index.gsp')
	}

	def save() {
		def person = new Person(params)
		person.save()
		render "success!"
	}
}
