package module_2_4;

public class MyPyramid {
  public static void printPyramid(int h) {
    int prob = h-1;
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= i; j++) {
        for (int k = prob; k > 0; k--) {
          System.out.print(" ");
        }
        prob--;
         do{
           System.out.print(j);
           ++j;
         }while(j <= i);
         j -=1;
         if(j !=1){
           for (int k = j-1; k > 0; k--) {
             System.out.print(k);
           }
         }
      }
      System.out.println();
    }
  }
}
