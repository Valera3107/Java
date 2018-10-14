package module_2_1;

public class Computer {
  private String manufacturer;
  private int serialNumber;
  private float price;
  private int quantityCPU;
  private int frequencyCPU;

  public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
    this.manufacturer = manufacturer;
    this.serialNumber = serialNumber;
    this.price = price;
    this.quantityCPU = quantityCPU;
    this.frequencyCPU = frequencyCPU;
  }

  public Computer(String manufacturer, int serialNumber, float price) {
    this.manufacturer = manufacturer;
    this.serialNumber = serialNumber;
    this.price = price;
  }

  public static void view(Computer[] arr) {
    for (Computer obj:
      arr) {
      if (obj.getFrequencyCPU() == 0 || obj.getQuantityCPU() == 0) {
        System.out.println("Information about computer: " + " - manufacturer: " + obj.getManufacturer() + "; serialNumber: " +
          obj.getSerialNumber() + "; price: " + obj.getPrice() + ";");
      } else {
        System.out.println("Information about computer: " + " - manufacturer: " + obj.getManufacturer() + "; serialNumber: " +
          obj.getSerialNumber() + "; price: " + obj.getPrice() + "; quatity: " + obj.getQuantityCPU() + "; frequency: " + obj.getFrequencyCPU() + ";");
      }
    }
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int getQuantityCPU() {
    return quantityCPU;
  }

  public void setQuantityCPU(int quantityCPU) {
    this.quantityCPU = quantityCPU;
  }

  public int getFrequencyCPU() {
    return frequencyCPU;
  }

  public void setFrequencyCPU(int frequencyCPU) {
    this.frequencyCPU = frequencyCPU;
  }
}
