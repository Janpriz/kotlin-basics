fun main(args: Array<String>) {
    print("Enter marks:")
    val marks=Integer.valueOf(readlnOrNull())
    if( marks>=80){
        println("Your grade is A")
    }
    else if(marks>=70){
        println("Your grade a is B")
    }
    else if(marks>=60){
        println("Your grade is a C")
    }
    else if(marks>=50){
        println("Your grade is a D")
    }
    else{
        println("You have failed")
    }
}