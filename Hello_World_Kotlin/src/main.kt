//Chapter 4
//For 2 august 2020 class
// Reformat Code from the main menu or press Ctrl+Alt+L

fun main(){
    // น้องชื่อ Lucky, น้ำหนัก 50 ปอนด์ พันธุ์ Golden Retriever
    var lucky = Dog("ลั้กกี้", 50, "Golden Retriever")

    // น้องชื่อ Browny, น้ำหนัก 20 ปอนด์ พันธุ์ Mixed Thai
    var browny = Dog("บราวนี่", 18, "Mixed Thai")

    // น้องชื่อ หางดาบ, น้ำหนัก 100 ปอนด์ พันธุ์บางแก้ว
    var หางดาบ = Dog("หางดาบ",100,"บางแก้ว")

    println(lucky.name)
    println(browny.name)
    println(หางดาบ.name)

    lucky.bark()
    browny.bark()
    หางดาบ.bark()

}