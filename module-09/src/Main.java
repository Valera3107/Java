import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main<T> {
  public static void main(String[] args) {
    User[] users = {new User(0001, "Pavlo", "Picasso", "London", 10_500),
      new User(0010, "Peter", "Fagot", "Lion", 12_800),
      new User(0011, "Max", "Tranker", "Madrid", 1_500),
      new User(0100, "Frank", "Carpen", "Lion", 8_700),
      new User(0101, "Tim", "Nest", "London", 1_400),
      new User(0110, "Tom", "Pinch", "Krakow", 17_500)};

    Order[] orders = {
      new Order(0001, 1000, Currency.USA, "Iphone", "AB1111CD", users[0]),
      new Order(0010, 505, Currency.RUB, "Table", "AB1110CD", users[1]),
      new Order(0011, 234, Currency.RUB, "Computer", "AB1101CD", users[2]),
      new Order(0100, 1546, Currency.USA, "Radio", "AB1100CD", users[3]),
      new Order(0101, 2348, Currency.USA, "Car", "AB1011CD", users[4]),
      new Order(0110, 20, Currency.RUB, "Paper", "AB1010CD", users[5]),
      new Order(0010, 605, Currency.RUB, "Table", "AB1110CD", users[1]),
      new Order(0001, 1000, Currency.USA, "Iphone", "AB1111DD", users[0]),
      new Order(0101, 2500, Currency.USA, "Car", "AB1011CD", users[4]),
      new Order(0110, 101, Currency.RUB, "Paper", "AB1010CD", users[5])};


    List<Order> list = new ArrayList<>();
    addToCollection(list, orders);

    System.out.println("Split by currency: ");
    splitByCurrency(list);

    System.out.println("\n\nSplit by city:");
    splitByCity(list);

    System.out.println("\n\nSortByOrderPriceAndCity: ");

    sortByOrderPriceAndCity(list);

    System.out.println("\n\nSortByOrderPrice: ");
    sortByOrderPrice(list);

    System.out.println("\n\nSortByOrderNameIdentAndUserCity: ");
    sortByOrderNameIdentAndUserCity(list);

    System.out.println("\n\nDeleted dublicates: ");
    deleteDublicate(list);

    System.out.println("\n\nFindMatch: ");
    findMatch(list, "Tim");


    System.out.println("\n\nDelete orders with RUB currency: ");
    deleteOrderWithRUB(list);

    System.out.println("\n\nDelete by price: ");
    deleteByPrice(list);

  }

  private static <T extends Order> void splitByCity(List<T> list) {
    Map<String, List<T>> map = list.stream().collect(Collectors.groupingBy(e -> e.getUser().getCity()));
    new ArrayList<>(map.keySet()).forEach(e -> System.out.println(map.get(e)));
  }

  private static <T extends Order> void splitByCurrency(List<T> list) {
    Map<Currency, List<T>> map = list.stream().collect(Collectors.groupingBy(Order::getCurrency));
    new ArrayList<>(map.keySet()).forEach(e -> System.out.println(map.get(e)));
  }

  private static <T extends Order> void deleteByPrice(List<T> list) {
    list.stream().filter(e -> e.getPrice() > 1000).forEach(System.out::println);
  }

  private static <T extends Order> void deleteDublicate(List<T> list) {
    list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
  }

  private static <T extends Order> void deleteOrderWithRUB(List<T> list) {
    list.stream()
      .filter(e -> e.getCurrency() != Currency.RUB)
      .forEach(System.out::println);
  }

  private static <T extends Order> void findMatch(List<T> list, String name) {
    System.out.println(list.stream()
      .filter(e -> e.getUser().getFirstName().equals(name))
      .findFirst());
  }

  private static <T extends Order> void addToCollection(List<T> list, T[] arr) {
    list.addAll(Stream.of(arr).collect(Collectors.toList()));
  }

  private static <T extends Order> void sortByOrderPrice(List<T> list) {
    list.stream()
      .sorted(Comparator.comparingInt(Order::getPrice))
      .collect(Collectors.toList())
      .forEach(System.out::println);
  }

  private static <T extends Order> void sortByOrderPriceAndCity(List<T> list) {
    list.stream()
      .sorted(Comparator.comparingInt(Order::getPrice).thenComparing( e-> e.getUser().getCity()))
      .forEach(System.out::println);
  }

  private static <T extends Order> void sortByOrderNameIdentAndUserCity(List<T> list) {
    list.stream()
      .sorted(Comparator.comparing(Order::getItemName).thenComparing(e -> e.getUser().getCity()))
      .forEach(System.out::println);

  }

}



