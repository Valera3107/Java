package module_13;

import java.util.Arrays;

public class Deputy extends Human {
  private int bribe;
  private boolean briber;

  public Deputy(int age, double height, String[] gentlemansSet, boolean briber) {
    super(age, height, gentlemansSet);
    this.briber = briber;
  }

  public void giveBribe(int bribe) {
    if (briber) {
      setBribe(getBribe() + bribe);
      if (getBribe() > 5000) {
        System.out.println("The police will arrest deputy!!!");
      }
    } else {
      System.out.println("This deputy is not get bribe!");
    }
  }

  public int getBribe() {
    return bribe;
  }

  public void setBribe(int bribe) {
    this.bribe = bribe;
  }

  public boolean isBriber() {
    return briber;
  }

  public void setBriber(boolean briber) {
    this.briber = briber;
  }

  @Override
  public String toString() {
    return "Deputy{" + " age = " + getAge() + ", height = " + getHeight() + " gentlemen's set = " + Arrays.toString(getGentlemansSet()) +
      ", bribe=" + bribe +
      ", briber=" + briber +
      '}';
  }
}
