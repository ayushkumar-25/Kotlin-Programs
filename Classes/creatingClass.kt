class Dog
{
    var breed: String? = null
    var colour: String? = null
    var age: Int? = null

    fun eat()
    {
        val food = "Pedigree"
        println("The dog eats $food.")
    }
}


fun main()
{
    val dog1 = Dog()
    dog1.breed = "Labrador"
    dog1.colour = "Brown"
    dog1.age = 3
    println("The dog's breed is ${dog1.breed}. Its colour is ${dog1.colour} and age is ${dog1.age}.")


    val dog2 = Dog()
    dog2.breed = "Pug"
    dog2.colour = "Dirty While"
    dog2.age = 2
    println("The dog's breed is ${dog2.breed}. Its colour is ${dog2.colour} and age is ${dog2.age}.")
    dog1.eat()
}