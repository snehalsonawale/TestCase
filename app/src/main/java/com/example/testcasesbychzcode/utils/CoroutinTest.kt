package com.example.testcasesbychzcode.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class utilsforCoroutinTest(val dispatcher: CoroutineDispatcher){

    suspend fun getUserName():String{
        delay(100)
        return "Testing Coroutin"
    }

    suspend fun getUser():String{
        CoroutineScope(Dispatchers.Main).launch {
            delay(100)
        }
        return "user getuser return"
    }

    suspend fun getAddress():String{
        CoroutineScope(Dispatchers.IO).launch {
            delay(100)
        }
        return "Address"
    }
}