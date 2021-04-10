import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.util.rangeTo
import com.example.fragment.*
import java.lang.ArithmeticException
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

 /*println("Please enter number")
 var input=Scanner(System.`in`)
 var num=input.nextLine()*/
 //recursionMethod('a')
 //println("Entered number is:-o ${evenOrOdd(num)}")
/*
var len:String
 len="jdkadk"
 println("The length is $len")

 var number:Int=10
 var number2:Int=29
 println("The sum of two number is ${number+number2}")
 var num:Byte=-12
 var num1:Short=6785
 var num2:Int=64382646
 var num3:Double=667386757443546542462436244324363462463263546441643162431632154254351243562432543216243562436254.0
 var num4:Float=654632626262645272737527542735476254f
 var num5:Long=546236253265362426
 var num6:Char='6' */
/*it will take 4 bit*//*

 var num7:Boolean=true  */
/*it will take only 1 bit*//*


 var str="ty8uwqtyiedwqhdi\n"
 var str1="hdkjhdka \nGD\tGQD\b"

 print(str)
 print(str1)

 var str3="""hkdhaskjdhka
  |duhsaiduh
  |hdshd
  |hsdsahd
  |dhsakjdh
  |dhshd
  |   ydhiahsdhkshd
  |         gdjhdsd
 """.trimMargin()

 var latter="""Dear Afzal,
  |
  |Greetings of the dat!
  |
  |This is Afzal here I would like to share about my qualification and experience.
  |I have done my B.Tech in IT in PTU in 2014 with 72% .I wastarted work in Trigma
  |
  |Thanks # Regards
  |Afzal Hussain
 """.trimMargin()

 print(latter)

 var numM="""The type conversion is a process in which one data type is converted
  |into an other data type.
 """.trimMargin()


 println(numM)
*/

 /*var a=10
 var b:Long=a.toLong()
 var c=b.toFloat()
 var d=c.toDouble()
 var e=d.toShort()
 var f=e.toChar()
 println(f)*/

 //Kotlin operator
 // Arithmetic Operator +,-,/,%
/*
 var a=10
 var b=50
 println(a+b)
 println(a-b)
 println(a*b)
 println(a%b)
 println(a/b)
 a+=10
 println(a)*/

 //Relation Operator
 /*var max=if(a>b){
   println("a is greater than b")
   a
  }else{
   println("b is greater than a")
   b
  }
 println("max=$max")*/

 //Assignment Operator
 //+=
 //Unary Operator
 // +,-,++,--,!

 /*var x=-10
 x=--x
 println(x)
 var flag=false
 println("The flag is ${!flag}")*/
 //Bitwise Operator

/*
  var a=20
 var b=2
 println(a.shl(b))
 println(a.shr(b))
 println(a.ushr(b))
 println(a.or(b))
 println(a.and(b))

 println(a.xor(b))*/


 //Logical Operator
/*
 var z=10
 var l=20
 var k=3
 var result:Boolean
 var flaga=true
 result=(z>l)&&(z>k)
 println("The result of (z>l)&&(z>k)= $result ")

 result=(z>l)||(z>k)
 println("The result of (z>l)||(z>k)=$result")
 result=!flaga
 println("The result of !flaga=$result")*/

 //Kotlin standard Input/Output

 /*println("Enter first number")
 val input=Scanner(System.`in`)
 println("Please enter number")
 var numberr:Int
 numberr=input.nextInt()

 var n:Int=Integer.valueOf(readLine())
 println("The value is $n")*/


 //Control Flow
 // if-else expression
 /*var num:Int=40
 var num1=20
 var num2=30*/

 /*if(num>num1){
  println("$num is greated than $num1")
 }else{
  println("$num1 is greater than $num")
 }
 var result=if(num>num1)"$num1 is greaten than $num" else "$num is greater than $num1"
 println(result)*/


 // if-else if-else ladder expression
/*
 var result: String = if (num < 0) {
 "$num is negative"
}
  else if(num>0){
   "$num is positive"
  }else{
   "$num is 0"
  }
 println(result)*/

 // nested if expression
/*
 var result=if(num>num1){
  if(num>num2){
  num
  }else{
num2
  }
 }else if(num1>num2){
  num1
 }else{
  num2
 }

 println(result)*/

 // Kotlin when expression

/* println("Please enter your marks")
 var input=Scanner(System.`in`)
 var marks=input.nextInt()*/

 /*var result = when(marks){
  in 1..5->"range between 1 to 5"
  in 3..7->"range between 3 to 7"
  in 1..100->"range between 1 to 100"
  else->"invalid number"
 }*/
 //println(result)

 // Kotlin for loop
 // Kotlin while loop
 // Kotlin do while loop
/*
 var numbers= Array<Int>(5){0}
 numbers[0]=10
 numbers[1]=20
 numbers[3]=40
 numbers[4]=50*/

/*
 for (i in 0..numbers.size-1) {
  if(numbers[i]==0) continue
  println(numbers[i])
 }

 for(i in numbers.size downTo 1 step 3) println(i)
 for (i in 10 downTo 1 step 2) println(i)*/
 /*var j=1
 while (j<=5){
  println(j)
  j++
 }*/
 /*var i=10
 do{
  println(i)
  i++
 }while (i<=5)*/
 /* var result=greaterThanNumber(20,40)
 println(result)
}
fun greaterThanNumber(number1:Int,number2:Int ):Int{
 if(number1>number2) return number1 else return number2
}*/

 //println("The divided number is: ${7/2}")
//recursionMethod('a')
 //println(fac(5))
 //println(recSum(4))
 //run(letter = 'n')
/*
 val name="Afzal"
 val name1="Afzal"
 val name2="Hello"
 val name3= buildString { "Mohit" }

 println(name==name1)
 println(name===name1)
 println(name==name2)
 println(name===name3)*/


 //Exception Handling in Kotlin
 // Exception handling is a technique which handle runtime problem and maintain the flow of program execution
 //There are four different  keyword is used to Exception handling:-
 // try
 // catch
 // finally
 // throw

 // ArithmeticException             throw when we divided a number by zero
/*
try {
 var data=20/0
}catch (e:ArithmeticException){
 println("we can not divide through zero")
}

 println("he;llo")*/

 // Multiple catch block
 /*val name = intArrayOf(4, 8, 16, 32, 64, 128, 256, 512)
 val deno = intArrayOf(4, 0, 2, 0, 4, 0)
 try {
  *//*for (i in name.indices) {
   try {
    println(name[i].toString() + "/" + deno[i] + " is " + name[i] / deno[i])
   } catch (e: ArithmeticException) {
    println("can not divided by zero")
   }
  }*//*
 } catch (e: ArrayIndexOutOfBoundsException) {
  println("Elementb is not found")
 } finally {
     println("Finally is executed")
 }*/


 // ArrayIndexOfBoundException      throw when an array  has been tried to access the incorrect index value..
 //NullPointerException             throw when invoking a method and property by null object
 //SecurityException                throw by the security manager to indicates the security violation

 // use of throw keyword in exception handling..
 //drivingLicence(23)

 // Kotlin Null Safety
// Kotlin Nullable Types and Non-Nullable Types
//var name:String?="Afzal"
// if (name!=null){
//  println(name.length)
// }else{
//  -1
// }

 // smart cast
 // !is and is

 /*var name:Any="hkjfhhakfhkahf"
 if(name !is String){
  println("The given variable is not String")
 }else{
  println("The length os String is ${name.length}")

 }*/

 //Unsafe and safe cast operator
//..This is Unsafe cast
// var name:Any?=null
// var name1=name as String
// println(name1)
// Safe cast Operator
// var name2:Any?="75972389"
// var name3:String=name2 as String
// var name4:Int?=name3 as? Int
// println(name3)
// println(name4)

 // Elvis Operator(?:)
//
// var name:String?="null"
// var len:Int=name?.length ?: -1
// println(len)

 // Collections
 //Array
 //Mutable Array
 //List : listOf()
 //mutableListOf()
 // Kotlin Array list
 //arrayListOf()
 // Map mapOf()
 // Kotlin HashMap
 // hashMapOf()
 // mutableMapOf()
 // Set : setOf()
 // mutableSetOf()
 // hasSetOf()

 // Mutable array
// var number= arrayOf(2,3,4,5,5,6,7,7,8)
// var number1= arrayOf<String>("hja","djh","hkdj","dkjaD")
// var number3= arrayOf<Any>("hjdd",6,7,7.03,"kjaD")
// //println(number3.get(0))
// var len:Int=number3.size-1
//
// for (i in 0..len){
//  if(number3[i] !is Int){
//   println(number3[i])
//  }
//  }

 //Kotlin List Interface
// var name= listOf<Any>("afzal","hussain","Sumy",1,4,5,6,7,8)
// var anotherNumber= listOf<Int>(1,4,5,6,7,8)
//
// for (i in 0..name.size-1){
//  if (name.get(i) is Int){
//   println(name.get(i)as Int)
//  }
// }

 //Mutable List
// var name= mutableListOf<Any>("Afzal","Hussain","sumy",1,5,6,7,8,'c','z')
//
// name.add('n')
//
// name.remove("Afzal")
//
// println(name)
//
//var newName= mutableListOf<String>()
//
// for (i in 0..name.size-1){
//  if (name.get(i) is Char){
//   var char=name.get(i) as Char
//   newName.add(char.toString())
//  }
//
//
// }
// println(newName)
// println(name.contains("c"))

 // Kotlin ArrayList
// var name=ArrayList<String>()
// name.add("afzaL")
// name.add("Hussain")
// name.add("Sumy")
//
// for (i in 0..name.size-1){
//  println(name.get(i))
// }

 // Kotlin ArrayList arrayListOf()
//   var arraylist= arrayListOf<employee>()
// var e=employee(1,"Afzal","Singhia")
// var e1=employee(2,"Abrar","Samastipur")
// var e2=employee(3,"Arzoo","Dharbhnaga")
// var e3=employee(4,"Saddam","Patna")
// arraylist.add(e)
// arraylist.add(e1)
// arraylist.add(e2)
// arraylist.add(e3)
// arraylist.removeAt(0)
//for (i in arraylist){
//
// println("id=${i.id}  Name= ${i.name} city= ${i.city} ")
//}

 // Kotlin Map
 // Map is a immutable interface that is only read data
 // its hold data with pair of key and value
 var map = mapOf<Int, String>(1 to "Afzal", 2 to "Hussain", 3 to "Hussain", 4 to "Sddam", 5 to "Arzoo", 6 to "Dilip")
//println(map)
// //println(map.getValue(3))
// println(map.isEmpty())
// println(map.containsValue("Sumyhh"))
// println(map.isNullOrEmpty())
// println(map.getOrDefault(7,"Rumy"))

// println(map.minus(3))
// println(map.plus(Pair(7,"Anil")))
// //println(map)
// for (i in map.asIterable()) {
//  if (i.value == "Hussain") {
//   println("${i.key}=${i.value}")
//  }
//
//
// }

 // Kotlin HasMap class
 // Hasmap is a class of collection based on MutablehasMap interface
// var hashmap=HashMap<Int,String>()
// hashmap.put(1,"Afzal")
// hashmap.put(2,"Hussain")
// hashmap.put(3,"Sumy")
// hashmap.put(4,"Saddam")
// hashmap.put(5,"Abrar")
//
//println(hashmap.size)
// println(hashmap.get(3))
// println(hashmap.remove(2))

// var anotherMap=HashMap<Int,String>()
// anotherMap.put(6,"Anil")
// anotherMap.put(7,"Amit")
// anotherMap.put(8,"AFzal")
// println(anotherMap)
// println(hashmap.putAll(anotherMap))

//
// var newHashMap= hashMapOf<Int,String>(1 to "Afzal",2 to "Hussain", 3 to "Sumy")
// newHashMap.replace(2,"Abrar")
// newHashMap.set(4,"anil")
// println(newHashMap)
//
// var ns= hashMapOf<Int,String>()
// ns=newHashMap.clone() as HashMap<Int, String>
// println(ns)
//
// for (i in hashmap.keys){
//  println("Element at : $i=${hashmap[i]}")
// }

 // Kotlin mutableMap Interface

// var newMap= mutableMapOf<Int,String>()

 // Kotlin Set Interface

 // kotlin Set Interface is  generic unordered collection of element
 // kotlin set does not support duplicate element
 // read only funcanality is occure not write
 // set is immutable by nature mathod
// var set= setOf<Any>(1,2 ,3,4 ,5, 6,"afzal","Hussain")
// println(set)
// var newSet=set.drop(4)
// println(newSet)
// println(newSet.elementAt(3))

 // Mutable set
// var mutableset= mutableSetOf<Int>(1,3,3,5,6,7,8)
// mutableset.add(8)
// println(mutableset)
// println(mutableset.remove(8))
// println(mutableset)
//
// var name= mutableSetOf<Int>(13,14)
// name.addAll(mutableset)
// println(name)
//
// name.removeAll(mutableset)
// println(name)

 // Kotlin HashSet class

// var hasSet= hashSetOf<Int>(1,3,4,5,7)
// println(hasSet)
// var newhasSet=HashSet<Int>(5)
// newhasSet.add(4)
// newhasSet.add(5)
// newhasSet.add(7)
// newhasSet.add(8)
//
// println(newhasSet)


 // Kotlin Ranges Function
// val al='a'..'z'
// val num=0..9
// println(" 3 in num ${13 in num}")
// for (i in 'a'..'z')
// print("${i.toUpperCase()} = 3 in ")
//
// println()
//
//
// var check=3 in num step 2
// println(check)
// for (i in 0..9) print("${i } ")
//
// for (i in 0..9)
//  print(i)
// println()
// for (i in 1.rangeTo(5))
//  print(i)
// println()
// for (i in 5 downTo 1)
//  print(i)
// println()
// for (i in 5.downTo(1))
//  print(i)
// println()
//
// for (i in 'z'.downTo('a')) print(i)
//for (i in 1 until 3) println(i)

// for (i in 1..10 step 3) print(i)

// var num=1..9
// for (i in num.reversed()) print(i)

 // Kotlin Class and Object
 // Kotlin support both Object oriented programming(oop) and functional progrraming




// var account=child("Patna","India","Singhia",3,"aFZAL",12)
// println(account)
// var account=Account1(1,"Aszal")
// println("name is ${account.name1} and Id is ${account.no1}")

 //println("${account.idd} and ${account.namee}")
// account.insert(1133,"Afzal",0.4f)
// account.showValue()

 // Kotlin nested class and inner class
 // Advantage of Inner class over nested calss is inner class can acess member of outer call even it is private because inner calss keep th references of outer class
 //Account().InnerClass().showInner()


 // Kotlin Constructor
 /// There are two types of Kotlin Constructor
 // Primary Constructor
 // Secondary Constructor

// Kotlin Visibility Modifier
 // Private
 //Protected
 //Public
 //Internal
//
// var modifier=child1()
// println(modifier.a)
// println(modifier.user_Name)
// println(modifier.country)
// println(modifier.addNumber(5,6))
//
// var cat=Cat()
// println(cat.color)
// println(cat.eat)
// println(cat.meou())
//
//
// var dog=Dog()
// println(dog.color)
// println(dog.eat)
// println(dog.walking())
// println(dog.meou())

 // Kotlin Abstract class

 // Kotlin Abstract class is a class which does not create object
 // Abstract class create normal and abstract method
 // Abstract Method don not have body
// var honda=Honda()
// println(honda.name())
// println(honda.run())

 // Kotlin Interface
 //  Interface basically used for achieve the multiple inheritance
 //  It contains abstract method declaration as well as implementation

// var myclass=MyClass()
// println(myclass.name)
// println(myclass.city())
// println(myclass.doingSomething())

 // Kotlin Data class

 // Data class is a simple class which hold the data/state and contain standard functionality.
 // A data keyword is used to declare a class as a data class

// var user=User("Afzal","hafzal446@gmail.com")
// println("User Name is ${user.name} and Email is ${user.email}")
////Data will be copy into other references
// var user1=user
// println("User Name is ${user1.name} and Email is ${user1.email}")


 // Sealed Class in Kotlin

 // Sealed class is a class which restricts the class hierarchy.A class can be declared
 // as a sealed class using 'sealed' keyword before the class name
 // it is used to represent restricted class hierarchy
// var circle=Shape.Circle(10)
// var rectangle=Shape.Rectangle(5,6)
// var square=Shape.Square(4)
//
// avail(circle)
// avail(rectangle)
// avail(square)


 // Calling java code from Kotlin
//var sum=Myjavaclass.add(4,6)
// println(sum)


// Find the ranges between 1..100 and every 3 to "Fizz",5 to "Buzz 15 to "Fizz Buzz"
// println((1..100).map {
//  index->
//  mapOf(0 to index,
//          index % 3 to "Fizz",
//          index % 5 to "Buzz",
//          index % 15 to "Fizz Buzz"
//          )[0]
// })




 // Rotate teh array
// var arr= arrayOf(1,2,3,4,5,6,7,8,9)
// for (i in arr.size-1 downTo 0){
//  print(arr[i])
// }

}
 // Reverse the string word by word
 //fun reverseToString(reverseToString:String)=reverseToString.split(" ").reversed().joinToString(" ")




/*fun drivingLicence(age:Int){
 if(age<18){
  throw ArithmeticException ("You are not eligible for driving licence")
  }else if(age>70){
  throw ArithmeticException("You are out of age")
 } else{
  println("You are eligible for  driving licence")
 }
 println("Final Execute")
}*/

/*
fun evenOrOdd(number:Int) {
 if(number%2==0){
  println("Prime")
 }else{
  println("Not Prime")
 }
}*/

// Recursion Function
// Recursion function is a function which call itself continuously
// This technique is called recursion

/*fun recursionMethod(num:Char){
 var newNum=num
 if(newNum<='z'){
  println(newNum)
  newNum++
  recursionMethod(newNum)
 }
}*/
 /*fun fac(i:Int):Long {
 if(i==1) return i.toLong() else return i*fac(i-1)
}*/

// Tail recursion

// Tail recursion is arecursion which perform calculation first then makes the recursive call
//the result of current step is passed into the next recusive call

/* tailrec fun recSum(n:Long,answer:Long=0):Long{
 return if(n<=0){
  answer
 }else {
   recSum((n-1),n+answer)
 }
}*/

// Kotlin function Default and named Arguments

/*fun run(num:Int=5,letter:Char='a'){
 println("The arguments prints $num  and $letter")
}*/

// String in Kotlin
// The String class represent an array of a char types
// String is immutable which means the length and element can not be changed after their creation





