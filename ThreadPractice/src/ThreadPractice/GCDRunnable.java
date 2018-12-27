package ThreadPractice;

import javax.sound.midi.Track;
import java.util.Random;

import static ThreadPractice.ColorScheme.*;

public class GCDRunnable extends Random implements Runnable {

  public GCDRunnable() {

  }

  @Override
  public void run() {
    String threadDescription = Thread.currentThread().getName();

    System.out.println(BLUE + "starting " + threadDescription);

    for (int i = 0; i < 10_000_000; i++) {
      int a = nextInt();
      int b = nextInt();

      if (i % 10000 == 0) {
        if (!Thread.interrupted()) {
          int gcd = computeGCD(a, b);
          if (gcd > 5) {
            System.out.println(GREEN + "Running in " + threadDescription + ". The GCD of " + a + " and " + b + " is " + gcd);
          }
        } else {
          System.out.println(BLUE + "Thread was interrupted!");
          return;
        }
      }
    }
    System.out.println(BLUE + "Leaving the thread" + threadDescription);
  }

  private int computeGCD(int a, int b) {
    if (b == 0) return a;
    else return computeGCD(b, a % b);
  }
}
