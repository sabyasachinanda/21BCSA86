// Recursive Functions

fun factorial(n: Int): Long {
    return if (n <= 1) 1
    else n.toLong() * factorial(n - 1)
}
fun main(){
    val number = 4
    println("Factorial of $number is ${factorial(number)}")
}
