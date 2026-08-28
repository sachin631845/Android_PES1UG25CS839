// TODO - add exception handling

fun getNumber(data: String): Int {
    return try {
        data.toInt()
    } catch (e: NumberFormatException) {
        println("Invalid number: $data")
        0
    }
}

fun main() {
    println(getNumber("12"))    // Valid number
    println(getNumber("a1as"))  // Invalid number
}
