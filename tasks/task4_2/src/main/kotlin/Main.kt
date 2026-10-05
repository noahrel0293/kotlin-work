// Task 4.2: use of if and ranges

fun main() {
    println("Which pizza do you want? a, b, c, or d?")
    val pizzaOpt = readln().lowercase()
    if (pizzaOpt.length == 1 && pizzaOpt in "a".."d") {
        println("Order accepted")
    }
    else {
        println("Invalid choice!")
    }
}
