package module_2_2;

public class Administration {

  public static void changeName(String name, Person user) {
    user.set(name);
  }

  public static void changeAllName(String firstName, String lastName, Person user) {
    user.set(firstName, lastName);
  }

  public static void changeNamesAndGender(String firstName, String lastName, String gender, Person user) {
    user.set(firstName, lastName, gender);
  }

  public static void changeAge(int age, Person user) {
    user.set(age);
  }

  public static  void changeAgeAndPhoneNumber(int age, int phoneNumber, Person user) {
    user.set(age, phoneNumber);
  }

  public static void showAllInfoAboutUser(Person user) {
    System.out.println("Info about user: " + user.getFirstName() + " " + user.getLastName() + " " + user.getGender() + " " + user.getAge() + " " + user.getPhoneNumber());
  }
}
