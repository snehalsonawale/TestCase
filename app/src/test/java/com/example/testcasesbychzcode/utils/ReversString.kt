package com.example.testcasesbychzcode.utils

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class ReversString {
    @Test
    fun TestReversTring_emptyString_expetedEmptyString()
    {
        val sut = utils()
        val result = sut.reverseString(" ")
        Assert.assertEquals(" ",result)
    }

    @Test
    fun TestReversTring_validString_expetedReverseString()
    {
        val sut = utils()
        val result = sut.reverseString("pra")
        Assert.assertEquals("arp",result)
    }

    @Test
    fun TestReversTring_singlCharString_expetedsingleCharString()
    {
        val sut = utils()
        val result = sut.reverseString("a")
        assertEquals("a",result)
    }

    @Test(expected = IllegalAccessException::class)
    fun TestReversTring_nullCheck_expetedsingleCharString()
    {
        val sut = utils()
        val result = sut.reverseString(null)

    }

}