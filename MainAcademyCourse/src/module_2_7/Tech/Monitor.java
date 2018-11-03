package module_2_7.Tech;

public class Monitor {
  private int resolutionX;
  private int resolutionY;

  public int getResolutionX() {
    return resolutionX;
  }

  @Override
  public String toString() {
    return "Monitor: " + " resolutionX - " + this.getResolutionX() + "; resolutionY - " + this.getResolutionY();
  }

  @Override
  public int hashCode() {
    int res = 17;
    res = 31 * res + this.getResolutionX();
    res = 31 * res + this.getResolutionY();
    return res;
  }

  public boolean equals(Monitor obj) {
    if(this.getResolutionY() == obj.getResolutionY() && this.getResolutionX() == obj.getResolutionX()) return true;
    else return false;
  }

  public void setResolutionX(int resolutionX) {
    this.resolutionX = resolutionX;
  }

  public int getResolutionY() {
    return resolutionY;
  }

  public void setResolutionY(int resolutionY) {
    this.resolutionY = resolutionY;
  }

  public Monitor(int resolutionX, int resolutionY) {

    this.resolutionX = resolutionX;
    this.resolutionY = resolutionY;
  }
}
