package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun `자동차 생성 테스트`() {
        val race = Race(5)
        assertThat(race.cars.size).isEqualTo(5)
        race.cars.forEach { assertThat(it.status()).isEqualTo(0) }
    }
}
