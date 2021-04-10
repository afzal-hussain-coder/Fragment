package com.example.fragment

class Cat:Animal() {

    override val color:String="Black"
    override val eat:String="Milk"
      override fun meou(){
          super.meou()
        println("The cat is walking")
    }
}

class Dog:Animal(){

    override val color:String="White"
    override val eat:String="Chicken"
     fun walking(){
        println("The Dos is barking")
    }
}