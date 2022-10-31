fun main() {
    print("Введите число: ")
    var a:Int
    a= readLine()!!.toInt()
    print("Введите число: ")
    var b:Int
    b= readLine()!!.toInt()
    print("Введите число: ")
    var c:Int
    c= readLine()!!.toInt()
    if (a<b&&a<c)
        print("$a")
    else if (b<c&&b<a)
        print("$b")
    else if (c<b&&c<a)
        print("$c")

}