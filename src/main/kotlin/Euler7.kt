package practice;

object main4 {
    fun main() {
        var prime_found = 2
        var number_check = 3
        var isPrime = true
        while (prime_found != 6){
            for (i in 2..number_check-1){
                if (number_check % i == 0){
                    isPrime = false
                }
            }
            if (isPrime == true){
                prime_found += 1
                isPrime = true
            }
            number_check += 1
            isPrime = true
        }
        number_check -= 1
        println(number_check)
    }
}
