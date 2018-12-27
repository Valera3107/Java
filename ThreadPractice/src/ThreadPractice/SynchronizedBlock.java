package ThreadPractice;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlock {
  private int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private int[] b = {0, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
  private List<Integer> integers1 = new ArrayList<>();
  private List<Integer> integers2 = new ArrayList<>();

  private final Object block1 = new Object();
  private final Object block2 = new Object();

  public static void main(String[] args) {
    SynchronizedBlock synchronizedBlock = new SynchronizedBlock();
    synchronizedBlock.cope();
  }

  private void cope() {
    long start = System.currentTimeMillis();

    Thread th1 = new Thread(new RunnerA());
    Thread th2 = new Thread(new RunnerB());
    th1.start();
    th2.start();

    try {
      th1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      th2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    long finish = System.currentTimeMillis();
    System.out.println("Time:" + (finish - start));

  }

  private void copeArrayA() {
    synchronized (block1) {
      for (int i = 0; i < a.length; i++) {
        integers1.add(a[i]);
        System.out.println(integers1);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private void copeArrayB() {
    synchronized (block2) {
      for (int i = 0; i < b.length; i++) {
        integers2.add(b[i]);
        System.out.println(integers2);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private class RunnerA implements Runnable {
    @Override
    public void run() {
      copeArrayA();
    }
  }

  private class RunnerB implements Runnable {
    @Override
    public void run() {
      copeArrayB();
    }
  }
}
