object main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello World")
    var x = 0
    var y = 0
    var sum_even = 0
    for (i in 1..10){
    	if (x == 0){
    		println(x)
    		x += 1
    		println(x)
    	}
    	x += y
    	y = (x - y)
    	println(x)
    	if (x % 2 == 0){
    		sum_even += x
    	}

    }
    println("The sum of the evens is...")
    println(sum_even)

    var sum_natural = 0
    for (i in 1..999){
    	if ((i % 3 == 0) || (i % 5 == 0)){
    		sum_natural += i
    	}
    }
    println(sum_natural)
    var highest_number = 0
    for (i in 100..999){
    	for (x in 100..999){
    		var palindrome = i * x
    		var reversed_number = 0
    		var multiplier = 6
    		if (i * x > highest_number){
    			highest_number -= highest_number
    			highest_number += i * x
    		}
    		
    	}
    }
    println(highest_number)
    }
}
