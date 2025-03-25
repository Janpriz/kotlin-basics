import java.lang.classfile.constantpool.IntegerEntry

fun main(args: Array<String>) {
    print("Enter the first number:")
    val num1=Integer.valueOf(readlnOrNull())
    print("Enter the second number:")
    val num2=Integer.valueOf(readlnOrNull())
    print("Enter the third number:")
    val num3=Integer.valueOf(readlnOrNull())

//    find the largest number of the three numbers
    if (num2 in (num3 + 1)..<num1){
        println("$num1 is greater than $num2 and $num3")
    }

    else if (num2>num1 && num2>num3){
        println("$num2 is greater than $num1 and $num3")
    }
    else if (num3>num1 && num3>num2){
        println("$num3 is greater than $num2 and $num1")
    }
    else{
        println("All are the same")
    }
}