fun main(args: Array<String>) {

    // program takes user inputs

    // program outputs number in French
    var number = 0
    var output = ""

    print("Enter a number 1-10 to be translated to French: ")
    number = readLine()!!.toInt()

    when(number) {
        1 -> output = "Un"
        2 -> output = "Deux"
        3 -> output = "Trois"
        4 -> output = "Quatre"
        5 -> output = "Cinq"
        6 -> output = "Six"
        7 -> output = "Sept"
        8 -> output = "Huit"
        9 -> output = "Neuf"
        10 -> output = "Dix"
        !in 1..10 -> output = "\"Input not in range\""
        else -> output = "\"Invalid input\""
    }

    println("The number $number is $output in French!")
}