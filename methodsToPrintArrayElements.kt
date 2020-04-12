fun main()
{
    var s = arrayOf("a", "b", "c", "d", "e", "f")

    /* Method-1 */
    for (i in 0..s.size-1){
        print(s[i])
    }

    print("\n")

    /* Method-2*/
    for (i in s.indices){
        print(s[i])
    }

    print("\n")

    /* Method-3 */
    for (i in 0 until s.size){
        print(s[i])
    }

}