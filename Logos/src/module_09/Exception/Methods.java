package module_09.Exception;

public class Methods {
  public static void sum(double a, double b) throws IllegalAccessException, MyException {
    if (a < 0 && b < 0) {
      throw new IllegalAccessException("Two number less then zero!!!");
    } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
      throw new ArithmeticException("You have inputted zero number!!!");
    } else if (a == 0 && b == 0) {
      throw new IllegalAccessException("You have inputted two zero numbers!!!");
    } else if (a > 0 && b > 0) {
      throw new MyException();
    } else {
      System.out.println("Sum = " + (a + b));
    }
  }

  public static void min(double a, double b) throws IllegalAccessException, MyException {
    if (a < 0 && b < 0) {
      throw new IllegalAccessException("Two number less then zero!!!");
    } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
      throw new ArithmeticException("You have inputted zero number!!!");
    } else if (a == 0 && b == 0) {
      throw new IllegalAccessException("You have inputted two zero numbers!!!");
    } else if (a > 0 && b > 0) {
      throw new MyException();
    } else {
      System.out.println("Min = " + (a - b));
    }
  }

  public static void mult(double a, double b) throws MyException, IllegalAccessException {
    if (a < 0 && b < 0) {
      throw new IllegalAccessException("Two number less then zero!!!");
    } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
      throw new ArithmeticException("You have inputted zero number!!!");
    } else if (a == 0 && b == 0) {
      throw new IllegalAccessException("You have inputted two zero numbers!!!");
    } else if (a > 0 && b > 0) {
      throw new MyException();
    } else {
      System.out.println("Mult = " + (a * b));
    }
  }

  public static void divide(double a, double b) throws MyException, IllegalAccessException {
    if (a < 0 && b < 0) {
      throw new IllegalAccessException("Two number less then zero!!!");
    } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
      throw new ArithmeticException("You have inputted zero number!!!");
    } else if (a == 0 && b == 0) {
      throw new IllegalAccessException("You have inputted two zero numbers!!!");
    } else if (a > 0 && b > 0) {
      throw new MyException();
    } else {
      System.out.println("Divide = " + (a / b));
    }
  }
}

