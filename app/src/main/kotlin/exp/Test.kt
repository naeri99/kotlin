package exp


import exp.example.CollectionTest
import exp.example.Matrix
import exp.example.Inheritance
import exp.example.Sub


class Test{


    constructor(){
        println("start test")
    }
    
    fun testInheritance(){
        val test: Inheritance = Inheritance()
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




