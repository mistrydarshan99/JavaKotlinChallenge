package com.example.darshanmistry.kotlinchallange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.abs

class DiagonalDifferenceActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val a = arrayOf(arrayOf(10, 20, 70), arrayOf(40, 50, 60), arrayOf(70, 80, 90))

    diagonalDifference(a)
  }

  fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sumLeftDiagonal = 0
    var sumRightDiagonal = 0
    var n = arr.size
    for (i in arr.indices) {
      for (j in (arr[i].indices)) {
        if (i == j) {
          sumLeftDiagonal += arr[i][j]
        }

        if (i == n - j - 1) {
          sumRightDiagonal += arr[i][j]
        }
      }
    }


    println("ABS is -------------->${abs(sumLeftDiagonal - sumRightDiagonal)}")
    Math.abs(sumLeftDiagonal - sumRightDiagonal)

    return abs(sumLeftDiagonal - sumRightDiagonal)
  }
}
