package racingcar.domain

import java.security.SecureRandom

class RandomNumberGenerator {
    companion object {
        const val MAX_NUMBER = 9
    }

    private fun getRandomNumber(): Int {
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(MAX_NUMBER)
    }

    fun getRandomNumbers(numberCount: Int): List<Int> {
        return List(numberCount) { getRandomNumber() }
    }
}
