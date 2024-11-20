package racingcar.domain

import java.security.SecureRandom

class RandomNumberGenerator {
    fun getRandomNumbers(numberCount: Int): List<Int> {
        return List(numberCount) { getRandomNumber() }
    }

    private fun getRandomNumber(): Int {
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(MAX_NUMBER)
    }

    companion object {
        const val MAX_NUMBER = 9
    }
}
