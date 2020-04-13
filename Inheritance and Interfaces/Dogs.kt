class Dogs(legs: Int, colour: String):Animals(legs, colour) {

    fun bark(){
        println("I bark.")
    }

    override fun sound2(){
        println("I bark.")
    }
}