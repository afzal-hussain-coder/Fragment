package com.example.fragment


import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.Before as Before1

class ValidationTest{

    private lateinit var validation:Validation

    @Before1
    fun setUp(){
         validation=Validation()
    }
    @Test
    fun checkEmail(){
        val result=validation.email("hafzal446@gmail.com")
        assertThat(result).isTrue()
    }
    @Test
    fun chcekAddition(){
        val addResult=validation.addNumber(5,4)
        assertThat(addResult).isEqualTo(9)
    }

}