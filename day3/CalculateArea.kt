/*Define two overloaded functions named calculateArea that calculate the area
of a rectangle and a circle. The first function should take two parameters (length
and breadth) and return the area of a rectangle. The second function should take
one parameter (radius) and return the area of a circle.*/

fun calculateArea(length: Double, breadth: Double): Double {
    return length * breadth
}

fun calculateArea(radius: Double): Double {
    return 3.14 * radius * radius
}

fun main() {
    val rectangleArea = calculateArea(10.0, 20.0)
    println("Area of the rectangle: $rectangleArea")
    
    val circleArea = calculateArea(5.0)
    println("Area of the circle: $circleArea")
}
