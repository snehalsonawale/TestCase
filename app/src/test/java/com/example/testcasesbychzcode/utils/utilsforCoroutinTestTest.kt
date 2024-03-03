package com.example.testcasesbychzcode.utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class utilsforCoroutinTestTest {

    private val testDispatcher = StandardTestDispatcher()
    @Before
    fun setUp(){
        Dispatchers.setMain(testDispatcher)

    }
    @Test
    fun getUserName() {
        val sut = utilsforCoroutinTest(testDispatcher)

           runBlocking {
               sut.getUserName()
           }

    }


    @After
    fun tearDown(){
    Dispatchers.resetMain()
    }
}