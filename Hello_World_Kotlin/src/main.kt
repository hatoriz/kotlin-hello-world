fun main(){
    //นี่คือ Hippo ของฉัน
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()

    println("")
    
    //สร้างแมวของเรา
    var mycat = Cat()
    //เขียนให้แมวเรา eat, roam, makenoise, sleep
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()
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

class Cat : Animal(){
    override val image = "cat.jpg"
    override val food = "อาหารแมว"
    override val habitat = "บ้าน"

    override fun makeNoise() {
        println("Meow! Meow!")
    }

    override fun eat() {
        println("The Cat is eating $food")
    }
}