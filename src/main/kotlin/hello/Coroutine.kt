package hello

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {

    val job = launch { doWorld() }

    println("Hello")
    job.join()

    val jobs = List(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }

    jobs.forEach { it.join() }
}

suspend fun doWorld() {
    delay(1000L)
    println("World")
}