import kotlin.io.readLine as kotlinIoReadLine

fun main()
{
    var n: String? = kotlin.io.readLine()

    when (n){
        "0" -> println("The number is 0.")
        "1" -> println("The number is 1")
        "2" -> println("The Number is 2.")
        else -> print("None of above.")
    }
}