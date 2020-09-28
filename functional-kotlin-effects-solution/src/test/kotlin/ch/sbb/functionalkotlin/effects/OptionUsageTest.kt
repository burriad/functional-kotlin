package ch.sbb.functionalkotlin.effects

import org.junit.Assert
import org.junit.Test

class OptionUsageTest {
    @Test
    fun `find person with all attributes defined`() {
        val result = findPerson("42")
        Assert.assertEquals(Option(Person("42", "Adams, Douglas", "Galaxy", "marvin@earth.com")), result)
    }

    @Test
    fun `empty if an attribute in undefined`() {
        val result = findPerson("1984")
        Assert.assertEquals(Option.None, result)
    }
}