package module_2_7.Tech;

public class EthernetAdapter {
  private String mac;
  private int speed;

  public EthernetAdapter(String mac, int speed) {
    this.mac = mac;
    this.speed = speed;
  }

  @Override
  public String toString() {
     return "EthernetAdapter: " + " mac - " + this.getMac() + "; speed - " + this.getSpeed();
  }

  public boolean equals(EthernetAdapter obj) {
    if(this.getSpeed() == obj.getSpeed() && this.getMac() == obj.getMac()) return true;
    else return false;
  }

  @Override
  public int hashCode() {
    int res = 17;
     res = 31 * res + this.getMac().hashCode();
     res = 31 * res + this.getSpeed();
     return res;
  }

  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
