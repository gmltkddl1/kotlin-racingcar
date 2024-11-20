package racingcar

import racingcar.domain.Race
import racingcar.domain.RaceGame
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    inputView.drawNamesInput()
    val names = readln().split(",")
    inputView.drawNumberOfTryInput()
    val numberOfTrys = readln().toInt()

    val race = Race(names)
    val raceGame = RaceGame(race)

    raceGame.doRaceGame(numberOfTrys)
    outputView.drawRaceGame(raceGame)
}
