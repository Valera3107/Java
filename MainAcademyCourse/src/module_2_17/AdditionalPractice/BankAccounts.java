package module_2_17.AdditionalPractice;

public class BankAccounts {
  private int account1 = 50_000;
  private int account2 = 50_000;
  private int account3 = 50_000;
  private int account4 = 50_000;

  public void takeMoney() {
    int from = 1 + (int) (Math.random() * 5);
    int to = 1 + (int) (Math.random() * 5);
    int money = (int) (Math.random() * 10_000);

    if (money < 100) throw new RuntimeException("It's to small money for transit!");

    if (from == 1 && to == 2) {
      setAccount2(getAccount2() + money);
      setAccount1(getAccount1() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }
    if (from == 2 && to == 3) {
      setAccount3(getAccount3() + money);
      setAccount2(getAccount2() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }
    if (from == 3 && to == 4) {
      setAccount3(getAccount3() + money);
      setAccount4(getAccount4() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }
    if (from == 4 && to == 1) {
      setAccount4(getAccount4() + money);
      setAccount1(getAccount1() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }

    if (from == 2 && to == 4) {
      setAccount2(getAccount2() + money);
      setAccount4(getAccount4() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }
    if (from == 2 && to == 1) {
      setAccount2(getAccount2() + money);
      setAccount1(getAccount1() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }
    if (from == 3 && to == 2) {
      setAccount3(getAccount3() + money);
      setAccount2(getAccount2() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }
    if (from == 3 && to == 1) {
      setAccount3(getAccount3() + money);
      setAccount1(getAccount1() - money);
      System.out.println("From " + from + " to " + to + " : " + money);
    }

  }

  public int getAccount1() {
    return account1;
  }

  public void setAccount1(int account1) {
    this.account1 = account1;
  }

  public int getAccount2() {
    return account2;
  }

  public void setAccount2(int account2) {
    this.account2 = account2;
  }

  public int getAccount3() {
    return account3;
  }

  public void setAccount3(int account3) {
    this.account3 = account3;
  }

  public int getAccount4() {
    return account4;
  }

  public void setAccount4(int account4) {
    this.account4 = account4;
  }
}
