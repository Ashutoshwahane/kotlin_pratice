fun main(args: Array<String>){

    var result = cal(100,0.12)
    println(result)

    var result1 = calWithInterest(100)
    println(result1)
}

fun cal(amount : Int, interest : Double) : Int{
    return (amount + amount * interest).toInt()
}

@JvmOverloads
fun calWithInterest(amount: Int, interest: Double = 0.12) : Int{
    return (amount + amount * interest).toInt()
}