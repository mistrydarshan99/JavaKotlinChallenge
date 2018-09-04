package com.example.darshanmistry.kotlinchallange

class TwoSum {

  fun twoSumFun(numbers: IntArray, target: Int) {

    val associateBy = numbers.associateBy { i: Int -> 10 }
    print("---------->$associateBy")

//    numbers.asSequence()
//      .map { i -> target.minus(i) }
//      .filterIndexed()

    val all = numbers.all {
      target > 0
    }
    println("--------------------->$all")

  }

  fun reverseInt(number: Int) {
    val arrayOf = arrayOf(number)
    println("-------------->${arrayOf.reverse()}")
  }
}
