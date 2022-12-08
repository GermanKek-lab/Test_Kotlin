fun main() {
    val day1: Int = readLine()!!.toInt()
    val mon1: Int = readLine()!!.toInt()
    val ye1: Int = readLine()!!.toInt()
    val dai_2: Int = readLine()!!.toInt()
    val mon2: Int = readLine()!!.toInt()
    val ye2: Int = readLine()!!.toInt()
    
    if (ye1 > ye2){
        println("2 старше")
    } else if (ye1 < ye2){
        println("1 старше")
    } else if (ye1 == ye2){
        if (mon1 > mon2){
            println("2 старше")
        }
        else if (mon1 < mon2){
            println("1 старше")
        }
        else if (mon1 == mon2){
            if (day1 > dai_2){
                println("2 старше")
            }
            else if (day1 < dai_2){
                println("1 старше")
            }
            else{
                println("Один в один")
            }
        }
    }
}
