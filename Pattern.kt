// Q1.Print the pattern

fun main() {
    val n = 5

    for (i in 0 until n) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (j in 0 until 2 * i + 1) {
            print("*")
        }
        println()
    }
    for (i in n - 2 downTo 0) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (j in 0 until 2 * i + 1) {
            print("*")
        }
        println()
    }
}
