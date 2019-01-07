package DAO.Implementations;

import Controller.UserMenu;
import DAO.DAOs.UserDAO;
import Model.User;
import Service.DataBase;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static Service.Colors.GREEN;


public class UserWork implements UserDAO {
  DataBase db = new DataBase();
  Scanner scanner = new Scanner(System.in);

  @Override
  public boolean addNewUser() {
    User user;
    int age;
    String name;
    System.out.println(GREEN + "Input name:");
    name = scanner.nextLine();
    age = scanner.nextInt();
    user = new User(name, age);
    List<User> allUsers = getAllUsers();
    if (allUsers.add(user)) {
      db.writeUser(allUsers, UserMenu.USER_PATH);
      System.out.println(GREEN + "User has successfully added.");
      return true;
    }
    return false;
  }

  @Override
  public boolean deleteUserById() {
    List<User> users = getAllUsers();
    if (users.remove(getUserById())) {
      db.writeUser(users, UserMenu.USER_PATH);
      System.out.println(GREEN + "User was successfully deleted from DB.");
      return true;
    }
    return false;
  }

  @Override
  public List getAllUsers() {
    return db.getUsers(UserMenu.USER_PATH);
  }

  @Override
  public User getUserById() {
    System.out.println(GREEN + "Input id:");
    int id = scanner.nextInt();
    return db.readUsers(UserMenu.USER_PATH).stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(0);
  }
}
