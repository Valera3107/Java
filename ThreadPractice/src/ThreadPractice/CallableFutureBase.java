package ThreadPractice;


import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Timer {
  public Instant start;
  public  Instant end;

  public double timeInSeconds() {
    return Duration.between(start, end).toMillis() / 1000.0;
  }
}


public class CallableFutureBase {


  public static void main(String[] args) {

    ExecutorService  executorService = Executors.newCachedThreadPool();
    executorService.submit(new Callable<Double>() {
      @Override
      public Double call() {
        return null;
      }
    });

  }
}
