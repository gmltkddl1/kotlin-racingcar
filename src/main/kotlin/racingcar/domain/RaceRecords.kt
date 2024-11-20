package racingcar.domain

class RaceRecords {
    val raceRecords: MutableList<RaceRecord> = mutableListOf()

    fun addRaceRecord(record: RaceRecord) {
        raceRecords.add(record)
    }
}
