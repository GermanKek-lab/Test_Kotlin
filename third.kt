fun main() {
  var M: Int = readLine()!!.toInt()
  var N: Int = readLine()!!.toInt()
  var x: Int = readLine()!!.toInt()
  var y: Int = readLine()!!.toInt()

  if (N > 1) {
    if (y == 1){
      print(x)
      print(" ")
      println(y + 1)
    } else if (y == N){
      print(x)
      print(" ")
      println(y - 1)
    } else {
      print(x)
      print(" ")
      println(y - 1)
      
      print(x)
      print(" ")
      println(y + 1)
    }
  }

  if (M > 1) {
    if (x == 1) {
    
      print(x + 1)
      print(" ")
      printn(y)
    
    } else if (x == M){
      
      print(x - 1)
      print(" ")
      println(y)
    
    } else {
      print(x - 1)
      print(" ")
      println(y)
      
      print(x + 1)
      print(" ")
      println(y)
    }
  }
}
