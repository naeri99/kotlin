package exp.example.inherittwo

class SubTwoAdd:InheritanceAdd{
    constructor(name : String, power: Int  ):super(name, power, "gagoil"){

    }
    fun powerAttack(){
        println("powerful attack!!! Damage!${power*10}")
    }
}