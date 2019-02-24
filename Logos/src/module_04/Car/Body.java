package module_04.Car;

public class Body {
  private double width;
  private double height;
  private String mark;
  private String plating;

  public Body(double width, double height, String mark, String plating) {
    this.width = width;
    this.height = height;
    this.mark = mark;
    this.plating = plating;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public String getPlating() {
    return plating;
  }

  public void setPlating(String plating) {
    this.plating = plating;
  }

  public void changePlating(String newPlating){
    setPlating(newPlating);
  }

  @Override
  public String toString() {
    return "Body{" +
      "width=" + width +
      ", height=" + height +
      ", mark='" + mark + '\'' +
      ", plating='" + plating + '\'' +
      '}';
  }
}
