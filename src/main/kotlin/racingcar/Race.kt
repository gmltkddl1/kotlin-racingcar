package racingcar

class Race(
    names: List<String>,
) {
    val cars: List<Car> = names.map { Car(name = it) }

    fun process() {
        cars.forEach {
            it.process()
        }
    }
}
