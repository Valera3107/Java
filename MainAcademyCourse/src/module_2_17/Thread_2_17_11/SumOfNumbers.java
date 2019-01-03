package module_2_17.Thread_2_17_11;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfNumbers {
  private static long N = 1_000_000L;
  private static final int NUM_THREADS = 10;

  public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
    long computeSum = pool.invoke(new RecSumOfN(0, N));
    long formulaSum = (N * (N + 1)) / 2;
    System.out.printf("Sum for range 1...%d; compute sum = %d, formula sum = %d \n", N, computeSum, formulaSum);
  }

  static class RecSumOfN extends RecursiveTask<Long> {
    long from, to;

    public RecSumOfN(long from, long to) {
      this.from = from;
      this.to = to;
    }

    @Override
    protected Long compute() {
      if ((to - from) <= N / NUM_THREADS) {
        long localSum = 0;
        for (long i = from; i <= to; i++) {
          localSum += (int) (Math.random() * 1000);
        }
        System.out.printf("\t Summing of range %d to %d is %d \n", from, to, localSum);
        return localSum;
      } else {
        long mid = (from + to) / 2;
        System.out.printf("Forking into two ranges: " + "%d to %d and %d to %d \n", from, mid, mid, to);
        RecSumOfN firstHalf = new RecSumOfN(from, mid);
        firstHalf.fork();
        RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);
        long resultSecond = secondHalf.compute();
        return firstHalf.join() + resultSecond;
      }
    }
  }
}
