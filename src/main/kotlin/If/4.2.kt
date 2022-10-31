fun main() {
    print("Введите a: ")
    var a:Int
    a= readLine()!!.toInt()
    print("Введите b: ")
    var b:Int
    b= readLine()!!.toInt()
    if (a>b) {
        println("Число больше: $a")
    }else if (a==b){
       println("Числа равны")
    }else if (a<b){
        println("Число больше: $b ")
    }
    }