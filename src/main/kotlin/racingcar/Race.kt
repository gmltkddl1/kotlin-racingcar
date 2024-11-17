package racingcar

class Race(numberOfCar: Int) {
    val carList: List<Car> =
        List(numberOfCar) { Car(0) }

    fun process() {
        for (car in carList) {
            car.process()
        }
    }
}
