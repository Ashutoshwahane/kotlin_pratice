fun main(args: Array<String>){

    // ascending
    var num = 1..10
    for(i in num){
        println("using .. $i")
    }
    // ascending using until keyword
    // here until is a infix funtion means we can call a class funtion without using .
    var num1 = 1 until 10
    for(i in num1){
        println("using until $i")
    }

    // descending using downtown
    var mun = 10 downTo 1
    for(i in mun){
        println("using downto $i")
    }

    //descending using reversed()
    var num2 = 1 until 10
    for(i in num2.reversed()){
        println("using reversed $i")
    }

    println("count ${num2.count()}")
    var alpha = 'A' .. 'z'
    for ( i in alpha){
        println(i)
    }
    println(alpha.count())
}