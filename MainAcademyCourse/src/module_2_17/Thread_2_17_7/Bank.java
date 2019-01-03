package module_2_17.Thread_2_17_7;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
  private int balance;
  private int accountNum;

  public Bank(int balance, int accountNum) {
    this.balance = balance;
    this.accountNum = accountNum;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(int accountNum) {
    this.accountNum = accountNum;
  }

  public synchronized int transfer(Bank acc2) {
    int balance = (int) (Math.random() * this.getBalance());
    acc2.setBalance(acc2.getBalance() + balance);
    this.setBalance(this.getBalance() - balance);
    System.out.println("from " + this.getAccountNum() + " to " + acc2.getAccountNum() + " : " + balance);
    return balance;
  }
}
