fun main() {


    print("Введите число: ")
    var a: Int
    a = readLine()!!.toInt()
    var d = a / 10 //3
    var d1 = a % 10 //
    var sum: Int
    sum = d + d1
    var umn: Int
    umn = d * d1
    println("Сумма: $sum")
    print("Умножение: $umn")
}
