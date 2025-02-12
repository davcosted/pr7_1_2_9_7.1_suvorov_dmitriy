fun main(){
    try {
        println("Введите x y z")
        print("x = ")
        var x = readLine()!!.toDouble()
        print("y = ")
        var y = readLine()!!.toDouble()
        print("z = ")
        var z = readLine()!!.toDouble()
        var a: Double
        var b: Double
        a = (Math.sqrt(Math.abs(x-1))-Math.cbrt(Math.abs(y))/1+(Math.pow(x,2.0)/2)+(Math.pow(y,2.0)/4))
        b = (x*Math.round(Math.atan(z)+Math.pow(Math.E,-(x+3))))
        println(a)
        println(b)
    }catch (d:Exception){
        println("Неверный формат данных")
    }
}