fun highAndLow(numbers: String): String {
    val nums = numbers.split(" ").map { it.toInt() }
//    val nums = numbers.split(" ")
//    val nums2: Int = nums.toInt()
    val max = nums.max()
    val min = nums.min()
    return "$max $min"
}

fun main() {
    val number = "1 2 3 4 5"
    println(highAndLow(number))
}

/*
Please return the maximum and minimum number from a string that contains many integer.
e.g. : "1 2 3 4 5" -> 5 1
       "-3 6 9 12 7" -> 12 -3
 */
