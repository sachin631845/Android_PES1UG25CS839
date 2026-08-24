//PESIUG25CS839
fun convert(names: Array<String?>) {
    for (i in names.indices) {
        val name = names[i]

        // Explicit null check
        if (name != null) {
            names[i] = name.uppercase()

            // Assertion operator (!!), safe here after null check
            val confirmedName = name!!
            println("Assertion: ${confirmedName.uppercase()}")
        }

        // Safe-call operator (?.) and Elvis operator (?:)
        val converted = name?.uppercase() ?: "NO NAME"
        println(converted)
    }
}

fun main() {
    val names = arrayOf("john", null, "merry", "robert")

    convert(names)

    println(names.contentToString())
}