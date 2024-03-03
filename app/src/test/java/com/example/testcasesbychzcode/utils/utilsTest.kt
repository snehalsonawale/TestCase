package com.example.testcasesbychzcode.utils

import org.junit.Assert
import org.junit.Assert.*

import org.junit.Test

class utilsTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField() {
        val sut = utils()
       val result = sut.validatePassword(" ")
       Assert.assertEquals( "Password is blanck",result)

    }

    @Test
    fun validatePassword_2charInput_expectedValidationMessage() {
        val sut = utils()
        val result = sut.validatePassword("ab")
        Assert.assertEquals(  "length need to grater than 6",result)

    }

    @Test
    fun validatePassword_CorrectInput_expectedValidationMessage_Valid() {
        val sut = utils()
        val result = sut.validatePassword("abcdefghid")
        Assert.assertEquals(  "Valid",result)

    }
}