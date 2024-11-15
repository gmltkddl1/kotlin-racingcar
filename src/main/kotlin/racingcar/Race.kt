package racingcar

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    inputView.drawNumberOfCarInput()
    val numberOfCar = readLine()!!.toInt()
    inputView.drawNumberOfTryInput()
    val numberOfTry = readLine()!!.toInt()

    val race = Race(numberOfCar)

    for (i in 1..numberOfTry) {
        race.process()
        outputView.drawRace(race)
    }
}

class Race(numberOfCar: Int) {
    val carList: MutableList<Car> = mutableListOf()

    init {
        for (i in 1..numberOfCar) {
            carList.add(Car(0))
        }
    }

    fun process() {
        for (car in carList) {
            if (car.decide()) {
                car.move()
            }
        }
    }
}
