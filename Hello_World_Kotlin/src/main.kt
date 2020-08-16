fun main(){

}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("This Animal is making noise!")
    }

    open fun eat(){
        println("This Animal is eating!")
    }

    open fun roam(){
        println("This Animal is roaming")
    }

    fun sleep(){
        println("This Animal is sleeping")
    }
}