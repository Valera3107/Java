package module_09.Exception;

public class Main {
  public static void main(String[] args) {
//    try {
//      Methods.sum(2, 2);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.sum(-2, -2);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.sum(0, 2);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.sum(0, 8);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.sum(0,0);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }


//    try {
//      Methods.min(2, 2);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.min(-2, -2);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.min(0, 2);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.min(0, 8);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.min(0,0);
//    } catch (IllegalAccessException | MyException e) {
//      e.printStackTrace();
//    }


//    try {
//      Methods.mult(2, 2);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.mult(-2, -2);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.mult(0, 2);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.mult(0, 8);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.mult(0,0);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }


//    try {
//      Methods.divide(2, 2);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.divide(-2, -2);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.divide(0, 2);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.divide(0, 8);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }
//
//    try {
//      Methods.divide(0,0);
//    } catch (MyException | IllegalAccessException e) {
//      e.printStackTrace();
//    }

    try {
      Methods.sum(4, -9);
    } catch (IllegalAccessException | MyException e) {
      e.printStackTrace();
    }

    try {
      Methods.min(24, -98);
    } catch (IllegalAccessException | MyException e) {
      e.printStackTrace();
    }

    try {
      Methods.mult(45, -7);
    } catch (MyException | IllegalAccessException e) {
      e.printStackTrace();
    }

    try {
      Methods.divide(34, -6);
    } catch (MyException | IllegalAccessException e) {
      e.printStackTrace();
    }

  }
}
