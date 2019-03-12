package module_23.module_14_updated.max;

import java.util.*;
import java.util.function.Supplier;

public class Commodity {
  private Set<Product> products = new HashSet<>();

  public Set<Product> getProducts() {
    return products;
  }

  private Supplier<Integer> getIndex = () -> {
    products.forEach(System.out::println);
    System.out.println("Input index of product to delete:(0-" + (products.size() - 1) + ")");
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  };

  public void addProduct(Supplier<Product> func) {
    products.add(func.get());
    System.out.println("Product have been added!");
  }

  public void deleteProduct() {
    products.remove(products.toArray()[getIndex.get()]);
    System.out.println("Product have been deleted.");
  }

  public void replaceProduct() {
    products.forEach(System.out::println);
    System.out.println("Input index of product: (0-" + (products.size() - 1) + ")");
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    Product product = (Product) products.toArray()[index];
    System.out.println("Change 1 - name, 2 - length, 3 - weight, 4 - width:");
    int choice = sc.nextInt();
    sc.nextLine();
    System.out.println("Input value:");
    String answer = sc.nextLine();
    switch (choice) {
      case 1:
        product.setName(answer);
        break;
      case 2:
        product.setLength(Integer.parseInt(answer));
        break;
      case 3:
        product.setWeight(Integer.parseInt(answer));
        break;
      case 4:
        product.setWidth(Integer.parseInt(answer));
        break;
      default:
        System.out.println("Invalid input!");
        return;
    }
    System.out.println("Changed successfully!!!");
  }

  public void sortByName() {
    List<Product> list = new ArrayList<>(products);
    list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    list.forEach(System.out::println);
  }

  public void sortByLength() {
    List<Product> list = new ArrayList<>(products);
    list.sort((o1, o2) -> o1.getLength() - o2.getLength());
    list.forEach(System.out::println);
  }

  public void sortByWidth() {
    List<Product> list = new ArrayList<>(products);
    list.sort((o1, o2) -> o1.getWidth() - o2.getWidth());
    list.forEach(System.out::println);
  }

  public void sortByWeight() {
    List<Product> list = new ArrayList<>(products);
    list.sort((o1, o2) -> o1.getWeight() - o2.getWeight());
    list.forEach(System.out::println);
  }

  public void printElement() {
    products.forEach(System.out::println);
    System.out.println("Input index of product: (0-" + (products.size() - 1) + ")");
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    System.out.println(products.toArray()[index]);
  }
}
