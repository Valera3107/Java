package module_13;

import java.util.*;

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

    Scanner scanner = new Scanner(System.in);
    boolean isStop = false;
    int choice;
    printInfo();
    while (!isStop) {
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          addFraction();
          break;
        case 2:
          deleteFraction();
          break;
        case 3:
          printAllFractions();
          break;
        case 4:
          clearFraction();
          break;
        case 5:
          printFraction();
          break;
        case 6:
          addDeputyToTheFraction();
          break;
        case 7:
          deleteDeputy();
          break;
        case 8:
          printBribers();
          break;
        case 9:
          printSuperBiber();
          break;
        case 10:
          giveBribe();
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

  public static void printInfo() {
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

  public static void addFraction() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input name of the fraction:");
    String name = scanner.nextLine();
    Fraction fraction = new Fraction(name);
    verkhovnaRada.addFraction(fraction);
    System.out.println("Fraction successfully added!");
  }

  public static void deleteFraction() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction to delete [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int index = scanner.nextInt();
    verkhovnaRada.deleteFraction(index);
    System.out.println("Fraction have deleted!");
  }

  public static void printAllFractions() {
    verkhovnaRada.printFractions();
  }

  public static void clearFraction() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction to delete [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int index = scanner.nextInt();
    verkhovnaRada.getFractions().get(index).deleteAlldeputys();
    System.out.println("Deputes have deleted from the fraction!!");
  }

  public static void printFraction() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction to print [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int index = scanner.nextInt();
    verkhovnaRada.printFraction(index);
  }

  public static void addDeputyToTheFraction() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int fractionIndex = scanner.nextInt();
    scanner.nextLine();
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
    Deputy deputy = new Deputy(age, height, set, briber);
    verkhovnaRada.getFractions().get(fractionIndex).addDeputy(deputy);
    System.out.println("Deputy have been added!!!");
  }

  public static void deleteDeputy() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int fractionIndex = scanner.nextInt();
    verkhovnaRada.getFractions().get(fractionIndex).printAllDeputy();
    System.out.println("Input index of deputy to delete:(0-" + (verkhovnaRada.getFractions().get(fractionIndex).getList().size() - 1) + "]");
    int deputeIndex = scanner.nextInt();
    verkhovnaRada.getFractions().get(fractionIndex).deleteDeputy(deputeIndex);
    System.out.println("Depute have been deleted!!!");
  }

  public static void printBribers() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int fractionIndex = scanner.nextInt();
    verkhovnaRada.getFractions().get(fractionIndex).printBribers();
  }

  public static void printSuperBiber() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int fractionIndex = scanner.nextInt();
    verkhovnaRada.getFractions().get(fractionIndex).printSuperBriber();
  }

  public static void giveBribe() {
    Scanner scanner = new Scanner(System.in);
    verkhovnaRada.printFractions();
    System.out.println("\nInput number of fraction [0-" + (verkhovnaRada.getFractions().size() - 1) + "]");
    int fractionIndex = scanner.nextInt();
    verkhovnaRada.getFractions().get(fractionIndex).printAllDeputy();
    System.out.println("Input index of deputy: (0-" + (verkhovnaRada.getFractions().get(fractionIndex).getList().size() - 1) + "]");
    int deputeIndex = scanner.nextInt();
    System.out.println("Input bribe $:");
    int bribe = scanner.nextInt();
    verkhovnaRada.getFractions().get(fractionIndex).getList().get(deputeIndex).giveBribe(bribe);
    System.out.println("Depute have been successfully get bribe!!!");
  }

}
