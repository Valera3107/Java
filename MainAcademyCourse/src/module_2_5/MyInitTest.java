package module_2_5;

public class MyInitTest {
  private int testInteger;
  private float testFloat;

  public MyInitTest(float testFloat, int testInteger) {
    this(testInteger);
    this.testFloat = testFloat;
    System.out.println("constructor 1");
  }

  public MyInitTest(int testInteger) {
    this.testInteger = testInteger;
    System.out.println("constructor 2");
  }

  static {
    System.out.println("static initialization block 1");
  }

  static {
    System.out.println("static initialization block 2");
  }

  {
    System.out.println("non-static initialization block 1");
  }

  {
    System.out.println("non-static initialization block 2");
  }


}
