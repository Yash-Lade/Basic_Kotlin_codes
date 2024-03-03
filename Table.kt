fun main() {
    print("Enter the number for table: ")
    val input = readLine()
    val num = input?.toIntOrNull()

    if (num != null) {
        println("The table is as follows:")
        for (i in 1..10) {
            val result = num * i
            println("$num * $i = $result")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}
