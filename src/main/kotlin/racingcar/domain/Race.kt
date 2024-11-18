package racingcar.domain

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
        val max = cars.maxOf { it.moveCount }
        return cars.filter { it.moveCount == max }
    }
}
