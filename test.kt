fun main()
{
    val a = 10
    val b = 10
    val max = if (a >= b) a else b
    println(max)
    when (max) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}