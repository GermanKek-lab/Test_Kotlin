fun main() {
  var date1:Int = readln()!!.toInt()
  var mes1:Int = readln()!!.toInt()
  var god1:Int = readln()!!.toInt()
  
  var date2:Int = readln()!!.toInt()
  var mes2:Int = readln()!!.toInt()
  var god2:Int = readln()!!.toInt()
  
  if (god1 == god2){
      if (mes1 == mes2)
          if (date1 < date2) println("1 старше")
          else println("2 старше")
      else if (mes1 < mes2) println("1 старше")
      else println("2 старше")
  }
  else if (god1 < god2)println("1 старше")
  else println("2 старше")
}
