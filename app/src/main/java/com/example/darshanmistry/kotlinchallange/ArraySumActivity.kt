package com.example.darshanmistry.kotlinchallange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ArraySumActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    simpleArraySum(arrayOf(10, 20, 30, 40, 50))

    simpleArraySumOne(arrayOf(10, 20, 30, 40, 50))

  }

  private fun simpleArraySumOne(ar: Array<Int>) = ar.sum()

  private fun simpleArraySum(ar: Array<Int>) = ar.sumBy {
    it
  }

}
