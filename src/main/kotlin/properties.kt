class Employee{
  private val _fname:   String=""
    var fname:String=""
        get(){
            return field.lowercase()
        }
        set(value){
            field = value.uppercase()
        }

}
        fun main(){

            val e1=Employee()
            e1.fname="Abhishek"
            println(e1.fname)
        }

