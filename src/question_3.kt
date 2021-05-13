/*
Simply Multiplication
Description:
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */

fun simpleMultiplication(n: Int): Int {
    var no = n
    if(no%2==0){
        no=no*8
    }else{
        no=no*9
    }
    return no
}

fun main() {
    val number = simpleMultiplication(7)
    println(number)
}