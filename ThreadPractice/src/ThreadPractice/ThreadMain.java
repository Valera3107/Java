package ThreadPractice;

import static ThreadPractice.ColorScheme.GREEN;
import static ThreadPractice.ColorScheme.RED;
import static ThreadPractice.ColorScheme.YELLOW;

public class ThreadMain {
  public static void main(String[] args) {
    SimpleThread th1 = new SimpleThread();
    th1.start();

    System.out.println("HELLO from main!");

    SimpleThread th2 = new SimpleThread();
    th2.start();

    th2.interrupt();

    Thread th3 = new Thread(new SimpleRunner());
    th3.start();

    Thread th4 = new Thread(()->{
      System.out.println(RED+"I am lambda thread!");
    });
    th4.start();
  }
}

class SimpleThread extends Thread {

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(YELLOW + "WARNING - " + currentThread().getName() + "was interrupted!");
        return;
      }
      System.out.println(GREEN + "INFO - " + currentThread().getName() + " - " + i);
    }
  }
}

class SimpleRunner implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(YELLOW + "WARNING - " + Thread.currentThread().getName() + "was interrupted!");
      }
      System.out.println(GREEN + "INFO - Runnable " + Thread.currentThread().getName() + " - " + i);
    }
  }
}
