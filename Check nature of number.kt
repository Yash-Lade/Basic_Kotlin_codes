fun main()
{
    print("Enter a number :")
    val input= readlnOrNull()
    val no=input?.toInt()

    if (no!=null)
    {
    if (no%2==0)
        print("Entered number ($no) is Even")

    else
        print("Entered number ($no) is Odd")
    }
}