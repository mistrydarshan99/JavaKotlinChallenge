package com.example.darshanmistry.kotlinchallange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BigArraySumActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    simpleArraySum(arrayOf(10, 20, 30, 40, 50))

    val simpleArraySumOne =
      simpleArraySumOne(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005))
    println("-------------------------------------$simpleArraySumOne")

  }

  fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0

    val sum1 = ar
      .sumBy {
        when (it) {
          is Int -> it
          else -> 0
        }
      }

    return sum1
  }

  fun simpleArraySumOne(ar: Array<Long>) = ar.sum()
}
