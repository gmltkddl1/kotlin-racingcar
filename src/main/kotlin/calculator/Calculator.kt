
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
            isValid(inputs[i])
            addQueue(inputs[i], queue)
            val processResult = processQueue(queue)
            resetQueue(processResult, queue)
        }
        return queue[0].toInt()
    }

    private fun addQueue(
        input: String,
        queue: MutableList<String>,
    ) {
        queue.add(input)
    }

    private fun processQueue(queue: List<String>): Int? {
        if (queue.size == 3) {
            return getAction(queue[1]).invoke(queue[0].toInt(), queue[2].toInt())
        }
        return null
    }

    private fun resetQueue(
        input: Int?,
        queue: MutableList<String>,
    ) {
        if (input != null) {
            queue.clear()
            queue.add(input.toString())
        }
    }

    private fun isValid(input: String) {
        require(isOperator(input)) { "is not operator" }
        require(input.single().isDigit()) { "Invalid input" }
    }

    private fun isOperator(input: String): Boolean {
        return Operator.entries
            .filter({ operator -> input.equals(operator.symbol) })
            .any()
    }

    private fun getAction(symbol: String): (Int, Int) -> Int {
        return Operator.entries
            .filter({ operator -> operator.symbol.equals(symbol) })
            .first().action
    }
}
