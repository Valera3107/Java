public class BankForAll {
  public static void main(String[] args) {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    String ownerName = "Ann";
    double withdrawal = 100;
    double commision = 0.05;

    getMoneyFromBalance(balances, ownerNames, ownerName, withdrawal, commision);

  }

  public static void getMoneyFromBalance(int[] arrOfMoney, String[] arrOfOwnerNames, String name, double withdrawal, double commision) {
    for(int i = 0; i< arrOfOwnerNames.length; i++) {
      if(name == arrOfOwnerNames[i]){
        int ownerMoney = arrOfMoney[i];
        double commisionMoney = withdrawal * commision;
        double total = ownerMoney - withdrawal - commisionMoney;
        if(total < 0) {
          System.out.println(name + " No");
          break;
        }
        System.out.println(name + " " + withdrawal + " " + total);
      }
    }
  }
}
