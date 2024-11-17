package calculator

enum class Operator(val symbol: String, val action: (Int, Int) -> Int) {
    ADD("+", { a, b -> a + b }),
    SUB("-", { a, b -> a - b }),
    MUL("*", { a, b -> a * b }),
    DIV("/", { a, b ->
        if (b == 0) throw ArithmeticException("0으로 나눌 수 없음")
        a / b
    }),
}
