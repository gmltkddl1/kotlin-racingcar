package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.NumberGenerator
import racingcar.domain.Race

class RaceTest {
    private val numberGenerator =
        object : NumberGenerator {
            var flag = 3

            override fun getNumber(): Int {
                val result = flag
                flag++
                flag %= 10
                return result
            }
        }

    @Test
    fun `doRace 테스트`() {
        val race = Race.Companion.of(listOf("car1", "car2", "car3"), numberGenerator)
        race.doRace()
        race.doRace()
        assertThat(race.cars.map { it.moveCount }).containsExactly(1, 2, 2)
    }
}
