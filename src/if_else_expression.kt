fun main(args: Array<String>){
    var num1 : Int = 100
    var num2 : Int = 199

    var result1 : Int = 0
    var result2 : Int = 0

    // if condition in java can also implemented
    if(num1>num2){
        result1 = num1
    }
    else{
        result1 = num2
    }
    println("java if else loop result : $result1")

    // kotlin if else loop
    result2 = if(num1>num2){
        num1
    }
    else{
        num2
    }
    println("Kotline if else loop result : $result2")



}