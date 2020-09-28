package ch.sbb.functionalkotlin.effects

import org.junit.Assert
import org.junit.Test

class OptionTest {

    @Test
    fun `getOrElse with value`() {
        val result = Option("value").getOrElse("default")

        Assert.assertEquals("value", result)
    }

    @Test
    fun `getOrElse without value`() {
        val result = Option<String>(null).getOrElse("default")

        Assert.assertEquals("default", result)
    }

    @Test
    fun `map with value`() {
        val result = Option(1).map { v -> v + 1 }

        Assert.assertEquals(Option(2), result)
    }

    @Test
    fun `map without value`() {
        val result = Option<Int>(null).map{ v -> v + 1 }

        Assert.assertEquals(Option.None, result)
    }

    @Test
    fun `flaMap with value`() {
        val result = Option(1).flatMap { v -> Option(v + 1) }

        Assert.assertEquals(Option(2), result)
    }

    @Test
    fun `flatMap without value`() {
        val result = Option.None.flatMap{ v: Int -> Option(v + 1)  }

        Assert.assertEquals(Option.None, result)
    }


    @Test
    fun `filter with value matching`() {
        val result = Option(2).filter{it % 2 == 0}

        Assert.assertEquals(Option(2), result)
    }

    @Test
    fun `filter with value not matching`() {
        val result = Option(2).filter{it % 3 == 0}

        Assert.assertEquals(Option.None, result)
    }

    @Test
    fun `filter without value`() {
        val result = Option<Int>(null).filter{it % 3 == 0 }

        Assert.assertEquals(Option.None, result)
    }
}