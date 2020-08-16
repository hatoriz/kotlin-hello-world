fun main(){
    var hip = Hippo()
    hip.eat()
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

class Hippo : Animal() {
    //สร้างคลาส Hippo แต่ยังไม่ได้ทำอะไร
}