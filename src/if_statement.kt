fun main(args: Array<String>) {
    //check whether a number is odd or even
//    print("Enter age:")
    val num=33

    if (num%2==0){
        println("$num is an even number")
    }
    else{
        println("$num is an odd number")
    }
    print("Enter age:")
    val age=Integer.valueOf(readlnOrNull())

    if (age>=18){
        println("You are elligible to vote")
    }
    else{
        println("you are not elligible to vote")
    }

}