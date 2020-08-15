fun main(){
    val animal: Animal = Wolf()
    animal.eat()

    val animals = arrayOf(Hippo(), Wolf())

    for(item in animals){
        item.roam()
        item.eat()
    }

    println("--- Vet is giving a shot for wolf and hippo")
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}