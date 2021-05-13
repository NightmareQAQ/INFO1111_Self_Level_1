/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0
 */
fun sum(numbers: IntArray): Int {
    var addition = 0

    for( number in numbers ) {
        if( number > 0 ) {
            addition = addition + number
        }
    }
    return addition
}

fun main() {
    val sum = sum(intArrayOf(1, 2, -1, 3, 7))
    println(sum)

}

