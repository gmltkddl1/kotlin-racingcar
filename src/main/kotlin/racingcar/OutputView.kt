package racingcar

class OutputView() {
    fun drawRace(race: Race) {
        val sb = StringBuilder()
        for (i in 0 until race.cars.size) {
            sb.append(drawCar(race.cars[i]))
        }
        println(sb.toString())
    }

    fun drawWinner(race: Race) {
        val sb = StringBuilder()
        race.getWinner().forEach {
            sb.append(it.name)
            sb.append(", ")
        }
        sb.delete(sb.length - 2, sb.length)
        println(sb.toString())
    }

    private fun drawCar(car: Car): String {
        val sb = StringBuilder()
        sb.append(car.name)
        sb.append(" : ")
        for (i in 1..car.status()) {
            sb.append("-")
        }
        sb.append("\n")
        return sb.toString()
    }
}
