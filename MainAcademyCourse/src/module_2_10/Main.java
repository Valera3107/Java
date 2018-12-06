package module_2_10;

public class Main {
  public static void main(String[] args) {
  Integer x1 = 20;
  Integer x2 = Integer.valueOf(20);
  Integer x3 = Integer.parseInt("20");
  Integer x4 = new Integer(20);

    System.out.println("==");
    System.out.println("x1==x2 " + (x1==x2));
    System.out.println("x1==x3 " + (x1==x3));
    System.out.println("x1==x4 " + (x1==x4));
    System.out.println("x2==x3 " + (x2==x3));
    System.out.println("x2==x4 " + (x2==x4));
    System.out.println("x3==x4 " + (x3==x4));

    System.out.println("\n");

    System.out.println("equal");
    System.out.println("x1 equal x2 " + x1.equals(x2));
    System.out.println("x1 equal x3 " + x1.equals(x3));
    System.out.println("x1 equal x4 " + x1.equals(x4));
    System.out.println("x2 equal x3 " + x2.equals(x3));
    System.out.println("x2 equal x4 " + x2.equals(x4));
    System.out.println("x3 equal x4 " + x3.equals(x4));

    Byte b = 7;
    System.out.println("Sum: " + compute(b, 290));
  }

  public static Long compute(Byte b, Integer i) {
    return (b.longValue() + i);
  }
}
