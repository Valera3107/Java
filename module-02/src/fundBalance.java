public class fundBalance {
  public static void main(String[] args) {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    String ownerName = "Oww";
    double withdrawal = 100;

    fundBalance(ownerName, balances, ownerNames, withdrawal);

  }

  public static void fundBalance(String ownerName, int[] arrOfNum, String[] arrOfNames, double withdrawal) {
    double total = 0;
    for(int i = 0; i < arrOfNames.length; i++) {
      if(ownerName == arrOfNames[i]) {
        int ownerMoney = arrOfNum[i];
        total = ownerMoney + withdrawal;
        System.out.println(ownerName + " " + total);
      }
    }
  }
}
