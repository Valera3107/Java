package module_2_17.AdditionalPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  private static AtomicInteger takeMoney = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException {
    //=================================== 1
//    MyThread thread = new MyThread();
//    thread.start();
//    thread.join();
//
    //=================================== 2

//    Thread thread1 = new Thread(new MyInterThread());
//    thread1.start();
//    thread1.join();
//
    //=================================== 3

//    Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
//    thread2.start();
//    thread2.join();

    //=================================== 4

//    Thread thread3 = new Thread(() -> {
//      for (int i = 1; i <= 1000; i++) {
//        System.out.println(i);
//      }
//    });
//    thread3.start();

    //=================================== 5

//    Thread thread4 = new Thread(() -> {
//      for (int i = 1; i < 100; i++) {
//        System.out.println(i);
//        try {
//          Thread.sleep(100);
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
//      }
//    });
//    thread4.setDaemon(true);
//    thread4.start();
//    Thread.sleep(2000);

    //=================================== 6, 7

    ExecutorService service = Executors.newFixedThreadPool(10);
//    for (int i = 0; i < 10; i++) {
//      service.submit(new Thread(new ImpThread()));
//    }
//
//    service.shutdown();

    //================================== 8
//    for (int i = 0; i < 10; i++) {
//      service.submit(new Thread(() -> { System.out.println(Thread.currentThread().getName() + " " + ((int) (Math.random()*100)));}));
//    }
//    service.shutdown();

    //================================== 9
//    Thread thread1 = new MyThread();
//    thread1.setDaemon(true);
//    thread1.start();
//    Thread thread2 = new MyThread();
//    thread2.setDaemon(true);
//    thread2.start();
//    Thread thread3 = new MyThread();
//    thread3.setDaemon(true);
//    thread3.start();
//    Thread thread4 = new MyThread();
//    thread4.setDaemon(true);
//    thread4.start();
//    Thread thread5 = new MyThread();
//    thread5.setDaemon(true);
//    thread5.start();

    //================================ 10
//    ThreadForCallThread thread2 = new ThreadForCallThread(new Thread());
//    ThreadForCallThread thread1 = new ThreadForCallThread(thread2);
//    ThreadForCallThread thread = new ThreadForCallThread(thread1);
//    thread.start();

    //================================ 12
//    for (int i = 0; i < 20; i++) {
//      service.submit(new MyThreadWork());
//    }
//
//
//    service.shutdown();

    //================================= 14

//    MyBank bank = new MyBank();
//
//    for (int i = 0; i < 10; i++) {
//      service.submit(new MyThread(bank));
//    }
//
//    Thread.sleep(1000);
//    System.out.println("Money on the account: " + bank.getAccount());
//    int check = bank.getAccount() + 500_000;
//
//    System.out.println(check == 1_000_000);
//    service.shutdown();

    //================================ 17
//
//    Bank bank = new Bank();
//    BankThread bankThread = new BankThread(bank);
//    bankThread.start();
//    Thread.sleep(1000);
//    System.out.println("Balance on the account: "+bankThread.bank.getInteger());

    //=============================== 18

//    Bank bank = new Bank();
//    new BankTaker(bank).start();
//    new BankPrinter(bank).start();

    //================================ 22

      BankAccounts bank = new BankAccounts();
//    new BankTaker(bank).start();
//    new BankPrinter(bank).start();

    //================================ 25

    ExecutorService executorService = Executors.newFixedThreadPool(5);

    for (int i = 0; i < 10; i++) {
      executorService.submit(new BankTaker(bank));
      executorService.submit(new BankPrinter(bank));
    }

    executorService.shutdown();

  }

  private static class BankTaker extends Thread {
    private final BankAccounts bank;

    BankTaker(BankAccounts bank) {
      this.bank = bank;
    }

    @Override
    public void run() {
      try {
        taker();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void taker() throws InterruptedException {
      for (int i = 0; i < 10; i++) {
        synchronized (bank) {
          bank.takeMoney();
          bank.notify();
          takeMoney.incrementAndGet();
          if (takeMoney.intValue() == 9)
            bank.wait();
        }
        Thread.sleep(100);
      }
    }
  }

  private static class BankPrinter extends Thread {
    private final BankAccounts bank;

    BankPrinter(BankAccounts bank) {
      this.bank = bank;
    }

    @Override
    public void run() {
      try {
        print();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void print() throws InterruptedException {
      while (true) {
        synchronized (bank) {

          if (takeMoney.intValue() == 9) return;
          else {
            System.out.println("Account 1: "+bank.getAccount1());
            System.out.println("Account 2: "+bank.getAccount2());
            System.out.println("Account 3: "+bank.getAccount3());
            System.out.println("Account 4: "+bank.getAccount4());
            bank.notify();
            bank.wait();
          }
        }
        Thread.sleep(100);
      }
    }
  }

  private static class BankThread extends Thread {
    private Bank bank;

    BankThread(Bank bank) {
      this.bank = bank;
    }

    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        bank.takeMoney();
      }
    }
  }

  private static class MyThreadWork extends Thread {
    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " is starting!");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(Thread.currentThread().getName() + " is finished work!");
    }
  }

  private static class ThreadForCallThread extends Thread {
    private Thread thread;

    ThreadForCallThread(Thread thread) {
      this.thread = thread;
    }

    @Override
    public void run() {
      this.thread.start();
      System.out.println(Thread.currentThread().getName() + " is running " + this.thread.getName());
    }
  }

  private static class MyThread extends Thread {
    private MyBank bank;

    MyThread(MyBank bank) {
      this.bank = bank;
    }

    @Override
    public void run() {
      bank.takeMoney();

    }
  }

  private static class ImpThread implements Runnable {
    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " " + ((int) (Math.random() * 100)));
    }
  }
}
