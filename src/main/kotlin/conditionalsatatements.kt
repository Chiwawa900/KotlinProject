fun main(args: Array<String>) {
    // If statements
    var age = 20
    if (age < 18) {
        println("You are underage")
    } else {
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18) {
        println("Underweight")
    } else if (bmi <= 29) {
        println("Normal weight")
    } else if (bmi <= 34) {
        println("Overweight")
    } else {
        println("Obese")
    }

    var a = 50
    var b = 70
    var marks = a * 100 + b * 100 / (100)
    if (marks <= 40){
        println("Fail")
    } else if (marks <= 50){
        println("Average")
    }else if (marks <=70){
        println("Above average")
    } else {
        println("Pass")
    }
    // When statements
    var bettingNumber = 3
    when(bettingNumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 -4 to bet")
        }
    }

}