package sample_controller
import groovy.transform.InheritConstructors

@InheritConstructors
class Artist extends Person {

	String style = new String()

	//static hasMany = [works: Work]

	/*static constraints = {
	 }
	 def String toString() {
	 "($id: $name)"
	 }*/
}
