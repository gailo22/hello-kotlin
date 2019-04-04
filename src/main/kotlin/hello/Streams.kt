package hello

fun main(args: Array<String>) {

    val ints = listOf<Int>(1, 2, 3)

    ints.asSequence()
        .map { it + 1 }
        .filter { it > 2 }
        .forEach { println(it) }


    println(Derived().method2().method1("world"))


    val sequence = sequence {
        val start = 0
        // yielding a single value
        yield(start)
        // yielding an iterable
        yieldAll(1..5 step 2)
        // yielding an infinite sequence
        yieldAll(generateSequence(8) { it * 3 })
    }

    println(sequence.take(7).toList())
}

fun <T> async(block: suspend () -> T) = null

interface Base {
    fun method1(s: String): String
}

class Derived {
    fun method2() = object : Base {
        override fun method1(s: String): String {
            return "hello $s"
        }
    }
}