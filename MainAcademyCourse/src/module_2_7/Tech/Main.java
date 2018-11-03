package module_2_7.Tech;

public class Main {
  public static void main(String[] args) {
    Monitor[] monitorsArr = {new Monitor(20,30), new Monitor(40,60)};
    Device[] devicesArr = {new Device("Samsung", 1200, "AB112234DC"), new Device("LG", 999, "RR124444FF"), new Device("Apple", 2500, "AA111111AB")};
    EthernetAdapter[] ethernetAdaptersArr = {new EthernetAdapter("FFLL", 40), new EthernetAdapter("DDLL", 70)};

    for (Monitor elem:
         monitorsArr) {
      System.out.println(elem.toString());
    }

    for (Device elem:
         devicesArr) {
      System.out.println(elem.toString());
    }

    for (EthernetAdapter elem:
         ethernetAdaptersArr) {
      System.out.println(elem.toString());
    }
  }
}
