package module_05.Money;

public class Coin {
  private static final String EAGLE = "Eagle";
  private static final String EMBLEM = "Emblem";

  public static void tossCoin() {
    int side = 1 + (int) (Math.random()*2);
    if(side == 1) System.out.println(EAGLE);
    else if (side == 2)System.out.println(EMBLEM);
  }
}
