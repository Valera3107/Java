package module_2_3;

public class MyWindow {
  private double width;
  private double height;
  private int numberOfGlass;
  private String color;
  private boolean isOpen;

  public MyWindow() {
    this.isOpen = false;
    this.numberOfGlass = 1;
    this.height = 10;
    this.width = 10;
    this.color = "White";
  }

  public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
    this(width,height,numberOfGlass);
    this.color = color;
    this.isOpen = isOpen;
  }

  public MyWindow(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public MyWindow(double width, double height, int numberOfGlass) {
    this(width,height);
    this.numberOfGlass = numberOfGlass;
  }

  public void printAllInfoAboutWindow() {
    System.out.println("Info about window: " + "size(w:h) " + this.width + " : " + this.height + "; color " + this.color + "; number of glass" + this.numberOfGlass + "; is open " + this.isOpen);
  }
}
