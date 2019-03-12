package module_23.Rada;

import java.util.Scanner;
import java.util.function.Supplier;

@FunctionalInterface
interface Deletable<T> {
  T get(int index);
}

public class Main {
  private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();

  public static void main(String[] args) {

    Fraction communists = new Fraction("Communists");
    communists.addDeputy(new Deputy(56, 189.4, new String[]{"BMW", "4 rooms, 3 houses", "1 factory"}, true));
    communists.addDeputy(new Deputy(76, 178.6, new String[]{"Audi", "3 rooms, 1 houses", "2 factory"}, false));
    communists.addDeputy(new Deputy(35, 156.8, new String[]{"Lexus", "4 rooms, 4 houses", "1 factory"}, false));
    communists.addDeputy(new Deputy(87, 198.9, new String[]{"Ferrari", "4 rooms, 2 houses", "4 factory"}, true));
    communists.addDeputy(new Deputy(65, 156.5, new String[]{"BMW", "4 rooms, 1 houses", "2 factory"}, true));
    communists.addDeputy(new Deputy(87, 176.7, new String[]{"Mazda", "4 rooms,6 houses", "0 factory"}, true));

    Fraction opposition = new Fraction("Opposition");
    opposition.addDeputy(new Deputy(76, 154.5, new String[]{"Opel", "2 rooms, 1 houses", "2 factory"}, false));
    opposition.addDeputy(new Deputy(53, 187.6, new String[]{"Mazda", "3 rooms, 3 houses", "3 factory"}, true));
    opposition.addDeputy(new Deputy(98, 147.7, new String[]{"Ford", "4 rooms, 6 houses", "1 factory"}, false));
    opposition.addDeputy(new Deputy(65, 173.8, new String[]{"Toyota", "4 rooms, 2 houses", "0 factory"}, true));
    opposition.addDeputy(new Deputy(87, 187.4, new String[]{"BMW", "4 rooms, 4 houses", "1 factory"}, false));
    opposition.addDeputy(new Deputy(64, 176.3, new String[]{"Lexus", "4 rooms, 0 houses", "6 factory"}, true));

    Fraction freedom = new Fraction("Freedom");
    freedom.addDeputy(new Deputy(54, 154.7, new String[]{"Lada", "2 rooms, 0 houses", "0 factory"}, false));
    freedom.addDeputy(new Deputy(63, 135.6, new String[]{"Audi", "3 rooms, 4 houses", "2 factory"}, true));
    freedom.addDeputy(new Deputy(74, 186.5, new String[]{"Lexus", "2 rooms, 3 houses", "5 factory"}, false));
    freedom.addDeputy(new Deputy(36, 174.6, new String[]{"Ford", "6 rooms, 6 houses", "1 factory"}, true));
    freedom.addDeputy(new Deputy(63, 176.4, new String[]{"BMW", "1 rooms, 1 houses", "3 factory"}, true));
    freedom.addDeputy(new Deputy(76, 187.3, new String[]{"Bugatti", "2 rooms, 2 houses", "1 factory"}, false));

    verkhovnaRada.addFraction(communists);
    verkhovnaRada.addFraction(opposition);
    verkhovnaRada.addFraction(freedom);

    Supplier<Fraction> createFraction = () -> {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input name of the fraction:");
      String name = scanner.nextLine();
      return new Fraction(name);
    };

    Supplier<Integer> getIndex = () -> {
      Scanner scanner = new Scanner(System.in);
      verkhovnaRada.printFractions();
      System.out.println("\nInput number of fraction [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
      return scanner.nextInt();
    };

    Supplier<Deputy> createDeputy = () -> {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input age:");
      int age = scanner.nextInt();
      System.out.println("Input height:");
      double height = scanner.nextDouble();
      scanner.nextLine();
      System.out.println("Input gentlemen's set:");
      String str = scanner.nextLine();
      String[] set = {str};
      System.out.println("Is bribe? (0 - no or 1 - yes):");
      int isBribe = scanner.nextInt();
      boolean briber = isBribe != 0;
      return new Deputy(age, height, set, briber);
    };

    Deletable<Integer> deputyIndex = (i) -> {
      Scanner scanner = new Scanner(System.in);
      verkhovnaRada.getFractions().get(i).printAllDeputy();
      System.out.println("Input index of deputy to delete:(0-" + (verkhovnaRada.getFractions().get(i).getList().size() - 1) + "]");
      return scanner.nextInt();
    };

    Scanner scanner = new Scanner(System.in);
    boolean isStop = false;
    int choice;
    printInfo();
    while (!isStop) {
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          addFraction(createFraction);
          break;
        case 2:
          deleteFraction(getIndex);
          break;
        case 3:
          printAllFractions();
          break;
        case 4:
          clearFraction(getIndex);
          break;
        case 5:
          printFraction(getIndex);
          break;
        case 6:
          addDeputyToTheFraction(getIndex, createDeputy);
          break;
        case 7:
          deleteDeputy(deputyIndex, getIndex);
          break;
        case 8:
          printBribers(getIndex);
          break;
        case 9:
          printSuperBriber(getIndex);
          break;
        case 10:
          giveBribe(deputyIndex, getIndex);
          break;
        case 11:
          printInfo();
          break;
        case 12:
          isStop = true;
          break;
        default:
          System.out.println("Input invalid!!!");
          break;
      }
    }

  }

  private static void printInfo() {
    System.out.println("1 - add fraction\n" +
      "2 - delete fraction\n" +
      "3 - show all fractions\n" +
      "4 - clear fraction\n" +
      "5 - print fraction\n" +
      "6 - add deputy to rhe fraction\n" +
      "7 - delete deputy from fraction\n" +
      "8 - print bribers\n" +
      "9 - show super briber\n" +
      "10 - give bribe\n" +
      "11 - print options\n" +
      "12 - stop work.");
  }

  private static void addFraction(Supplier<Fraction> fuction) {
    verkhovnaRada.addFraction(fuction.get());
    System.out.println("Fraction successfully added!");
  }

  private static void deleteFraction(Supplier<Integer> func) {
    verkhovnaRada.deleteFraction(func.get());
    System.out.println("Fraction have deleted!");
  }

  private static void printAllFractions() {
    verkhovnaRada.printFractions();
  }

  private static void clearFraction(Supplier<Integer> func) {
    verkhovnaRada.getFractions().get(func.get()).deleteAlldeputys();
    System.out.println("Deputes have deleted from the fraction!!");
  }

  private static void printFraction(Supplier<Integer> func) {
    verkhovnaRada.printFraction(func.get());
  }

  private static void addDeputyToTheFraction(Supplier<Integer> func, Supplier<Deputy> deputyFunc) {
    int index = func.get();
    verkhovnaRada.getFractions().get(index).addDeputy(deputyFunc.get());
    System.out.println("Deputy have been added!!!");
  }

  private static void deleteDeputy(Deletable<Integer> funcDele, Supplier<Integer> func) {
    int index = func.get();
    verkhovnaRada.getFractions().get(index).deleteDeputy(funcDele.get(index));
    System.out.println("Depute have been deleted!!!");
  }

  private static void printBribers(Supplier<Integer> func) {
    verkhovnaRada.getFractions().get(func.get()).printBribers();
  }

  private static void printSuperBriber(Supplier<Integer> func) {
    verkhovnaRada.getFractions().get(func.get()).printSuperBriber();
  }

  private static void giveBribe(Deletable<Integer> funcDele, Supplier<Integer> func) {
    Scanner scanner = new Scanner(System.in);
    int index = func.get();
    System.out.println("Input bribe $:");
    int bribe = scanner.nextInt();
    verkhovnaRada.getFractions().get(index).getList().get(funcDele.get(index)).giveBribe(bribe);
    System.out.println("Depute have been successfully get bribe!!!");
  }

}
