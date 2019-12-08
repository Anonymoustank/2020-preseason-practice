package practice;

object main13 {
    fun main() {
        var hi = "bc"
        var letter_number = 0
        var value_number = 0
        var alphabet = "abc"
        for (i in hi){
        	for (x in alphabet){
        		letter_number += 1
        		if (x == i){
        			value_number += letter_number
        		}
        	}
        	letter_number = 0
        }
        println("The answer to Euler 22 is...")
        println(value_number)
}
}
