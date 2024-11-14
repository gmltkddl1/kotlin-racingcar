package calculator

fun add(
    a: Int,
    b: Int,
): Int = a + b

fun sub(
    a: Int,
    b: Int,
): Int = a - b

fun mul(
    a: Int,
    b: Int,
): Int = a * b

fun div(
    a: Int,
    b: Int,
): Int = a / b

enum class Operator(val symbol: String, val action: (Int, Int) -> Int) {
    ADD("+", { a, b -> add(a, b) }),
    SUB("-", { a, b -> sub(a, b) }),
    MUL("*", { a, b -> mul(a, b) }),
    DIV("/", { a, b -> div(a, b) }),
}
