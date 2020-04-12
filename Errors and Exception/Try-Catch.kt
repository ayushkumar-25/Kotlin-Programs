fun main()
{
    var ar = arrayOf<Any>(0,1,2,3,4)

    try {
        ar[6]=10
    }catch (e1: ArrayIndexOutOfBoundsException){
        println("Caught the 'Array Index Out of Bound Exception.'")
    }

    finally {
        println(ar.contentToString())
    }


}