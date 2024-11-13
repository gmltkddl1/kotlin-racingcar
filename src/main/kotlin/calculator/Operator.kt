package calculator

enum class Operator(val symbol: String, val action: (Int, Int) -> Int) {
    ADD("+", { a, b -> a + b }),
    SUB("-", { a, b -> a - b }),
    MUL("*", { a, b -> a * b }),
    DIV("/", { a, b -> a / b }),
}
