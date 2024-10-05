package exp.example.inheritone

open class Inheritance(open var name :String, open var power: Int, var type :String ){
    fun attack(){
        println("$name complicated attack damage $power")
    }
}