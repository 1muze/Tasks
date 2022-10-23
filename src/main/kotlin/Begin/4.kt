fun main() {
    print("Введите длину ребра: ")
    val a:Int
    a= readLine()!!.toInt()
    var v:Int
    v=a*a*a
    var s:Int
    s=6*(a*a)
    println("Объем куба равен=$v")
    println("Площадь куба равна=$s")
}

