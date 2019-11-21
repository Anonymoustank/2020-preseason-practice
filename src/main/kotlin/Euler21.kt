package practice;

object main11 {
    fun main(dividend: Int) {
        var divisor = 0
        for (i in 1..dividend-1){
            if (dividend % i == 0){
                divisor += i
            }
        }
        println("Euler 21 is...")
        println(divisor)
    }
}
