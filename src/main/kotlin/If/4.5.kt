fun main() {

println("Ввведите x: ")
val x:Int
x= readLine()!!.toInt()
println("Введите y: ")
val y:Int
y= readLine()!!.toInt()
if (x>0&& y>0) {
    println("Первая четверть!")
}else if (x<0&&y>0) {
    println("Вторая четверть!")
}else if (x<0&&y<0){
    println("Третья четверть!")
} else if (x>0&&y<0) {
    println("Четвёртая четверть!")}
}
//Скопировал из Boolean,скорее всего в Boolean не так сделал,если нет,то скажи пожалуйста,я переделаю!
