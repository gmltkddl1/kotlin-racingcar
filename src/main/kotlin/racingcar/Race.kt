package racingcar

class Race(numberOfCar: Int) {
    val cars: List<Car> =
        List(numberOfCar) { Car() }

    fun process() {
        cars.forEach {
            it.process()
        }
    }
}
