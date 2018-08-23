public class Bank {
  public static void main(String[] args) {
    int moneyHave = 100;
    int withdrawal = 10;
    double commision = 0.05;

    double commisionMoney = withdrawal * commision;
    double total = moneyHave - withdrawal - commisionMoney;
    if(total > 0) {
      System.out.println("Ok " + commisionMoney + " " + total);
    } else {
      System.out.println("No");
    }

  }
}
