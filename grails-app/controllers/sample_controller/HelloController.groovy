package sample_controller

class HelloController {

	def index() {
		def list = Person.list()
		def numberofRecodrds = Person.count()
		def person = new Person()
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
