package racingcar

class Car(initialMoveCount: Int = 0) {
    companion object {
        private const val MOVE_MINIMUM_VALUE = 4
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
