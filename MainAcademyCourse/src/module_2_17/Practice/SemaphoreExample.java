package module_2_17.Practice;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(2);
    Cart cart = new Cart();
    new AddWorker(cart, semaphore, "Tomas").start();
    new ReduceWorker(cart, semaphore, "Peter");
  }
}
