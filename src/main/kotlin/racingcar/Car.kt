package racingcar

import java.security.SecureRandom

class Car(var moveCount: Int) {
    fun move() {
        moveCount++
    }

    fun decide(): Boolean {
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(10) >= 4
    }
}
