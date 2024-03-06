fun main()
{
    println("A kotlin program by YasH Lade \n")
    print("Enter first number :")
    val input= readLine()
    var num=input?.toIntOrNull()

    print("Enter second number :")
    val input1= readLine()
    var num1=input1?.toIntOrNull()

    if(num!=null && num1!=null) {
        val sum = num1 + num
        print("The sum is : $sum")
    }
}
