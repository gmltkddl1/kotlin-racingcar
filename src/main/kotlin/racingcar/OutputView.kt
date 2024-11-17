package racingcar

class OutputView() {
    fun drawRace(race: Race) {
        val sb = StringBuilder()
        for (i in 0 until race.carList.size) {
            sb.append(drawCar(race.carList[i]))
        }
        println(sb.toString())
    }

    private fun drawCar(car: Car): String {
        val sb = StringBuilder()
        for (i in 1..car.moveCount) {
            sb.append("-")
        }
        sb.append("\n")
        return sb.toString()
    }
}
