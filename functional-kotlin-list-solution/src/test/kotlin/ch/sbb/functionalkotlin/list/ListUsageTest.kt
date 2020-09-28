package ch.sbb.functionalkotlin.list

import org.junit.Assert
import org.junit.Test

class ListUsageTest {

    @Test
    fun `sum list of ints`() {
        val result = sum(List(1, 2, 3))

        Assert.assertEquals(6, result)
    }

    @Test
    fun `list with negatives`() {
        val result = withNegatives(List(1, 2, 3))

        Assert.assertEquals(List(1, -1, 2, -2, 3, -3), result)
    }

}