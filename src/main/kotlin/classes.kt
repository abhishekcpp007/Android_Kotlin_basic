
class Calculator(val a:Int,val b:Int) {
    fun add()=a+b
    fun sub()=a-b
    fun mul()=a*b
    fun div()=a/b
}
fun main(){
    val calc=Calculator(10,20)
    println(calc.a)
    println(calc.b)
    println(calc.add())
    println(calc.sub())
    println(calc.mul())
    println(calc.div())

}
