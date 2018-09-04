package com.example.darshanmistry.kotlinchallange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ArraySumActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    simpleArraySum(arrayOf(10, 20, 30, 40, 50))

    simpleArraySumOne(arrayOf(10, 20, 30, 40, 50))

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

  fun simpleArraySumOne(ar: Array<Int>) = ar.sum()
}
