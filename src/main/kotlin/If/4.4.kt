fun main() {
    print("Введите число: ")
    var a:Int
    a= readLine()!!.toInt()
    print("Введите число: ")
    var b:Int
    b= readLine()!!.toInt()
    if (a<b) {
       a=b
        print("Число A<B⇒ = A=$a B=$b")
    }else if (a>b){
        b=a
        print("Число A>B⇒ = A=$a B=$b")
    } else if (a==b){
        a=0
        b=0
        print("Число A=B⇒ A=$a B=$b")
    }
}
