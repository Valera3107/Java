package module_20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  private static int current = 1;
  private static int previous = 0;
  private static int[] arr;

  public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of fibonacci numbers:");

    int num = scanner.nextInt();
    arr = new int[num];

    Thread th1 = new Thread(new ClassFibonacci(num));
    Thread th2 = new Thread(new ThreadFibonacciReverse(num));

    //============== 1

//    th1.start();
//    th1.join();
//
//    th2.start();


    //============== 2
    runWithExecutorService(th1, th2);
  }

  private static void runWithExecutorService(Thread ... threads){
    ExecutorService executorService = Executors.newFixedThreadPool(1);

    for (int i = 0; i < 2; i++) {
      executorService.execute(threads[i]);
    }

    executorService.shutdown();
  }

  private static class ThreadFibonacciReverse implements Runnable {
    private int count;
    public ThreadFibonacciReverse(int count) {
      this.count = count;
    }
    @Override
    public void run() {
      System.out.print("Runnable: ");
      for (int i = count - 1; i >= 0; i--) {
        System.out.print(calcFibonacciReversed(i) + " ");
      }
    }
  }

  private static class ClassFibonacci extends Thread {
    private int count;
    public ClassFibonacci(int count) {
      this.count = count;
    }
    @Override
    public void run() {
      System.out.print("Thread: ");
      for (int i = 0; i < count; i++) {
        arr[i] = calcFibonacci();
      }
      System.out.println("\n\n");
    }
  }

  private static int calcFibonacci() {
    int next = current + previous;
    previous = current;
    current = next;
    System.out.print(next + " ");
    return next;
  }

  private static int calcFibonacciReversed(int i) {
    return arr[i];
  }
}
