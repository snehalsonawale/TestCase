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

    fun reverseString(inpute:String?):String{
        if (inpute == null){
            throw IllegalAccessException("Input string is Required")
        }
        var chars = inpute.toCharArray()
        var i =0
        var j = chars.size - 1
        while (i < j){
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++
            j--
        }
        return chars.joinToString("")
    }
}