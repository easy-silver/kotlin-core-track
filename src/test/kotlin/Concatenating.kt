import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class Concatenating {

    @Test
    fun concatenating() {
        //given
        val string1 = "Hello,"
        val string2 = "world"

        //when
        val result = string1.plus(string2)

        //then
        assertThat(result).isEqualTo("Hello,world")
        assertThat(string1).isEqualTo("Hello,")
        assertThat(string2).isEqualTo("world")
    }

    @Test
    fun concatenatingVariables() {
        //given
        val name = "Timo"
        var greeting = "Welcome to Kotlin, "

        //when
        greeting += name

        //then
        print(greeting)
        assertThat(greeting).isNotEqualTo("Welcome to Kotlin, ")
        assertThat(greeting).isEqualTo("Welcome to Kotlin, Timo")
        assertThat(name).isEqualTo("Timo")
    }
}