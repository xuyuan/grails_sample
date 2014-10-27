package sample_controller

class Work {

	String title
	Integer price
	Date created = new Date()

	static belongsTo = [artist: Artist]

	static constraints = {
	}

	static mapping = { created defaultValue: 'now()' }
}
