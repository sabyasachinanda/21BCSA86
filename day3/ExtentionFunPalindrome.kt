// Extension Functions

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    val word1 = "hello"
    println("$word1 is a palindrome: ${word1.isPalindrome()}")
    
    val word2 = "malayalam"
    println("$word2 is a palindrome: ${word2.isPalindrome()}")
}
