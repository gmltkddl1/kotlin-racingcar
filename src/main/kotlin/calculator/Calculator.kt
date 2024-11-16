
package calculator

class Calculator {
    fun calculate(input: String?): Int {
        require(!input.isNullOrBlank()) { "Invalid input" }
        val inputs = input.split(" ")
        isValid(inputs)
        return processStrings(inputs)
    }

    private fun processStrings(inputs: List<String>): Int {
        var queue: MutableList<String> = mutableListOf()
        for (i in 0 until inputs.size) {
            addQueue(inputs[i], queue)
            if (queue.size == 3) {
                queue = mutableListOf(processQueue(queue).toString())
            }
        }
        return queue[0].toInt()
    }

    private fun addQueue(
        input: String,
        queue: MutableList<String>,
    ) {
        queue.add(input)
    }

    private fun processQueue(queue: List<String>): Int {
        require(queue.size == 3) { "계산기 규칙에 어긋나요" }
        return getAction(queue[1]).invoke(queue[0].toInt(), queue[2].toInt())
    }

    private fun isValid(inputs: List<String>) {
        for (input in inputs) {
            require(isOperator(input) || input.single().isDigit()) { "is not operator and digit" }
        }
    }

    private fun isOperator(input: String): Boolean {
        return Operator.entries.any({ it.symbol == input })
    }

    private fun getAction(symbol: String): (Int, Int) -> Int {
        return Operator.entries.first({ it.symbol == symbol }).action
    }
}
