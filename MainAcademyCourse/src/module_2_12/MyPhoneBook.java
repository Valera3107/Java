package module_2_12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
  private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

  public void addPhoneNumber(String name, String number) {
    for (int i = 0; i < phoneNumbers.length; i++) {
      if (phoneNumbers[i] == null) {
        phoneNumbers[i] = new PhoneNumber(name, number);
        break;
      }
    }
  }

  public void sortPhoneNumberByName() {
    Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
      @Override
      public int compare(PhoneNumber o1, PhoneNumber o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
  }

  public void sortPhoneNumberByPhoneNumber() {
    Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
      @Override
      public int compare(PhoneNumber o1, PhoneNumber o2) {
        return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
      }
    });
  }

  public void printPhoneBook() {
    for (PhoneNumber p : phoneNumbers
      ) {
      if (p != null) {
        System.out.println(p.toString());
      }
    }
  }

  static class PhoneNumber {
    private String name;
    private String phoneNumber;

    public PhoneNumber(String name, String phoneNumber) {
      this.name = name;
      this.phoneNumber = phoneNumber;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
      return "PhoneNumber {" +
        "name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
    }
  }
}
