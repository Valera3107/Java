package module_2_17.Thread_2_17_10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CFMain {
  private static final Map<Integer, String> map = new HashMap<>();
  private static AtomicInteger start = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException {
     new Thread(new WriterThread()).start();
     new Thread(new ReaderThread()).start();

     Thread.sleep(3000);

    for (int i = 0; i < 10; i++) {
      System.out.println(map.get(i));
    }
  }

  private static class ReaderThread implements Runnable {
    @Override
    public void run() {
      while (true) {
        synchronized (map) {
          System.out.println(map.size());
          map.notify();
          try {
            map.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        if(map.size() == 10) {
          return;
        }
      }
    }
  }

  private static class WriterThread implements Runnable {
    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (map) {
          map.put(start.intValue(), "Number " + start);
          map.notify();
          try {
            map.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        if(map.size() == 10) {
          return;
        }
        start.incrementAndGet();
      }
    }
  }
}
