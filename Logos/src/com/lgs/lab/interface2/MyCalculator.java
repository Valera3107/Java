package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
  @Override
  public void devide(double num1, double num2) {
    System.out.println("Devide result: " + (num1/num2));
  }

  @Override
  public void minus(int num1, int num2) {
    System.out.println("Minus result: " + (num1 - num2));
  }

  @Override
  public void multiply(int... num) {
    int res = 1;
    for (int i = 0; i < num.length; i++) {
      res*=num[i];
    }
    System.out.println("Multiply result: " + res);
  }

  @Override
  public void sum(int... num) {
    int res = 0;
    for (int i = 0; i < num.length; i++) {
      res+=num[i];
    }
    System.out.println("Sum result: " + res);
  }
}
