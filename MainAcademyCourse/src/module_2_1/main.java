package module_2_1;

import java.util.Random;

public class main {
  public static void main(String[] args) {
//    Computer[] arrOfComputers = {
//      new Computer("Apple", 1234, 2000),
//      new Computer("Meizu", 3434, 1500, 34, 10),
//      new Computer("Samsung", 1010, 2300, 54, 23)
//    };
    Computer[] arrOfComputers = new Computer[4];

    for (int i = 0; i < arrOfComputers.length; i++) {
      arrOfComputers[i] = createComputer();
    }

    for (Computer comp: arrOfComputers
         ) {
      comp.setPrice(comp.getPrice()*0.1 + comp.getPrice());
    }

    Computer.view(arrOfComputers);
  }

  public static Computer createComputer() {
    String manufacturer;
    int serialNumber = 10 + (int) (Math.random()*99);
    double price;
    int quantityCPU = 100 + (int) (Math.random()*999);
    int frequencyCPU = 1 + (int) (Math.random()*99);

    int markNum = 1 + (int) (Math.random()*4);
    switch (markNum){
      case 1: manufacturer = "Apple";
              price = 1500 + (int) (Math.random()*3000);
      ;break;
      case 2: manufacturer = "Samsung";
        price = 1000 + (int) (Math.random()*2500);
        break;
      case 3: manufacturer = "Meizu";
        price = 500 + (int) (Math.random()*1500);
        break;
      default: manufacturer = "Yota";
        price = 500 + (int) (Math.random()*3000);
        break;
    }
    Computer newComputer = new Computer(manufacturer,serialNumber, price, quantityCPU,frequencyCPU);

    return newComputer;
  }
}
