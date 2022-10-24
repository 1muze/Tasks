fun main() {
    print("Введите число: ")
    var a:Int
    a= readLine()!!.toInt()
    var d=a/100
    var d1=a%100/10
    var d2=a%10
    var sum:Int
    sum=d+d1+d2
    var umn:Int
    umn=d*d1*d2
    println("Сумма: $sum")
    print("Умножение: $umn")
}

