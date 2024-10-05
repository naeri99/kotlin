package exp.example


class Matrix{
    val three : Array<Array<Array<Int>>> = Array(3) { Array(3) { Array(3) { 0 } } }
    constructor(){
        for (layer in three) {
            for (row in layer) {
                println(row.joinToString())
            }
            println("-----")  // Separator between layers
        }

    }

}