fun main() {
    print("Введите сторону: ")
    var a:Int
    a= readLine()!!.toInt()
    print("Введите сторону: ")
    var b:Int
    b= readLine()!!.toInt()
    print("Введите сторону: ")
    var c:Int
    c= readLine()!!.toInt()
    if (a+b>c&&a+c>b&&c+b>a) {
        println("Треугольник существует!")
    }else {
        println("Треугольник НЕ существует!")
    }
}