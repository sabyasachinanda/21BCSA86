//Higher-Order Function

fun operation(a: Int,b: Int, op:(Int, Int) -> Int): Int{
    return op(a,b)
}

fun main() {
    val sum = operation(10, 5){
        x, y -> x + y
    }
    println("Sum: $sum")
    
    val diff = operation(10, 5){
        x, y -> x - y
    }
    println("Difference: $diff")
    
    val mul = operation(10, 5){
        x, y -> x * y
    }
    println("Product: $mul")
    
    val div = operation(10, 5){
        x, y -> x / y
    }
    println("Division: $div")
}
