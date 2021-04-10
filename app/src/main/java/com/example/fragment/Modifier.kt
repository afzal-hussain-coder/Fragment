package com.example.fragment
 open class Modifier{
     open val a:Int = 0
     private val user_Name=""
     protected open val city=""
     internal open val country=""

     protected open fun addNumber(a:Int,b:Int):Int{
         return a+b
     }
 }

class child1:Modifier(){
    override val a=20
    val user_Name="Afzal"
    public override val city="Samastipur"
    override val country="India"

    public override fun addNumber(a:Int,b:Int):Int{
        return a+b
    }


}
