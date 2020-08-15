fun main(){
    val animal: Animal = Wolf()
    animal.eat()

    val animals = arrayOf(Hippo(), Wolf())

    for(item in animals){
        item.roam()
        item.eat()
    }
}