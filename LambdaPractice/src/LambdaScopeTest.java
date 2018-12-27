import java.util.function.Consumer;

public class LambdaScopeTest {
  double d = 0.5;

  class LambdaScopeInner {
    double dd = 44.65;

    void testScope(double val) {
      Consumer<Double> res = e-> {
        System.out.println("func d = " + val);
        System.out.println("e = " + e);
        System.out.println("this.d = " + this.dd);
        System.out.println("LambdaScopeTest.this.d = " + LambdaScopeTest.this.d);
      };

      res.accept(2343.43);
    }
  }
}
