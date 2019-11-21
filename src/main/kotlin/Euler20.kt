package practice;

object main10 {
    fun main(number: Int) {
        var smaller_num = number - 1
        var total = number
        while (smaller_num > 1){
            total *= smaller_num
            smaller_num -= 1
        }
        println("Euler 20 solution is...")
        var sum_digit = 0
        while (total > 0){
            val remainder = (total % 10)
            sum_digit += remainder
            total /= 10
        }
        println(sum_digit)
    }
}
