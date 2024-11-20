package racingcar.domain

class RaceGame(val race: Race) {
    val raceRecords = RaceRecords()
    private val randomNumberGenerator = RandomNumberGenerator()

    fun doRaceGame(numberOfTry: Int) {
        repeat(numberOfTry) {
            race.doRace(randomNumberGenerator.getRandomNumbers(race.cars.size))
            raceRecords.raceRecords.add(RaceRecord(race = race))
        }
    }
}
