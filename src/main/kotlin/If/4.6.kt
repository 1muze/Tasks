fun main() {
   println("Ввведите x: ")
    var x:Float
    x= readLine()!!.toFloat()
    var f:Float
    if (x>0) {
        f = 2 * x
        println("f(x)=$f")
    }else if (x<=0) {
        f=6-x
    println("f(x)=$f")}

}