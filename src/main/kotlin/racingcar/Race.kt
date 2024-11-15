package racingcar

class Race(numberOfCar: Int) {
    private val carList: MutableList<Car> = mutableListOf()

    init {
        for (i in 1..numberOfCar) {
            carList.add(Car(0))
        }
    }

    fun drawRace(): String {
        val sb = StringBuilder()
        for (i in 0 until carList.size) {
            sb.append(drawCar(carList[i]))
        }
        return sb.toString()
    }

    private fun drawCar(car: Car): String {
        val sb = StringBuilder()
        for (i in 1..car.moveCount) {
            sb.append("-")
        }
        sb.append("\n")
        return sb.toString()
    }

    fun process() {
        for (car in carList) {
            if (car.decide()) {
                car.move()
            }
        }
    }
}
