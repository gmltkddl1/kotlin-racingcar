package racingcar.domain

class RaceRecords {
    val raceRecords: MutableList<RaceRecord> = mutableListOf()

    fun getWinner(): String {
        var max = 0
        raceRecords.last().carRecords.forEach {
            if (it.moveCount > max) max = it.moveCount
        }
        return raceRecords.last().carRecords
            .filter { it.moveCount == max }
            .joinToString(",") { it.name }
    }
}
