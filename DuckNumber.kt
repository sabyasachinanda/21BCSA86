// Q5.	Check if a number is duck number or not

fun main() {
    val number = "2024"
    var isDuck = false

    if (number[0] != '0') {
        for (char in number) {
            if (char == '0') {
                isDuck = true
                break
            }
        }
    }

    if (isDuck) {
        println("$number is a Duck number.")
    } else {
        println("$number is not a Duck number.")
    }
}
