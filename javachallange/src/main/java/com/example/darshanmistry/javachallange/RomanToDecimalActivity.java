package com.example.darshanmistry.javachallange;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class RomanToDecimalActivity extends AppCompatActivity {

  public final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
  public final String[] NUMBER_LETTERS =
      { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    romanToDecimal("III");
  }

  public static void romanToDecimal(String romanNumber) {
    int decimal = 0;
    int lastNumber = 0;
    String romanNumeral = romanNumber.toUpperCase();
        /* operation to be performed on upper cases even if user
           enters roman values in lower case chars */
    for (int x = romanNumeral.length() - 1; x >= 0; x--) {
      char convertToDecimal = romanNumeral.charAt(x);

      switch (convertToDecimal) {
        case 'M':
          decimal = processDecimal(1000, lastNumber, decimal);
          lastNumber = 1000;
          break;

        case 'D':
          decimal = processDecimal(500, lastNumber, decimal);
          lastNumber = 500;
          break;

        case 'C':
          decimal = processDecimal(100, lastNumber, decimal);
          lastNumber = 100;
          break;

        case 'L':
          decimal = processDecimal(50, lastNumber, decimal);
          lastNumber = 50;
          break;

        case 'X':
          decimal = processDecimal(10, lastNumber, decimal);
          lastNumber = 10;
          break;

        case 'V':
          decimal = processDecimal(5, lastNumber, decimal);
          lastNumber = 5;
          break;

        case 'I':
          decimal = processDecimal(1, lastNumber, decimal);
          lastNumber = 1;
          break;
      }
    }
    System.out.println(decimal);
    Log.e("JavaChallange",
        "romanToDecimal: ------------------------------------------->" + decimal);
  }

  public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
    if (lastNumber > decimal) {
      return lastDecimal - decimal;
    } else {
      return lastDecimal + decimal;
    }
  }

  public int romanToInt(String s) {
    if (s == null || s.length() < 1) {
      return 0;
    }

    int sum = 0;
    int prevNum = 0;
    char[] input = s.toCharArray();

    for (int i = input.length - 1; i >= 0; i--) {
      switch (input[i]) {
        case 'I':
          sum += (prevNum > 1 ? -1 : 1);
          prevNum = 1;
          break;
        case 'V':
          sum += (prevNum > 5 ? -5 : 5);
          prevNum = 5;
          break;
        case 'X':
          sum += (prevNum > 10 ? -10 : 10);
          prevNum = 10;
          break;
        case 'L':
          sum += (prevNum > 50 ? -50 : 50);
          prevNum = 50;
          break;
        case 'C':
          sum += (prevNum > 100 ? -100 : 100);
          prevNum = 100;
          break;
        case 'D':
          sum += (prevNum > 500 ? -500 : 500);
          prevNum = 500;
          break;
        case 'M':
          sum += (prevNum > 1000 ? -1000 : 1000);
          prevNum = 1000;
          break;
      }
    }

    return sum;
  }
}

