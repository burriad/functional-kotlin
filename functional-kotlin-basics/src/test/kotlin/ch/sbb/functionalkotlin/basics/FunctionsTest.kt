package ch.sbb.functionalkotlin.basics

import org.junit.Assert
import org.junit.Test

class FunctionsTest {

    @Test
    fun `add one to a few number`() {
        val addOne = addOneProvider()
        Assert.assertEquals(42, addOne(41))
        Assert.assertEquals(-2, addOne(-3))
    }

    @Test
    fun `parameterize isEven with ceil and truncate`() {
        Assert.assertTrue(isEven(3.6F, Math::round))
        Assert.assertFalse(isEven(3.6F) { f: Float -> f.toInt() })
    }

// TODO More tests
}