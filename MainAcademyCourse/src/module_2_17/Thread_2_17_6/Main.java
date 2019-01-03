package module_2_17.Thread_2_17_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static DiningHall d = new DiningHall();
  public static void main(String[] args) {

    ExecutorService service = Executors.newFixedThreadPool(20);
    for (int i = 0; i < 10; i++) {
      d.makePizza();
    }
    for (int i = 1; i <= 20; i++) {
      service.submit(new Thread(new ServePizza()));
    }

    service.shutdown();
  }
  private static class ServePizza implements Runnable{
    @Override
    public void run() {
      d.servePizza();
    }
  }
}
