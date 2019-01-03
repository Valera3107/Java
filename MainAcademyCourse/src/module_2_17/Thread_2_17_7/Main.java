package module_2_17.Thread_2_17_7;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  private static AtomicInteger TotalTransfer = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newCachedThreadPool();
    for (int i = 0; i < 10; i++) {
      service.submit(new Thread(new BankTest()));
    }
    service.shutdown();
    Thread.sleep(1000);
    System.out.println("Total sum: " + TotalTransfer.get());
  }

  private static class BankTest implements Runnable {
    @Override
    public void run() {
      Random rand = new Random();
      Bank acc1 = new Bank(rand.nextInt(2000), rand.nextInt(4));
      Bank acc2 = new Bank(rand.nextInt(1500), rand.nextInt(4));
      TotalTransfer.addAndGet(acc1.transfer(acc2));
    }
  }
}
