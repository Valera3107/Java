package module_2_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    //person.setAge(121);


    String str = "Circles:BLUE:1,2,3";
    String checkStr = "[A-Z]{1}[a-z]{6,8}:[A-Z]{3,10}:([1-9]{1,2}(,?))+";
    Pattern pattern = Pattern.compile(checkStr);
    Matcher m = pattern.matcher(str);
    if(m.matches()) {
      System.out.println("It's suit!");
    } else {
      System.out.println("Oh no!");
    }

  }
}
