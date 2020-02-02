import java.lang.Exception
import java.lang.NumberFormatException

fun main(args : Array<String>){
    var str : String = "4a"

    var num = try{
        str.toInt()
    }
    catch (e : NumberFormatException){
        println("please provide a number")
    }
    catch (e : Exception){
        println("Exception : $e")
    }
}