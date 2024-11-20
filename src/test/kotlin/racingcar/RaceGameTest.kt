package racingcar

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import racingcar.domain.Race
import racingcar.domain.RaceGame

class RaceGameTest {
    @Test
    fun `가장 이동수가 큰차가 우승자이다`() {
        val race = Race(listOf("car1", "car2", "car3"))
        val raceGame = RaceGame(race)
        raceGame.doRaceGame(listOf(listOf(4, 5, 1), listOf(4, 1, 1)))
        raceGame.getWinner().joinToString(",") shouldBe "car1"
    }
}
