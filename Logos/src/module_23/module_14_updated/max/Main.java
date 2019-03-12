package module_23.module_14_updated.max;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    boolean isStop = false;
    Commodity commodity = new Commodity();
    commodity.getProducts().add(new Product("Coca-Cola", 20, 14, 5));
    commodity.getProducts().add(new Product("Pepsi", 16, 12, 8));
    commodity.getProducts().add(new Product("Box", 21, 19, 6));
    commodity.getProducts().add(new Product("Lego", 6, 34, 3));
    commodity.getProducts().add(new Product("Milk", 27, 20, 9));
    commodity.getProducts().add(new Product("Chocolate", 56, 18, 1));

    Supplier<Product> productBuilder = () -> {
      Scanner sc = new Scanner(System.in);
      System.out.println("Input name:");
      String name = sc.nextLine();
      System.out.println("Input length:");
      int length = sc.nextInt();
      System.out.println("Input width:");
      int width = sc.nextInt();
      System.out.println("Input weight:");
      int weight = sc.nextInt();
      return new Product(name, length, width, weight);
    };

    int choice;
    Scanner scanner = new Scanner(System.in);
    printFuctional();
    while (!isStop) {
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          commodity.addProduct(productBuilder);
          break;
        case 2:
          commodity.deleteProduct();
          break;
        case 3:
          commodity.replaceProduct();
          break;
        case 4:
          commodity.sortByName();
          break;
        case 5:
          commodity.sortByLength();
          break;
        case 6:
          commodity.sortByWidth();
          break;
        case 7:
          commodity.sortByWeight();
          break;
        case 8:
          isStop = true;
          break;
        case 9:
          System.exit(0);
        case 10:
          printFuctional();
          break;
        default:
          System.out.println("Invalid input!");
          break;
      }

    }
  }

  private static void printFuctional() {
    System.out.println("1 - add product\n" +
      "2 - delete product\n" +
      "3 - replace product\n" +
      "4 - sort by name\n" +
      "5 - sort by length\n" +
      "6 - sort by width\n" +
      "7 - sort by weight\n" +
      "8 - stop work\n" +
      "9 - stop all\n" +
      "10 - print options");
  }
}
