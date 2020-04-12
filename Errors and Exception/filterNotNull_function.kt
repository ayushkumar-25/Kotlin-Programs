fun main()
{
    var arr = arrayOf("My", null, "name", null, "is Ayush")
    println("The array with null value => ${arr.contentToString()}")
    println("The array without null value => ${arr.filterNotNull()}")
}