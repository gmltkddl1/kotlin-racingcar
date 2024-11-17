package racingcar

class Car(initialMoveCount: Int) {
    var moveCount: Int = initialMoveCount

    fun process() {
        val randomNumber = RandomNumberGenerator().getRandomNumber()
        move(randomNumber)
    }

    fun move(number: Int) {
        if (number >= 4) {
            moveCount++
        }
    }
}
