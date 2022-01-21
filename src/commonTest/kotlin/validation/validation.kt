// when renaming the package and add concrete import statements everything works fine!
package validation

import kotlin.test.Test
import kotlin.test.assertEquals

val validator: (Framework, Unit?) -> String = validation { data ->
    data.name
}

class ValidationTest {

    // running this test case under jvm fails at runtime -> NoSuchMethodError
    // running this test case under js works
    @Test
    fun testValidation() {
        assertEquals("fritz2", validator(Framework("fritz2")))
    }
}