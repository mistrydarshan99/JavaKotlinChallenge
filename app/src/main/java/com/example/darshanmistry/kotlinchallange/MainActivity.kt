package com.example.darshanmistry.kotlinchallange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val twosum = TwoSum()
    twosum.twoSumFun(intArrayOf(3, 4, 5, 9), 7)

//    twosum.reverseInt(5679)
  }
}
