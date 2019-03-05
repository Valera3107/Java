package module_15;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    int choice;
    Zoo zoo = new Zoo();

    Person person = new Person("Rick", 23);
    Person person1 = new Person("Jack", 34);
    Person person2 = new Person("Mack", 19);

    List<Animal> animals1 = new ArrayList<>();
    animals1.add(new Animal("cat", "Barsic"));
    animals1.add(new Animal("cat", "Rudolf"));
    animals1.add(new Animal("bird", "Saimon"));
    animals1.add(new Animal("dog", "Rex"));
    animals1.add(new Animal("cat", "Max"));
    animals1.add(new Animal("bird", "Roma"));

    List<Animal> animals2 = new ArrayList<>();
    animals2.add(new Animal("cat", "Barsic"));
    animals2.add(new Animal("bird", "Rudolf"));
    animals2.add(new Animal("cat", "Tom"));
    animals2.add(new Animal("dog", "Rex"));
    animals2.add(new Animal("cat", "Spanser"));
    animals2.add(new Animal("dog", "Sara"));

    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("bird", "Piter"));
    animals.add(new Animal("cat", "Rudolf"));
    animals.add(new Animal("bird", "Saimon"));
    animals.add(new Animal("dog", "Rex"));
    animals.add(new Animal("cat", "Max"));
    animals.add(new Animal("cat", "Tim"));

    zoo.getZooMap().put(person, animals);
    zoo.getZooMap().put(person1, animals2);
    zoo.getZooMap().put(person2, animals1);

    printOptions();
    Scanner scanner = new Scanner(System.in);
    while (true){
      choice = scanner.nextInt();
      switch (choice){
        case 1: zoo.addAnimal();break;
        case 2: zoo.addPerson();break;
        case 3: zoo.deleteAnimal();break;
        case 4: zoo.deletePerson();break;
        case 5: zoo.deleteFromEachOwners();break;
        case 6: zoo.printZooClub();break;
        case 7: printOptions();break;
        case 8: zoo.closeZoo();break;
        default:
          System.out.println("Invalid input");break;
      }
    }
  }

  private static void printOptions(){
    System.out.println("1 - add animal\n" +
      "2 - add person\n" +
      "3 - delete animal\n" +
      "4 - delete person\n" +
      "5 - delete animal everywhere\n" +
      "6 - print zoo club\n" +
      "7 - print options\n" +
      "8 - stop work");
  }
}
