// Q4.	Find the frequency of letters in a string

fun main() {
    val input = "Hii there"
    val frequency = IntArray(26)

    for (char in input) {
        if (char in 'a'..'z') {
            frequency[char - 'a']++
        }
    }

    for (i in frequency.indices) {
        if (frequency[i] > 0) {
            println("${('a' + i)}: ${frequency[i]}")
        }
    }
}
