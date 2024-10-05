package exp.example.inheritone

class SubTwo(override var name :String, override  var power: Int):Inheritance(name =name, power= power, "goriila"){
    fun powerAttack(){
        println("powerful attack!!! Damage!${power*10}")
    }
}