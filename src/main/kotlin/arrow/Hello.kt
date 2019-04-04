package arrow

import kotlinx.coroutines.runBlocking
import java.util.*

fun main(args: Array<String>) {
    greet()
}

suspend fun sayGoodBye(): Unit =tus
    println("Good bye World!")

suspend fun sayHello(): Unit =
    println("Hello World")

fun greet() = runBlocking {
    sayHello()
    sayGoodBye()
}