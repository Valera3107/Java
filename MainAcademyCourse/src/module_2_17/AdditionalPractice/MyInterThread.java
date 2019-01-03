package module_2_17.AdditionalPractice;

public class MyInterThread implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}
