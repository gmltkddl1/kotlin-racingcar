package racingcar

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    inputView.drawNamesInput()
    val names = readln().split(",")
    inputView.drawNumberOfTryInput()
    val numberOfTrys = readln().toInt()

    val race = Race(names)

    for (i in 1..numberOfTrys) {
        race.process()
        outputView.drawRace(race)
    }
}
