fun main()
{
    val dog1 = Dogs(4,"Brown")
    dog1.eat()
    dog1.sleep()
    dog1.sound("Bark")  // Through normal function method
    dog1.sound2()                // Through overriding method
    dog1.character()

    val cat1 = Cats(4,"Black")
    cat1.eat()
    cat1.sleep()
    cat1.sound("Purr")
    cat1.character()
}