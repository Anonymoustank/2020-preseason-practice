package practice;

object main5 {
    fun main() {
        var solution_found = false
        var a_number = 1
        var b_number = 1
        var c_number = 1
        for (a in 1..501){
            for (b in 1..501){
                for (c in 1..501){
                    var a_squared = a * a
                    var b_squared = b * b
                    var c_squared = c * c
                    if (a_squared + b_squared == c_squared){ 
                        if (a + b + c == 1000){
                            a_number = a
                            b_number = b
                            c_number = c
                            if (solution_found == false){
                                println("Euler 8 solution is...")
                                println(a_number)
                                println(b_number)
                                println(c_number)
                                solution_found = true
                                break
                            }
                        }
                    }
                }
            }
        }
    }
}
