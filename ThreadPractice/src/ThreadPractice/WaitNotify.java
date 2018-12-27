package ThreadPractice;

import static ThreadPractice.ColorScheme.BLUE;
import static ThreadPractice.ColorScheme.RED;

public class WaitNotify {
  public static void main(String[] args) {
    Message message = new Message();

    new Thread(new Producer(message)).start();
    new Thread(new Consumer(message)).start();
  }

  private static class Producer implements Runnable {
    private Message message;

    Producer(Message message) {
     this.message = message;
    }

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
      for (String t : arr
        ) {
        synchronized (message) {
          System.out.println(BLUE + "Producing message: " + t);
          message.setMessage(t);
          message.notify();
          if (!"DONE".equals(t))
            message.wait();
        }
        Thread.sleep(400);
      }
    }
  }

  private static class Consumer implements Runnable {
    private final Message message;

    Consumer(Message message) {
      this.message = message;
    }

    @Override
    public void run() {
      try {
        consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void consume() throws InterruptedException {
      while (true) {
        Thread.sleep(400);
        synchronized (message) {
          System.out.println(RED + "Consuming message: " + message.getMessage());
          if (!"DONE".equals(message.getMessage())) {
            message.notify();
            message.wait();
          } else {
            return;
          }
        }
      }
    }
  }
}
