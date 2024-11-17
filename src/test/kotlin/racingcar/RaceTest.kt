package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun `자동차 생성 테스트`() {
        val race = Race(listOf("car1", "car2", "car3"))
        assertThat(race.cars.size).isEqualTo(3)
        race.cars.forEach { assertThat(it.status()).isEqualTo(0) }
        race.cars.forEachIndexed { index, car -> assertThat(car.name).isEqualTo("car${index + 1}") }
    }
}
