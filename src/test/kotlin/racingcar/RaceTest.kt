package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Race

class RaceTest {
    @Test
    fun `자동차 생성 테스트`() {
        val race = Race(listOf("car1", "car2", "car3"))
        assertThat(race.cars.size).isEqualTo(3)
        race.cars.forEach { assertThat(it.moveCount).isEqualTo(0) }
        assertThat(race.cars.map { it.name }).containsExactly("car1", "car2", "car3")
    }

    @Test
    fun `우승자 테스트`() {
        val race = Race(listOf("car1", "car2", "car3"))
        race.cars[0].move(4)
        race.cars[1].move(4)
        val winners = race.getWinner()
        assertThat(winners.size).isEqualTo(2)
        assertThat(winners).containsExactly(race.cars[0], race.cars[1])
    }
}
