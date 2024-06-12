// Q2.	Check if the number is Armstrong number or not

fun main() {
    val number = 153 
    var temp = number
    var sum = 0
    val digits = number.toString().length

    while (temp != 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt()
        temp /= 10
    }

    if (sum == number) {
        println("$number is an Armstrong number.")
    } else {
        println("$number is not an Armstrong number.")
    }
}
