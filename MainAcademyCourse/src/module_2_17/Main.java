package module_2_17;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    MyTimeBomb bomb = new MyTimeBomb();
    //bomb.start();
    //bomb.join();

    Thread th = new Thread(new MyTimeBombDAO());
    //th.start();

    //=================
    int[] arr = new int[1000];
    SumCount sumCount1 = new SumCount(arr);
    sumCount1.start();
    sumCount1.join();
    SumCount sumCount2 = new SumCount(arr);
    sumCount2.start();

    Thread thread = new Thread(new SumCountDAO(arr));
    thread.start();
  }
}
