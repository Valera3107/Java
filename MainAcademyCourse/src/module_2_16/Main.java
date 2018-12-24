package module_2_16;

public class Main {

  public static void main(String[] args) {
    Cat cat = new Cat();
    Animal animal = new Animal();


    foo(cat);
    foo(animal);

    //====================

    byte b = 5;
    foo(b);

    //====================

    foo(3, 4);
    foo(4, 4, 4);

    //=====================

    Puppy p = new Puppy();
    foo(p);

    //====================

    foo(5);
  }

  public static void foo(Puppy p) {
    System.out.println("Puppy");
  }

  public static void foo(int a, int b) {
    System.out.println("int a, int b");
  }

  public static void foo(int... a) {
    System.out.println("...a");
  }

  public static void foo(Byte b) {
    System.out.println("Byte");
  }

  public static void foo(byte b) {
    System.out.println("byte");
  }

  public static void foo(int i) {
    System.out.println("int");
  }

  public static void foo(Cat c) {
    System.out.println("Cat");
  }

  public static void foo(Animal a) {
    System.out.println("Animal");
  }
}
