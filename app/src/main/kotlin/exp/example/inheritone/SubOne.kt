package exp.example.inheritone

class SubOne(override var name :String, override var power: Int):Inheritance(name =name, power= power, "goblin"){
    fun defence(){
        println("defence")
    }
}