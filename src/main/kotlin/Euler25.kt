package practice;

object main14 {
    fun main() {
        println("Hello World")
        var x = 0
        var y = 0
        var sum_even = 0
        while (sum_even < 4){
            sum_even = 0
            if (x == 0){
                x += 1
            }
            x += y
            y = (x - y)
            for (f in "$x"){
                sum_even += 1
            }
            if (sum_even == 4){
                for (z in "$x"){
                    println("The solution to Euler 25 is...")
                    println(x)
                    println(z)
                    break
                }
            }

        }         
}
}
