package com.knoldus.functions

 class FunctionExpand {

  //val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
   val add: Function2[Int,Int,Int] = new Function2[Int, Int, Int] {
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }

  //val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  val sumOfList: Function1[List[Int],Int]= new Function1[List[Int], Int]{
   override def apply(aList: List[Int]): Int = aList.sum
  }

  //val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
  def higherOrderFunction(f:Int => Int, num : Int) : Int = {
   def apply(num: Int):Int = f(num)
   apply(num)
}

 }