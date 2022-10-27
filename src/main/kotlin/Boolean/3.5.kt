fun main() {
    print("Число А: ")
    val a:Int
    a= readLine()!!.toInt()
    print("Число B: ")
    val b:Int
    b= readLine()!!.toInt()
    val c:Boolean=a%2==1&&b%2==1
    println("$c")
}