package Exception;

public class InvalidNameInput extends RuntimeException {
  public static void throwInvalidNameInput() {
    throw new InvalidNameInput();
  }
}
