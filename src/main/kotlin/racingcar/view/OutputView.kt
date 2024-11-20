package racingcar.view

import racingcar.domain.CarRecord
import racingcar.domain.RaceGame
import racingcar.domain.RaceRecord

class OutputView() {
    fun drawRaceGame(raceGame: RaceGame) {
        raceGame.raceRecords.raceRecords.forEach { drawRace(it) }
        println(raceGame.getWinner().joinToString(","))
    }

    private fun drawRace(raceRecord: RaceRecord) {
        raceRecord.carRecords.forEach { drawCar(it) }
        println()
    }

    private fun drawCar(carRecord: CarRecord) {
        val sb = StringBuilder()
        sb.append(carRecord.name)
        sb.append(" : ")
        repeat(carRecord.moveCount) {
            sb.append("-")
        }
        println(sb.toString())
    }
}
