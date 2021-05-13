/*
Description:
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */
fun findShort(s: String): Int {
    val str = s
    val list = s.split(' ')
    var min = 26
    for (word in list){
        if (word.length < min){
            min = word.length
        }
    }
    return min
}


fun main() {
    val min = findShort("a bb ccc dddd")
    println(min)
}