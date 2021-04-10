package com.example.fragment

class Validation {
    private val EMAIL_PATTERN="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    fun email(email:String):Boolean{
        return email.matches(EMAIL_PATTERN.toRegex())
    }

    fun addNumber(a:Int,b:Int):Int{
        return a+b
    }
}