package module_2_18;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class BuyNail {
  private static final double[] costs = {0.1, 0.2, 0.3, 0.4};

  public static void butNails(double money) {
    int choice;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose cost of nail: (1-4) " + Arrays.toString(costs));
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        countItemBought(costs[0], money);
        break;
      case 2:
        countItemBought(costs[1], money);
        break;
      case 3:
        countItemBought(costs[2], money);
        break;
      case 4:
        countItemBought(costs[3], money);
        break;
      default:
        System.out.println("Invalid input!");
        break;
    }
  }

  private static void countItemBought(double cost, double money) {
    int count = 0;
    while (money > 0) {
      money -= cost;
      if (money < 0) {
        money *= -1;
        break;
      }
      count++;
    }
    count--;

    System.out.println("Money left over: $" + money);
    System.out.println("Items bought: " + count);
  }
}
