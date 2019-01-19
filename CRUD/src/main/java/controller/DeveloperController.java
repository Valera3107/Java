package controller;

import dao.Implementations.DeveloperImpl;
import model.Developer;

import java.util.List;
import java.util.Scanner;

public class DeveloperController {
  private DeveloperImpl developer = new DeveloperImpl();
  Developer newDeveloper = new Developer("Antony", "Middle", 1375);
  Developer updateDeveloper = newDeveloper;

  public void start() {
    updateDeveloper.setSalary(1680);
    int choice;
    boolean isStop = false;
    Scanner sc = new Scanner(System.in);
    while (!isStop) {
      System.out.println("Choose command number:\n1 - create developer;\n2 - add skill;\n3 - read by developer id\n4 - Update by id and developer;\n5 - delete developer by id;\n6 - get all developers;\n7 - stop work");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          developer.create(newDeveloper);
          break;
        case 2:
          developer.addSkill(newDeveloper);
          break;
        case 3:
          developer.read(4);
          break;
        case 4:
          developer.update(updateDeveloper.getId(), updateDeveloper);
          break;
        case 5:
          developer.delete(newDeveloper.getId());
          break;
        case 6:
          List<Developer> allDevelopers = developer.getAllDevelopers();
          for (Developer d : allDevelopers
          ) {
            System.out.println(d);
          }
          break;
        case 7:
          isStop = true;
          break;
        default:
          System.out.println("Invalid input!");
          break;
      }
    }
  }
}
