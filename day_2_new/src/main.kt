fun main(){
    var x = 1
    //          1   1   2  2  3
    //ต้องพิมคำว่า Yab ba Dab ba Do
    while ( x < 3) {
        print(if (x == 1) "Yab" else "Dab" )
        print("ba")
        x = x + 1
    }
    if (x == 3) println ("Do")
}