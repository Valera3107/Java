package module_05;

import module_05.Animal.Cat;
import module_05.Animal.Cow;
import module_05.Animal.Dog;
import module_05.Animal.Pet;
import module_05.Class.Alien;
import module_05.Money.Coin;
import module_05.WaterAnimal.Amphibia;
import module_05.WaterAnimal.Frog;

import java.util.Formatter;

public class Main {
  public static void main(String[] args) {

    //=============== 1
//    Pet pet = new Cat();
//    pet.voice();
//
//    pet = new Dog();
//    pet.voice();
//
//    pet = new Cow();
//    pet.voice();

    //================ 2
//    for (int i = 0; i < 10; i++) {
//      Coin.tossCoin();
//    }

    //================= 3
//    double minDouble = Double.MIN_VALUE;
//    double maxDouble = Double.MAX_VALUE;
//    float minFloat = Float.MIN_VALUE;
//    float maxFloat = Float.MAX_VALUE;
//
//    printExp(maxDouble);
//    printExp(minDouble);
//    printExp(maxFloat);
//    printExp(minFloat);
    //================= 4
//    Alien alien = new Alien("Mars", "Pol");
//    System.out.println(alien);

    //================= 5
    Frog frog = new Frog();
    frog.eat();
    frog.sleep();
    frog.swim();
    frog.walk();
  }

  private static void printExp(Number number){
    Formatter frm = new Formatter();
    System.out.println("Number = "+frm.format("%3.2e", number));
  }
}
