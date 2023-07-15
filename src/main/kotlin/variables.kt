import kotlin.math.sqrt

fun main(){


    val name:String="Abhishek"
    val x:Int=10
    val y:Float = 23.4f
    var z=x+y
    println(name)
    println(x)
    println(y)
    println(z)
       z=15f
    var str: String?="xyz"// if remove the question mark than throw error and Null safety will not follow
    str=null

    getLength("Hello")
    getLength((null))
   println( areaOfCircle(7))
    println("area of circle${areaOfCircle(12)}")
    println("hypoteneus is ${hypotenuse(0.0)}")
    println("hypoteneus is ${hypotenuse(prep = 12.0,base = 10.0)}")

}

//fun getLength(str: String?):Int?{
  //  return str?.length // compile time error correct by using ? //str?.length
//}


fun getLength(str: String?):Int{
    return str?.length?:0
}

fun areaOfCircle(r:Int) : Double {

return 3.14*r*r }

// STRING INTERPOLATION

fun hypotenuse(prep:Double=0.0,base:Double=0.0):Double{
    return sqrt(prep*prep + base*base)
}

