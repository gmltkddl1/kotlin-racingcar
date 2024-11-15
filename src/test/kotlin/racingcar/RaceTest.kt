package racingcar

import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun drawRaceTest() {
        val race = Race(5)
        race.process()
        println(race.drawRace())
        race.process()
        println(race.drawRace())
        race.process()
        println(race.drawRace())
    }
}
