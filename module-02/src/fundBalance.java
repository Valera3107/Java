public class fundBalance {
  public static void main(String[] args) {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    String ownerName = "Oww";
    double withdrawal = 100;

    for(int i = 0; i < ownerNames.length; i++) {
      if(ownerName == ownerNames[i]) {
        int ownerMoney = balances[i];
        double total = ownerMoney + withdrawal;
        System.out.println(ownerName + " " + total);
      }
    }

  }
}
