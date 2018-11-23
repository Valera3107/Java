import java.util.Comparator;

public class CompareOrder implements Comparator<Order> {
  @Override
  public int compare(Order o1, Order o2) {
    return o1.getPrice() - o2.getPrice();
  }
}
