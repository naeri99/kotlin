package exp


import exp.example.CollectionTest
import exp.example.Matrix
import exp.example.inherittwo.SubTwoAdd
import exp.example.inherittwo.SubOneAdd


class Test{


    constructor(){
        println("start test")
    }
    
    fun testInheritance(){
        val test1: SubOneAdd = SubOneAdd("jane", 10, 500)
        test1.defence()
        test1.attack()


        val test: SubTwoAdd = SubTwoAdd("brother", 100)
        test.powerAttack()
        test.attack()
    }

    fun makeClass(){
        val argInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)

        val collection = CollectionTest(argInt)


        println(collection.intList)  

    }

    fun threeDim(){

        val testtow : Matrix = Matrix()
    }


}




