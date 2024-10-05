package exp.example.inherittwo

open class InheritanceAdd(open var name :String, open var power: Int, var type :String ){
    fun attack(){
        println("$name complicated attack damage $power")
    }
}