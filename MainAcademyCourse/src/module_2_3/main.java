package module_2_3;

public class main {
  public static void main(String[] args) {
    MyWindow windowOne = new MyWindow(12,23,4,"Red", true);
    MyWindow windowTwo = new MyWindow(10,10,2,"Blue" , false);
    MyWindow windowThree = new MyWindow(20,40,8,"Gold",true);
    MyWindow windowFour = new MyWindow(5,5,1,"White", false);
    MyWindow window = new MyWindow();

    MyWindow[] arrOfWindows = {new MyWindow(), new MyWindow(11,20,2), new MyWindow(1,1), new MyWindow(20,30,10,"Green", false)};

    window.printAllInfoAboutWindow();
    windowOne.printAllInfoAboutWindow();
    windowTwo.printAllInfoAboutWindow();
    windowThree.printAllInfoAboutWindow();
    windowFour.printAllInfoAboutWindow();

    System.out.println();
    System.out.println("Collection of windows from the array: ");

    for (MyWindow item: arrOfWindows) {
      item.printAllInfoAboutWindow();
    }
  }
}
