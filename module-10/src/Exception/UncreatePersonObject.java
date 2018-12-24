package Exception;

public class UncreatePersonObject extends RuntimeException {
  public static void throwUncreatePersonObject() {
    throw new UncreatePersonObject();
  }
}
