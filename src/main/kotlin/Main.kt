fun main() {
    println("Hello World!")
    printVariables()
    constantVariables()
}

fun printVariables() {
    var variable = "here we can mutate the variable"
    print(variable + " ")
    variable = "by overwritting the previous one"
    println(variable)
}

fun constantVariables() {
    val const = "here a constant variable"
    println(const)
}
