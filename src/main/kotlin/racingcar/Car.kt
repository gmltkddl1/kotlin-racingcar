package racingcar

class Car(
    initialMoveCount: Int = 0,
    val name: String = "Car",
) {
    var moveCount: Int = initialMoveCount
        private set(value) {
            field = value
        }

    init {
        require(name.length <= 5) { "자동차 이름이 너무 길어요" }
    }

    fun process() {
        val randomNumber = RandomNumberGenerator().getRandomNumber()
        move(randomNumber)
    }

    fun move(number: Int) {
        if (number >= MOVE_MINIMUM_VALUE) {
            moveCount++
        }
    }

    companion object {
        private const val MOVE_MINIMUM_VALUE = 4
    }
}
