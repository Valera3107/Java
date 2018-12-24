package Exception;

public class InvalidIdException extends RuntimeException {
  public static void throwInvalidIdException() {
    throw new InvalidIdException();
  }
}
