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

class InputView() {
    fun drawNumberOfCarInput() {
        println("자동차 대수는 몇 대인가요?")
    }

    fun drawNumberOfTryInput() {
        println("시도할 횟수는 몇 회인가요?")
    }
}

class OutputView() {
    fun drawRace(race: Race) {
        val sb = StringBuilder()
        for (i in 0 until race.carList.size) {
            sb.append(drawCar(race.carList[i]))
        }
        println(sb.toString())
    }

    private fun drawCar(car: Car): String {
        val sb = StringBuilder()
        for (i in 1..car.moveCount) {
            sb.append("-")
        }
        sb.append("\n")
        return sb.toString()
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
