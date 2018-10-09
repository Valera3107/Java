package module_1_4;

public class TypeCastingApp {
  public static void main(String[] args) {
    int i = 100;
    byte b = 34;
    long l = 50;
    short s = 45;
    float f = 45.6f;
    double d = 67.89;

    System.out.println("float -> int : " + (f = (float)i));
    System.out.println("byte -> double : " + (b = (byte)d));
    System.out.println("long -> short : " + (l=(long)s));
  }
}
