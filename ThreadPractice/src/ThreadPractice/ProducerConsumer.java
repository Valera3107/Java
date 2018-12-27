package ThreadPractice;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static ThreadPractice.ColorScheme.GREEN;
import static ThreadPractice.ColorScheme.RED;

public class ProducerConsumer {
  private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

  public static void main(String[] args) {

    new Thread(new Producer()).start();
    new Thread(new Consumer()).start();

  }

  private static class Producer implements Runnable {
    String[] arr = {
      "Now is the winter of our discontent",
      "Made glorious summer by this sun of York;",
      "And all the clouds that lour'd upon our house",
      "In the deep bosom of the ocean buried.",
      "Now are our brows bound with victorious wreaths;",
      "Our bruised arms hung up for monuments;",
      "Our stern alarums changed to merry meetings,",
      "Our dreadful marches to delightful measures.",
      "Grim-visaged war hath smooth'd his wrinkled front;",
      "And now, instead of mounting barded steeds",
      "To fright the souls of fearful adversaries,",
      "He capers nimbly in a lady's chamber",
      "To the lascivious pleasing of a lute.",
      "But I, that am not shaped for sportive tricks,",
      "Nor made to court an amorous looking-glass;",
      "I, that am rudely stamp'd, and want love's majesty",
      "To strut before a wanton ambling nymph;",
      "I, that am curtail'd of this fair proportion,",
      "DONE"
    };

    @Override
    public void run() {
      try {
        produce();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void produce() throws InterruptedException {
      Random r = new Random();
      for (int i = 0; i < arr.length; i++) {
        queue.put(arr[i]);
        System.out.println(GREEN + "Producing: " + arr[i] + ". Queue size is " + queue.size());
        Thread.sleep(r.nextInt(1000));
      }
    }
  }

  private static class Consumer implements Runnable {
    @Override
    public void run() {
      try {
        consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void consume() throws InterruptedException {
      Random r = new Random();
      while (true) {
        String message = queue.take();
        System.out.println(RED + "Consuming: " + message + ". Queue size " + queue.size());
        if (!message.equals("DONE")) {
          Thread.sleep(r.nextInt(3000));
        }
      }
    }
  }
}
