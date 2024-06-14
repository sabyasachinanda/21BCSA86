fun filterTransform(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
                  .map { it * 2 }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val result = filterTransform(numbers)
    println(result)
}
