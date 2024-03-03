package com.example.testcasesbychzcode.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

   lateinit var helper: Helper

    @Before
    fun setUp(){
        println("Before Every Test Case")
         helper = Helper()
    }

    @After
    fun tearDown(){
        println("After Every Test Case")
    }

    @Test
    fun isPalilindrom() {
        // Arrange


        // act
        val result = helper.isPalilindrom("hello")

        // Assert

        assertEquals(false,result)
    }


    @Test
    fun isPalilindrom_inputeString_level_expectedTrue() {
        // Arrange
        val helper = Helper()

        // act
        val result = helper.isPalilindrom("level")

        // Assert

        assertEquals(true,result)
    }



}