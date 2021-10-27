package com.knoldus.functions

object FunctionExpandRun{

def main (args: Array[String] ): Unit = {

  val a = new FunctionExpand
  println(a.add.apply(480,560))

  println(a.sumOfList.apply(List(1,5,9,16)))

  println(a.higherOrderFunction(num => num, 5))

  }

}
