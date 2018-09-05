package com.example.darshanmistry.javachallange;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class LongestPrefixActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //longestCommonPrefix(new String[] { "leets", "leetCode", "leet", "leeds" });
    String longPrefix =
        longestCommonPrefix(new String[] { "leets", "leetCode", "darshan", "demo" });
    Log.e("Java", "onCreate: " + longPrefix);
  }

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    return prefix;
  }
}
