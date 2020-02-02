import java.util.*

fun main(args: Array<String>){

    // for tree mapping like key and value
    var detail = TreeMap<String, Int>()
    detail["Ashutosh"] = 1010
    detail["goldy"] = 123

    for((name, num) in detail){
        println("$name : $num")
    }
}