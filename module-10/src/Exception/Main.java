package Exception;

public class Main {
  public static void main(String[] args) {
    try {
      throw new NullPointerException("Null pointer exc!!");
    } catch (NullPointerException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Finally block!");
    }

    //====================

    try {
      throw new MyException("It's my exception!");
    } catch (MyException e) {
      e.printStackTrace();
    } finally {
      System.out.println("It's finally block!");
    }

    //=====================

    try {
      Object o = null;
      o.toString();
    } catch (NullPointerException e) {
      e.printStackTrace();
    } finally {
      System.out.println("It's finally block!");
    }

    //====================

    try {
      TestThrow.f();
    } catch (NullPointerException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Exceptions of the class TestThrow!");
    }

    //===================

    try {
      ThrowExceptions.throwExceptions();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("All exceptions have intercepted!");
    }
  }
}
