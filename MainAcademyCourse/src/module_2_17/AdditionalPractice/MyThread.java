package module_2_17.AdditionalPractice;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println(MyThread.currentThread().getName());
  }
}
