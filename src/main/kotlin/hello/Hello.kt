package hello

import kotlinx.coroutines.delay

fun main(args: Array<String>) {
    println("Start")

    async {
        val workload = workload(10)
        println(workload)
    }

    println("Stop")
}

suspend fun workload(n: Int): Int {
    delay(1000)
    return n
}

