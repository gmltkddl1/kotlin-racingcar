package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class CarTest {
    @Test
    fun moveTest() {
        val car = Car(0)
        car.move(5)
        assertThat(car.moveCount).isEqualTo(1)
    }

    @Test
    fun moveThreeTimesTest() {
        val car = Car(0)
        car.move(5)
        car.move(6)
        car.move(8)
        assertThat(car.moveCount).isEqualTo(3)
    }

    @Test
    fun notMoveTest() {
        val car = Car(0)
        car.move(2)
        assertThat(car.moveCount).isEqualTo(0)
    }

    @Test
    fun notMoveThreeTimesTest() {
        val car = Car(0)
        car.move(2)
        car.move(1)
        car.move(3)
        assertThat(car.moveCount).isEqualTo(0)
    }

    @Test
    fun `자동차 이름 부여 테스트`() {
        val car = Car(name = "자동차1")
        assertThat(car.moveCount).isEqualTo(0)
        assertThat(car.name).isEqualTo("자동차1")
    }

    @Test
    fun `5글자 이상의 자동차 이름 부여`() {
        assertThatThrownBy { Car(name = "5글자가넘어요") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("자동차 이름이 너무 길어요")
    }
}
