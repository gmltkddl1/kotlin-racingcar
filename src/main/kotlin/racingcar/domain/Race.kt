package racingcar.domain

class Race(
    names: List<String>,
) {
    val cars: List<Car> = names.map { Car(name = it) }

    fun process() {
        cars.forEach {
            val randomNumberGenerator = RandomNumberGenerator()
            it.move(randomNumberGenerator.getRandomNumber())
        }
    }

    fun getWinner(): List<Car> {
        val max = cars.maxOf { it.moveCount }
        return cars.filter { it.moveCount == max }
    }
}
