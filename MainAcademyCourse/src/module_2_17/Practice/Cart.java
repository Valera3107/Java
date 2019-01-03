package module_2_17.Practice;

import java.util.concurrent.atomic.AtomicInteger;

public class Cart {
  private AtomicInteger weight = new AtomicInteger(0);

  public void addWeight() {
    weight.incrementAndGet();
  }

  public void reduceWeight() {
    weight.decrementAndGet();
  }

  public int getWeight() {
    return weight.intValue();
  }
}
