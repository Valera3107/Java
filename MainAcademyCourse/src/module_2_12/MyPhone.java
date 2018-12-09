package module_2_12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
  MyPhoneBook phoneBook = null;

  public MyPhone() {
  }

  public void swichOn() {
    System.out.println("Loading phoneBook records...");
    phoneBook = new MyPhoneBook();
    phoneBook.addPhoneNumber("Peter", "+38(097) 546 65 65");
    phoneBook.addPhoneNumber("Frank", "+38(097) 875 23 89");
    phoneBook.addPhoneNumber("Carl", "+38(097) 466 73 67");
    phoneBook.addPhoneNumber("Kate", "+38(097) 256 80 36");
    phoneBook.addPhoneNumber("Bill", "+38(050) 346 25 31");
    phoneBook.addPhoneNumber("Carl", "+38(097) 466 73 67");
    phoneBook.addPhoneNumber("Antony", "+38(043) 345 34 32");
    phoneBook.addPhoneNumber("Mark", "+38(042) 313 43 45");
    phoneBook.addPhoneNumber("Sem", "+38(034) 235 54 54");
    phoneBook.addPhoneNumber("Bony", "+38(065) 123 67 74");
    System.out.println("Ok!");
  }

  public void call(int index) {
    System.out.println("Calling to: " + phoneBook.phoneNumbers[index].toString());
  }

  class MyPhoneBook {
    private module_2_12.MyPhoneBook.PhoneNumber[] phoneNumbers = new module_2_12.MyPhoneBook.PhoneNumber[10];

    public void addPhoneNumber(String name, String number) {
      for (int i = 0; i < phoneNumbers.length; i++) {
        if (phoneNumbers[i] == null) {
          phoneNumbers[i] = new module_2_12.MyPhoneBook.PhoneNumber(name, number);
          break;
        }
      }
    }

    public void sortPhoneNumberByName() {
      Arrays.sort(phoneNumbers, new Comparator<module_2_12.MyPhoneBook.PhoneNumber>() {
        @Override
        public int compare(module_2_12.MyPhoneBook.PhoneNumber o1, module_2_12.MyPhoneBook.PhoneNumber o2) {
          return o1.getName().compareTo(o2.getName());
        }
      });
    }

    public void sortPhoneNumberByPhoneNumber() {
      Arrays.sort(phoneNumbers, new Comparator<module_2_12.MyPhoneBook.PhoneNumber>() {
        @Override
        public int compare(module_2_12.MyPhoneBook.PhoneNumber o1, module_2_12.MyPhoneBook.PhoneNumber o2) {
          return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
        }
      });
    }

    public void printPhoneBook() {
      for (module_2_12.MyPhoneBook.PhoneNumber p : phoneNumbers
        ) {
        if (p != null) {
          System.out.println(p.toString());
        }
      }
    }

    class PhoneNumber {
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
}
