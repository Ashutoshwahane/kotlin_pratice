fun main(args : Array<String>){
    var lst = listOf(1,2,4,5,6,2,312,34,646)
    for ((i,e) in lst.withIndex()){
        println("$i : $e")
    }
}