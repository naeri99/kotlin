package exp


import exp.example.CollectionTest
import exp.example.Matrix
import exp.example.SubOne
import exp.example.SubTwo


class Test{


    constructor(){
        println("start test")
    }
    
    fun testInheritance(){
        val test1: SubOne = SubOne("jane", 10)
        test1.defence()
        test1.attack()


        val test: SubTwo = SubTwo("brother", 100)
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




