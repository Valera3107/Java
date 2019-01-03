package module_2_17.Thread_2_17_6;

public class DiningHall {
  static int pizzaNum;
  static int studentID = 1;

  public void makePizza() {
    pizzaNum++;
  }

  public synchronized void servePizza() {
    String result;
    if(pizzaNum > 0) {
      result = "Served ";
      pizzaNum--;
    } else {
      result = "Starved ";
    }
    System.out.println(result + studentID);
    studentID++;
  }
}
