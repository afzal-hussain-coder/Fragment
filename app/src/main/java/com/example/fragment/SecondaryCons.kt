package com.example.fragment

open class Accountt{
    //Secondary Constructor

    constructor(idd:Int,namee:String){
        println("Next Execute")
        println("Id is $idd")
        println("Name is $namee")

    }
    constructor(id:Int,name:String,password: Int){
        println("Fistr Execute")
        println("Id is $id")
        println("Name is $name")
        println("Password is $password")

    }


}

class child:Accountt{
    constructor(city:String,Country:String,idd:Int,namee:String):super(idd ,namee){
        println("Next1 Execute")
        println("City is $city")
        println("Country is $Country")

    }
    constructor(city:String,Country:String,house: String,id:Int,name:String,password: Int):super(id,name,password){
        println("Fistr2 Execute")
        println("City is $city")
        println("Country is $Country")
        println("Password is $password")

    }
}