package module_09.MonthApp;

public enum Season {
  SUMMER(1), AUTUMN(2), WINTER(3), SPRING(4);

  private int index;

  Season(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }
}
