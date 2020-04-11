fun main()
{
    var n = 3

    when (n) {
        in 1..10 -> println("The number is between 1&10")
        in 10..20 -> println("The number is between 10&20")
        else -> println("The number nit found")

    }
}
