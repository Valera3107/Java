import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaMain4 {
  public static void main(String[] args) {
    List<RichPerson> richPeople = new ArrayList<>();
    richPeople.add(new RichPerson("Frank", "Laim", 45000, 34));
    richPeople.add(new RichPerson("Bill", "Black", 34000, 23));
    richPeople.add(new RichPerson("Jack", "Green", 80000, 65));
    richPeople.add(new RichPerson("Max", "Pitenhov", 60000, 43));

    testPredicate(richPeople);
    testFunction(richPeople);
    testConsumer(richPeople);
  }
  //==============Consumer
  private static void testConsumer(List<RichPerson> list) {
    System.out.println("Test consumer...");

    Consumer<RichPerson> personConsumer = z -> z.setSalary(z.getSalary() + (z.getSalary()*10/100));
    processor(list, personConsumer.andThen(System.out::println));
  }

  private static <T> void processor(List<T> list, Consumer<T> consumer) {
    for (T e : list
         ) {
      consumer.accept(e);
    }
  }

  //==============Function
  private static void testFunction(List<RichPerson> list) {
    System.out.println("Test function...");
    Function<RichPerson, String> name = x -> x.getName() + "_" + x.getLastName();
    Function<String, String> helloSentence = x -> x.concat("!!!");
    Function<RichPerson, String> composeFunc = helloSentence.compose(name);
    List<String> transform = transform(list, composeFunc);

    Function<String, String > exclaim = z-> z.concat("---_---");
    Function<String, String > toUpper = String::toUpperCase;
    transform(transform, composeFunction(exclaim, toUpper)).forEach(System.out::println);
  }

  private static <T> Function<T, T> composeFunction(Function<T,T>... functions) {
    Function<T,T> res = Function.identity();
    for (Function<T,T> func : functions) {
      res = res.andThen(func);
    }
    return res;
  }

  private static <T, R> List<R> transform(List<T> list, Function<T, R> function) {
    List<R> newList = new ArrayList<>();
    for (T obj : list
      ) {
      newList.add(function.apply(obj));
    }
    return newList;
  }

  //==============Predicate

  private static void testPredicate(List<RichPerson> list) {
    System.out.println("Test predicate...");
    Predicate<RichPerson> isRich = x -> x.getSalary() >= 45000;
    Predicate<RichPerson> isYoung = x -> x.getAge() <= 35;
    System.out.println("Is rich and young: ");
    findAll(list, isRich.and(isYoung)).forEach(System.out::println);
    System.out.println("Is rich or young: ");
    findAll(list, isRich.or(isYoung)).forEach(System.out::println);
    System.out.println("Is not reach: ");
    findAll(list, isRich.negate()).forEach(System.out::println);
  }

  private static <T extends RichPerson> List<T> findAll(List<T> list, Predicate<T> functionPredicate) {
    List<T> newList = new ArrayList<>();
    for (T r : list
      ) {
      if (functionPredicate.test(r)) {
        newList.add(r);
      }
    }
    return newList;
  }
}
