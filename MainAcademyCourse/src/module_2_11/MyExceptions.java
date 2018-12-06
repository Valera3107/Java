package module_2_11;

public class MyExceptions extends RuntimeException {
  public MyExceptions(String message) {
    message(message);
  }

  private void message(String str) {
    System.out.println("Exception: " + str);
  }
}
