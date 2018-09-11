package com.example.darshanmistry.kotlinchallange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LongestPrefixActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    longestCommonPrefix(arrayOf("leets", "leetCode", "leeds", "leef"))
    binarySearchAlgo(arrayOf("leets", "leetCode", "leeds", "leef"))
  }

  private fun longestCommonPrefix(strs1: Array<String>): String {

    if (strs1.isEmpty()) {
      return ""
    }

    val sortedArray = strs1.sortedBy {
      it.length
    }
    var longPrefix = sortedArray[0]

    for (i in 1 until sortedArray.size) {
      val commonPrefix = sortedArray[i].commonPrefixWith(longPrefix, true)
      commonPrefix.length.takeIf { it > 0 }.apply {
        longPrefix = commonPrefix
      }
    }

    return longPrefix

  }

  private fun binarySearchAlgo(listStr: Array<String>) {
    val sortedArray = listStr.sortedBy {
      it.length
    }
    val binarySearch = sortedArray.binarySearch("leets", 0, sortedArray.size)
    println("---------Value---------------$binarySearch")

  }

}
