fun main(){
    try {
        println("Введите номер M")
        var m = readLine()!!.toInt()
        println("Введите номер N")
        var n = readLine()!!.toInt()
        println("Введите член прогрессии M")
        var aM = readLine()!!.toDouble()
        println("Введите член прогрессии N")
        var aN = readLine()!!.toDouble()
        var rez:Double
        rez = ((aM + aN) * (n - m + 1) / 2)
            when{
                (m<n) -> println("Сумма членов прогрессии с номерами от $m до $n: $rez")
                else -> println("Введите M<N")
        }
    }catch (d:Exception)
    {
        println("Неправильный формат данных")
    }
}
