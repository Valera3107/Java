package module_2_12;

public class MyTestClass {

  public MyTestClass() {
    System.out.println("My test class!");
  }

  public void test() {
    MyTestClass myTestClass = new MyTestClass();
    MyInner myInner = myTestClass.new MyInner();
    MyTestClass.MyStaticNested myStaticNeste = new MyStaticNested();
    myTestClass.localInner();
  }

  public void localInner() {
    class LocalInner {
      public LocalInner() {
        System.out.println("Local inner class!");
      }
    }

    LocalInner localInner = new LocalInner();
  }

  class MyInner {
    public MyInner() {
      System.out.println("My inner class!");
    }
  }

  public static class MyStaticNested{
    public MyStaticNested() {
      System.out.println("My static nested!");
    }
  }
}
