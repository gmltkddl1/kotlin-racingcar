
package calculator

class Calculator {
    fun calculate(input: String): Int {
        if (input.isBlank()) throw IllegalArgumentException("Invalid input")
        val inputs = input.split(" ")
        val queue: ArrayList<String> = arrayListOf()
        return processStrings(inputs, queue)
    }

    private fun processStrings(
        inputs: List<String>,
        queue: ArrayList<String>,
    ): Int {
        for (i in 0 until inputs.size) {
            addQueue(inputs[i], queue)
            processQueue(queue)
        }
        return queue[0].toInt()
    }

    private fun addQueue(
        input: String,
        queue: ArrayList<String>,
    ) {
        isValid(input)
        queue.add(input)
    }

    private fun processQueue(queue: ArrayList<String>) {
        if (queue.size == 3) {
            val invoke = getAction(queue[1]).invoke(queue[0].toInt(), queue[2].toInt())
            queue.clear()
            queue.add(invoke.toString())
        }
    }

    private fun isValid(input: String) {
        if (!isOperator(input) && !isNumber(input)) throw IllegalArgumentException("Invalid input")
    }

    private fun isOperator(input: String): Boolean {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")
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
