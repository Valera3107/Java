public class Bank {
  public static void main(String[] args) {
    int moneyHave = 100;
    int withdrawal = 10;
    double commision = 0.05;

    getInfoAboutMoney(moneyHave, withdrawal, commision);
  }

  public static  void getInfoAboutMoney(int allMoney, int withdrawal, double commision) {
    double commisionMoney = withdrawal * commision;
    double total = allMoney - withdrawal - commisionMoney;
    if(total > 0) {
      System.out.println("Ok " + commisionMoney + " " + total);
    } else {
      System.out.println("No");
    }
  }

}
