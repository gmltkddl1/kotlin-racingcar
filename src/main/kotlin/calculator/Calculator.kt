
package calculator

class Calculator {
    fun calculate(input: String?): Int {
        require(!input.isNullOrBlank()) { "Invalid input" }
        val inputs = input.split(" ")
        isValid(inputs)
        return processStrings(inputs)
    }

    private fun processStrings(inputs: List<String>): Int {
        val queue: MutableList<Int> = mutableListOf()
        for (i in 0 until inputs.size) {
            if (inputs[i].single().isDigit()) queue.add(inputs[i].toInt())
        }
        return queue.foldIndexed(0) { index, sum, element ->
            if (index == 0) sum + element else getAction(inputs[2 * index - 1]).invoke(sum, element)
        }
    }

    private fun isValid(inputs: List<String>) {
        for (input in inputs) {
            require(isOperator(input) || input.single().isDigit()) { "is not operator and digit" }
        }
    }

    private fun isOperator(input: String): Boolean {
        return Operator.entries.any { it.symbol == input }
    }

    private fun getAction(symbol: String): (Int, Int) -> Int {
        return Operator.entries.first { it.symbol == symbol }.action
    }
}
