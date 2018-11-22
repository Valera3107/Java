package com.brainacad.calc;

import com.brainacad.shapes.Triangle;

public class Main {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(30, 40, 50);
    System.out.println("Area of triangle: " + triangle.getArea());
  }
}
