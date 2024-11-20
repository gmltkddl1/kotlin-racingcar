package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Race

class RaceTest {
    @Test
    fun `자동차 생성 테스트`() {
        val race = Race(listOf("car1", "car2", "car3"))
        assertThat(race.cars.size).isEqualTo(3)
        assertThat(race.cars.map { it.moveCount }).containsExactly(0, 0, 0)
        assertThat(race.cars.map { it.name }).containsExactly("car1", "car2", "car3")
    }

    @Test
    fun `레이스 실행 테스트`() {
        val race = Race(listOf("car1", "car2", "car3"))
        race.doRace(listOf(3, 4, 4))
        assertThat(race.cars.map { it.moveCount }).containsExactly(0, 1, 1)
    }
}
