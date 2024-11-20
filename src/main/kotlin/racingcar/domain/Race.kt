package racingcar.domain

class Race(
    names: List<String>,
) {
    val cars: List<Car> = names.map { Car(name = it) }

    fun doRace(numbers: List<Int>) {
        require(cars.size == numbers.size) { "랜덤 숫자가 차의 갯수보다 적게 들어왔어요" }
        repeat(cars.size) { index -> cars[index].move(numbers[index]) }
    }
}
