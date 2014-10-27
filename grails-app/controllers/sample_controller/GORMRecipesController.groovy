package sample_controller

// http://timsporcic.github.io/GORM-Recipes/
class GORMRecipesController {

	def setup() {
		if (Artist.count() == 0) {
			def artist = new Artist(firstName: 'Lucy', lastName: 'Sparks')
			artist.save()
			artist = new Artist(firstName: 'Lucy', lastName: 'Berg')
			artist.save()
		}
	}

	def index() {
		setup()

		print Artist.count()

		// GORM Dynamic Finder
		def artist = Artist.findAllByFirstName('Lucy')
		println artist
		artist = Artist.findByFirstNameAndLastName('Lucy', 'Berg')
		println artist
		println Artist.countByFirstName('Lucy')

		// GORM Where
		def query = Artist.where { lastName == 'Sparks' }
		artist = query.find()
		print artist
		print query.count()

		// GORM Where plus execute in one action
		artist = Artist.find { firstName == 'Lucy' && lastName == 'Sparks' }
		print artist
	}
}
