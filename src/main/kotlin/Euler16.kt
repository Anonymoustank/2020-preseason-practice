package practice;

object main9 {
    fun main(base: Int, exp: Int) {
        var num = 1
        for (i in 1..exp){
            num *= base
        }
        var sum_digit = 0
        while (num > 0){
            val remainder = (num % 10)
            num /= 10
            sum_digit += remainder
        }
        println("Euler 16 solution is...")
        println(sum_digit)
    }
}
