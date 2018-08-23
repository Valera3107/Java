public class BankForAll {
  public static void main(String[] args) {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    String ownerName = "Ann";
    double withdrawal = 500;
    double commision = 0.05;

    for(int i = 0; i< ownerNames.length; i++) {
      if(ownerName == ownerNames[i]){
        int ownerMoney = balances[i];
        double commisionMoney = withdrawal * commision;
        double total = ownerMoney - withdrawal - commisionMoney;
        if(total < 0) {
          System.out.println(ownerName + " No");
          break;
        }
        System.out.println(ownerName + " " + withdrawal + " " + total);
      }
    }

  }
}
