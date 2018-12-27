package ThreadPractice;

import static ThreadPractice.ColorScheme.GREEN;
import static ThreadPractice.ColorScheme.RED;

public class VolatileMain {
  private static volatile int counter;

  public static void main(String[] args) {

    SimpleWriter th1 = new SimpleWriter();
    th1.start();

    SimpleReader th2 = new SimpleReader();
    th2.start();
  }

  private static class SimpleWriter extends Thread {
    @Override
    public void run() {
      int localCounter = counter;
      for (int i = 0; i < 10; i++) {
        System.out.println(GREEN + "Writer increment counter " + (localCounter + 1));
        counter = ++localCounter;
        try {
          sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private static class SimpleReader extends Thread {
    @Override
    public void run() {
      int localCounter = counter;
      while (localCounter < 10) {
        if (localCounter != counter) {
          System.out.println(RED + "Reader reads counter: " + counter);
          localCounter = counter;
        }
      }
    }
  }

}
