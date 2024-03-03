package com.example.testcasesbychzcode.utils

class utils{

    fun validatePassword(input:String) =
        when{

            input.isBlank() -> {
                "Password is blanck"
            }
            input.length < 6 -> {
                "length need to grater than 6"
            }
             input.length > 15 -> {
                 "lenth should be less than 15 digit"
             }

            else ->{
                "Valid"
            }

    }
}