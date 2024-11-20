package racingcar.view

import racingcar.domain.Car
import racingcar.domain.Race

class OutputView() {
    fun drawRace(race: Race) {
        val sb = StringBuilder()
        repeat(race.cars.size) { index ->
            sb.append(drawCar(race.cars[index]))
        }
        println(sb.toString())
    }

    fun drawWinner(race: Race) {
        val winnersString =
            race.getWinner()
                .map { it.name }
                .joinToString(",")
        println(winnersString)
    }

    private fun drawCar(car: Car): String {
        val sb = StringBuilder()
        sb.append(car.name)
        sb.append(" : ")
        repeat(car.moveCount) {
            sb.append("-")
        }
        sb.append("\n")
        return sb.toString()
    }
}
