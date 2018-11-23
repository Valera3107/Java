import java.util.*;
import java.util.function.Predicate;

public class Main {
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



    CompareOrder compareOrder = new CompareOrder();
    ArrayList<Order> list = new ArrayList<Order>();
    for (int i = 0; i < orders.length; i++) {
      list.add(orders[i]);
    }
    Collections.sort(list);

    for (Object obj: list
         ) {
      System.out.println(obj.toString());
    }

    System.out.println("----------------------------");

    Collections.sort(list, Collections.reverseOrder());

    for (Object obj: list
      ) {
      System.out.println(obj.toString());
    }




    list.sort(new Comparator<Order>() {
      @Override
      public int compare(Order o1, Order o2) {
        if (o1.getUser().getBalance() == o2.getUser().getBalance()){
          return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        } else {
          return o1.getPrice() - o2.getPrice();
        }
      }
    });

    System.out.println();
    System.out.println("Compare city and balance: ");
    System.out.println();

    for (Object obj: list
      ) {
      System.out.println(obj.toString());
    }

    System.out.println();
    System.out.println("Compare city, balance and id: ");
    System.out.println();

    list.sort(new Comparator<Order>() {
      @Override
      public int compare(Order o1, Order o2) {
        if (o1.getUser().getBalance() == o2.getUser().getBalance()){
          if(o1.getUser().getCity().compareTo(o2.getUser().getCity()) == 0) return o2.getShopIdentificator().compareTo(o2.getShopIdentificator());
          return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        } else {
          return o1.getPrice() - o2.getPrice();
        }
      }
    });

    for (Object obj: list
      ) {
      System.out.println(obj.toString());
    }

    System.out.println("----------------------------");

    ArrayList<Order> RUBList = new ArrayList<>();
    ArrayList<Order> USAList = new ArrayList<>();

    list.stream().forEach(elem -> {
      if(elem.getCurrency() == Currency.RUB) RUBList.add(elem);
      else if (elem.getCurrency() == Currency.USA) USAList.add(elem);
    });

    System.out.println("Rub list:");
    System.out.println(RUBList.size());
    for (Object obj : RUBList) {
      System.out.println(obj.toString());
    }

    System.out.println("---");
    System.out.println("Usa list");
    System.out.println(USAList.size());
    for (Object obj : USAList) {
      System.out.println(obj.toString());
    }

    System.out.println("---------------------");

    List<Order> orderListIn = new ArrayList<>(list);

    list.removeIf(new Predicate<Order>() {
      @Override
      public boolean test(Order order) {
        if(order.getPrice() < 1500) return true;
        return false;
      }
    });

    for (Object obj: list
      ) {
      System.out.println(obj.toString());
    }

    System.out.println("Delete dublicates: ");

    List<Order> orderList = deleteDublicates(orderListIn);

    for (Object obj: orderList
         ) {
      System.out.println(obj.toString());
    }

  }

  public static ArrayList<Order> deleteDublicates(List<Order> orderIn) {
    ArrayList<Order> ordersOut = new ArrayList<>(orderIn);

    if(ordersOut.size() == 1) return ordersOut;

    for (int i = 0; i < ordersOut.size(); i++) {
      if(ordersOut.get(i) != null) {
        for (int j = 0; j < ordersOut.size(); j++) {
          if(ordersOut.get(i).equals(orderIn.get(j))) {
            ordersOut.remove(i);
          }
        }
      }
    }

    while (ordersOut.remove(null)) {}

    return ordersOut;
  }
}
