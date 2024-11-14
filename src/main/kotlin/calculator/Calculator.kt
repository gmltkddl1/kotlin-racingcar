
package calculator

class Calculator {
    fun calculate(input: String?): Int {
        require(!input.isNullOrBlank()) { "Invalid input" }
        val inputs = input.split(" ")
        return processStrings(inputs)
    }

    private fun processStrings(inputs: List<String>): Int {
        val queue: MutableList<String> = mutableListOf()
        for (i in 0 until inputs.size) {
            addQueue(inputs[i], queue)
            processQueue(queue)
        }
        return queue[0].toInt()
    }

    private fun addQueue(
        input: String,
        queue: MutableList<String>,
    ) {
        isValid(input)
        queue.add(input)
    }

    private fun processQueue(queue: MutableList<String>) {
        if (queue.size == 3) {
            val invoke = getAction(queue[1]).invoke(queue[0].toInt(), queue[2].toInt())
            queue.clear()
            queue.add(invoke.toString())
        }
    }

    private fun isValid(input: String) {
        require(isOperator(input) || input.single().isDigit()) { "Invalid input" }
    }

    private fun isOperator(input: String): Boolean {
        return Operator.entries
            .filter({ operator -> input.equals(operator.symbol) })
            .any()
    }

    private fun isNumber(text: String): Boolean {
        return try {
            text.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    private fun getAction(symbol: String): (Int, Int) -> Int {
        return Operator.entries
            .filter({ operator -> operator.symbol.equals(symbol) })
            .first().action
    }
}
