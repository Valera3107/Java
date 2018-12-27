package ThreadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static ThreadPractice.ColorScheme.RED;

public class Launcher {
  private static int SIZE_POOL = 2;

  public static void main(String[] args) {
    boolean isDaemon = true;
    System.out.println(RED + "Starting main thread");
    GCDRunnable gcd = new GCDRunnable();
    //runInOneThread(gcd, true);
//    try {
//      Thread.sleep(300);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    runWIthExecutorService(gcd, true);
    System.out.println(RED+"Leaving main thread");

  }

  private static void runInOneThread(GCDRunnable gcd, boolean isDaemon) {
    Thread th = new Thread(gcd);
    if (isDaemon) {
      th.setDaemon(true);
    }
    th.start();
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    th.interrupt();
  }

  private static void runWIthExecutorService(GCDRunnable gcd, boolean isDaemon) {
    ThreadFactory factory = new ThreadFactory() {
      @Override
      public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        if(isDaemon) {
          thread.setDaemon(true);
        }
        return thread;
      }
    };

    ExecutorService executorService = Executors.newFixedThreadPool(SIZE_POOL, factory);
    for (int i = 0; i < 5; i++) {
      executorService.execute(gcd);
    }
    executorService.shutdown();

    try {
      executorService.awaitTermination(30, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
