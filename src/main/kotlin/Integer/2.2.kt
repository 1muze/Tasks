fun main() {
    print("Введите число секунд: ")
    var a:Int
    a= readLine()!!.toInt()
    var x:Int
    x=a/60
    println("Полных минут:$x")
}