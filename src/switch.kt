fun main(args : Array<String>){
    val num : Int = 100

    // switch case in kotlin
    // when is a keyword like switch
    when(num){
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        10 -> println("ten")
        else -> print("wrong input")
    }

    // when as expression
    var str = when(num){
        1 -> "one"
        100 -> "hundred"
        10 -> "ten"

        else -> "wrong input"
    }

    println(str)
}