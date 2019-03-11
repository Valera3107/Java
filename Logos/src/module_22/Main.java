package module_22;

import com.lgs.lab.interface1.Numerable;
import module_22.Animal.*;
import module_22.Money.Coin;
import module_22.WaterAnimal.*;
import java.util.Formatter;

@FunctionalInterface
interface Exponent<T extends Number> {
  void print(T num);
}

@FunctionalInterface
interface CoinToss {
  boolean toss(int i);
}

@FunctionalInterface
interface PetBuilder<T>{
  T createPet();
}
public class Main {
  public static void main(String[] args) {
    //=============== 1
//    PetBuilder petBuilder1 = Cat::new;
//    Cat cat = (Cat) petBuilder1.createPet();
//    cat.voice();
//
//    PetBuilder petBuilder2 = Dog::new;
//    Dog dog = (Dog) petBuilder2.createPet();
//    dog.voice();
//
//    PetBuilder petBuilder3 = Cow::new;
//    Cow cow = (Cow) petBuilder3.createPet();
//    cow.voice();

    //================ 2
//    CoinToss tossTest = (num) -> num == 1;
//
//    for (int i = 0; i < 10; i++) {
//      tossCoin(tossTest);
//    }
    //================= 3
//    double minDouble = Double.MIN_VALUE;
//    double maxDouble = Double.MAX_VALUE;
//    float minFloat = Float.MIN_VALUE;
//    float maxFloat = Float.MAX_VALUE;
//    Exponent exp = (num) -> {Formatter frm = new Formatter();
//      System.out.println("Number = "+frm.format("%3.2e", num));};
//
//    printExp(maxDouble, exp);
//    printExp(minDouble, exp);
//    printExp(maxFloat, exp);
//    printExp(minFloat, exp);
    //================= 4
//    PetBuilder petBuilder5 = Alien::new;
//    Alien alien = (Alien) petBuilder5.createPet();
//    System.out.println(alien);
    //================= 5

  }

  private static void tossCoin(CoinToss test) {
    int side = 1 + (int) (Math.random() * 2);
    if(test.toss(side)) System.out.println(Coin.EAGLE);
    else System.out.println(Coin.EMBLEM);
  }

  private static void printExp(Number number, Exponent function) {
    function.print(number);
  }
}
