package module_2_12;

public class Main {
  public static void main(String[] args) {
    MyPhoneBook phoneBook = new MyPhoneBook();
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

    phoneBook.printPhoneBook();

    System.out.println("\n\nSort by name: ");
    phoneBook.sortPhoneNumberByName();
    phoneBook.printPhoneBook();

    System.out.println("\n\nSort by phone number: ");
    phoneBook.sortPhoneNumberByPhoneNumber();
    phoneBook.printPhoneBook();

    //=============
    System.out.println("\n\n");
    MyPhone phone = new MyPhone();
    phone.swichOn();
    phone.call(3);

    //==============

    MyTestClass myTestClass = new MyTestClass();
    myTestClass.test();
  }
}
