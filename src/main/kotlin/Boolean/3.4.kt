fun main() {
    print("Число А: ")
    var a:Int
    a= readLine()!!.toInt()
    print("Число B: ")
    var b:Int
    b= readLine()!!.toInt()
    var c:Boolean=a>2&&b<=3
    println("$c")
}