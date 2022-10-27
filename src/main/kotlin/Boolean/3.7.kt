fun main() {
    print("Число А: ")
    var a:Int
    a= readLine()!!.toInt()
    print("Число B: ")
    var b:Int
    b= readLine()!!.toInt()
    print("Число C: ")
    var c:Int
    c= readLine()!!.toInt()
    var x:Int
    x=(b*b)-4*a*c
    val g:Float=(a*(x*x)+b*x+c)
    var k:Boolean =g%2&&a>0
    println("$k")
















}