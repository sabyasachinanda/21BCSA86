//Higher-Order Functions

data class Person(val name: String, val age: Int, val id: Int)

fun main(){
    val person1 = Person("Harry", 26, 99)
    val person2 = person1.copy(age = 30, id = 88)
    
    println("Person 1: $person1")
    println("Person 1: $person2")
}
