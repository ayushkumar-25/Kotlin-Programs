open class Animals (var legs: Int, var colour: String){


    fun eat(){
        println("I eat.")
    }


    fun sleep(){
        println("I sleep.")
    }


    fun character(){
        println("I have $legs legs and my colour is $colour.")
    }


    fun sound(type: String){
        println("I $type")
    }

    // One another method of doing is overriding
    open fun sound2(){
        println("I make sound.")
    }

}