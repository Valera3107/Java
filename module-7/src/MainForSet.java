
import java.util.*;

public class MainForSet {
  public static void main(String[] args) {
    User[] users = {new User(0001, "Pavlo", "Picasso", "London", 10_500),
      new User(0010, "Peter", "Fagot", "Lion", 12_800),
      new User(0011, "Max", "Tranker", "Madrid", 1_500),
      new User(0100, "Frank", "Carpen", "Lion", 8_700),
      new User(0101, "Tim", "Nest", "London", 1_400),
      new User(0110, "Tom", "Pinch", "Kiev", 17_500)};

    Order[] orders = {
      new Order(0001, 1000, Currency.USA, "Iphone", "AB1111CD", users[0]),
      new Order(0010, 505, Currency.RUB, "Table", "AB1110CD", users[1]),
      new Order(0011, 234, Currency.RUB, "Computer", "AB1101CD", users[2]),
      new Order(0100, 1546, Currency.USA, "Radio", "AB1100CD", users[3]),
      new Order(0101, 2348, Currency.USA, "Car", "AB1011CD", users[4]),
      new Order(0110, 10, Currency.RUB, "Paper", "AB1010CD", users[5]),
      new Order(0010, 505, Currency.RUB, "Table", "AB1110CD", users[1]),
      new Order(0001, 1000, Currency.USA, "Iphone", "AB1111DD", users[0]),
      new Order(0101, 2348, Currency.USA, "Car", "AB1011CD", users[4]),
      new Order(0110, 10, Currency.RUB, "Paper", "AB1010CD", users[5])};

    TreeSet<Order> ordersSet = new TreeSet<Order>();
    for (int i = 0; i < orders.length; i++) {
      ordersSet.add(orders[i]);
    }

    printCollection(ordersSet);

   String str = "Nest";

    System.out.println("Is " + str + " contains: "+containsLastName(ordersSet, str));

    System.out.println("Order with the biggest price: " + ordersSet.last());

    System.out.println("After delete:");

    deleteUSAOrder(ordersSet);

    printCollection(ordersSet);
  }

  public static void printCollection(Collection<Order> collection) {
    for (Object obj: collection) {
      System.out.println(obj.toString());
    }
  }

  public static boolean containsLastName(Collection<Order> collection, String str) {
    Iterator<Order> orderIterator = collection.iterator();

    while (orderIterator.hasNext()) {
      if(orderIterator.next().getUser().getLastName() == str) return true;
    }
    return false;
  }

  public static void deleteUSAOrder(Collection<Order> collection) {
    Iterator<Order> orderIterator = collection.iterator();

    while (orderIterator.hasNext()) {
      if(orderIterator.next().getCurrency().equals(Currency.USA)) {
        orderIterator.remove();
      }
    }
    }
}
