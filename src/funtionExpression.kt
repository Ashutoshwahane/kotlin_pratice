fun main(args: Array<String>){

    add(8,2)

    var result1 = add1(10,20)
    println(result1)

    var result2 = add2(5,5)
    println(result2)

    var max_result = max(10,13)
    println(max_result)

}

// take nothing return nothing
fun add(a :Int, b :Int){
    println(a+b)
}

// take something return something
fun add1(a :Int, b :Int) : Int{
    return a+b
}

// kind of inline funtion
fun add2(a :Int, b:Int):Int = a+b

// find max number
fun max(a:Int,b:Int):Int = if (a>b) a else b