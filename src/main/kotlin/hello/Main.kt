package hello

fun add1(x: Int) = x + 1;

fun <A, B> map1(xs: List<A>, fn: (A) -> (B)) =
    xs.map(fn)

fun main(args: Array<String>) {
    println(add1(3))

    map1(listOf("hello", "world", "doc")) {
        it.length
    }.map { it + 1 }.let { println(it); it }.apply { println("apply $this") }

}
