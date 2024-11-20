package racingcar.domain

class RaceGame(val race: Race) {
    val raceRecords = RaceRecords()

    fun doRaceGame(numberLists: List<List<Int>>) {
        numberLists.forEach {
            race.doRace(it)
            raceRecords.addRaceRecord(RaceRecord(race = race))
        }
    }

    fun getWinner(): List<String> {
        val max = race.cars.maxOf { it.moveCount }
        return race.cars
            .filter { it.moveCount == max }
            .map { it.name }
    }
}
