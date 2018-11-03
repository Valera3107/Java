package module_2_7.Tech;

public class Device {
  private String manufacturer;
  private float price;
  private String serialNumber;

  public String getManufacturer() {
    return manufacturer;
  }

  @Override
  public String toString() {
    return "Device: manufacturer - " + this.getManufacturer() + "; price - " + this.getPrice() + "; serialNumber - " + this.getSerialNumber();
  }

  public boolean equals(Device obj) {
    if(this.getPrice() == obj.getPrice() && this.getManufacturer() == obj.getManufacturer() && this.getSerialNumber() == obj.getSerialNumber()) return true;
    else return false;
  }

  @Override
  public int hashCode() {
    int res = 17;
    res = 31 * res + this.getSerialNumber().hashCode();
    res = 31 * res + this.getManufacturer().hashCode();
    res = 31 * res + (int) this.getPrice();

    return res;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Device(String manufacturer, float price, String serialNumber) {

    this.manufacturer = manufacturer;
    this.price = price;
    this.serialNumber = serialNumber;
  }
}
