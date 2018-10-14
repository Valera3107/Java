package module_1_5;

import java.util.Scanner;

public class SearchPerfectNumberApp {
  public static void main(String[] args) {

    Scanner sl=new Scanner(System.in);
    System.out.println("Enter A Number");
    int num = sl.nextInt();

    int s=0;
    int j, b = 1;

    for (int i = num; i > 0; i--) {
      j = i;

      while(b < i )
      {
        if(i%b == 0)
        {
          s += b;

        }
        b++;
      }

      if(s == i)
      {
        System.out.println(i + " is a perfect number");
      }

      s = 0;
      i = j;
      b = 1;
    }
  }
}
