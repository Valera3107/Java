package module_2_17.AdditionalPractice;

public class MyBank {
  private static int account = 1_000_000;

  public void takeMoney() {
    int money = 50_000;
    System.out.println("Money taken : " + money);
    setAccount(account - money);
  }

  public int getAccount() {
    return account;
  }

  public void setAccount(int newAccount) {
    account = newAccount;
  }
}
