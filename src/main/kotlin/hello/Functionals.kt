package hello

import org.funktionale.either.Disjunction
import org.funktionale.validation.Validation


fun main(args: Array<String>) {

    val e1 = Disjunction.right(1)
    val e2 = Disjunction.left("Not a number")
    val e3 = Disjunction.right(3)
    val e4 = Disjunction.left("Division by zero")

    val validation = Validation(e1, e2, e3, e4)
    println(validation.hasFailures)
    println(validation.failures)


    val name: String? = null
    if (name.isNullOrBlank()) println("dddd")
}