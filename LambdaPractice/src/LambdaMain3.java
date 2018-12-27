import javafx.scene.effect.Shadow;
import model.Circle;
import model.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain3 {
  public static void main(String[] args) {

    List<Person> people = new ArrayList<>();
    people.add(new Person("Jim", "Cary", 23));
    people.add(new Person("Bill", "Shriek", 56));
    people.add(new Person("Tommy", "Green", 25));
    people.add(new Person("Jack", "Black", 44));
    people.add(new Person("Rocky", "Balboa", 64));


    List<Employee> employees = new ArrayList<>();

    employees.add(new Employee("Jim", "Miterson", 345555));
    employees.add(new Employee("Bill", "Shriek", 25434));
    employees.add(new Employee("Rocky", "Balboa", 76533));
    employees.add(new Employee("Tommy", "Green", 87455));
    employees.add(new Employee("Sam", "Raime", 76455));

    //Predicate
    System.out.println(findMatch(people, x -> x.getAge() > 40));
    System.out.println(findMatch(employees, x -> x.getSalary() > 50000));

    //Function
    System.out.println(calcSum(employees, Employee::getSalary));
    System.out.println(calcSum(people, Person::getAge));

    //Bifunction
    Integer zeroElem = 0;
    BinaryOperator<Integer> combiner = Math::max;
    System.out.println(combine(employees, zeroElem, Employee::getSalary, combiner));

    //Consumer
    employees.forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * 10 / 100)));
    employees.forEach(System.out::println);

    //Supplier
    Supplier[] shapes = {Circle::new, Shadow::new, Square::new};
    Random rand = new Random();
    for (int i = 0; i < 4; i++) {
      int index = rand.nextInt(3);
      Supplier supplier = shapes[index];
      supplier.get();
    }
  }

  private static <T> T findMatch(List<T> list, Predicate<T> predicateFunction) {
    for (T i : list) {
      if (predicateFunction.test(i)) {
        return i;
      }
    }
    return null;
  }

  private static <T> int calcSum(List<T> list, Function<T, Integer> function) {
    int sum = 0;
    for (T elem : list) {
      sum += function.apply(elem);
    }
    return sum;
  }

  private static <T, R> R combine(List<T> list, R zeroElement, Function<T, R> function, BinaryOperator<R> combiner) {
    for (T elem : list) {
      zeroElement = combiner.apply(zeroElement, function.apply(elem));
    }
    return zeroElement;
  }


}

