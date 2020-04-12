fun main() {

    var myList = mutableListOf<Any>("This", "is", "a", "new", "list")
    println(myList)

    myList.set(3, "Brand New")  //this is same as ''' myList[3] = "Brand New" '''
    println(myList)

}