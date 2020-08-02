//-------------------- let's define a dog class
//class Dog(val name: String, val weight: Int, val breed: String) {
class Dog(val name: String, val weight: Int, breed_param: String) {

    init {
        println("Dog ${name} has been created")
    }

    val activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    val weightiInKgs: Double
    get() = weight / 2.2

    var newWeight = weight
    set(value) {
        if (value>0){
            field = value
        }

    }


    init {
        println("The breed is ${breed} and ${weightiInKgs} kgs")
    }

    fun bark() {
        println(if (weight < 20) "${name} - Yep!" else "${name} - Woof!")
    }
}
