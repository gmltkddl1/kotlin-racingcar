
package calculator

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class OperatorTest {
    @Test
    fun addTest() {
        assertThat(Operator.ADD.symbol).isEqualTo("+")
        assertThat(Operator.ADD.action(1, 4)).isEqualTo(5)
    }

    @Test
    fun subTest() {
        assertThat(Operator.SUB.symbol).isEqualTo("-")
        assertThat(Operator.SUB.action(4, 2)).isEqualTo(2)
    }

    @Test
    fun mulTest() {
        assertThat(Operator.MUL.symbol).isEqualTo("*")
        assertThat(Operator.MUL.action(4, 2)).isEqualTo(8)
    }

    @Test
    fun divTest() {
        assertThat(Operator.DIV.symbol).isEqualTo("/")
        assertThat(Operator.DIV.action(4, 2)).isEqualTo(2)
    }

    @Test
    fun divZeroTest() {
        assertThatThrownBy { Operator.DIV.action(4, 0) }.isInstanceOf(ArithmeticException::class.java)
    }
}
