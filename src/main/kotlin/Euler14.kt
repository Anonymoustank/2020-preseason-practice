package practice;

object main8 {
    fun main() {
        var count = 0
        var n = 4
        while (n != 1){
            if (n % 2 == 0){
                n /= 2
                count += 1
            }
            else {
                n = 3 * n + 1
                count += 1
            }
        }
        count += 1
        println("Euler 14 solution is..")
        println(count)
    }
}
