package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun moveTest() {
        val car = Car(0)
        car.move()
        assertThat(car.moveCount).isEqualTo(1)
        car.move()
        car.move()
        assertThat(car.moveCount).isEqualTo(3)
    }
}
