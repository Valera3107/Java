package module_2_14;

public class MyTuple<A,B,C> {
  private A val1;
  private B val2;
  private C val3;

  public MyTuple(A val1, B val2, C val3) {
    this.val1 = val1;
    this.val2 = val2;
    this.val3 = val3;
  }

  public A getVal1() {
    return val1;
  }

  public void setVal1(A val1) {
    this.val1 = val1;
  }

  public B getVal2() {
    return val2;
  }

  public void setVal2(B val2) {
    this.val2 = val2;
  }

  public C getVal3() {
    return val3;
  }

  public void setVal3(C val3) {
    this.val3 = val3;
  }
}
