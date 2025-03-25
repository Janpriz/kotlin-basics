fun main(args: Array<String>) {
    var majina= arrayOf("Erick","ken","boswo")
    majina[2]="joel"
    println("My name is ${majina[2]}")

    var nambari= arrayOf<Int>(4,5,8,2,6,6,5,5,2,5,5)
    for (i in nambari){
        println(i)
    }
    for (x in majina){
        println(x)
    }
}