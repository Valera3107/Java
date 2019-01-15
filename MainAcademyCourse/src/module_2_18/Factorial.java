package module_2_18;

import java.math.BigInteger;

public class Factorial {
  public static BigInteger factorial(int N) {
    String s = String.valueOf(N + 1);
    BigInteger res = new BigInteger("1");
    for (BigInteger i = new BigInteger("1"); i.compareTo(new BigInteger(s)) < 0; i = i.add(new BigInteger("1"))) {
      res = res.multiply(i);
    }
    return res;
  }
}
