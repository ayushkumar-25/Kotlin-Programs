class Friend(var name: String, var height: Double, var age: Int)
{
    fun character()
    {
        println("My friends are the best in the world.")
        println("Both are my the best friends.")
    }
}


fun main()
{
    val f1 = Friend("Rajat", 5.6, 20)
    println("${f1.name} is my classmate. His height is ${f1.height} and age is ${f1.age}.  ")

    val f2 = Friend("Rohit", 5.5, 21)
    println("${f2.name} is my Hostel mate. His height is ${f2.height} and age is ${f2.age}.  ")

    f1.character()
}