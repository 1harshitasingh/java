package com.company.lec10;

public class PracticeQ6 {
  public static void main(String[] args) {
    try {
      int result = divideNum(5, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static int divideNum(int dividend, int divisor) {
    if (divisor == 0) {
      throw new ArithmeticException("Cannot divide  by zero!");
    }

    return dividend / divisor;
  }
}