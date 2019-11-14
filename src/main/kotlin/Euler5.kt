package practice;

object main3 {
    fun main() {
        var test_num = 13195
        var highest_prime = 0
        for (i in 2..131914){
            if (test_num % i == 0){
                if (i > highest_prime){
                    highest_prime = i
                }
            }
        }
        println(highest_prime)
    }
}
