package practice;

object main7 {
    fun main() {
        var divisor_amount = 0
        var number = 1
        var previous_number = 2
        var i = 0
        while (divisor_amount < 6){
            divisor_amount = 0
            for (i in 1..number){
                if (number % i == 0){
                    divisor_amount += 1
                }
            }
            if (divisor_amount < 6){
                number += previous_number
                previous_number += 1
            }
            else {
                break
            }
        }
        println(number)
    }
}
