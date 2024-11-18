package racingcar.domain

import java.security.SecureRandom

class RandomNumberGenerator {
    companion object {
        private const val MAX_NUMBER = 10
    }

    fun getRandomNumber(): Int {
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(MAX_NUMBER)
    }
}
