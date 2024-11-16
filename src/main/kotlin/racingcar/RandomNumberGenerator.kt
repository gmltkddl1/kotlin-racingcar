package racingcar

import java.security.SecureRandom

class RandomNumberGenerator {
    fun getRandomNumber(): Int {
        val secureRandom = SecureRandom()
        return secureRandom.nextInt(10)
    }
}
