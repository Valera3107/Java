package Exception;

public class TestThrow {
  public static void g() {
    throw new MyException("You called my exception!");
  }

  public static void f() {
    try {
      g();
    } catch (Exception e) {
      e.printStackTrace();
      throw new NullPointerException("I'm new exception ha ha ha!");
    } finally {
      System.out.println("Exception at the method!");
    }
  }
}
