package com.example.fragment

sealed class Shape {
    class Circle(var radious:Int):Shape()
    class Square(var side:Int):Shape()
    class Rectangle(var length:Int,var width:Int):Shape()
}

fun avail(s:Shape){
    when(s){
        is Shape.Circle-> println("The area of Circle is ${3.14*s.radious*s.radious}")
        is Shape.Square-> println("The are of square is ${s.side*s.side}")
        is Shape.Rectangle-> println("The are of rectangle is ${s.length*s.width}")
    }
}