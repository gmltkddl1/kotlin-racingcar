package racingcar.domain

class Car(
    initialMoveCount: Int = 0,
    val name: String,
) {
    var moveCount: Int = initialMoveCount
        private set

    init {
        require(name.length <= MAX_NAME_LENGTH) { "자동차 이름이 너무 길어요" }
    }

    fun move(number: Int) {
        if (number >= MOVE_MINIMUM_VALUE) {
            moveCount++
        }
    }

    companion object {
        private const val MOVE_MINIMUM_VALUE = 4
        private const val MAX_NAME_LENGTH = 5
    }
}
