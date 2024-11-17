package racingcar

class OutputView() {
    fun drawRace(race: Race) {
        val sb = StringBuilder()
        for (i in 0 until race.cars.size) {
            sb.append(drawCar(race.cars[i]))
        }
        println(sb.toString())
    }

    private fun drawCar(car: Car): String {
        val sb = StringBuilder()
        sb.append(car.name)
        for (i in 1..car.status()) {
            sb.append("-")
        }
        sb.append("\n")
        return sb.toString()
    }
}
