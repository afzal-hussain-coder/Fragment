
package com.example.fragment

import androidx.constraintlayout.solver.widgets.Rectangle
import java.math.BigInteger


fun main(){

    println(getFibonacciSeries(11, BigInteger("0"),BigInteger("1")))

 }


 tailrec fun getFibonacciSeries(n:Int,a:BigInteger,b:BigInteger):BigInteger{

     if(n==0)
         return b
     else
     return getFibonacciSeries(n-1,a+b,a)
 }







