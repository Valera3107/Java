package Bank;

public class BankSystemImpl implements BankSystem {

  @Override
  public void withdrawOfUser(User user, int amount) {
    System.out.println(" User " + user.getName() + " have balance " + user.getBalance());
        if (amount > user.getBank().getLimitOfWithdrawal()) {
          System.out.println("Sorry but your amount bigger then"+ user.getBank().getLimitOfWithdrawal() +"! Try again!");
          return;
        }
        double newBalance = user.getBalance() - (amount + user.getBank().getCommission(amount));
        user.setBalance(newBalance);
    System.out.println(" User " + user.getName() + " have balance " + user.getBalance());
  }

  @Override
  public void fundUser(User user, int amount) {
    System.out.println(" User " + user.getName() + " have balance " + user.getBalance());
    if (amount > user.getBank().getLimitOfFunding()) {
      System.out.println("Sorry but your amount bigger then"+ user.getBank().getLimitOfWithdrawal() +"! Try again!");
      return;
    }
    double newBalance = user.getBalance() + (amount - user.getBank().getCommission(amount));
    user.setBalance(newBalance);
    System.out.println(" User " + user.getName() + " have balance " + user.getBalance());
  }

  @Override
  public void transferMoney(User fromUser, User toUser, int amount) {
    System.out.println("User giver " + fromUser.getBalance() + ", user getter " +toUser.getBalance());
    if(amount > toUser.getBank().getLimitOfWithdrawal() && amount > fromUser.getBank().getLimitOfFunding()){
      System.out.println("It's to much for transfer!");
      return;
    }
    double newBalanceFromUser = fromUser.getBalance() - (amount + fromUser.getBank().getCommission(amount));
    fromUser.setBalance(newBalanceFromUser);

    double newBalanceToUser = toUser.getBalance() + (amount - toUser.getBank().getCommission(amount));
    toUser.setBalance(newBalanceToUser);
    System.out.println(" User giver" + fromUser.getBalance() + ", user getter " +toUser.getBalance());
  }

  @Override
  public void paySalary(User user) {
    System.out.println(" User " + user.getName() + " have balance " + user.getBalance());
      double newBalance = user.getBalance() + user.getSalary() - user.getBank().getCommission(user.getSalary());
      user.setBalance(newBalance);
    System.out.println(" User " + user.getName() + " have balance " + user.getBalance());
  }
}
