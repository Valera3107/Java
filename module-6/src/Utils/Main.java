package Utils;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    User[] users = {
      new User(0001, "Petrov", "Stelmov", 1200, 1),
      new User(0010, "Ivan", "Karpuk", 1000, 1),
      new User(0011, "Oleg", "Liashko", 500, 1),
      new User(0100, "Vasilii", "Kilchenko", 1400, 1)
    };

    UserUtils.paySalaryToUsers(users);
    UserUtils.uniqueUsers(users);
    UserUtils.usersWithConditionalBalance(users, 100);
    UserUtils.deleteEmptyUsers(users);
    System.out.println(Arrays.toString(UserUtils.getUsersId(users)));

    for (User user: users
         ) {
      System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " balance: " + user.getBalance() + " salary: " + user.getSalary());
    }
  }
}
