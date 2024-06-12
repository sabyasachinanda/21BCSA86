// Q3.	Find the GCD of two numbers using Euclidean method
fun main() {
    var a = 15 
    var b = 20 

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    println("GCD is $a")
}
