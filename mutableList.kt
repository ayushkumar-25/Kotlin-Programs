fun main()
{
    var s = mutableListOf<Any>("Fan", "TV", "AC", "Oven")
    println(s)

    // Adding a element to the list in the last position
    s.add("DishWasher")
    println(s)

    // Adding a element to the list in the specific index number
    s.add(2, "Chimney")
    println(s)

    // Removing a element from the mutable list through its "element name"
    s.remove("AC")
    println(s)

    // Removing a element from the mutable list through its "element index"
    s.removeAt(1)
    println(s)

    // Adding a whole new array to the list
    var ar1 = arrayOf(1, 2, 3, 4, 5)
    s.addAll(ar1)
    println(s)

    // Adding a whole new array in the middle of the list
    var ar2 = arrayOf(9, 8, 7, 6)
    s.addAll(2, ar2.toList())
    println(s)




}