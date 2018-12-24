package Utils;

public class UserUtils {

  public static User[] uniqueUsers(User[] users){
    for (int i = 0; i < users.length; i++) {
      for (int j = 0; j < users.length; j++) {
        if(users[i].getId() != users[j].getId()) {
          if(users[i].getBalance() == users[j].getBalance() && users[i].getFirstName() == users[j].getFirstName()
            && users[i].getLastName() == users[j].getLastName() && users[i].getSalary() == users[j].getSalary()){
            System.out.println("User " + users[i].getFirstName() + " with id " + users[i].getId() + " is equal " + users[j].getFirstName()+ " with id " + users[j].getId());
          }
        }
      }
    }
    return users;
  }

  public static User[] usersWithConditionalBalance(User[] users, int balance){
    for (User elem: users
         ) {
      elem.setBalance(balance);
    }
    return users;
  }

  public static final User[] paySalaryToUsers(User[] users) {
    for (User elem: users
         ) {
      int newBalance = elem.getBalance() + elem.getSalary();
      elem.setBalance(newBalance);
    }
    return users;
  }

  public static final long[] getUsersId(User[] users){
    long[] arrOfId = new long[users.length];
    for (int i = 0; i < arrOfId.length; i++) {
      arrOfId[i] = users[i].getId();
    }
    return arrOfId;
  }

  public static User[] deleteEmptyUsers(User[] users) {
    for (int i = 0; i < users.length; i++) {
      if(users[i].getId() == 0 || users[i].getFirstName() == "" || users[i].getSalary() == 0 || users[i].getLastName() == "" || users[i].getBalance() == 0) {
        users[i] = null;
      }
    }
    return users;
  }

}

