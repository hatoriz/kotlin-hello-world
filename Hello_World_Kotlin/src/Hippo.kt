class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

//---------- Canine and Wolf ------------
open class Canine : Animal() {
    override fun roam() {
        println("The Canin is roaming")
    }

}

class Wolf : Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

//---------- end of Canine and Wolf ------------