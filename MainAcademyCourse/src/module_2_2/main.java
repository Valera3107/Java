package module_2_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[][] arr_1 = {{2,4},
                    {2, 10}};

    int[][] arr_2 = {{13,5},
                    {20, 16}};

    int[][] resultArr = Matrix.addMatrix(arr_1, arr_2);
    for (int[] arr:
         resultArr) {
      System.out.println(Arrays.toString(arr));
    }

    System.out.println(Matrix.multMatrix(arr_1, arr_2));

    //================

    Accountant empVitia = new Accountant("Vitia", 1200, 120, 100);
    empVitia.showInfoAboutEmployee();

    //================

    Person user = new Person("Igor", "Fedenev", 19, "man", 123943123);

    Administration.changeAge(77, user);
    Administration.changeAllName("Vitia", "Aka", user);
    Administration.showAllInfoAboutUser(user);

    //================

    Circle circle = new Circle();
    circle.calcSquare(10);

    Rectangle rectangle = new Rectangle();
    rectangle.calcSquare(23, 54);

    Foursquare foursquare = new Foursquare();
    foursquare.calcSquare(15);
  }
}
