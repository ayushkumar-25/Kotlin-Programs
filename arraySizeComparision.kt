fun main()
{
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
}

fun compareArrayLength(a:Array<String>, b:Array<String>):Unit = if (a.size == b.size){
    println("Both the arrays are of equal length.")
}
else {
    println("Not equal arrays")
}