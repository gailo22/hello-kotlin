package arrow

import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    greet()
}

suspend fun sayGoodBye(): Unit =
    println("Good bye World!")

suspend fun sayHello(): Unit =
    println("Hello World")

fun greet() = runBlocking {
    sayHello()
    sayGoodBye()
}