package module_2_17.Practice;

import java.util.concurrent.Semaphore;

public class AddWorker extends Thread {
  private Cart cart;
  private Semaphore semaphore;
  private String workerName;

  AddWorker(Cart cart, Semaphore semaphore, String workerName) {
    this.cart = cart;
    this.semaphore = semaphore;
    this.workerName = workerName;
  }
  @Override
  public void run() {
    System.out.println(workerName + " started working...");

    try{
      System.out.println(workerName + " waiting for cart...");
      semaphore.acquire();
      System.out.println(workerName + " get access to cart!");
      for (int i = 0; i < 3; i++) {
        cart.addWeight();
        System.out.println(workerName + " changed weight to : " + cart.getWeight());
        Thread.sleep(1000);
        semaphore.release();
        System.out.println(workerName + " finished working with cart...");
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

