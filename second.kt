fun main(){
    var a: Int = readLine()!!.toInt()
    var b: Int = readLine()!!.toInt()
    var c: Int = readLine()!!.toInt()
    if ((a + b > c) && (a + c > b) && (c + b > a)){
        if (a == b && b == c) {
            println("Существует равносторонний.")
        }
        else if (a == b || a == c || b == c) {
            println("Существует равнобедренный.")
        }
        else {
            println("существует разносторонний.")
        }
    } else {
        println("не существует!")
    }
}
