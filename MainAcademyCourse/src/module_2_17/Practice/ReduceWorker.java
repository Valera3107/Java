package module_2_17.Practice;

import java.util.concurrent.Semaphore;

public class ReduceWorker extends Thread {
  private Cart cart;
  private Semaphore semaphore;
  private String workerName;

  ReduceWorker(Cart cart, Semaphore semaphore, String workerName) {
    this.cart = cart;
    this.semaphore = semaphore;
    this.workerName = workerName;
  }
  @Override
  public void run() {
    System.out.println(workerName + " started working...");
    try {
      System.out.println(workerName + " waiting for cart...");
      semaphore.acquire(2);
      System.out.println(workerName + " get access to cart...");
      int weight = cart.getWeight();
      for (int i = 0; i < weight; i++) {
        cart.reduceWeight();
        System.out.println(workerName + " changed weight to : " + cart.getWeight());
      }
      Thread.sleep(1000);
      semaphore.release(2);
      System.out.println(workerName + " finished work work cart");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
