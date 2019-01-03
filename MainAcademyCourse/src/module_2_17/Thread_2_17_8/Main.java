package module_2_17.Thread_2_17_8;

public class Main {
  public static MyObject object1 = new MyObject();
  public static MyObject object2 = new MyObject();
  public static MyObject object3 = new MyObject();

  public static void main(String[] args) {
    new Thread1().start();
    new Thread2().start();
    new Thread3().start();
  }

  private static class Thread1 extends Thread {
    @Override
    public void run() {
      synchronized (object1) {
        System.out.println("Thread 1: Holding lock 1...");
      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Thread 1 : Waiting for lock 2...");
      synchronized (object2) {
        System.out.println("Thread 1 : Waiting form lock 1 & 2...");
      }
    }
  }

  private static class Thread2 extends Thread {
    @Override
    public void run() {
      synchronized (object2) {
        System.out.println("Thread 2: Holding lock 2...");
      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Thread 2 : Waiting for lock 3...");
      synchronized (object2) {
        System.out.println("Thread 2 : Waiting form lock 2 & 3...");
      }
    }
  }

  private static class Thread3 extends Thread {
    @Override
    public void run() {
      synchronized (object3) {
        System.out.println("Thread 3: Holding lock 3...");
      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Thread 3 : Waiting for lock 1...");
      synchronized (object3) {
        System.out.println("Thread 3 : Waiting form lock 3 & 1...");
      }
    }
  }
}
