fun main() {
    print("Введите трёхзначное число:")
    var a:Int
    a= readLine()!!.toInt()
    var ch1:Int
    var ch2:Int
    ch1=a/100
    ch2=a%100
    println("Перенос 1 цифры в конец: $ch2$ch1")

}