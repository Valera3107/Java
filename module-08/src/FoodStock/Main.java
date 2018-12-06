package FoodStock;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    ManagerSystem managerSystem = new ManagerSystem();
    Food milk = new Food("Milk", Country.EURO, 4);
    Food pizza = new Food("Pizza", Country.UK, 24);
    Food meat = new Food("Meat", Country.RUS, 7);
    Food cocaCola = new Food("Coca-Cola", Country.USA, 365);
    Food kitKat = new Food("Kit-Kat", Country.UKR, 103);
    Food bread = new Food("Bread", Country.EURO, 2);

    managerSystem.save(pizza, 23.4);
    managerSystem.save(meat, 143.7);
    managerSystem.save(milk , 23.6);
    managerSystem.save(cocaCola, 223.8);
    managerSystem.save(kitKat, 123.1);
    managerSystem.save(bread);

    for (Map.Entry<Food, Double> ent: managerSystem.getDatabase().entrySet()
         ) {
      System.out.println(ent);
    }

    System.out.println(managerSystem.getPrices());
    System.out.println(managerSystem.getProducts());

    managerSystem.delete(meat);
    managerSystem.deleteById(pizza.getId());

    System.out.println("Price: " + managerSystem.getPrice(milk));

    for (Map.Entry<Food, Double> ent: managerSystem.getDatabase().entrySet()
      ) {
      System.out.println(ent);
    }

    managerSystem.printProductsSortedByName();
    System.out.println();
    managerSystem.printProductsSortedByPrice();
  }
}
