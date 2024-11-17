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

    fun getWinner(): List<Car> {
        var max = 0
        cars.forEach { if (it.status() > max) max = it.status() }
        return cars.filter { it.status() == max }
    }
}
