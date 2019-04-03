package hello

data class Person(val name: String, val email: String)

fun main(args: Array<String>) {

    val ints = listOf<Int>(1, 2, 3)
    val strings = listOf<String>("a", "b", "c")

    ints.zip(strings).forEach { println(it) }


    val person = Person("a", "a@email.com")
}