package type

import org.junit.jupiter.api.Test
import kotlin.Byte

class ByteType {

    @Test
    fun byteTest() {
        val byte: Byte = 127
        val byte2: Byte = 127
        println((byte + byte2).toByte())
    }
}