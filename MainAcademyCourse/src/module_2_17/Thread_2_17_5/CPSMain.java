package module_2_17.Thread_2_17_5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CPSMain {
  public final static Integer SIZE = 100;

  public static void main(String[] args) throws InterruptedException {
    Number number = new Number();

    Thread threadCount = new Thread(new Count(number));
    Thread threadStore = new Thread(new Storage(number));

    threadStore.start();
    threadCount.join();

    new Thread(new Print()).start();
  }

  private static class Print implements Runnable {

    @Override
    public void run() {
      print();
    }

    private void print() {
      System.out.println(Arrays.toString(Storage.list.toArray()));
    }
  }

  private static class Storage implements Runnable {
    public static List<Integer> list = new ArrayList<>();
    private final Number number;

    Storage(Number number) {
      this.number = number;
    }

    @Override
    public void run() {
      try {
        store();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void store() throws InterruptedException {
      while (true) {
        Thread.sleep(100);
        synchronized (number) {
          list.add(number.getNumber());
          if (list.size() != SIZE - 1) {
            number.notify();
            number.wait();
            System.out.println(list.size());
          } else {
            return;
          }
        }
      }
    }
  }


  private static class Count implements Runnable {
    private final Number number;

    Count(Number number) {
      this.number = number;
    }

    @Override
    public void run() {
      try {
        countingNumber();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void countingNumber() throws InterruptedException {
      for (int i = 0; i < SIZE; i++) {
        Thread.sleep(100);
        synchronized (number) {
          number.setNumber(100 + (int) (Math.random() * 1000));
          number.notify();
          if (i != SIZE - 1)
            number.wait();
        }
      }
    }
  }
}
