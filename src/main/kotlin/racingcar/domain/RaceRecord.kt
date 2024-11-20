package racingcar.domain

class RaceRecord(race: Race) {
    val carRecords = race.cars.map { CarRecord(it) }
}
