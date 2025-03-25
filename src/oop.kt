class Myclass{
//    data member
    var myname:String="My name is Caleb."
//    member function
    fun display(){
        println(myname)
    }
}

fun main(args: Array<String>) {
//    create an instance object
    val myobj=Myclass()
    myobj.display()
//    instance of an object
    val obj2=Car()
    obj2.brand="Mercedes"
    obj2.model="G-class"
    obj2.yearofman="2023"

    println("My favourite car is ${obj2.brand} and the model is ${obj2.model} manufactured in ${obj2.yearofman}")
}
class Car{
    var brand=""
    var model=""
    var yearofman=""
}