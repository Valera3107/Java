package module_15;

import java.util.*;

public class Zoo {
  Map<Person, List<Animal>> zooMap = new HashMap<>();

  public Map<Person, List<Animal>> getZooMap() {
    return zooMap;
  }

  public void addPerson() {
    List<Animal> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input person date:");
    System.out.println("Name:");
    String name = scanner.nextLine();
    System.out.println("Age:");
    int age = scanner.nextInt();
    zooMap.put(new Person(name, age), list);
    System.out.println("Person successfully added!");
  }

  public void addAnimal() {
    Scanner sc = new Scanner(System.in);
    zooMap.forEach((k, v) -> System.out.println(k));
    System.out.println("Input name of person: (0-" + (zooMap.size() - 1));
    String name = sc.nextLine();
    Person person = null;
    for (Person p : zooMap.keySet()
      ) {
      if (p.getName().compareTo(name) == 0) {
        person = p;
      }
    }
    System.out.println("Input animal date:");
    System.out.println("Type:");
    String type = sc.nextLine();
    System.out.println("Name:");
    String animalName = sc.nextLine();
    zooMap.get(person).add(new Animal(type, animalName));
    System.out.println("Animal have been added!");
  }

  public void deleteAnimal() {
    Scanner sc = new Scanner(System.in);
    zooMap.forEach((k, v) -> System.out.println(k));
    System.out.println("Input name of person: (0-" + (zooMap.size() - 1));
    String name = sc.nextLine();
    Person person = null;
    for (Person p : zooMap.keySet()
      ) {
      if (p.getName().compareTo(name) == 0) {
        person = p;
      }
    }
    zooMap.get(person).forEach(System.out::println);
    System.out.println("Input name of the animal:");
    String animalName = sc.nextLine();
    zooMap.get(person).removeIf((e) -> e.getName().equals(animalName));
    System.out.println("Animal have been added!!!");
  }

  public void deletePerson() {
    Scanner sc = new Scanner(System.in);
    zooMap.forEach((k, v) -> System.out.println(k));
    System.out.println("Input name of person: (0-" + (zooMap.size() - 1));
    String name = sc.nextLine();
    Person person = null;
    for (Person p : zooMap.keySet()
      ) {
      if (p.getName().compareTo(name) == 0) {
        person = p;
      }
    }
    zooMap.remove(person);
    System.out.println("Person have been deleted!!!");
  }

  public void deleteFromEachOwners() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input animal date:");
    System.out.println("Type:");
    String type = sc.nextLine();
    System.out.println("Name:");
    String animalName = sc.nextLine();
    Animal animal = new Animal(type, animalName);
    zooMap.forEach((k, v) -> {
      if(zooMap.get(k).contains(animal)){
        zooMap.get(k).remove(animal);
      }
    });
    System.out.println("Animal have been added everywhere!");
  }

  public void printZooClub() {
    zooMap.forEach((k, v) -> {
      System.out.println(k + " -> " + v);
    });
  }

  public void closeZoo(){
    System.exit(0);
  }
}
