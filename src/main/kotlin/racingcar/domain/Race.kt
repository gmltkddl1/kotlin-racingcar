package racingcar.domain

class Race(
    names: List<String>,
) {
    val cars: List<Car> = names.map { Car(name = it) }

    fun doRace(numbers: List<Int>) {
        require(cars.size == numbers.size)
        repeat(cars.size) { index -> cars[index].move(numbers[index]) }
    }
}
