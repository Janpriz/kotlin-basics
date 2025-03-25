fun main(args: Array<String>) {
    var num =10
    while (num>=5){
        println("Loop: $num")
        num -=2
    }
//    for loop
    val students= arrayOf("Erick","jane","Michael","caleb")
    students.sort()
    for (i in students)
        println(i)
    val nambari= arrayOf(-4,5,3,4,5,74,88,7,1,0,-5)
    nambari.sort()
    for (c in nambari){
        println(c)
    }
}