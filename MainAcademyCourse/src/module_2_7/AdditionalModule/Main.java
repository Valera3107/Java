package module_2_7.AdditionalModule;

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("Tuzik", 5);
    System.out.println("Name: " + dog.getName() + " age: " + dog.getAge());

    Person person = new Person("Mike", 21, "male", 1997, dog);



    System.out.println("Name: " + person.getName() + "; age: " + person.getAge() + "; gender: " + person.getGender() + "; year of birth: " + person.getYearOfBirth() + "; dog: name: " + person.getDog().getName() + "; age " + person.getDog().getAge());

    Bus bus = new Bus(15, person);
    System.out.println("Number of seats: " + bus.getSeats() + "; driver: " + bus.getDriver().getName());
  }
}
