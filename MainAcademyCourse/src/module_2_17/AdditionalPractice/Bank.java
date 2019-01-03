package module_2_17.AdditionalPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
  private AtomicInteger integer = new AtomicInteger(1_000_000);

  public void takeMoney() {
    int money = ((int) (Math.random()*50_000));
    System.out.println("Taken money: " + money);
    int newBalance = getInteger().intValue() - money;
    integer.set(newBalance);
  }

  public AtomicInteger getInteger() {
    return integer;
  }

  public void setInteger(AtomicInteger integer) {
    this.integer = integer;
  }
}
