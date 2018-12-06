package module_2_9;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String str = "adracadabra";
    System.out.println("Last index of ra: " + str.lastIndexOf("ra"));
    System.out.println("First index of r: " + str.indexOf("ra"));
    System.out.println("Substring: " + str.substring(3, 7));

    System.out.println(reverseString(str));

    String str1 = "Cartoon";
    String str2 = "Tomcat";

    showCommonWord(str1, str2);

    String strForUniqMath = "Using method of class String";

    uniqueChars(strForUniqMath);

    String strForTokenizer = "This is string for tokanaizer, I hate all it: eat, live, love... It's all about me";
    printViaTokenizer(strForTokenizer);

    System.out.println("\n\n");
    System.out.println(checkPersonWithRegExp("Albert"));
    System.out.println(checkPersonWithRegExp("bill"));
    System.out.println(checkPersonWithRegExp("F2343"));


    System.out.println("\n\n");
    System.out.println(checkPhoneNumber("+38(097) 657-45-45"));
    System.out.println(checkPhoneNumber("+48(0907) 57-445-445"));
    System.out.println(checkPhoneNumber("+38 097 657-45-45"));
  }

  public static boolean checkPhoneNumber(String str) {
    String checkStr = "\\+38\\([0-9]{3}\\) [0-9]{3}-[0-9]{2}-[0-9]{2}";
    Pattern pattern = Pattern.compile(checkStr);
    Matcher m = pattern.matcher(str);
    if(m.matches()) {
      return true;
    }
    return false;
  }

  public static boolean checkPersonWithRegExp(String str) {
    String checkStr = "[A-Z]{1}[a-z]+";
    Pattern pattern = Pattern.compile(checkStr);
    Matcher m = pattern.matcher(str);
    if(m.matches()) {
      return true;
    }
    return false;
  }

  private static void printViaTokenizer(String strForTokanaizer) {
    StringTokenizer str = new StringTokenizer(strForTokanaizer, ", .");
    while (str.hasMoreElements()) {
      System.out.print(str.nextElement() + " ");
    }
  }

  public static void uniqueChars(String str) {
    String temp = "";
    for (int i = 0; i < str.length(); i++){
      char current = str.charAt(i);
      if (temp.indexOf(current) < 0){
        temp = temp + current;
      } else {
        temp = temp.replace(String.valueOf(current), "");
      }
    }

    System.out.println(Arrays.toString(temp.toCharArray()));
  }

  public static void showCommonWord(String strToShowChars, String strToBreakChars) {
    for (int i = 0; i < strToBreakChars.split("").length; i++) {
      for (int j = 0; j < strToShowChars.split("").length; j++) {
        if (strToShowChars.toLowerCase().charAt(j) == strToBreakChars.toLowerCase().charAt(i)) {
          System.out.println("Common char: " + strToShowChars.charAt(j));
        }
      }
    }
  }

  public static String reverseString(String str) {
    String newString = "";
    for (int i = str.split("").length - 1; i >= 0; i--) {
      newString += str.charAt(i);
    }
    return newString;
  }
}
