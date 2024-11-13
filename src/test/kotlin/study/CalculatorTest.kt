
package study

import calculator.Calculator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun addTest() {
        val calculator = Calculator()
        val result = calculator.calculate("1 + 2")
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun subTest() {
        val calculator = Calculator()
        val result = calculator.calculate("5 - 3")
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun multiplyTest() {
        val calculator = Calculator()
        val result = calculator.calculate("6 * 4")
        assertThat(result).isEqualTo(24)
    }

    @Test
    fun divideTest() {
        val calculator = Calculator()
        val result = calculator.calculate("8 / 4")
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun givenExampleTest() {
        val calculator = Calculator()
        val result = calculator.calculate("2 + 3 * 4 / 2")
        assertThat(result).isEqualTo(10)
    }
}
