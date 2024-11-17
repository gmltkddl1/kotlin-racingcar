
package calculator

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CalculatorTest {
    @ParameterizedTest
    @ValueSource(strings = ["1 + 1", "3 - 1", "2 * 1", "4 / 2"])
    fun `문자열 계산기 사칙연산 테스트`(input: String) {
        val calculator = Calculator()
        val result = calculator.calculate(input)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun givenExampleTest() {
        val calculator = Calculator()
        val result = calculator.calculate("2 + 3 * 4 / 2")
        assertThat(result).isEqualTo(10)
    }

    @ParameterizedTest
    @ValueSource(strings = ["", "  "])
    fun blankTest(input: String?) {
        val calculator = Calculator()
        assertThatThrownBy({ calculator.calculate(input) })
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("Invalid input")
    }

    @ParameterizedTest
    @ValueSource(strings = ["1 % 3", "1 ^ 3"])
    fun `연산자가 아닐 때 IllegalArgumentException 리턴하는지 테스트`(input: String) {
        val calculator = Calculator()
        assertThatThrownBy({ calculator.calculate(input) })
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("is not operator")
    }

    @ParameterizedTest
    @ValueSource(strings = ["+ +, - -"])
    fun `숫자 자리에 연산자를 넣을때 IllegalArgumentException 리턴하는지 테스트`(input: String) {
        val calculator = Calculator()
        assertThatThrownBy({ calculator.calculate(input) })
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("is not digit")
    }
}
