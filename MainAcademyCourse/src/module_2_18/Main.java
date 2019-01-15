package module_2_18;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
//    for (int i = 0; i < 5; i++) {
//      int num = 10 + (int) (Math.random() * 50);
//      System.out.println(num + "!= " + Factorial.factorial(num));
//    }
//
//    int N = 5;
//
//    System.out.println(N + "!= " + Factorial.factorial(N));

    //===========================

    //BuyNail.butNails(10);

    //==========================

    try {
      getInfo();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void getInfo() {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    System.out.println("Integer: " + numberFormat.format(12000000));
    Locale locale = new Locale("rus", "RUSSIA");
    System.out.println("Locate " + locale.getCountry() + ", " + locale.getISO3Language());
    Date date = new Date();
    System.out.println("Date " + date);
  }

  private static void showProgramms() throws IOException {
    Process process = Runtime.getRuntime().exec("Photoshop.exe");
  }
}
