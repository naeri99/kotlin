package exp.example.inherittwo

class SubOneAdd:InheritanceAdd{
    var bonusDefence: Int
    constructor(name: String, power:Int, bonusDefence: Int ): super(name, power, "golrem"){
        
        this.bonusDefence = bonusDefence
    }
    fun defence(){
        println("defence $bonusDefence from enemy's damage")
    }
}