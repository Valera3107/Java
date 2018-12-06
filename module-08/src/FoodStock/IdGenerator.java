package FoodStock;

public class IdGenerator {
  public static int generateId() {
    return (1111 + (int) (Math.random()*9999));
  }
}
