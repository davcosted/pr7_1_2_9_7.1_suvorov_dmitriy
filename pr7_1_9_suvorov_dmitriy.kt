fun main(){
    try {
        println("Введите a b c")
        print("a = ")
        var a = readLine()!!.toDouble()
        print("b = ")
        var b = readLine()!!.toDouble()
        print("c = ")
        var c = readLine()!!.toDouble()
        var p:Double = (a+b+c)/3
        var q:Double = Math.cbrt(a*b*c)
        var arf:Long = Math.round(p)
        var gem:Long = Math.round(q)
        println("Среднее арифметическое abc = $arf")
        println("Среднее геометрическое abc = $gem")
    }catch(d:Exception){
        println("Неверный формат данных")
    }
}