//Chapter 4
//For 2 august 2020 class
// Reformat Code from the main menu or press Ctrl+Alt+L

fun main(){

    var my70Dog = Dog("Fido", 70, "Mixed")
    var my20Dog = Dog("Shiro", 15, "Golden retriever")

    my70Dog.bark()
    my20Dog.bark()
    //-------------------- let's define a dog class

    //-------------------- What if the Dog is in a Dog array?
    var dogs = arrayOf(Dog("Lucky", 15, "Mixed"), Dog("Browny",40, "Thai"))
    dogs[0].bark()
    dogs[1].bark()

    //-------------------- What if the Dog is in a Dog array?

    //Create a Songs application
    val songOne = Song("As long as you love me", "Backstreet boy")
    val songTwo = Song("Lucky", "Britney Spears")

    songOne.play()
    songOne.stop()
    songTwo.play()
    songTwo.stop()
}