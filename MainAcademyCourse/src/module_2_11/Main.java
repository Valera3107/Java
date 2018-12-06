package module_2_11;

public class Main {
  public static void main(String[] args) {
    try {
      int[] arr = {1, 2, 3};
      int i = arr[4];
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Exception in try block " + e);
    } finally {
      System.out.println("Block finally!");
    }

    //=======

    try {
      throw new MyExceptions("It's my exception!");
    } catch (MyExceptions e) {
      System.out.println("Exception: " + e);
    } finally {
      System.out.println("Block finally!");
    }

    //=========

    try {
      MyTest.test();
    } catch (MyExceptions e) {
      System.out.println("Your ex: " + e);
    }

    //=========
    MyTest myTest = null;

    //========

    Person person = new Person();
    person.setFirstName("Mark");
    person.setLastName("Franclin");
    person.setAge(121);

  }
}
