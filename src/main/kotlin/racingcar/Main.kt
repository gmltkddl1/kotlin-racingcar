package racingcar

import racingcar.domain.Race
import racingcar.domain.RaceGame
import racingcar.domain.RandomNumberGenerator
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val randomNumberGenerator = RandomNumberGenerator()

    inputView.drawNamesInput()
    val names = readln().split(",")
    inputView.drawNumberOfTryInput()
    val numberOfTrys = readln().toInt()

    val race = Race(names)
    val raceGame = RaceGame(race)

    val numbersLists: MutableList<List<Int>> = mutableListOf()
    repeat(numberOfTrys) {
        numbersLists.add(randomNumberGenerator.getRandomNumbers(names.size))
    }

    raceGame.doRaceGame(numbersLists)
    outputView.drawRaceGame(raceGame)
}
