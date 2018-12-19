package module_2_14;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    MyTuple<Integer, Double, String> myTuple = new MyTuple<>(12, 34.5, "Hello");

    MyTuple<Long, String, String> myTuple1 = new MyTuple<>(21324L, "ggg", "eee");

    //=================

    Integer[] arr = {1, 33, 2, 41, 3, 24, 34};
    String[] str = {"one", "two", "three", "four"};
    MyMixer<String> myMixer1 = new MyMixer<>(str);
    MyMixer<Integer> myMixer = new MyMixer<>(arr);
    myMixer.shuffle();
    myMixer1.shuffle();
    System.out.println(Arrays.toString(myMixer.getArr()));
    System.out.println(Arrays.toString(myMixer1.getArr()));

    //==================

    Integer[] arrForCalcNum = {23, 2, 3, 23, 12, 3, 43, 4};
    System.out.println(MyTestMethod.calcNum(arrForCalcNum, 6));

    //=====================
    System.out.println(MyTestMethod.calcSum(arrForCalcNum, 10));
  }
}
