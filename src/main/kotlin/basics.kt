fun main(){
    //val a: Int= readln().toInt()
    //val b:Int = readln().toInt()
    //println("SUM IS ${addnumber(a,b)}")
    println("enter the first name")
    val s:String? = readlnOrNull()
    s.apply {
        println("you entered ${this?.length} numbers of letters")
    }

}
//fun addnumber(a:Int , b:Int): Int {return a+b}