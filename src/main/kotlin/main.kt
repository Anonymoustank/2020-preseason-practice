package practice;

object main {
    @JvmStatic
    fun main(args: Array<String>) {
    	main12.main()
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
	    
	    main2.main()

	    var sum_square = 0
	    for (i in 1..100){
	    	sum_square += i * i
	    }
	    var square_sum = 0
	    for (i in 1..100){
	    	square_sum += i
	    }
	    square_sum *= square_sum
	    println(square_sum - sum_square)

	    main3.main()

	    main4.main()

	    main5.main()

	    main6.main()

	    main7.main()

	    main8.main()

	    main9.main(2, 15)

	    main10.main(5)

	    main11.main(220)

	    main13.main()

	    main14.main()
	    }


}
