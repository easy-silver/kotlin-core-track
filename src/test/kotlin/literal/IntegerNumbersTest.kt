package literal

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntegerNumbersTest {

    @Test
    fun underscores() {
        val integer = 10000

        assertThat(integer).isEqualTo(10_000)
        assertThat(integer).isEqualTo(10____000)
    }
}