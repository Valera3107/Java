package module_2_17.Thread_2_17_1__4;

import static java.lang.Thread.sleep;

public class MyTimeBombDAO implements Runnable {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Boom!!!");
  }
}
