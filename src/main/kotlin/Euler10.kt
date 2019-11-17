package practice;

object main6 {
    fun main() {
        var prime_total = 5
        var number_check = 3
        var number_limit = 100000
        var isPrime = true
        for (i in 4..number_limit){
            for (x in 2..i-1){
                if (i % x == 0){
                    isPrime = false
                }
            }
            if (isPrime == true){
                prime_total += i
                isPrime = true
            }
            isPrime = true
        }
        println(prime_total)
    }
}
