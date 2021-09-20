fun main(){
/**/
   //Perform a number check inside of a function that verifies the user has entered a number

fun UserNumbers() {
    //Ask the user to enter a number
    print("please  enter your first number: ")
    val num1 = readLine()!!.toInt()
    //Ask the user to enter a second number
    print("please  enter your second number: ")
    val num2 = readLine()!!.toInt()

    fun AddTwoNumbers(num1: Int , num2: Int) {
        var sum = num1 + num2
        // Display the sum to the user with string interpolation
        println("$num1 + $num2 = $sum")
    }
    //Add the two numbers inside of a function that returns the sum
    AddTwoNumbers(num1,num2)

}
var Check = true
    //Use a loop to allow users to perform further calculations
    while (Check){
        UserNumbers()
        print("Would you like to add more numbers? (Y/N) : >>")
        var User_choice = readLine().toString()
        if (User_choice.toLowerCase() == "y" ){
            //return UserNumbers()

        } else if(User_choice.toLowerCase() == "n" ){
            Check=  false
            print("bye")
            break
        } else {
            print("Please choose Y or N")
            break
        }


    }

}
