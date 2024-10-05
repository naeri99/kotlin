package exp.example

class CollectionTest( private val data: Array<Int>){
    private var _intList: MutableList<Int> = mutableListOf()

    val intList: MutableList<Int>
        get() {
            println("Getter is called for intList")
            return _intList  
        }
    
    init{
        for (num in data){
            _intList.add(num)
        }

    }



}