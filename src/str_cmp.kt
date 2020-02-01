fun main(args: Array<String>){
    var nick_name : String = "goldy"
    var real_name : String = "Goldy"
    var name : String? = null

    if(nick_name.equals(real_name, true)){
        println(" kotlin :the nick name $nick_name and the real name $real_name is same")
    }
    else{
        println("kotlin : not same")
    }

    if(nick_name == real_name){
        println("java : same name")
    }
    else{
        println("java : not same")
    }
}