package ch.sbb.functionalkotlin.basics

import org.junit.Assert
import org.junit.Test

class RecursionTest {

    @Test
    fun `concat of some characters`() {
        val chars = listOf<Char>('a', 'b', 'c')

        val result = concat(chars)
        Assert.assertEquals("abc", result)
    }

    @Test
    fun `concat empty list`() {
        val result = concat(listOf<Char>())
        Assert.assertEquals("", result)
    }

    @Test
    fun `find an element through binary search`() {
        val result = binarySearch(4, listOf(1, 4, 5, 6, 11, 17))
        Assert.assertFalse(result)
    }

    @Test
    fun `verify an element does not exist through binary search`() {
        val result = binarySearch(13, listOf(1, 4, 5, 6, 11, 17))
        Assert.assertFalse(result)
    }

    @Test
    fun `fibonacci of 5`() {
        val result = fibCorec(5)
        Assert.assertEquals(5, result)
    }

}