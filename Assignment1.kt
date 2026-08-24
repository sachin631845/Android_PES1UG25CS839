//PESIUG25CS839
fun main() {
    val data = "Hi! How are you?"

    var vowels = 0
    var spaces = 0

    for (ch in data) {
        when (ch.lowercaseChar()) {
            'a', 'e', 'i', 'o', 'u' -> vowels++
            ' ' -> spaces++
        }
    }

    // when used as an expression
    val message = when {
        vowels > 0 -> "The string has vowels"
        else -> "The string has no vowels"
    }

    println("Vowels: $vowels")
    println("Spaces: $spaces")
    println(message)
}
