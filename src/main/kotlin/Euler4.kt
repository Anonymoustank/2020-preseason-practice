package practice;

object main2 {
    fun main() {
    var highest_number = 0
    for (i in 100..999){
    	for (x in 100..999){
    		var palindrome = i * x
    		var real_palindrome = i * x
    		var reversed_number = 0
    		while (palindrome != 0){
    			val digit = palindrome % 10
    			reversed_number = reversed_number * 10 + digit
    			palindrome /= 10
    		}
    		if (reversed_number == real_palindrome){
    			if (i * x > highest_number){
    				highest_number = i * x
    			}
    		}
    		
    	}
    }
    println(highest_number)	
    }
}
