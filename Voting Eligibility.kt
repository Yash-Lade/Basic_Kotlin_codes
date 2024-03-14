fun main()
{
    var El=Eligibility(name = "Yash", age = 19)
    El.canvote(age = 19,"Yash")
}

class Eligibility(var name:String , var age:Int)
{
    public
    fun canvote(age: Int,name: String) {
        if (age >= 18)
            println(name+"is eligible for voting")

        else
            println(name +"is not eligible for voting")
    }
}