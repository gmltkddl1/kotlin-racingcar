package racingcar

import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun drawRaceTest() {
        val race = Race(5)
        val outputView = OutputView()
        race.process()
        outputView.drawRace(race)
        race.process()
        outputView.drawRace(race)
        race.process()
        outputView.drawRace(race)
    }
}
