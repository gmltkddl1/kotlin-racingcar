package racingcar

class Car(
    initialMoveCount: Int = 0,
    val name: String = "Car",
) {
    companion object {
        private const val MOVE_MINIMUM_VALUE = 4
    }

    init {
        if (name.length > 5) throw IllegalArgumentException("자동차 이름이 너무 길어요")
    }

    private var moveCount: Int = initialMoveCount

    fun process() {
        val randomNumber = RandomNumberGenerator().getRandomNumber()
        move(randomNumber)
    }

    fun move(number: Int) {
        if (number >= MOVE_MINIMUM_VALUE) {
            moveCount++
        }
    }

    fun status(): Int {
        return moveCount
    }
}
