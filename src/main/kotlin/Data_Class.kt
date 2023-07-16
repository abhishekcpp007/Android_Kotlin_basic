data class Movie(
        val title: String,
        val director: String,
        val duration :Int,
        val releaseDate:Int,
    val genre: String,)
{ init {
    println("you called init")
   val a=15
    val d=49
}

}

fun main(){
    val m1=Movie("Kal ho na ho","shaNikkhi Adavani",187,2003,"dramedy" )
    print(m1)
}