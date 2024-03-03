package com.example.testcasesbychzcode.utils

import org.junit.Test
import org.junit.Assert.*
import org.junit.runners.Parameterized.Parameter


class ParametariesExample(val input:String,val expectedvalue:Boolean)
{


    @Test
    fun test() {


        val helper = Helper()
        val result = helper.isPalilindrom(input)
        assertEquals(expectedvalue, result)
    }



}