 fun main() {
        println("Ввведите x: ")
        var x: Float
        x = readLine()!!.toFloat()
        var f: Float
        if (x <= 0) {
            f = x
            println("f(x)=$f")
        } else if (0 < x&&x<2) {
            f = x * x
            println("f(x)=$f")
        } else if (x >= 2) {
            f= 4F
            println("f(x)=$f")
        }
     else{}

    }
