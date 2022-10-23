fun main() {
        val a: Int
        println("Введите сторону а: ")
        a= readLine()!!.toInt()
        val b: Int
        println("Введите сторону b: ")
        b= readLine()!!.toInt()
        var s:Int
        var p:Int
        s=a*b
        p = 2 * (a + b)
        println("Площадь равна=$s ")
        println("Периметр равен=$p")
}