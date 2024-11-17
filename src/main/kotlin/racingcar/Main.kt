package racingcar

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    inputView.drawNumberOfCarInput()
    val numberOfCar = readln().toInt()
    inputView.drawNumberOfTryInput()
    val numberOfTry = readln().toInt()

    val race = Race(numberOfCar)

    for (i in 1..numberOfTry) {
        race.process()
        outputView.drawRace(race)
    }
}
