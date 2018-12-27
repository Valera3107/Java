package ThreadPractice;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static ThreadPractice.ColorScheme.GREEN;
import static ThreadPractice.ColorScheme.RED;

public class WaitingQueue {
  public static void main(String[] args) throws InterruptedException {
    int operators = 5;
    int customers = 21;

    SemaphoreServiceDesk desk = new SemaphoreServiceDesk(operators, customers);
    ExecutorService service = Executors.newCachedThreadPool();

    IntStream.range(0, customers)
      .forEach(client -> service.submit(() -> {
        desk.connect();
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(GREEN + "Number of connected customers " + desk.getCustomersConnected());
        System.out.println(RED + "Number of connected customers in a queue " + desk.getCustomersWaiting());
      }));
    service.shutdown();
    service.awaitTermination(100, TimeUnit.SECONDS);
  }

  private static class SemaphoreServiceDesk {
    private AtomicInteger connectedCustomers = new AtomicInteger();
    private AtomicInteger customersQueue;

    private Semaphore semaphore;

    SemaphoreServiceDesk(int operatorsNum, int customersNumber) {
      semaphore = new Semaphore(operatorsNum);
      customersQueue = new AtomicInteger(customersNumber);
    }

    public void connect() {
      Random random = new Random();
      try {
        semaphore.acquire();
        connectedCustomers.incrementAndGet();
        customersQueue.decrementAndGet();
        Thread.sleep(random.nextInt(3000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        disconnect();
      }
    }

    private void disconnect() {
      semaphore.release();
      connectedCustomers.decrementAndGet();
    }

    private int getCustomersConnected() {
      return connectedCustomers.get();
    }

    private int getCustomersWaiting() {
      return customersQueue.get();
    }

  }
}
