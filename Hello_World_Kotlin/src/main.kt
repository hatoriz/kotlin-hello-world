//Chapter 4
//For 2 august 2020 class

fun main(){

    //-------------------- let's define a dog class ------------------------
    class Dog(val name: String, val weight: Int, val breed: String) {
        fun bark() {
            println(if (weight < 20) "${breed} - Yep!" else "${breed} - Woof!")
        }
    }

    var my70Dog = Dog("Fido", 70, "Mixed")
    var my20Dog = Dog("Shiro", 15, "Golden retriever")

    my70Dog.bark()
    my20Dog.bark()
    //-------------------- let's define a dog class ------------------------





}