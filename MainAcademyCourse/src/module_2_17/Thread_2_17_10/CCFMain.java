package module_2_17.Thread_2_17_10;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CCFMain {
  private static final Map<Integer, String> map = new ConcurrentHashMap<>();
  private static AtomicInteger start = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(5);

    for (int i = 0; i < 10; i++) {
      service.submit(new Thread(new Writer()));
    }
    service.shutdown();
    Thread thread = new Thread(new Reader());
    thread.sleep(1000);
    thread.start();

  }

  private static class Writer implements Runnable {
    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        map.put(start.intValue(), "Number " + (start.intValue() + 1));
        start.incrementAndGet();
      }
    }
  }

  private static class Reader implements Runnable {
    @Override
    public void run() {
      System.out.println(map.size());
      for (int i = 0; i < map.size()-1; i++) {
        System.out.println(map.get(i));
      }
    }
  }
}
