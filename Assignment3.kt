//PESIUG25CS839
fun main() {
    val phoneNumbers = listOf("1234567890", "123", "", "0987654321")

    // 1. Filter valid phone numbers (exactly 10 digits)
    val validNumbers = phoneNumbers.filter { number ->
        number.length == 10 && number.all { it.isDigit() }
    }

    println("Valid numbers: $validNumbers")

    // 2. Print each number; print NAN when invalid
    phoneNumbers.forEach { number ->
        println(
            if (number.length == 10 && number.all { it.isDigit() }) number else "NAN"
        )
    }

    // Same result using map()
    val displayNumbers = phoneNumbers.map { number ->
        if (number.length == 10 && number.all { it.isDigit() }) number else "NAN"
    }

    println(displayNumbers)
}
